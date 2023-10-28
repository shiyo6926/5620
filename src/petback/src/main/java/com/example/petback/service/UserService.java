package com.example.petback.service;

import com.example.petback.entity.User;
import com.example.petback.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public Map<String,Object>  sign_up(User user){
        if (Objects.equals(user.getUserName(), ""))
            return response_reason("userName cannot be empty");
        if (Objects.equals(user.getPassword(), ""))
            return response_reason("password cannot be empty");
        if (Objects.equals(user.getEmail(), ""))
            return response_reason("email cannot be empty");
        if (Objects.equals(user.getUserType(), ""))
            return response_reason("UserType cannot be empty");
        if (user.getUserName()==null)
            return response_reason("No transfer user name");
        if (user.getPassword()==null)
            return response_reason("No transfer password");
        if (user.getEmail()==null)
            return response_reason("No transfer email");
        if (user.getUserType()==null)
            return response_reason("No transfer UserType");
        if(userMapper.check_userName_repeat(user)==0)
        {
            if(userMapper.check_email_repeat(user)==0)
                {
                    int result =userMapper.sign_up(user);
                    if(result==1)
                        return response_reason("success");
                    else
                        return response_reason("error");
                }
                //success
            else
                return response_reason("email repeat");//email repeat
        }
        else {
            return response_reason("username repeat");//username repeat
        }
    }
    public Map<String, Object> sign_in(User user){
        if(userMapper.check_userName_repeat(user)==1||userMapper.sign_in_check_email(user)==1)
        {
            List<User> user_username=userMapper.sign_in_by_username(user);
            List<User> user_email=userMapper.sign_in_by_email(user);
            if (user_username.size()==1)
            {
                userMapper.log_state_update(user_username.get(0));
                return getStringObjectMap(user_username);
            }
            else if(userMapper.sign_in_by_email(user).size()==1)
            {
                userMapper.log_state_update(user_email.get(0));
                return getStringObjectMap(user_email);
            }
            else
            {
                return response_reason("password error");
            }
        }
        else
        {
            return response_reason("username or email does not exist");
        }
    }
    public Map<String,Object> get_userId_by_username(User user)
    {
        List<User> User_info=userMapper.get_userinfo_by_username(user);
        if(User_info.size()==1)
        {
            Map<String,Object> response =new HashMap<>();
            response.put("userId",User_info.get(0).getUserId());
            response.put("reason","success");
            return response;
        }
        else
        {
            return response_reason("Cannot find the username");
        }

    }
    private Map<String, Object> getStringObjectMap(List<User> user_username) {
        String reason = "success";
        Map<String, Object> response = new HashMap<>();
        response.put("userId", user_username.get(0).getUserId());
        response.put("userName", user_username.get(0).getUserName());
        response.put("password", user_username.get(0).getPassword());
        response.put("email", user_username.get(0).getEmail());
        response.put("userType", user_username.get(0).getUserType());
        response.put("reason", reason);
        return response;
    }
    private Map<String,Object>response_reason(String reason)
    {
        Map<String, Object> response = new HashMap<>();
        response.put("reason", reason);
        return response;
    }


}

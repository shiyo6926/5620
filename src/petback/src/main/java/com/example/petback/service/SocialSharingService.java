package com.example.petback.service;

import com.example.petback.entity.SocialSharing;
import com.example.petback.mapper.SocialSharingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Service
public class SocialSharingService {
    @Autowired
    private SocialSharingMapper socialSharingMapper;

    public SocialSharing addSocialSharing(SocialSharing socialSharing) {
        // 检查参数是否为空

        if (Objects.equals(socialSharing.getUserId(),null) || Objects.equals(socialSharing.getUserId(),"")) {
            socialSharing.setReason("Error: UserId is missing");
            return socialSharing;
        }

        if (socialSharing.getSharingContent() == null || socialSharing.getSharingContent().isEmpty()) {
            socialSharing.setReason("Error: SharingContent is missing");
            return socialSharing;
        }

        // 调用 Mapper 插入数据
        socialSharingMapper.addSocialSharing(socialSharing);
        socialSharing.setReason("successful");
        List<SocialSharing> getSocialSharinglist = socialSharingMapper.getSocialSharingList(socialSharing);
        return getSocialSharinglist.get(0);
    }



    public SocialSharing editSocialSharing(SocialSharing socialSharing) {
        // 检查参数是否为空

        if (Objects.equals(socialSharing.getUserId(),null) || Objects.equals(socialSharing.getUserId(),"")) {
            socialSharing.setReason("Error: UserId is missing");
            return socialSharing;
        }

        if (socialSharing.getSharingContent() == null || socialSharing.getSharingContent().isEmpty()) {
            socialSharing.setReason("Error: SharingContent is missing");
            return socialSharing;
        }

        if (Objects.equals(socialSharing.getSharingId(),null) || Objects.equals(socialSharing.getSharingId(),"")) {
            socialSharing.setReason("Error: SocialSharingId is missing");
            return socialSharing;
        }

        socialSharingMapper.updateSocialSharing(socialSharing);
        socialSharing.setReason("successful");
        return socialSharing;
    }


    public SocialSharing deleteSocialSharing(SocialSharing socialSharing) {
        // 检查参数是否为空

        if (Objects.equals(socialSharing.getUserId(),null) || Objects.equals(socialSharing.getUserId(),"")) {
            socialSharing.setReason("Error: UserId is missing");
            return socialSharing;
        }


        if (Objects.equals(socialSharing.getSharingId(),null) || Objects.equals(socialSharing.getSharingId(),"")) {
            socialSharing.setReason("Error: UserId is missing");
            return socialSharing;
        }

        // 调用 Mapper 删除数据
        socialSharingMapper.deleteSocialSharing(socialSharing);
        socialSharing.setReason("successful");
        return socialSharing;
    }

    public List<SocialSharing> getSocialSharingByuserId(int userId) {
        // 检查参数是否为空
        List<SocialSharing> listbyuser =new ArrayList<>();;
        if (Objects.equals(userId,null) || Objects.equals(userId,"")) {
            listbyuser.get(0).setReason("Error: ProductId is missing");
            return listbyuser;
        }


        // 调用 Mapper 获取数据
        return socialSharingMapper.getSocialSharingByuserId(userId);
    }
}

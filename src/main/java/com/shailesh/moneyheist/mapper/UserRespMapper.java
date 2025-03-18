package com.shailesh.moneyheist.mapper;

import com.shailesh.moneyheist.entity.User;
import com.shailesh.moneyheist.responseDto.UserRespDto;

import java.util.Date;


public class UserRespMapper {
    private UserRespMapper() {}

    public static UserRespDto mapToUserRespDto(User user){
        UserRespDto reqUser =  new UserRespDto();
        reqUser.setId(user.getId())
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setPhone(user.getPhone())
                .setEmail(user.getEmail())
                .setCreatedAt(new Date(user.getCreatedAt()))
                .setUpdatedAt(new Date(user.getUpdatedAt()));
        return reqUser;
    }
}

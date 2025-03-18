package com.shailesh.moneyheist.mapper;

import com.shailesh.moneyheist.requestDto.UserReqDto;
import com.shailesh.moneyheist.entity.User;

public class UserReqMapper {
    private UserReqMapper(){}
    public static UserReqDto mapToUserDto(User user){
        UserReqDto reqUser =  new UserReqDto();
        reqUser.setId(user.getId())
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setPhone(user.getPhone())
                .setEmail(user.getEmail());
        return reqUser;
    }

    public static User mapToUser(UserReqDto userReqDto){
        User user=  new User();
        user.setFirstName(userReqDto.getFirstName())
                .setLastName(userReqDto.getLastName())
                .setEmail(userReqDto.getEmail())
                .setPhone(userReqDto.getPhone())
                .setPassword(userReqDto.getPassword());
        return user;

    }
}

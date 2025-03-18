package com.shailesh.moneyheist.service;

import com.shailesh.moneyheist.requestDto.UserReqDto;
import com.shailesh.moneyheist.responseDto.UserRespDto;

public interface UserService {
    UserRespDto createUser(UserReqDto userReqDto);
    UserRespDto getUser(Long id);


}

package com.shailesh.moneyheist.service.impl;

import com.shailesh.moneyheist.mapper.UserRespMapper;
import com.shailesh.moneyheist.requestDto.UserReqDto;
import com.shailesh.moneyheist.entity.User;
import com.shailesh.moneyheist.mapper.UserReqMapper;
import com.shailesh.moneyheist.repository.UserRepository;
import com.shailesh.moneyheist.responseDto.UserRespDto;
import com.shailesh.moneyheist.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;


    @Override
    public UserRespDto createUser(UserReqDto userReqDto) {
        User user = UserReqMapper.mapToUser(userReqDto);
        User newUser = userRepository.save(user);

        return UserRespMapper.mapToUserRespDto(newUser);
    }

    @Override
    public UserRespDto getUser(Long id) {
        User newUser = userRepository.getReferenceById(id);
        return UserRespMapper.mapToUserRespDto(newUser);
    }

}

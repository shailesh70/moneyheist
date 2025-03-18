package com.shailesh.moneyheist.controller.v1;

import com.shailesh.moneyheist.requestDto.UserReqDto;
import com.shailesh.moneyheist.responseDto.UserRespDto;
import com.shailesh.moneyheist.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
@Slf4j
public class UserController {

    private UserService userService;

    @PostMapping
    public ResponseEntity<UserRespDto> createUser(@RequestBody UserReqDto userReqDto){
        log.info("userController :: createUser :: request body = {}", userReqDto);
        UserRespDto saveUser = userService.createUser(userReqDto);
        return new ResponseEntity<>(saveUser, HttpStatus.CREATED);

    }

    @GetMapping("/{id}")
    public ResponseEntity<UserRespDto> getUser(@PathVariable("id") Long userId) {
        log.info("userController :: getUser :: request param = {}", userId);
        UserRespDto user = userService.getUser(userId);

        return ResponseEntity.ok(user);
    }
}

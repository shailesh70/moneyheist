package com.shailesh.moneyheist.requestDto;


import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain=true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserReqDto {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private Long createdAt;
    private Long updatedAt;
}

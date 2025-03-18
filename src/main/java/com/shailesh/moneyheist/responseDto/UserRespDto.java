package com.shailesh.moneyheist.responseDto;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

@Getter
@Setter
@Accessors(chain=true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserRespDto {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Date createdAt;
    private Date updatedAt;
}

package com.example.mynacos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author zhoupeng
 * @Date 2020-04-10 9:54
 */
@Data
@AllArgsConstructor
public class UserDto {
    private String userId;
    private String authority;
}

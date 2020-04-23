package com.example.mynacos.dto;

import lombok.Data;

/**
 * @Author zhoupeng
 * @Date 2020-04-10 10:04
 */
@Data
public class ApiResultDto {
    public ApiResultDto(String code, Object data, boolean isSuccess) {
        this.code = code;
        this.data = data;
        this.isSuccess = isSuccess;
    }

    private String code;
    private Object data;
    private boolean isSuccess;
}

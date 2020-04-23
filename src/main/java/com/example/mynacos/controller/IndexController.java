package com.example.mynacos.controller;

import com.example.mynacos.dto.ApiResultDto;
import com.example.mynacos.dto.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhoupeng
 * @Date 2020-04-10 9:52
 */
@RestController
public class IndexController {

    @RequestMapping("/common/queryUserInfo")
    public ApiResultDto userInfo(String token){
        String userId = "";
        if("userToken001".equals(token)){
            userId = "1";
        }else if("userToken002".equals(token)){
            userId = "2";
        }else if("userToken003".equals(token)){
            userId = "3";
        }else if("userToken004".equals(token)){
            userId = "4";
        }else if("userToken005".equals(token)){
            userId = "5";
        }
        return new ApiResultDto("0",new UserDto(userId,"ROLE_USER"),true);
    }
}

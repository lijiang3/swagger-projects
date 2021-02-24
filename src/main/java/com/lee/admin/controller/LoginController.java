package com.lee.admin.controller;

import com.lee.admin.model.User;
import com.lee.admin.model.UserNamePassword;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author by lxh
 * @date 2021/2/23 15:42
 */
@Api(tags = "登陆")
@RestController
@RequestMapping("/")
public class LoginController {


  @ApiOperation(value = "登陆", notes = "用户登陆")
  @PostMapping("/login")
  public UserNamePassword login(@RequestBody UserNamePassword userNamePassword,
      HttpServletRequest request){
    String token = request.getHeader("token");
    System.out.println(token);
    return userNamePassword;
  }

}

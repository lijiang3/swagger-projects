package com.lee.admin.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * TODO
 *
 * @author by lxh
 * @date 2021/2/23 16:04
 */
@Data
@ApiModel("UserNamePassword对象")
public class UserNamePassword {

  @ApiModelProperty(value = "用户名称", example = "admin")
  private String userName;

  @ApiModelProperty(value = "密码", example = "admin")
  private String password;
}

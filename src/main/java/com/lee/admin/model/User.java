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
@ApiModel("User对象")
public class User {

  @ApiModelProperty(value = "主键ID")
  private Integer id;

  @ApiModelProperty(value = "用户名称")
  private String userName;

  @ApiModelProperty(value = "密码")
  private String password;

  @ApiModelProperty(value = "性别")
  private String sex;

  @ApiModelProperty(value = "年龄")
  private Integer age;

  @ApiModelProperty(value = "电话")
  private String phone;

}

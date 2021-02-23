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
@ApiModel("Menu对象")
public class Menu {

  @ApiModelProperty(value = "主键ID")
  private Integer id;

  @ApiModelProperty(value = "菜单名称")
  private String name;

  @ApiModelProperty(value = "图标")
  private String icon;

  @ApiModelProperty(value = "权限")
  private String perms;
}

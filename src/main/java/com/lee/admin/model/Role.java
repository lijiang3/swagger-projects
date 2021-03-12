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
@ApiModel("Role对象")
public class Role {

  @ApiModelProperty(value = "主键ID")
  private Integer id;

  @ApiModelProperty(value = "角色名称")
  private String name;

  @ApiModelProperty(value = "角色描述")
  private String desc;

  @ApiModelProperty(value = "别名")
  private String nickName;
}

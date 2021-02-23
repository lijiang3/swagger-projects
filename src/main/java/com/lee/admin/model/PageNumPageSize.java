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
@ApiModel("PageNumPageSize对象")
public class PageNumPageSize {

  @ApiModelProperty(value = "页码", example = "1")
  private Integer pageNum;

  @ApiModelProperty(value = "每页条数", example = "10")
  private String pageSize;
}

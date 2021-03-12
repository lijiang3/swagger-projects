package com.lee.admin.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 导入-列信息表
 * </p>
 *
 * @author lxh
 * @since 2021-03-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "ImportColumn对象", description = "导入-列信息表")
public class ImportColumn implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "主键ID")
  private Integer id;

  @ApiModelProperty(value = "模板信息表ID")
  private String tableId;

  private String columnAttrIndex;

  @ApiModelProperty(value = "列名")
  private String columnName;

  @ApiModelProperty(value = "描述")
  private String description;

  @ApiModelProperty(value = "Y失效N可用")
  private String disable;

  @ApiModelProperty(value = "创建时间")
  private Date createTime;

  @ApiModelProperty(value = "创建人ID")
  private Integer createUserId;

  @ApiModelProperty(value = "修改时间")
  private Date updateTime;

  @ApiModelProperty(value = "修改人ID")
  private Integer updateUserId;


}
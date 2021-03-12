package com.lee.admin.model;

import com.sun.org.apache.xpath.internal.operations.Or;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * TODO
 *
 * @author by lxh
 * @date 2021/3/10 16:23
 */
@Data
@ApiModel("GetImportTemplates")
public class GetImportTemplates {

  private String code;

  private String value;
}

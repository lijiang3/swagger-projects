package com.lee.admin.controller;

import com.lee.admin.model.GetImportTemplates;
import com.lee.admin.model.ImportTemplate;
import com.lee.admin.service.ImportTemplateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 导入excel
 *
 *
 * @author by lxh
 * @date 2021/3/10 15:15
 */
@Api(tags = "Excel导入")
@RestController
@RequestMapping("/")
public class ImportExcelController {


  /**
   * 导入
   * 选择模板→上传文件→开始导入
   */
  @ApiOperation(value = "选择模板进行导入", notes = "选择模板进行导入")
  @GetMapping("/importExcel")
  public void importExcel() {

  }

}

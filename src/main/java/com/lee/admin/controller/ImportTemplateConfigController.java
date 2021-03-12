package com.lee.admin.controller;


import com.lee.admin.model.GetImportTemplates;
import com.lee.admin.model.ImportTemplate;
import com.lee.admin.service.ImportTemplateService;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 导入-模板信息表 前端控制器
 * 将一个excel转变为数据库表，数据库表包括{表名称，表描述，sheet页开始下标，sheet页结束下标,row开始下标,col开始下标,是否可用标记}
 * 说明：一对一关系，如果一个excel只包括一个sheet页，则一个excel代表一个数据库表，sheet页开始结束下标为0；
 * 一对多关系，如果一个excel包括多个sheet页，则规定相同sheet页内容为一个数据库表，不同sheet页内容表示不同的数据库表，
 * 如果相同内容的sheet页连续，则设置sheet页的开始下标和结束下标。
 * </p>
 *
 * @author lxh
 * @since 2021-03-11
 */
@RestController
@RequestMapping("/import-template")
public class ImportTemplateConfigController {

  @Autowired
  private ImportTemplateService importTemplateService;

  /*查询可用的模板，如果查询为空则添加*/
  @ApiOperation(value = "查询模板", notes = "查询模板")
  @GetMapping("/getImportTemplates")
  public List<GetImportTemplates> getImportTemplates() {
    List<GetImportTemplates> list = importTemplateService.getImportTemplates();
    return list;
  }

  /**
   * 添加模板，需配置sheet页开始结束下标，row开始下标，col开始下标
   */
  @ApiOperation(value = "添加模板", notes = "添加模板")
  @GetMapping("/save")
  public void save(@RequestBody ImportTemplate importTemplate) {
    importTemplateService.save(importTemplate);
  }

  /**
   * 启用禁用
   */
  @ApiOperation(value = "启用禁用", notes = "启用禁用")
  @GetMapping("/switchOnAndOff")
  public void switchOnAndOff() {
  }

  /**
   * 强制自动导入开启，ON开启OFF关闭
   * 数据库表列信息与excel列信息相似度在60%才有作用
   */
  @ApiOperation(value = "启用禁用", notes = "启用禁用")
  @GetMapping("/switchForceOnAndOff")
  public void switchForceOnAndOff() {
  }
}


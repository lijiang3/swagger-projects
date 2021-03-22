package com.lee.admin.controller;


import com.lee.admin.model.ImportColumn;
import com.lee.admin.service.IImportColumnService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 导入-列信息表 前端控制器
 * 将excel的sheet页包含的列信息转换为数据库表，数据库表包括{列名称，列描述，属性下标，排序，是否可用标记}
 * 先创建模板信息表才能添加列信息表。
 * 自动导入原理：
 * 指定模板→上传excel→获取指定模板的配置{sheet下标、row下标、col下标}→解析excel获取首行的列信息
 * →excel列信息与数据库表可用的列信息比对→数量、名称一致则自动导入成功，否则转为人工导入
 * 人工导入原理：
 * 1、首行获取失败：修改模板配置获取正确的首行列信息→解析excel获取首行的列信息
 * →excel列信息与数据库表可用的列信息比对→数量、名称一致则自动导入成功，否则转为人工导入
 * 2、数量不一致：
 * a、数据库列信息少于excel列信息：以数据库表列信息为主人工导入；往数据库表列信息添加新数据，完成自动导入。
 * b、数据库列信息大于excel列信息：以数据库表列信息为主人工导入；多余的数据库表列信息删除或者标记无用，完成自动导入。
 * 3、名称不一致：
 * a、修改数据库表列信息名称与excel列信息保持一致，完成自动导入。
 * b、往数据库表列信息添加新数据&&多余的数据库表列信息删除或者标记无用，完成自动导入。
 * c、只改动b中的任意一项，完成人工导入
 * 4、数量、名称不一致：
 * a、参照2、3点完成自动导入
 * b、人工导入
 * </p>
 *
 * @author lxh
 * @since 2021-03-11
 */
@RestController
@RequestMapping("/import-column")
public class ImportColumnConfigController {

  @Autowired
  private IImportColumnService iImportColumnService;

  /**
   * 添加列信息，属性下标及排序自动生成
   * 获取数据库数据（orderNum倒序），如果查询为空，属性下标和排序从1开始，否则属性下标+1和排序+1
   */
  @ApiOperation(value = "添加模板", notes = "添加模板")
  @GetMapping("/save")
  public void save(@RequestBody ImportColumn importColumn) {
    iImportColumnService.save(importColumn);
  }

  /**
   * 启用禁用
   */
  @ApiOperation(value = "启用禁用", notes = "启用禁用")
  @GetMapping("/switchOnAndOff")
  public void switchOnAndOff() {
  }

  /**
   * 修改
   */
  @ApiOperation(value = "修改", notes = "修改")
  @GetMapping("/updateById")
  public void updateById() {
  }

  /**
   * 删除
   */
  @ApiOperation(value = "删除", notes = "删除")
  @GetMapping("/deleteById")
  public void deleteById() {
  }

  /**
   * 排序换位
   * 选择且只能选择两条数据进行排序换位
   */
  @ApiOperation(value = "排序换位", notes = "排序换位")
  @GetMapping("/transposition")
  public void transposition() {
  }

  /**
   * 相似度比对开关
   * 尽可能少标记，只比对两三个字段，节约时间
   */
  @ApiOperation(value = "相似度比对开关", notes = "相似度比对开关")
  @GetMapping("/switchSimilarityOnAndOff")
  public void switchSimilarityOnAndOff() {
  }

}


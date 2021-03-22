package com.lee.admin.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 导入-数据相似度信息表 前端控制器
 * </p>
 *
 * @author lxh
 * @since 2021-03-11
 */
@RestController
@RequestMapping("/import-column")
public class ImportDataSimilarityController {


  /**
   * 列表查看（默认相似度倒序查询，根据批次ID查询对手批次）
   */
  @ApiOperation(value = "列表查看", notes = "列表查看")
  @GetMapping("/list")
  public void list() {
  }

  /**
   * 根据ID删除
   */
  @ApiOperation(value = "根据ID删除", notes = "根据ID删除")
  @GetMapping("/deleteById")
  public void deleteById() {
  }

  /**
   * 详情
   * 根据ID查询目标批次号和对手批次号
   * 分两个tab展示，一个tab根据目标批次号查询数据列表（可以指定字段排序），
   * 另一个tab根据对手批次号查询数据列表（可以指定字段排序）
   */
  @ApiOperation(value = "详情", notes = "详情")
  @GetMapping("/detail")
  public void detail() {
  }

  /**
   * 相似度对比开始
   * 导入完成→模板信息表相似度比对开关开启&&列信息相似度开关开启→调用相似度对比方法，开始相似度比对
   * →获取模型信息表拿到表名→获取列信息表拿到有标记的列→仅查询有标记的列(条件是该批次)
   * →遍历其他批次→目标批次与各对手批次比对，入库
   */
  @ApiOperation(value = "详情", notes = "详情")
  @GetMapping("/start")
  public void start() {

  }

}


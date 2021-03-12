package com.lee.admin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 导入-批次信息表
 *
 *
 * @author by lxh
 * @date 2021/3/10 15:15
 */
@Api(tags = "导入-批次信息表")
@RestController
@RequestMapping("/")
public class ImportProcessBatchController {



  /**
   * 查询导入成功的批次列表（默认创建时间倒序，可以指定字段进行排序查询）
   * 展示列{模板名称，文件名称，文件下载，状态，导入数据总条数}
   */
  @ApiOperation(value = "查询导入成功的批次列表", notes = "查询导入成功的批次列表")
  @GetMapping("/listSuccess")
  public void listSuccess() {
  }

  /**
   * 查询导入失败&&处理中的批次列表（默认创建时间倒序，可以指定字段进行排序查询）
   * 展示列{模板名称，文件名称，文件下载，状态，导入数据总条数}
   */
  @ApiOperation(value = "查询导入失败的批次列表", notes = "查询导入失败的批次列表")
  @GetMapping("/listFailure")
  public void listFailure() {
  }


  /**
   * 添加批次
   * 成功状态下{模板名称，文件名称，文件下载，状态，导入数据总条数，excel列信息}
   * 失败状态下{模板名称，文件名称，文件下载，状态，导入数据总条数，excel列信息}
   */
  @ApiOperation(value = "添加批次", notes = "添加批次")
  @GetMapping("/save")
  public void save() {
  }

  /**
   * 详情
   * 进入详情页，详情页展示：
   * 展示数据库表模板信息（模板名称，状态标记，强制导入标记）
   * 展示数据库表批次信息（文件名称，文件下载，状态，excel列信息，导入数据总条数，导入失败原因）
   * 展示数据表列信息{支持修改、删除、添加、标记无效化、排序换位}
   * 页面提供模板信息编辑入口{可能会设置sheet页开始结束下标、row下标、col下标、状态、是否可用标记等}
   * （如果是导入成功状态的详情，则另外还提供相似度对比、相似度规则设置；
   * 如果是导入失败状态的详情，则另外提供重新尝试导入按钮，点击则该页面关闭）
   */
  @ApiOperation(value = "详情", notes = "详情")
  @GetMapping("/detail")
  public void detail() {
  }

  /**
   * 根据ID删除
   */
  @ApiOperation(value = "根据ID删除", notes = "根据ID删除")
  @GetMapping("/deleteById")
  public void deleteById() {
  }
}

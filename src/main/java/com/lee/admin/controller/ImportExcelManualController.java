package com.lee.admin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 手动导入excel-指处理失败的批次
 *
 *
 * @author by lxh
 * @date 2021/3/10 15:15
 */
@Api(tags = "手动导入excel")
@RestController
@RequestMapping("/")
public class ImportExcelManualController {


  /**
   * 重新尝试导入（需指定批次ID）
   * 分两步。第一步，修改批次表状态为处理中
   * 第二步，获取已保存到服务器上的文件，开始导入
   * 如果自动导入成功，更新状态为成功，否则更新状态为失败
   */
  @ApiOperation(value = "重新尝试导入", notes = "重新尝试导入")
  @GetMapping("/tryAgain")
  public void tryAgain() {
  }


}

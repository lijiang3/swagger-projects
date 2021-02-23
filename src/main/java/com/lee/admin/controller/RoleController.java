package com.lee.admin.controller;

import com.lee.admin.model.Role;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author by lxh
 * @date 2021/2/23 15:42
 */
@Api(tags = "角色管理")
@RestController
@RequestMapping("/role")
public class RoleController {

  @ApiOperation("新增")
  @PostMapping("/save")
  public void save(@RequestBody Role role){

  }

  @ApiOperation("查询单个")
  @GetMapping("/findById/{id}")
  public void findById(@PathVariable("id") Integer id){

  }

  @ApiOperation("修改")
  @PostMapping("/update")
  public void update(@RequestBody Role role){

  }

  @ApiOperation("删除单个")
  @GetMapping("/deleteById/{id}")
  public void deleteById(@PathVariable("id") Integer id){

  }
}

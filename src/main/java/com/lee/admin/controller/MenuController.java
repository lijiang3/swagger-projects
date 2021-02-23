package com.lee.admin.controller;

import com.lee.admin.model.Menu;
import com.lee.admin.model.PageNumPageSize;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.ArrayList;
import java.util.List;
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
@Api(tags = "菜单管理")
@RestController
@RequestMapping("/menu")
public class MenuController {

  @ApiOperation("新增")
  @PostMapping("/save")
  public void save(@RequestBody Menu menu){

  }

  @ApiOperation("查询单个")
  @GetMapping("/findById/{id}")
  public Menu findById(@PathVariable("id") Integer id){

    return new Menu();
  }

  @ApiOperation("分页查询")
  @GetMapping("/list")
  public List<Menu> list(@RequestBody PageNumPageSize pageNumPageSize){

    return new ArrayList<>();
  }

  @ApiOperation("修改")
  @PostMapping("/update")
  public void update(@RequestBody Menu menu){

  }

  @ApiOperation("删除单个")
  @GetMapping("/deleteById/{id}")
  public void deleteById(@PathVariable("id") Integer id){

  }
}

package com.lee.admin.dao;

import com.lee.admin.model.Role;
import org.apache.ibatis.annotations.Mapper;

/**
 * TODO
 *
 * @author by lxh
 * @date 2021/3/10 11:14
 */
@Mapper
public interface RoleDao {

  Role findById(Integer id);
}

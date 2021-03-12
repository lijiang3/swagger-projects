package com.lee.admin.service.impl;

import com.lee.admin.dao.RoleDao;
import com.lee.admin.model.Role;
import com.lee.admin.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author by lxh
 * @date 2021/3/10 11:13
 */
@Service
public class RoleServiceImpl implements RoleService {

  @Autowired
  private RoleDao roleDao;

  @Override
  public Role findById(Integer id) {
    return roleDao.findById(id);
  }
}

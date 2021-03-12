package com.lee.admin.service.impl;

import com.lee.admin.dao.ImportColumnMapper;
import com.lee.admin.model.ImportColumn;
import com.lee.admin.service.IImportColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 导入-列信息表 服务实现类
 * </p>
 *
 * @author lxh
 * @since 2021-03-11
 */
@Service
public class ImportColumnServiceImpl implements IImportColumnService {

  @Autowired
  private ImportColumnMapper importColumnMapper;

  @Override
  public void save(ImportColumn importColumn) {
    importColumnMapper.save(importColumn);
  }
}

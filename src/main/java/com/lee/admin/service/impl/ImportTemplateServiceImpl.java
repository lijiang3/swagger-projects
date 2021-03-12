package com.lee.admin.service.impl;

import com.lee.admin.dao.ImportTemplateDao;
import com.lee.admin.model.GetImportTemplates;
import com.lee.admin.model.ImportTemplate;
import com.lee.admin.service.ImportTemplateService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author by lxh
 * @date 2021/3/10 16:25
 */
@Service
public class ImportTemplateServiceImpl implements ImportTemplateService {

  @Autowired
  private ImportTemplateDao importTemplateDao;

  @Override
  public List<GetImportTemplates> getImportTemplates() {
    return importTemplateDao.getImportTemplates();
  }

  @Override
  public void save(ImportTemplate importTemplate) {
    importTemplateDao.save(importTemplate);
  }
}

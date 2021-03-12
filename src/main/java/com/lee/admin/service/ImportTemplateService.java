package com.lee.admin.service;

import com.lee.admin.model.GetImportTemplates;
import com.lee.admin.model.ImportTemplate;
import java.util.List;

/**
 * TODO
 *
 * @author by lxh
 * @date 2021/3/10 16:25
 */
public interface ImportTemplateService {

  List<GetImportTemplates> getImportTemplates();

  void save(ImportTemplate importTemplate);
}

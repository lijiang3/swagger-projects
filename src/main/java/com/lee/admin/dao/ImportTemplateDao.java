package com.lee.admin.dao;

import com.lee.admin.model.GetImportTemplates;
import com.lee.admin.model.ImportTemplate;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * TODO
 *
 * @author by lxh
 * @date 2021/3/10 16:27
 */
@Mapper
public interface ImportTemplateDao {

  List<GetImportTemplates> getImportTemplates();

  void save(ImportTemplate importTemplate);
}

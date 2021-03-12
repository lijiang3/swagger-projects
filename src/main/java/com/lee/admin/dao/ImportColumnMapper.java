package com.lee.admin.dao;

import com.lee.admin.model.ImportColumn;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 导入-列信息表 Mapper 接口
 * </p>
 *
 * @author lxh
 * @since 2021-03-11
 */
@Mapper
public interface ImportColumnMapper {

  void save(ImportColumn importColumn);
}

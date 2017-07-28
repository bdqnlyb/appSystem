package dao;

import entity.appCategory;

public interface appCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(appCategory record);

    int insertSelective(appCategory record);

    appCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(appCategory record);

    int updateByPrimaryKey(appCategory record);
}
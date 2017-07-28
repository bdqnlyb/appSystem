package dao;

import entity.appInfo;

public interface appInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(appInfo record);

    int insertSelective(appInfo record);

    appInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(appInfo record);

    int updateByPrimaryKey(appInfo record);
}
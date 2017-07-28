package dao;

import entity.appVersion;

public interface appVersionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(appVersion record);

    int insertSelective(appVersion record);

    appVersion selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(appVersion record);

    int updateByPrimaryKey(appVersion record);
}
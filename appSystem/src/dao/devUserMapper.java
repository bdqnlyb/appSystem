package dao;

import entity.devUser;

public interface devUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(devUser record);

    int insertSelective(devUser record);

    devUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(devUser record);

    int updateByPrimaryKey(devUser record);
}
package dao;

import entity.backendUser;

public interface backendUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(backendUser record);

    int insertSelective(backendUser record);

    backendUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(backendUser record);

    int updateByPrimaryKey(backendUser record);
}
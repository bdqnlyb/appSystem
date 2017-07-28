package dao;

import entity.dataDictionary;

public interface dataDictionaryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(dataDictionary record);

    int insertSelective(dataDictionary record);

    dataDictionary selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(dataDictionary record);

    int updateByPrimaryKey(dataDictionary record);
}
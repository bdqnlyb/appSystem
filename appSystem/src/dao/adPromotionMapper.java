package dao;

import entity.adPromotion;

public interface adPromotionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(adPromotion record);

    int insertSelective(adPromotion record);

    adPromotion selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(adPromotion record);

    int updateByPrimaryKey(adPromotion record);
}
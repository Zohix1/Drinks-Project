package com.drinks.erp.datasource.mappers;

import com.drinks.erp.datasource.entities.MaterialCurrentStockExample;
import com.drinks.erp.datasource.entities.MaterialCurrentStock;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialCurrentStockMapper {
    long countByExample(MaterialCurrentStockExample example);

    int deleteByExample(MaterialCurrentStockExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MaterialCurrentStock record);

    int insertSelective(MaterialCurrentStock record);

    List<MaterialCurrentStock> selectByExample(MaterialCurrentStockExample example);

    MaterialCurrentStock selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MaterialCurrentStock record, @Param("example") MaterialCurrentStockExample example);

    int updateByExample(@Param("record") MaterialCurrentStock record, @Param("example") MaterialCurrentStockExample example);

    int updateByPrimaryKeySelective(MaterialCurrentStock record);

    int updateByPrimaryKey(MaterialCurrentStock record);
}

package com.drinks.erp.datasource.mappers;

import com.drinks.erp.datasource.entities.MaterialInitialStock;

import java.util.List;

public interface MaterialInitialStockMapperEx {

    int batchInsert(List<MaterialInitialStock> list);

}

package com.drinks.erp.datasource.mappers;

import com.drinks.erp.datasource.entities.TenantExample;
import com.drinks.erp.datasource.entities.Tenant;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TenantMapper {
    long countByExample(TenantExample example);

    int deleteByExample(TenantExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tenant record);

    int insertSelective(Tenant record);

    List<Tenant> selectByExample(TenantExample example);

    Tenant selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Tenant record, @Param("example") TenantExample example);

    int updateByExample(@Param("record") Tenant record, @Param("example") TenantExample example);

    int updateByPrimaryKeySelective(Tenant record);

    int updateByPrimaryKey(Tenant record);
}

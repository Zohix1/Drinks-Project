package com.drinks.erp.datasource.mappers;

import com.drinks.erp.datasource.entities.User;
import com.drinks.erp.datasource.entities.UserEx;
import com.drinks.erp.datasource.vo.TreeNodeEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapperEx {

    List<UserEx> selectByConditionUser(
            @Param("userName") String userName,
            @Param("loginName") String loginName,
            @Param("offset") Integer offset,
            @Param("rows") Integer rows);

    Long countsByUser(
            @Param("userName") String userName,
            @Param("loginName") String loginName);

    List<User> getUserListByUserNameOrLoginName(@Param("userName") String userName,
                                                @Param("loginName") String loginName);

    int batDeleteOrUpdateUser(@Param("ids") String ids[], @Param("status") byte status);

    List<TreeNodeEx> getNodeTree();
    List<TreeNodeEx> getNextNodeTree(Map<String, Object> parameterMap);

    void disableUserByLimit(@Param("tenantId") Long tenantId);
}

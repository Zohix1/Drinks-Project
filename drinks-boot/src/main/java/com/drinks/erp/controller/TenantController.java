package com.drinks.erp.controller;

import com.alibaba.fastjson.JSONObject;
import com.drinks.erp.utils.ErpInfo;
import com.drinks.erp.utils.ResponseJsonUtil;
import com.drinks.erp.service.tenant.TenantService;
import com.drinks.erp.utils.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ji_sheng_hua 华夏erp
 */
@RestController
@RequestMapping(value = "/tenant")
@Api(tags = {"租户管理"})
public class TenantController {
    private Logger logger = LoggerFactory.getLogger(TenantController.class);

    @Resource
    private TenantService tenantService;

    /**
     * 批量设置状态-启用或者禁用
     * @param jsonObject
     * @param request
     * @return
     */
    @PostMapping(value = "/batchSetStatus")
    @ApiOperation(value = "批量设置状态")
    public String batchSetStatus(@RequestBody JSONObject jsonObject,
                                 HttpServletRequest request)throws Exception {
        Boolean status = jsonObject.getBoolean("status");
        String ids = jsonObject.getString("ids");
        Map<String, Object> objectMap = new HashMap<>();
        int res = tenantService.batchSetStatus(status, ids);
        if(res > 0) {
            return ResponseJsonUtil.returnJson(objectMap, ErpInfo.OK.name, ErpInfo.OK.code);
        } else {
            return ResponseJsonUtil.returnJson(objectMap, ErpInfo.ERROR.name, ErpInfo.ERROR.code);
        }
    }
}

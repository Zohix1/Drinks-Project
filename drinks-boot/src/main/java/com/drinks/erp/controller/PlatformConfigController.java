package com.drinks.erp.controller;

import com.alibaba.fastjson.JSONObject;
import com.drinks.erp.service.platformConfig.PlatformConfigService;
import com.drinks.erp.utils.BaseResponseInfo;
import com.drinks.erp.utils.ErpInfo;
import com.drinks.erp.utils.ResponseJsonUtil;
import com.drinks.erp.datasource.entities.PlatformConfig;
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
 * @author ji|sheng|hua 华夏erp QQ7827-18920
 */
@RestController
@RequestMapping(value = "/platformConfig")
@Api(tags = {"平台参数"})
public class PlatformConfigController {
    private Logger logger = LoggerFactory.getLogger(PlatformConfigController.class);

    @Resource
    private PlatformConfigService platformConfigService;

    /**
     * 获取平台名称
     * @param request
     * @return
     */
    @GetMapping(value = "/getPlatform/name")
    @ApiOperation(value = "获取平台名称")
    public String getPlatformName(HttpServletRequest request)throws Exception {
        String res;
        try {
            String platformKey = "platform_name";
            PlatformConfig platformConfig = platformConfigService.getPlatformConfigByKey(platformKey);
            res = platformConfig.getPlatformValue();
        } catch(Exception e){
            e.printStackTrace();
            res = "ERP系统";
        }
        return res;
    }

    /**
     * 获取官方网站地址
     * @param request
     * @return
     */
    @GetMapping(value = "/getPlatform/url")
    @ApiOperation(value = "获取官方网站地址")
    public String getPlatformUrl(HttpServletRequest request)throws Exception {
        String res;
        try {
            String platformKey = "platform_url";
            PlatformConfig platformConfig = platformConfigService.getPlatformConfigByKey(platformKey);
            res = platformConfig.getPlatformValue();
        } catch(Exception e){
            e.printStackTrace();
            res = "#";
        }
        return res;
    }

    /**
     * 根据platformKey更新platformValue
     * @param object
     * @param request
     * @return
     */
    @PostMapping(value = "/updatePlatformConfigByKey")
    @ApiOperation(value = "根据platformKey更新platformValue")
    public String updatePlatformConfigByKey(@RequestBody JSONObject object,
                                            HttpServletRequest request)throws Exception {
        Map<String, Object> objectMap = new HashMap<>();
        String platformKey = object.getString("platformKey");
        String platformValue = object.getString("platformValue");
        int res = platformConfigService.updatePlatformConfigByKey(platformKey, platformValue);
        if(res > 0) {
            return ResponseJsonUtil.returnJson(objectMap, ErpInfo.OK.name, ErpInfo.OK.code);
        } else {
            return ResponseJsonUtil.returnJson(objectMap, ErpInfo.ERROR.name, ErpInfo.ERROR.code);
        }
    }

    /**
     * 根据platformKey查询信息
     * @param platformKey
     * @param request
     * @return
     */
    @GetMapping(value = "/getPlatformConfigByKey")
    @ApiOperation(value = "根据platformKey查询信息")
    public BaseResponseInfo getPlatformConfigByKey(@RequestParam("platformKey") String platformKey,
                                                   HttpServletRequest request)throws Exception {
        BaseResponseInfo res = new BaseResponseInfo();
        try {
            PlatformConfig platformConfig = platformConfigService.getPlatformConfigByKey(platformKey);
            res.code = 200;
            res.data = platformConfig;
        } catch(Exception e){
            e.printStackTrace();
            res.code = 500;
            res.data = "获取数据失败";
        }
        return res;
    }
}

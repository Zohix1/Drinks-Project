package com.drinks.erp.service.platformConfig;

import com.drinks.erp.service.ResourceInfo;

import java.lang.annotation.*;

/**
 * @author jishenghua qq752718920  2020-10-16 22:26:27
 */
@ResourceInfo(value = "platformConfig")
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PlatformConfigResource {
}

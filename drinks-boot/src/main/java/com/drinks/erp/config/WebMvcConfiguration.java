//package com.drinks.erp.config;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.module.SimpleModule;
//import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
//import com.drinks.erp.service.redis.RedisService;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Conditional;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.config.annotation.*;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.List;
//
///**
// * Spring Boot 2.0 解决跨域问题
// *
// * @Author qinfeng
// *
// */
//@Configuration
//public class WebMvcConfiguration implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedHeaders("*")
//                .allowedMethods("*")
//                .allowedOrigins("*")
//                .maxAge(3600)
//                .exposedHeaders("Access-Control-Allow-Origin", "Access-Control-Allow-Credentials")
//                .allowCredentials(true);
//    }
//
//
////    private CorsConfiguration buildConfig() {
////        CorsConfiguration corsConfiguration = new CorsConfiguration();
////        corsConfiguration.addAllowedOrigin("*");
////        corsConfiguration.addAllowedHeader("*");
////        corsConfiguration.addAllowedMethod("*");
////        corsConfiguration.addExposedHeader("X-Access-Token");
////        corsConfiguration.setMaxAge(3600L);
////        corsConfiguration.setAllowCredentials(true);
////        return corsConfiguration;
////    }
////
////    @Bean
////    public CorsFilter corsFilter() {
////        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
////        CorsConfiguration corsConfiguration = buildConfig();
//////        corsConfiguration.addExposedHeader("X-Access-Token");
////        source.registerCorsConfiguration("/**", corsConfiguration);
////        return new CorsFilter(source);
////    }
//
//
//}

package com.gxy.config.configer;

import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @author:  guoxiaoyu
 * @date : 2018/8/25
 */
@Configuration
public class FilterConfiguration {
 /*   @Bean
    public FilterRegistrationBean requestFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new HttpServletRequestBodyFilter());
        registration.addUrlPatterns("/*");
        registration.setName("cache_body_request");
        registration.setOrder(Integer.MAX_VALUE - 1);
        return registration;
    }

    @Bean
    public FilterRegistrationBean xssFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new HttpServletRequestXssFilter());
        registration.addUrlPatterns("/*");
        registration.setName("xss_filter");
        registration.setOrder(Integer.MAX_VALUE);
        return registration;
    }*/

}

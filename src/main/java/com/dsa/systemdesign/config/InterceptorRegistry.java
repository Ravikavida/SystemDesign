package com.dsa.systemdesign.config;

import com.dsa.systemdesign.interceptor.ApplicantInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorRegistry implements WebMvcConfigurer {


    public void addInterceptors(InterceptorRegistry interceptorRegistry){

        interceptorRegistry.addInterceptors(new ApplicantInterceptor());
                //.addPathPattrens("/")
               // .excludePathParrens("/");

    }


}

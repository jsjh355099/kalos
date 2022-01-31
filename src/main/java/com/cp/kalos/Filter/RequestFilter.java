package com.cp.kalos.Filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class RequestFilter implements WebMvcConfigurer {

//	List<String> url = Arrays.asList("/profiles/**", "/orders/**", "/feedback/**", "/payment/**");
//	@Autowired
//	private RequestInterceptor interceptor;
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(interceptor).addPathPatterns(url).excludePathPatterns("/", "/css/**", "/js/**",
//				"/image/**");
//	}
}
package com.through.hystric;



import org.springframework.stereotype.Component;

import com.through.service.UserService;

import feign.hystrix.FallbackFactory;

/**
 * 错误断路器
 * <p>Title: ErrorHystric.java</p>
 * @author TAO
 * @date 2019年12月10日
 */
@Component
public class ErrorHystric implements UserService{

	@Override
	public String test(String name) {
		return "sorry,error......";
	}

}

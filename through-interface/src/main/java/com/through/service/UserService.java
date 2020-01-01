package com.through.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.through.hystric.ErrorHystric;


//@FeignClient(value="throughService")  //指定消费的服务
@FeignClient(value="throughService",fallback=ErrorHystric.class)  //指定消费的服务  指定断路器
public interface UserService {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
    public String test(@RequestParam(value = "name", defaultValue = "tao") String name);
}

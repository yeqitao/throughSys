package com.through.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.through.dao.UserDao;
import com.through.entity.User;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserServiceImpl {
	
	@Autowired
    private UserDao userDao;	
	
	@Value("${server.port}")
    String port;
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
    public String test(@RequestParam(value = "name") String name) {
		List<User> list = userDao.findAll();
		System.out.println(list);
		System.out.println(list.get(0).getName());
        return "hi " + name + " ,i ammmAAA from port:" + port+" >>> "+list;
    }
}

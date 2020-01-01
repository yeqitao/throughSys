package com.through.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.through.service.UserService;

@RestController
@RequestMapping(value="/user")

public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
    public String test(@RequestParam(value = "name", defaultValue = "tao") String name) {
        return userService.test(name);
    }
}

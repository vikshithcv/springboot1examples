package com.awpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	//@RequestMapping("/hello")
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(){  
        return"Hello!";  
    }  

}

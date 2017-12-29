package com.example.springBootjsp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringBootJspController {
	@RequestMapping(value="/index")  
	public String test() {
		return "index";
	}
}

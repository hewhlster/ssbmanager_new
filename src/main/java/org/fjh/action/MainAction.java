package org.fjh.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainAction {
	
	@RequestMapping("/top")
	public String top(){
		return "top";
	}
	
	@RequestMapping("/left")
	public String left(){
		return "left";
	}
	
	@RequestMapping("/center")
	public String center(){
		return "middel";
	}
	
	@RequestMapping("/down")
	public String down(){
		return "down";
	}
	
	@RequestMapping("/tab")
	public String tab(){
		return "/tab/tab";
	}
}

package com.you.spring.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("index")
public class RestController {
	@RequestMapping(value="/blog/{id}",method=RequestMethod.POST)
	@ResponseBody
	public String delete(@PathVariable Long id,HttpServletRequest request,HttpServletResponse response) {
		
		return "aaaaa"+id+"key:"+request.getHeader("key")+"para:"+request.getParameter("para");
	}
	
	@RequestMapping(value="/blog/{blogId}/message/{msgId}",method=RequestMethod.GET)
	@ResponseBody
	public String delete(@PathVariable("blogId") Long blogId,@PathVariable("msgId") Long msgId,HttpServletRequest request,HttpServletResponse response) {
		return "bbb"+blogId+"ccc"+msgId;
	}
}

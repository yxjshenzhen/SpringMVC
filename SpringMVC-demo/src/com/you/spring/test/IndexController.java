package com.you.spring.test;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
  

@Controller  
@RequestMapping("index")  
public class IndexController {  
    @RequestMapping("helloWorld")  
    public String helloworld() {  
        // return "success"; //��ת��successҳ��  
        return "succ";  
    }  
  
}  
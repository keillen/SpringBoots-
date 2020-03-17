package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@Controller
public class HelloController {
   @Autowired
   private LimitConfig limitConfig;
    @GetMapping({"/hello","/hi"})
         public String say(){
          //return limitConfig.getDescription();
        return "index";
         }
}

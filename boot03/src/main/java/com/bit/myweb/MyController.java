package com.bit.myweb;

import java.util.Map;
import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController{

    @RequestMapping("/msg")
    public Map<String, Object> msg(){
        //String msg="{\"id\":1,\"content\":\"Hello, World!\"}";
        Map<String, Object> map = new HashMap<String, Object>();
    	map.put("id", "1");
    	map.put("content", "Hello, World!aaaaaaaaaaaaaaaaaa");
        return map;
    }

}
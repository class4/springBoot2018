package com.bit.myview;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController{

    @RequestMapping("/")
    public String index(Model model){
        ArrayList<JavaBean> list=new ArrayList<>();
        JavaBean bean=new JavaBean();
        bean.setSu(1000);
        bean.setMsg("abcd");
        list.add(bean);
        bean=new JavaBean();
        bean.setSu(2000);
        bean.setMsg("efg");
        list.add(bean);
        bean=new JavaBean();
        bean.setSu(3000);
        bean.setMsg("hijk");
        list.add(bean);
        model.addAttribute("alist", list);
        return "page1";
    }

}
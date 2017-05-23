package com.zhch.demo07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 响应返回　freemarker 模板<br>
 * 1. pom.xml 中引用　starter-freemarker<br>
 * 2. Controller 配置好RequestMapping()<br>
 * 3. 配置文件中freemarker 相关配置，　application.properties<br>
 * 4. 写好 *.ftl 模板文件<br>
 * 至于返回静态文件，直接放在classpath:static 或　public 下就可以
 * @author zhch May 23, 2017
 *
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/marker")
public class Demo07ResponseHtml {
    Logger LOG = LoggerFactory.getLogger(getClass());

    // https://spring.io/blog/2013/12/19/serving-static-web-content-with-spring-boot
    // 这是　spring boot 定义的搜索静态文件的位置
    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
            "classpath:/META-INF/resources/", "classpath:/resources/",
            "classpath:/static/", "classpath:/public/" };

    // http://localhost:8080/marker/
    @RequestMapping("/")
    String home(Model model) {
        model.addAttribute("hello", "Hello World free marker!");
        return "index";
    }

    // http://localhost:8080/marker/errlist
    @RequestMapping("/errlist")
    String page(Model model) {
        model.addAttribute("errorLogLink", "http://www.baidu.com");
        List<Map<String, String>> errs = new ArrayList<>();
        Map<String, String> m1 = new HashMap<>();
        m1.put("msg", "msg");
        m1.put("eName", "eName");
        errs.add(m1);
        Map<String, String> m2 = new HashMap<>();
        m2.put("msg", "msg");
        m2.put("eName", "eName");
        m2.put("details", "details hahaha");
        errs.add(m2);
        model.addAttribute("errorList", errs);
        return "err_list";
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Demo07ResponseHtml.class, args);
    }
}
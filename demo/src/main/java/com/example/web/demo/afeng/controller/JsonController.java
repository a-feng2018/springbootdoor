package com.example.web.demo.afeng.controller;

import com.example.web.demo.afeng.adminapi.Blogger;
import com.example.web.demo.afeng.adminapi.JsonResult;
import com.example.web.demo.afeng.adminapi.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: demo
 * @description:
 * @author: 闫国栋
 * @create: 2022-08-14 14:08
 **/
@RestController
@RequestMapping("/jsonResult")
public class JsonController {
    private static final Logger logger = LoggerFactory.getLogger(JsonController.class);

    @RequestMapping("/user")
    public JsonResult<User> getUser() {
        User user = new User(1, "小张", "123456");
        return new JsonResult<>(user);
    }

    @RequestMapping("/list")
    public JsonResult<List> getUserList() {
        List<User> userList = new ArrayList<>();
        User user1 = new User(1, "小张", "123456");
        User user2 = new User(2, "李四", "123456");
        userList.add(user1);
        userList.add(user2);
        return new JsonResult<>(userList, "获取用户列表成功");
    }

    @RequestMapping("/map")
    public JsonResult<Map> getMap() {
        Map<String, Object> map = new HashMap<>(3);
        User user = new User(1, "小张", null);
        map.put("作者信息", user);
        map.put("博客地址", "http://blog.itcodai.com");
        map.put("CSDN地址", null);
        map.put("粉丝数量", 3568);
        logger.debug("===========测试日志debug级别打印===========");
        logger.info("============测试日志info级别打印============");
        logger.error("===========测试日志error级别打印===========");
        logger.warn("============测试日志warn级别打印============");
        return new JsonResult<>(map);
    }
    @GetMapping("/getList")
    public String getList(Model model) {
        Blogger blogger1 = new Blogger(1L, "小贾", "123456");
        Blogger blogger2 = new Blogger(2L, "小明", "123456");
        List<Blogger> list = new ArrayList<>();
        list.add(blogger1);
        list.add(blogger2);
        model.addAttribute("list", list);
        return "list";
    }

}


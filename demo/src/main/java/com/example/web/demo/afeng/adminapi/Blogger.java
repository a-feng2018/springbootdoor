package com.example.web.demo.afeng.adminapi;

/**
 * @program: demo
 * @description:
 * @author: 闫国栋
 * @create: 2022-08-14 14:48
 **/

public class Blogger {
    private Long id;
    private String name;
    private String pass;
        // 省去set和get

    public Blogger(Long id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }
}

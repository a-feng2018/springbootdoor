package com.example.web.demo.afeng.controller;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.*;

/**
 * @program: demo
 * @description:
 * @author: 闫国栋
 * @create: 2022-08-14 14:05
 **/

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Controller
@ResponseBody
public @interface RestController {
    @AliasFor(
            annotation = Controller.class
    )
    String value() default "";
}

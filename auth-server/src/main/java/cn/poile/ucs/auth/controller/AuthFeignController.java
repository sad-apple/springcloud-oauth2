package cn.poile.ucs.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：zhang shi ping
 * @Date：Created in 10:39 2021/6/25
 * @Description：
 * @ModifiedBy：
 * @Version:
 */
@RestController
public class AuthFeignController implements AuthFeign{
    @Override
    public String hello(String param) {
        return "hello: " + param;
    }
}

package cn.poile.ucs.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author：zhang shi ping
 * @Date：Created in 10:38 2021/6/25
 * @Description：
 * @ModifiedBy：
 * @Version:
 */
public interface AuthFeign {
    @RequestMapping("/feign/hello")
    public String hello(@RequestParam("param") String param);
}

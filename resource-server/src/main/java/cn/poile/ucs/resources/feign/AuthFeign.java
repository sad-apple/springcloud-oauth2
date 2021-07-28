package cn.poile.ucs.resources.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author：zhang shi ping
 * @Date：Created in 10:24 2021/6/25
 * @Description：
 * @ModifiedBy：
 * @Version:
 */
@FeignClient(value = "AUTH-SERVER", fallback = AuthFeignFallback.class)
public interface AuthFeign {
    @RequestMapping("/feign/hello")
    public String hello(@RequestParam("param") String param);
}

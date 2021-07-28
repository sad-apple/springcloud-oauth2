package cn.poile.ucs.resources.feign;

/**
 * @Author：zhang shi ping
 * @Date：Created in 10:37 2021/6/25
 * @Description：
 * @ModifiedBy：
 * @Version:
 */
public class AuthFeignFallback implements AuthFeign {
    @Override
    public String hello(String param) {
        return "请求异常：" + param;
    }
}

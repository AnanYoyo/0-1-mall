package per.zqa.mall.order.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import per.zqa.mall.common.utils.R;

import java.util.Map;

/**
 * 商品feign借口
 *
 * @author zqa
 * @since 2024/4/7
 */
@FeignClient(name = "mall-product")
public interface ProductFeignClient {

    @RequestMapping("/product/brand/list")
    R list(@RequestParam Map<String, Object> params);

}

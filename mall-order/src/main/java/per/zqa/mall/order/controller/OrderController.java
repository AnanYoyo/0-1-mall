package per.zqa.mall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import per.zqa.mall.order.entity.OrderEntity;
import per.zqa.mall.order.openfeign.ProductFeignClient;
import per.zqa.mall.order.service.OrderService;
import per.zqa.mall.common.utils.PageUtils;
import per.zqa.mall.common.utils.R;


/**
 * 订单
 *
 * @author zqa
 * @email 596105081@qq.com
 * @date 2024-04-05 23:41:30
 */
@RestController
@RequestMapping("order/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductFeignClient productFeignClient;

    @GetMapping("/products")
    public R queryProducts() {
        R list = productFeignClient.list(null);
        return R.ok().put("result", list);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = orderService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        OrderEntity order = orderService.getById(id);

        return R.ok().put("order", order);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OrderEntity order) {
        orderService.save(order);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OrderEntity order) {
        orderService.updateById(order);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        orderService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

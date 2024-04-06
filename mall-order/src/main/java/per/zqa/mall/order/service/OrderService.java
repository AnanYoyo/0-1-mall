package per.zqa.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.zqa.mall.common.utils.PageUtils;
import per.zqa.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author zqa
 * @email 596105081@qq.com
 * @date 2024-04-05 23:41:30
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


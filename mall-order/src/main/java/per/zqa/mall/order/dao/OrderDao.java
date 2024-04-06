package per.zqa.mall.order.dao;

import per.zqa.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zqa
 * @email 596105081@qq.com
 * @date 2024-04-05 23:41:30
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

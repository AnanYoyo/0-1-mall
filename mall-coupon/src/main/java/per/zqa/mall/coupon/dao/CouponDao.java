package per.zqa.mall.coupon.dao;

import per.zqa.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zqa
 * @email 596105081@qq.com
 * @date 2024-04-05 23:43:07
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

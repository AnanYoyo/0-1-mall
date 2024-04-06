package per.zqa.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.zqa.mall.common.utils.PageUtils;
import per.zqa.mall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author zqa
 * @email 596105081@qq.com
 * @date 2024-04-05 23:43:07
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


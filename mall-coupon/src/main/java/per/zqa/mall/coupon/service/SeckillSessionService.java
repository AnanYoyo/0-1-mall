package per.zqa.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.zqa.mall.common.utils.PageUtils;
import per.zqa.mall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author zqa
 * @email 596105081@qq.com
 * @date 2024-04-05 23:43:08
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


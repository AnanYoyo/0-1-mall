package per.zqa.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.zqa.mall.common.utils.PageUtils;
import per.zqa.mall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author zqa
 * @email 596105081@qq.com
 * @date 2024-04-05 23:40:07
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package per.zqa.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.zqa.mall.common.utils.PageUtils;
import per.zqa.mall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author zqa
 * @email 596105081@qq.com
 * @date 2024-04-05 23:40:07
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

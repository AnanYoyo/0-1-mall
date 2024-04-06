package per.zqa.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.zqa.mall.common.utils.PageUtils;
import per.zqa.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author zqa
 * @email 596105081@qq.com
 * @date 2024-04-05 23:40:06
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


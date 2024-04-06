package per.zqa.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.zqa.mall.common.utils.PageUtils;
import per.zqa.mall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author zqa
 * @email 596105081@qq.com
 * @date 2024-04-05 23:45:46
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


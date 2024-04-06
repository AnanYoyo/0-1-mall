package per.zqa.mall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.Objects;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import per.zqa.mall.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import per.zqa.mall.ware.dao.WareSkuDao;
import per.zqa.mall.ware.entity.WareSkuEntity;
import per.zqa.mall.ware.service.WareSkuService;


@Service("wareSkuService")
public class WareSkuServiceImpl extends ServiceImpl<WareSkuDao, WareSkuEntity> implements WareSkuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareSkuEntity> page = this.page(
                Objects.nonNull(params)? new Page<>(PageUtils.getPageNumByParams(params), PageUtils.getPageSizeByParams(params)): new Page<>(1, Integer.MAX_VALUE),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

}
package per.zqa.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.Objects;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import per.zqa.mall.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import per.zqa.mall.product.dao.SpuInfoDao;
import per.zqa.mall.product.entity.SpuInfoEntity;
import per.zqa.mall.product.service.SpuInfoService;


@Service("spuInfoService")
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoDao, SpuInfoEntity> implements SpuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuInfoEntity> page = this.page(
                Objects.nonNull(params)? new Page<>(PageUtils.getPageNumByParams(params), PageUtils.getPageSizeByParams(params)): new Page<>(1, Integer.MAX_VALUE),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

}
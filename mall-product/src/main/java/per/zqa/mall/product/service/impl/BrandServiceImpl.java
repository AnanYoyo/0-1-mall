package per.zqa.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.Objects;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import per.zqa.mall.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import per.zqa.mall.product.dao.BrandDao;
import per.zqa.mall.product.entity.BrandEntity;
import per.zqa.mall.product.service.BrandService;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BrandEntity> page = this.page(
                Objects.nonNull(params) && !params.isEmpty() ? new Page<>(PageUtils.getPageNumByParams(params), PageUtils.getPageSizeByParams(params)): new Page<>(1, Integer.MAX_VALUE),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

}
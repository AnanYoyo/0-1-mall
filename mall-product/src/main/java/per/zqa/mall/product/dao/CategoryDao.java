package per.zqa.mall.product.dao;

import per.zqa.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zqa
 * @email 596105081@qq.com
 * @date 2024-04-05 23:40:07
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

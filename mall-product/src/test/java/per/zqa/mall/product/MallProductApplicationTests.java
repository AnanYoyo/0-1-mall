package per.zqa.mall.product;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import per.zqa.mall.common.utils.PageUtils;
import per.zqa.mall.product.service.BrandService;

@SpringBootTest
class MallProductApplicationTests {

	@Resource
	private BrandService brandService;

	@Test
	void contextLoads() {
		PageUtils pageUtils = brandService.queryPage(null);
	}

}

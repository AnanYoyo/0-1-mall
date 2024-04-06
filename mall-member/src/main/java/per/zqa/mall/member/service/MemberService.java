package per.zqa.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.zqa.mall.common.utils.PageUtils;
import per.zqa.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zqa
 * @email 596105081@qq.com
 * @date 2024-04-05 23:44:43
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package per.zqa.mall.member.dao;

import per.zqa.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zqa
 * @email 596105081@qq.com
 * @date 2024-04-05 23:44:43
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

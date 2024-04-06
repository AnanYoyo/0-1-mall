package per.zqa.mall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.Objects;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import per.zqa.mall.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import per.zqa.mall.member.dao.MemberDao;
import per.zqa.mall.member.entity.MemberEntity;
import per.zqa.mall.member.service.MemberService;


@Service("memberService")
public class MemberServiceImpl extends ServiceImpl<MemberDao, MemberEntity> implements MemberService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberEntity> page = this.page(
                Objects.nonNull(params)? new Page<>(PageUtils.getPageNumByParams(params), PageUtils.getPageSizeByParams(params)): new Page<>(1, Integer.MAX_VALUE),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

}
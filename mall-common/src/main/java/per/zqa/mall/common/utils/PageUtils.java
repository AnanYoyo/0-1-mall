package per.zqa.mall.common.utils;

import com.baomidou.mybatisplus.core.metadata.IPage;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 分页工具类
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年11月4日 下午12:59:00
 */
public class PageUtils implements Serializable {
	private static final long serialVersionUID = 1L;
	//总记录数
	private long totalCount;
	//每页记录数
	private long pageSize;
	//总页数
	private long totalPage;
	//当前页数
	private long currPage;
	//列表数据
	private List<?> list;
	
	/**
	 * 分页
	 * @param list        列表数据
	 * @param totalCount  总记录数
	 * @param pageSize    每页记录数
	 * @param currPage    当前页数
	 */
	public PageUtils(List<?> list, long totalCount, long pageSize, long currPage) {
		this.list = list;
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		this.currPage = currPage;
		this.totalPage = (int)Math.ceil((double)totalCount/pageSize);
	}

	/**
	 * 分页
	 * @param page        page对象
	 */
	public PageUtils(IPage<?> page) {
		this.list = page.getRecords();
		this.totalCount = page.getTotal();
		this.pageSize = page.getSize();
		this.currPage = page.getCurrent();
		this.totalPage = (int)Math.ceil((double)totalCount/pageSize);
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public long getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public long getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	public static long getPageNumByParams(Map<String, Object> params) {
		return Long.parseLong(params.get("page").toString());
	}

	public static long getPageSizeByParams(Map<String, Object> params) {
		return Long.parseLong(params.get("limit").toString());
	}
}

package per.zqa.mall.common.utils;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 查询参数
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-14 23:15
 */
public class Query extends LinkedHashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	//当前页码
    private int pageNum;
    //每页条数
    private int pageSize;

    public Query(Map<String, Object> params){
        this.putAll(params);

        //分页参数
        this.pageNum = Integer.parseInt(params.get("page").toString());
        this.pageSize = Integer.parseInt(params.get("limit").toString());
        this.put("offset", (pageNum - 1) * pageSize);
        this.put("page", pageNum);
        this.put("limit", pageSize);
    }


    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}

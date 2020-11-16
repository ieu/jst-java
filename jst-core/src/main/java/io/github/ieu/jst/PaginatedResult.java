package io.github.ieu.jst;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PaginatedResult extends BaseResult {
    /**
     * 每页个数
     */
    private int pageSize;
    /**
     * 第几页
     */
    private int pageIndex;
    /**
     * 返回个数
     */
    private int dataCount;
    /**
     * 返回页数
     */
    private int pageCount;
    /**
     * 是否还有下一页
     */
    private boolean hasNext;
}

package io.github.ieu.jst;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class PaginationQueryParam {
    /**
     * 页码:从1开始
     */
    private int pageIndex;
    /*
    页数:最多50
     */
    private int pageSize;
}

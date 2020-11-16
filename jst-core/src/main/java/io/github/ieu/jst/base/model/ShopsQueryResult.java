package io.github.ieu.jst.base.model;

import io.github.ieu.jst.BaseResult;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ShopsQueryResult extends BaseResult {
    /**
     * 店铺列表
     */
    private List<Shop> shops;
}

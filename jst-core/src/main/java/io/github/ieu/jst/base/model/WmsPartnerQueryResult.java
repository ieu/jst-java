package io.github.ieu.jst.base.model;

import io.github.ieu.jst.BaseResult;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class WmsPartnerQueryResult extends BaseResult {
    private List<Warehouse> datas;
}

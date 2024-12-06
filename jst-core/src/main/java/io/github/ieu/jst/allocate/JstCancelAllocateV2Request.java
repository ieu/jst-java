package io.github.ieu.jst.allocate;

@lombok.Data
@lombok.Builder
public class JstCancelAllocateV2Request {

    /**
     * 调拨出库单号
     */
    private Number ioId;
}

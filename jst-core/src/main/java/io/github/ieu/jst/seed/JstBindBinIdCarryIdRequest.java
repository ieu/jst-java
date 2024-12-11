package io.github.ieu.jst.seed;

@lombok.Data
@lombok.Builder
public class JstBindBinIdCarryIdRequest {

    /**
     * 批次号
     */
    private String waveId;

    /**
     * 播种车号
     */
    private String carryId;

    /**
     * 分仓编号
     */
    private String wmsCoId;

    /**
     * 出库单播种柜号
     */
    private java.util.List<BindBinIdCarryId> bindBinIdCarryIds;

    @lombok.Data
    public static class BindBinIdCarryId {

        private Key key;

        /**
         * 播种柜号（相当于bin_id）
         */
        private String value;

        @lombok.Data
        public static class Key {

            /**
             * 出库单号
             */
            private Number ioId;

            private ExtendFlag extendFlag;

            @lombok.Data
            public static class ExtendFlag {

                /**
                 * 虚拟仓锁定ID
                 */
                private Number lockWhId;

                /**
                 * 外部锁定虚拟仓ID
                 */
                private Number outerLockWhid;

                /**
                 * 虚拟仓库存是否锁定标记
                 */
                private String isLockSuccess;

                /**
                 * 外部同步状态
                 */
                private String outerSyncStatus;

                /**
                 * 推送出库单状态
                 */
                private String pushOrdersStatus;

                /**
                 * 打印序号
                 */
                private Number printNo;

                /**
                 * BU 转让或 转入 关联信息
                 */
                private String linkBuId;

                /**
                 * 快销采购类型（无 = 0,外采 = 1,单留 = 2, 单拣 = 3）
                 */
                private Number p2dPurchaseType;

                /**
                 * 虚拟仓百分比设置
                 */
                private java.util.List<LockPercentage> lockPercentages;

                @lombok.Data
                public static class LockPercentage {

                    /**
                     * 虚拟仓锁定ID
                     */
                    private Number lWhId;

                    /**
                     * 百分比
                     */
                    private Number percentage;
                }
            }
        }
    }
}

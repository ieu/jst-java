package io.github.ieu.jst.jackson2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import io.github.ieu.jst.base.JstGetCompanyUsersRequest;
import io.github.ieu.jst.base.JstGetCompanyUsersResponse;
import io.github.ieu.jst.crossborder.JstCreateFirstCbTripRequest;
import io.github.ieu.jst.finance.JstQueryShengsuanPayableResponse;
import io.github.ieu.jst.finance.JstQueryShengsuanPaymentResponse;
import io.github.ieu.jst.item.JstUploadCombineSkuRequest;
import io.github.ieu.jst.item.JstUploadItemSkuRequest;
import io.github.ieu.jst.jackson2.base.JstGetCompanyUsersRequestMixIn;
import io.github.ieu.jst.jackson2.base.JstGetCompanyUsersResponseMixIn;
import io.github.ieu.jst.jackson2.mixin.crossborder.JstCreateFirstCbTripRequestMixIn;
import io.github.ieu.jst.jackson2.mixin.finance.JstQueryShengsuanPayableResponseMixIn;
import io.github.ieu.jst.jackson2.mixin.finance.JstQueryShengsuanPaymentResponseMixIn;
import io.github.ieu.jst.jackson2.mixin.item.JstUploadCombineSkuRequestMixIn;
import io.github.ieu.jst.jackson2.mixin.item.JstUploadItemSkuRequestMixin;
import io.github.ieu.jst.jackson2.mixin.logistics.JstUploadExpressRegisterRequestMixIn;
import io.github.ieu.jst.jackson2.mixin.order.JstUploadOrdersRequestMixIn;
import io.github.ieu.jst.jackson2.mixin.purchase.JstQueryManufactureRequestMixIn;
import io.github.ieu.jst.jackson2.mixin.purchase.JstQueryPurchaseResponseMixIn;
import io.github.ieu.jst.jackson2.mixin.seed.JstBindBinIdCarryIdRequestMixIn;
import io.github.ieu.jst.jackson2.mixin.seed.JstGetJushuitanWaveResponseMixIn;
import io.github.ieu.jst.jackson2.mixin.stockin.JstCreatePurchaseInBatchRequestMixIn;
import io.github.ieu.jst.jackson2.mixin.stockout.JstQueryOrderOutSimpleRequestMixIn;
import io.github.ieu.jst.jackson2.mixin.stockout.JstQueryOrderOutSimpleResponseMixIn;
import io.github.ieu.jst.jackson2.mixin.supplychainopen.JstQueryGoodsDetailRequestMixIn;
import io.github.ieu.jst.jackson2.mixin.supplychainopen.JstQueryGoodsDetailResponseMixIn;
import io.github.ieu.jst.jackson2.mixin.warehouse.JstCreateLwhOperationRequestMixIn;
import io.github.ieu.jst.jackson2.mixin.wms.JstLoadSkusnResponseMixIn;
import io.github.ieu.jst.jackson2.mixin.wms.JstQuickSaleArrivalResponseMixIn;
import io.github.ieu.jst.logistics.JstUploadExpressRegisterRequest;
import io.github.ieu.jst.order.JstUploadOrdersRequest;
import io.github.ieu.jst.purchase.JstQueryManufactureRequest;
import io.github.ieu.jst.purchase.JstQueryPurchaseResponse;
import io.github.ieu.jst.seed.JstBindBinIdCarryIdRequest;
import io.github.ieu.jst.seed.JstGetJushuitanWaveResponse;
import io.github.ieu.jst.stockin.JstCreatePurchaseInBatchRequest;
import io.github.ieu.jst.stockout.JstQueryOrderOutSimpleRequest;
import io.github.ieu.jst.stockout.JstQueryOrderOutSimpleResponse;
import io.github.ieu.jst.supplychainopen.JstQueryGoodsDetailRequest;
import io.github.ieu.jst.supplychainopen.JstQueryGoodsDetailResponse;
import io.github.ieu.jst.warehouse.JstCreateLwhOperationRequest;
import io.github.ieu.jst.wms.JstLoadSkusnResponse;
import io.github.ieu.jst.wms.JstQuickSaleArrivalResponse;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

public class DefaultObjectMapperFactory implements ObjectMapperFactory {

    private final Map<Class<?>, Class<?>> mixInAnnotations = new HashMap<>();

    public DefaultObjectMapperFactory mixInAnnotation(Class<?> targetType, Class<?> mixinClass) {
        mixInAnnotations.put(targetType, mixinClass);
        return this;
    }

    public DefaultObjectMapperFactory mixInAnnotations(Map<? extends Class<?>, ? extends Class<?>> mixInAnnotations) {
        this.mixInAnnotations.putAll(mixInAnnotations);
        return this;
    }

    @Override
    public ObjectMapper create() {
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(ZonedDateTime.class, new ZonedDateTimeSerializer());
        simpleModule.addDeserializer(ZonedDateTime.class, new ZonedDateTimeDeserializer());
        simpleModule.setMixInAnnotation(JstGetCompanyUsersRequest.class, JstGetCompanyUsersRequestMixIn.class);
        simpleModule.setMixInAnnotation(JstGetCompanyUsersResponse.class, JstGetCompanyUsersResponseMixIn.class);
        simpleModule.setMixInAnnotation(JstGetCompanyUsersResponse.Pagination.class, JstGetCompanyUsersResponseMixIn.Pagination.class);
        simpleModule.setMixInAnnotation(JstGetCompanyUsersResponse.Pagination.Data.class, JstGetCompanyUsersResponseMixIn.Pagination.Data.class);
        simpleModule.setMixInAnnotation(JstUploadItemSkuRequest.class, JstUploadItemSkuRequestMixin.class);
        simpleModule.setMixInAnnotation(JstUploadItemSkuRequest.Item.class, JstUploadItemSkuRequestMixin.Item.class);
        simpleModule.setMixInAnnotation(JstUploadCombineSkuRequest.class, JstUploadCombineSkuRequestMixIn.class);
        simpleModule.setMixInAnnotation(JstUploadCombineSkuRequest.Item.class, JstUploadCombineSkuRequestMixIn.Item.class);
        simpleModule.setMixInAnnotation(JstUploadCombineSkuRequest.Item.Child.class, JstUploadCombineSkuRequestMixIn.Item.Child.class);
        simpleModule.setMixInAnnotation(JstUploadOrdersRequest.class, JstUploadOrdersRequestMixIn.class);
        simpleModule.setMixInAnnotation(JstUploadOrdersRequest.OrderExt.class, JstUploadOrdersRequestMixIn.OrderExt.class);
        simpleModule.setMixInAnnotation(JstUploadOrdersRequest.OrderExt.ExtData.class, JstUploadOrdersRequestMixIn.OrderExt.ExtData.class);
        simpleModule.setMixInAnnotation(JstUploadOrdersRequest.FinanceData.class, JstUploadOrdersRequestMixIn.FinanceData.class);
        simpleModule.setMixInAnnotation(JstUploadOrdersRequest.Invoice.class, JstUploadOrdersRequestMixIn.Invoice.class);
        simpleModule.setMixInAnnotation(JstUploadOrdersRequest.Card.class, JstUploadOrdersRequestMixIn.Card.class);
        simpleModule.setMixInAnnotation(JstUploadOrdersRequest.Item.class, JstUploadOrdersRequestMixIn.Item.class);
        simpleModule.setMixInAnnotation(JstUploadExpressRegisterRequest.class, JstUploadExpressRegisterRequestMixIn.class);
        simpleModule.setMixInAnnotation(JstQueryPurchaseResponse.class, JstQueryPurchaseResponseMixIn.class);
        simpleModule.setMixInAnnotation(JstQueryPurchaseResponse.Pagination.class, JstQueryPurchaseResponseMixIn.Pagination.class);
        simpleModule.setMixInAnnotation(JstQueryPurchaseResponse.Pagination.Data.class, JstQueryPurchaseResponseMixIn.Pagination.Data.class);
        simpleModule.setMixInAnnotation(JstQueryPurchaseResponse.Pagination.Data.Item.class, JstQueryPurchaseResponseMixIn.Pagination.Data.Item.class);
        simpleModule.setMixInAnnotation(JstQueryManufactureRequest.class, JstQueryManufactureRequestMixIn.class);
        simpleModule.setMixInAnnotation(JstCreatePurchaseInBatchRequest.class, JstCreatePurchaseInBatchRequestMixIn.class);
        simpleModule.setMixInAnnotation(JstCreatePurchaseInBatchRequest.Item.class, JstCreatePurchaseInBatchRequestMixIn.Item.class);
        simpleModule.setMixInAnnotation(JstCreatePurchaseInBatchRequest.Item.SkuSn.class, JstCreatePurchaseInBatchRequestMixIn.Item.SkuSn.class);
        simpleModule.setMixInAnnotation(JstCreatePurchaseInBatchRequest.Item.SkuSn.InExtModel.class, JstCreatePurchaseInBatchRequestMixIn.Item.SkuSn.InExtModel.class);
        simpleModule.setMixInAnnotation(JstQueryOrderOutSimpleRequest.class, JstQueryOrderOutSimpleRequestMixIn.class);
        simpleModule.setMixInAnnotation(JstQueryOrderOutSimpleResponse.class, JstQueryOrderOutSimpleResponseMixIn.class);
        simpleModule.setMixInAnnotation(JstQueryOrderOutSimpleResponse.Pagination.class, JstQueryOrderOutSimpleResponseMixIn.Pagination.class);
        simpleModule.setMixInAnnotation(JstQueryOrderOutSimpleResponse.Pagination.Data.class, JstQueryOrderOutSimpleResponseMixIn.Pagination.Data.class);
        simpleModule.setMixInAnnotation(JstQueryOrderOutSimpleResponse.Pagination.Data.CbFinance.class, JstQueryOrderOutSimpleResponseMixIn.Pagination.Data.CbFinance.class);
        simpleModule.setMixInAnnotation(JstQueryOrderOutSimpleResponse.Pagination.Data.Sn.class, JstQueryOrderOutSimpleResponseMixIn.Pagination.Data.Sn.class);
        simpleModule.setMixInAnnotation(JstQueryOrderOutSimpleResponse.Pagination.Data.Batch.class, JstQueryOrderOutSimpleResponseMixIn.Pagination.Data.Batch.class);
        simpleModule.setMixInAnnotation(JstQueryOrderOutSimpleResponse.Pagination.Data.ClusterInfo.class, JstQueryOrderOutSimpleResponseMixIn.Pagination.Data.ClusterInfo.class);
        simpleModule.setMixInAnnotation(JstQueryOrderOutSimpleResponse.Pagination.Data.Item.class, JstQueryOrderOutSimpleResponseMixIn.Pagination.Data.Item.class);
        simpleModule.setMixInAnnotation(JstQueryShengsuanPayableResponse.class, JstQueryShengsuanPayableResponseMixIn.class);
        simpleModule.setMixInAnnotation(JstQueryShengsuanPayableResponse.Pagination.class, JstQueryShengsuanPayableResponseMixIn.Pagination.class);
        simpleModule.setMixInAnnotation(JstQueryShengsuanPayableResponse.Pagination.Data.class, JstQueryShengsuanPayableResponseMixIn.Pagination.Data.class);
        simpleModule.setMixInAnnotation(JstQueryShengsuanPayableResponse.Pagination.Data.FreeItem.class, JstQueryShengsuanPayableResponseMixIn.Pagination.Data.FreeItem.class);
        simpleModule.setMixInAnnotation(JstQueryShengsuanPayableResponse.Pagination.Data.Item.class, JstQueryShengsuanPayableResponseMixIn.Pagination.Data.Item.class);
        simpleModule.setMixInAnnotation(JstQueryShengsuanPaymentResponse.class, JstQueryShengsuanPaymentResponseMixIn.class);
        simpleModule.setMixInAnnotation(JstQueryShengsuanPaymentResponse.Pagination.class, JstQueryShengsuanPaymentResponseMixIn.Pagination.class);
        simpleModule.setMixInAnnotation(JstQueryShengsuanPaymentResponse.Pagination.Data.class, JstQueryShengsuanPaymentResponseMixIn.Pagination.Data.class);
        simpleModule.setMixInAnnotation(JstQueryShengsuanPaymentResponse.Pagination.Data.Item.class, JstQueryShengsuanPaymentResponseMixIn.Pagination.Data.Item.class);
        simpleModule.setMixInAnnotation(JstGetJushuitanWaveResponse.class, JstGetJushuitanWaveResponseMixIn.class);
        simpleModule.setMixInAnnotation(JstCreateFirstCbTripRequest.class, JstCreateFirstCbTripRequestMixIn.class);
        simpleModule.setMixInAnnotation(JstCreateLwhOperationRequest.class, JstCreateLwhOperationRequestMixIn.class);
        simpleModule.setMixInAnnotation(JstCreateLwhOperationRequest.Item.class, JstCreateLwhOperationRequestMixIn.Item.class);
        simpleModule.setMixInAnnotation(JstCreateFirstCbTripRequest.Item.class, JstCreateFirstCbTripRequestMixIn.Item.class);
        simpleModule.setMixInAnnotation(JstGetJushuitanWaveResponse.Data.class, JstGetJushuitanWaveResponseMixIn.Data.class);
        simpleModule.setMixInAnnotation(JstGetJushuitanWaveResponse.Data.Inout.class, JstGetJushuitanWaveResponseMixIn.Data.Inout.class);
        simpleModule.setMixInAnnotation(JstGetJushuitanWaveResponse.Data.Inout.Item.class, JstGetJushuitanWaveResponseMixIn.Data.Inout.Item.class);
        simpleModule.setMixInAnnotation(JstBindBinIdCarryIdRequest.class, JstBindBinIdCarryIdRequestMixIn.class);
        simpleModule.setMixInAnnotation(JstBindBinIdCarryIdRequest.BindBinIdCarryId.class, JstBindBinIdCarryIdRequestMixIn.BindBinIdCarryId.class);
        simpleModule.setMixInAnnotation(JstBindBinIdCarryIdRequest.BindBinIdCarryId.Key.class, JstBindBinIdCarryIdRequestMixIn.BindBinIdCarryId.Key.class);
        simpleModule.setMixInAnnotation(JstBindBinIdCarryIdRequest.BindBinIdCarryId.Key.ExtendFlag.class, JstBindBinIdCarryIdRequestMixIn.BindBinIdCarryId.Key.ExtendFlag.class);
        simpleModule.setMixInAnnotation(JstBindBinIdCarryIdRequest.BindBinIdCarryId.Key.ExtendFlag.LockPercentage.class, JstBindBinIdCarryIdRequestMixIn.BindBinIdCarryId.Key.ExtendFlag.LockPercentage.class);
        simpleModule.setMixInAnnotation(JstQueryGoodsDetailRequest.class, JstQueryGoodsDetailRequestMixIn.class);
        simpleModule.setMixInAnnotation(JstQueryGoodsDetailResponse.class, JstQueryGoodsDetailResponseMixIn.class);
        simpleModule.setMixInAnnotation(JstQueryGoodsDetailResponse.Data.class, JstQueryGoodsDetailResponseMixIn.Data.class);
        simpleModule.setMixInAnnotation(JstQueryGoodsDetailResponse.Data.ItemSku.class, JstQueryGoodsDetailResponseMixIn.Data.ItemSku.class);
        simpleModule.setMixInAnnotation(JstQuickSaleArrivalResponse.class, JstQuickSaleArrivalResponseMixIn.class);
        simpleModule.setMixInAnnotation(JstQuickSaleArrivalResponse.Data.class, JstQuickSaleArrivalResponseMixIn.Data.class);
        simpleModule.setMixInAnnotation(JstLoadSkusnResponse.class, JstLoadSkusnResponseMixIn.class);
        simpleModule.setMixInAnnotation(JstLoadSkusnResponse.Pagination.class, JstLoadSkusnResponseMixIn.Pagination.class);
        simpleModule.setMixInAnnotation(JstLoadSkusnResponse.Pagination.Item.class, JstLoadSkusnResponseMixIn.Pagination.Item.class);

        if (!mixInAnnotations.isEmpty()) {
            mixInAnnotations.forEach(simpleModule::setMixInAnnotation);
        }

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(simpleModule);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        return objectMapper;
    }
}

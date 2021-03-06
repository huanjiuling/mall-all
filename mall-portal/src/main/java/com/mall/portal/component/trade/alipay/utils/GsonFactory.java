package com.mall.portal.component.trade.alipay.utils;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mall.portal.component.trade.alipay.model.hb.*;
import java.lang.reflect.Type;
import java.util.List;

public class GsonFactory {

    private static class GsonHolder {
        private static Type exceptionListType = new TypeToken<List<ExceptionInfo>>(){}.getType();
        private static Type tradeInfoListType = new TypeToken<List<TradeInfo>>(){}.getType();

        private static Gson gson = new GsonBuilder()
                                .registerTypeAdapter(exceptionListType, new ExceptionInfoAdapter())
                                .registerTypeAdapter(tradeInfoListType, new TradeInfoAdapter())
                                .registerTypeAdapter(EquipStatus.class, new EquipStatusAdapter())
                                .create();
    }

    public static Gson getGson() {
        return GsonHolder.gson;
    }
}

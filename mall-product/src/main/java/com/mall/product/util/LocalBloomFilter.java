package com.mall.product.util;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import java.nio.charset.StandardCharsets;

public class LocalBloomFilter {

    private static final BloomFilter<String> bloomFilter = BloomFilter.create(Funnels.stringFunnel(StandardCharsets.UTF_8),1000000,0.01);

    /**
     * 谷歌guava布隆过滤器
     * @param id
     * @return
     */
    public static boolean match(String id){
        return bloomFilter.mightContain(id);
    }

    public static void put(Long id){
        bloomFilter.put(id+"");
    }
}

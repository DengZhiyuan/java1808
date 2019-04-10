package com.qianfeng.mapper;

import com.qianfeng.dto.WxbGoodSku;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WxbGoodSkuMapper {
    int insert(WxbGoodSku wxbGoodSku);
    List<WxbGoodSku> queryGoodAndSkuInfo(@Param("goodId") String goodId);
}

package com.qianfeng.mapper;

import com.qianfeng.dto.WxbGood;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WxbGoodMapper {
    int insert(WxbGood wxbGood);
    WxbGood queryGoodAndSkuInfo(@Param("goodId") String goodId);
}

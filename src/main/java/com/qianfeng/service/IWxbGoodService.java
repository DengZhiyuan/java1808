package com.qianfeng.service;

import com.qianfeng.dto.WxbGood;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IWxbGoodService {
    int insert(WxbGood wxbGood);
    WxbGood queryGoodAndSkuInfo(String goodId);
}

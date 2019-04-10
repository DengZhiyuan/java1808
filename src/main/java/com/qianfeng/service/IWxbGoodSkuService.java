package com.qianfeng.service;

import com.qianfeng.dto.WxbGoodSku;

import java.util.List;

public interface IWxbGoodSkuService {
    int insert(WxbGoodSku wxbGoodSku);
    List<WxbGoodSku> queryGoodAndSkuInfo(String goodId);
}

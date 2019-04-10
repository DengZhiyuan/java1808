package com.qianfeng.service.impl;

import com.qianfeng.dto.WxbGood;
import com.qianfeng.mapper.WxbGoodMapper;
import com.qianfeng.service.IWxbGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WxbGoodService implements IWxbGoodService {
    @Autowired
    private WxbGoodMapper wxbGoodMapper;

    @Override
    public int insert(WxbGood wxbGood) {
        return wxbGoodMapper.insert(wxbGood);
    }

    @Override
    public WxbGood queryGoodAndSkuInfo(String goodId) {
        return wxbGoodMapper.queryGoodAndSkuInfo(goodId);
    }
}
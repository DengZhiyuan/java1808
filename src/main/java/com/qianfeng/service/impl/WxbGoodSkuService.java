package com.qianfeng.service.impl;

import com.qianfeng.dto.WxbGoodSku;
import com.qianfeng.mapper.WxbGoodSkuMapper;
import com.qianfeng.service.IWxbGoodSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WxbGoodSkuService implements IWxbGoodSkuService {
    @Autowired
    private WxbGoodSkuMapper wxbGoodSkuMapper;

    @Override
    public int insert(WxbGoodSku wxbGoodSku) {
        return wxbGoodSkuMapper.insert(wxbGoodSku);
    }

    @Override
    public List<WxbGoodSku> queryGoodAndSkuInfo(String goodId) {
        return wxbGoodSkuMapper.queryGoodAndSkuInfo(goodId);
    }
}

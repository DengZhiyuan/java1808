package com.qianfeng.controller;

import com.qianfeng.dto.WxbGoodSku;
import com.qianfeng.service.IWxbGoodSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WxbGoodSkuController {
    @Autowired
    private IWxbGoodSkuService wxbGoodSkuService;

    @RequestMapping("/addWxbgoodSku")
    public String saveGood(WxbGoodSku wxbGoodSku, Model model){
        wxbGoodSkuService.insert(wxbGoodSku);
        model.addAttribute("wxbGoodSku",wxbGoodSku);
        return "addGood.jsp";

    }
    @RequestMapping("/WxbGoodSkuList")
    public String queryGoodAndSkuInfo(String goodId,Model model){
        List<WxbGoodSku> goodSkuList = wxbGoodSkuService.queryGoodAndSkuInfo(goodId);
        model.addAttribute("goodId",goodId);
        model.addAttribute("goodSkuList",goodSkuList);
        return "goodList.jsp";
    }
}

package com.qianfeng.controller;

import com.qianfeng.dto.WxbGood;
import com.qianfeng.service.IWxbGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WxbGoodController {
    @Autowired
    private IWxbGoodService wxbGoodService;

    @RequestMapping("/addWxbgood")
    public String saveGood(WxbGood wxbGood,Model model){
        wxbGoodService.insert(wxbGood);
        model.addAttribute("wxbGood",wxbGood);
        return "addGood.jsp";

    }
    @RequestMapping("/WxbGoodList")
    public String queryGoodAndSkuInfo(String goodId,Model model){
        WxbGood goodList = wxbGoodService.queryGoodAndSkuInfo(goodId);
        model.addAttribute("goodId",goodId);
        model.addAttribute("goodList",goodList);
        return "goodList.jsp";
    }
}

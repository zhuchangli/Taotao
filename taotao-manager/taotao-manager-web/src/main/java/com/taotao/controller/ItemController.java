package com.taotao.controller;/*
 * created by on 1/18/19
 */

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName ItemController
 * @Description
 * @Date 1/18/19 10:57 AM
 */

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemid){
        return itemService.getItemById(itemid);
    }

    @RequestMapping("/list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page,Integer rows){
        return itemService.getItemList(page,rows);
    }
}

package com.taotao.service.impl;/*
 * created by on 1/18/19
 */

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.mapper.TbItemDescMapper;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ItemServiceImpl
 * @Description
 * @Date 1/18/19 10:43 AM
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;
    @Autowired
    private TbItemDescMapper tbItemDescMapper;

    @Override
    public TbItem getItemById(Long id){
        return tbItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public EasyUIDataGridResult getItemList(int page,int rows){

        // 查询商品列表
        TbItemExample example = new TbItemExample();
        // 分页处理
        PageHelper.startPage(page, rows);
        List<TbItem> itemList = tbItemMapper.selectByExample(example);

        // 创建一个返回值对象
        EasyUIDataGridResult easyUIDataGridResult = new EasyUIDataGridResult();
        easyUIDataGridResult.setRows(itemList);

        // 取得记录总条数
        PageInfo<TbItem> pageInfo = new PageInfo<>(itemList);
        easyUIDataGridResult.setTotal(pageInfo.getTotal());

        return easyUIDataGridResult;
    }

}

package com.taotao.service;
/*
 * created by on 1/17/19
 */

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
    TbItem getItemById(Long itemId);

    EasyUIDataGridResult getItemList(int page, int rows);
}

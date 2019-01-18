package com.taotao.service.impl;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ItemCatServiceImpl
 * @Description 商品分类管理
 * @Date 1/18/19 4:42 PM
 */

@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private TbItemCatMapper itemCatMapper;


    @Override
    public List<EasyUITreeNode> getItemCatList(long parentId){

        // 创建查询条件
        TbItemCatExample example = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        // 根据条件查询
        List<TbItemCat> itemCatList = itemCatMapper.selectByExample(example);
        List<EasyUITreeNode> easyUITreeNodeList = new ArrayList<>();
        // 把列表转化成treeNodeList
        for(TbItemCat tbItemCat : itemCatList){
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            node.setState(tbItemCat.getIsParent()?"closed":"open");
            easyUITreeNodeList.add(node);
        }

        // 返回结果
        return easyUITreeNodeList;
    }

}

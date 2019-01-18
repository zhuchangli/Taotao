package com.taotao.common.pojo;

/**
 * @ClassName EasyUITreeNode
 * @Description easyUI树型控件节点格式
 * @Date 1/18/19 4:25 PM
 */
public class EasyUITreeNode {

    private long id;
    private String text;
    private String state;

    public void setId(long id) {
        this.id = id;
    }

    public long getId(){
        return id;
    }

    public String getText(){
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}

package com.taotao.common.pojo;/*
 * created by on 1/18/19
 */

import java.util.List;

/**
 * @ClassName EasyUIDataGridResult
 * @Description
 * @Date 1/18/19 10:36 AM
 */
public class EasyUIDataGridResult {

    private long total;

    private List<?> rows;

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public long getTotal(){
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}

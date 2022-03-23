package com.itheima.pojo;

import java.util.List;


/**
 * 分夜查询的JavaBean
 * @param <T>
 */
public class PageBean<T> {
    private int totalCount;
    private List<T> rows;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "totalCounts=" + totalCount +
                ", rows=" + rows +
                '}';
    }
}

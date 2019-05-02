package com.example.model;

import java.util.List;

public class PageFen<T>{
    private int count;//总共数据
    private int totalPageCount;   //总页数
    private int currPage;   //当前页数
    private int pageSize;   //每页大小数据
    public List<T> list;  //每页商品集合

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public PageFen(int count, int totalPageCount, int currPage, int pageSize, List<T> list) {
        this.count = count;
        this.totalPageCount = totalPageCount;
        this.currPage = currPage;
        this.pageSize = pageSize;
        this.list = list;
    }

    public PageFen() {
    }
}

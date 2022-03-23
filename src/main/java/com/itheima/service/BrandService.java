package com.itheima.service;

import com.itheima.pojo.Brand;
import com.itheima.pojo.PageBean;

import java.util.List;

public interface BrandService {
    public List<Brand> selectAll();

    public void add(Brand brand);

    public void deleteByIds(int[] ids);

    public PageBean<Brand> selectByPage(int currentPage, int pageSize);

    public PageBean<Brand> selectByPageAndCondition(int currentPage,int pageSize,Brand brand);

    public Brand selectById(int id);

    public void update(Brand brand);
}

package com.kakasys.rootbase.page.model;

import com.kakasys.rootbase.model.BaseModel;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/31 20:03</p>
 * <p>类全名：com.kakasys.rootbase.page.model.PageInfo</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class PageInfo extends BaseModel
{
    //页码
    private Integer pageNumber;
    //分页大小
    private Integer pageSize;
    //总页数
    private Integer pageCount;
    //数据总量
    private Integer dataCount;

    public PageInfo()
    {
    }

    public Integer getPageNumber()
    {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber)
    {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(Integer pageSize)
    {
        this.pageSize = pageSize;
    }

    public Integer getPageCount()
    {
        return pageCount;
    }

    public void setPageCount(Integer pageCount)
    {
        this.pageCount = pageCount;
    }

    public Integer getDataCount()
    {
        return dataCount;
    }

    public void setDataCount(Integer dataCount)
    {
        this.dataCount = dataCount;
    }
}

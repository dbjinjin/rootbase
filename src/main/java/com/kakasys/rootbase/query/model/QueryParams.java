package com.kakasys.rootbase.query.model;

import com.kakasys.rootbase.model.BaseModel;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/16 17:59</p>
 * <p>类全名：com.kakasys.rootbase.query.model.QueryParams</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class QueryParams extends BaseModel
{
    private Integer pageNumber;//页数
    private Integer pageSize;//每页数量
    private Integer pageIndex;//分页索引
    private String sortName;//排序字段
    private String sortOrder;//排序规则


    public Integer getPageIndex()
    {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex)
    {
        this.pageIndex = pageIndex;
    }

    public Integer getPageNumber()
    {
        return pageNumber;
    }

    public Integer getPageSize()
    {
        return pageSize;
    }


    public String getSortName()
    {
        return sortName;
    }

    public void setSortName(String sortName)
    {
        this.sortName = sortName;
    }

    public String getSortOrder()
    {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder)
    {
        this.sortOrder = sortOrder;
    }


    public void setPageNumber(Integer pageNumber)
    {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Integer pageSize)
    {
        this.pageSize = pageSize;
        calculate();
    }

    /**
     * 计算pageIndex
     */
    private void calculate()
    {
        if (pageNumber != null && pageSize != null)
        {
            this.setPageIndex((pageNumber - 1) * pageSize);
        }
    }

}

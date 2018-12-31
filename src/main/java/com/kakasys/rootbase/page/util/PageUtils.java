package com.kakasys.rootbase.page.util;

import com.kakasys.rootbase.page.model.PageInfo;
import com.kakasys.rootbase.query.model.QueryParams;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/31 20:30</p>
 * <p>类全名：com.kakasys.rootbase.page.util.PageUtils</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class PageUtils
{
    public static PageInfo buildPageInfo(QueryParams queryParams, Integer count)
    {
        Integer pageNumber = queryParams.getPageNumber();
        Integer pageSize = queryParams.getPageSize();
        if (pageNumber != null && pageSize != null)
        {
            PageInfo pageInfo = new PageInfo();
            pageInfo.setDataCount(count);//数据总量
            pageInfo.setPageNumber(pageNumber);//当前页
            pageInfo.setPageSize(pageSize);//每页大小
            pageInfo.setPageCount(count % pageSize == 0 ? count / pageSize : count / pageSize + 1);//总页数
            return pageInfo;
        } else
        {
            return null;
        }
    }
}

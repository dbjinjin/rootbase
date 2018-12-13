package com.kakasys.rootbase.date;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/6 14:52</p>
 * <p>类全名：com.kakasys.rootbase.date.FormatStyle</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public enum FormatStyle
{
    STYLE_DATE("yyyy-MM-dd"),STYLE_TIME("yyyy-MM-dd HH:mm:ss");

    private String style;

    FormatStyle(String style)
    {
        this.style = style;
    }

    public String getStyle()
    {
        return style;
    }

}

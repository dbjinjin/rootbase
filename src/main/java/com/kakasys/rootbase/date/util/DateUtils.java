package com.kakasys.rootbase.date.util;

import com.kakasys.rootbase.date.FormatStyle;
import sun.applet.Main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/6 14:31</p>
 * <p>类全名：com.kakasys.rootbase.date.util.DateUtils</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class DateUtils
{
    //系统默认时区
    private static TimeZone DEFAULT_TIMEZONE = TimeZone.getTimeZone("GMT+8");

    /**
     * @return 服务器日期
     */
    public static Date getServerDate()
    {
        return getServerDate(false);
    }

    /**
     * @param filterTime 是否过滤时间
     * @return 服务器时间
     */
    public static Date getServerDate(boolean filterTime)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(DEFAULT_TIMEZONE);
        if (filterTime)
        {
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DATE);
            calendar.set(year, month, day, 0, 0, 0);
        }
        return calendar.getTime();
    }

    public static Date getStrDate(String dateStr, FormatStyle formatStyle)
    {
        try
        {
            DateFormat dateFormat = new SimpleDateFormat(formatStyle.getStyle());
            dateFormat.setTimeZone(DEFAULT_TIMEZONE);
            return dateFormat.parse(dateStr);
        } catch (Exception e)
        {
            throw new RuntimeException("日期格式错误：" + dateStr + " 不符合格式" + formatStyle.getStyle());
        }
    }

    public static String getDateStr(Date date, FormatStyle formatStyle)
    {
        try
        {
            DateFormat dateFormat = new SimpleDateFormat(formatStyle.getStyle());
            dateFormat.setTimeZone(DEFAULT_TIMEZONE);
            return dateFormat.format(date);
        } catch (Exception e)
        {
            throw new RuntimeException("日期：" + date + " 不符合格式" + formatStyle.getStyle());
        }
    }

}

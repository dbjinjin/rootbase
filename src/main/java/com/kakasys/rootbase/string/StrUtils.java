package com.kakasys.rootbase.string;

/**
 * <p>标题： 字符串工具类</p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/6 14:06</p>
 * <p>类全名：com.kakasys.rootbase.string.StrUtils</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class StrUtils
{
    /**
     * @param checkStr 校验字符串
     * @return 是否为空
     */
    public static boolean isNull(String checkStr)
    {
        return checkStr == null || checkStr.length() == 0;
    }

    /**
     * @param checkStr 校验字符串
     * @return 是否非空
     */
    public static boolean isNotNull(String checkStr)
    {
        return !isNull(checkStr);
    }

    /**
     * @param str1      字符串1
     * @param concatStr 拼接字符
     * @param str2      字符串2
     * @return 字符串1+ 拼接字符+字符串2
     */
    public static String strConcat(String str1, String concatStr, String str2)
    {
        if (StrUtils.isNotNull(str1) && StrUtils.isNotNull(str2))
        {
            return str1.concat(concatStr).concat(str2);
        } else
        {
            return isNull(str1) ? str2 : str1;
        }
    }
}
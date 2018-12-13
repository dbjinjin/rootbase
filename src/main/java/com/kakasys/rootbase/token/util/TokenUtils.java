package com.kakasys.rootbase.token.util;

import java.util.UUID;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/8 19:04</p>
 * <p>类全名：com.kakasys.rootbase.token.util.TokenUtils</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class TokenUtils
{
    public static String buildToken()
    {
        String uuuid = UUID.randomUUID().toString().toUpperCase();
        return uuuid.replaceAll("-", "");
    }
}

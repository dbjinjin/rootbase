package com.kakasys.rootbase.invoke.util;

import com.kakasys.rootbase.invoke.code.InvokeCodeDef;
import com.kakasys.rootbase.invoke.common.InvokeConstant;
import com.kakasys.rootbase.invoke.model.InvokeResult;
import com.kakasys.rootbase.string.StrUtils;
import com.kakasys.rootbase.token.util.TokenUtils;

import java.io.Serializable;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/8 18:59</p>
 * <p>类全名：com.kakasys.rootbase.invoke.util.InvokeResultUtils</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class InvokeResultUtils
{
    public static <T> InvokeResult<T> buildSuccResult()
    {
        return buildResult(InvokeCodeDef.SUCC, null, null);
    }

    public static <T> InvokeResult<T> buildSuccResult(String message)
    {
        return buildResult(InvokeCodeDef.SUCC, message, null);
    }

    public static <T> InvokeResult<T> buildSuccResult(String message, T data)
    {
        return buildResult(InvokeCodeDef.SUCC, message, data);
    }

    public static <T> InvokeResult<T> buildFailResult(String message)
    {
        return buildResult(InvokeCodeDef.FAIL, message, null);
    }

    public static <T> InvokeResult<T> buildFailResult(InvokeCodeDef codeDef, String message)
    {
        if (InvokeCodeDef.SUCC == codeDef)
        {
            throw new IllegalArgumentException("参数错误~！");
        }
        return buildResult(codeDef, message, null);
    }

    public static <T> InvokeResult<T> buildExceResult(Exception e)
    {
        return buildExceResult(e, null);
    }

    public static <T> InvokeResult<T> buildExceResult(Exception e, String message)
    {
        return buildResult(InvokeCodeDef.PROGRAM_ERROR, StrUtils.isNotNull(message) ? message : e.getMessage(), null);
    }


    public static <T> InvokeResult<T> buildResult(InvokeCodeDef codeDef, String message, T data)
    {
        InvokeResult<T> result = new InvokeResult<>();
        result.setToken(TokenUtils.buildToken());
        result.setCode(codeDef.getCode());
        result.setMessage(StrUtils.isNotNull(message) ? message : codeDef.getMessage());
        result.setResult(codeDef == InvokeCodeDef.SUCC ? InvokeConstant.RESULT_SUCC : InvokeConstant.RESULT_FAIL);
        result.setData(data);
        return result;
    }
}

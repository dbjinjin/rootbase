package com.kakasys.rootbase.invoke.model;

import java.io.Serializable;

/**
 * <p>标题： 标准调用响应对象</p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/7 10:04</p>
 * <p>类全名：com.kakasys.rootbase.invoke.model.InvokeResult</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class InvokeResult<T> implements Serializable
{
    //调用结果
    private String result;

    //调用消息
    private String message;

    //响应Toekn
    private String token;

    //响应数据
    private T data;

    //响应编码
    private String code;

    public InvokeResult()
    {
    }

    public String getResult()
    {
        return result;
    }

    public void setResult(String result)
    {
        this.result = result;
    }

    public String getToken()
    {
        return token;
    }

    public void setToken(String token)
    {
        this.token = token;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }
}

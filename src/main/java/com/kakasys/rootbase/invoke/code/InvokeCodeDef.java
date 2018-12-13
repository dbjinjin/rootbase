package com.kakasys.rootbase.invoke.code;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/7 10:20</p>
 * <p>类全名：com.kakasys.rootbase.invoke.code.InvokeCodeDef</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public enum InvokeCodeDef
{
    SUCC("00","成功"),
    FAIL("10","失败"),
    ERROR("30","异常"),
    PARAMS_ERROR("3010","参数错误"),
    PROGRAM_ERROR("3020","程序处理异常"),
    DBCONN_ERROR("3030","数据库异常"),
    NETWORK_ERROR("3040","网络连接异常"),
    REDIS_ERROR("3050","Redis异常"),
    ZOOKEEPER_ERROR("3060","Zookeeper异常"),
    MONGODB_ERROR("3060","MongoDB异常"),
    IO_ERROR("3070","IO流异常");

    //响应编码
    private String code;
    //编码描述
    private String message;

    InvokeCodeDef(String code, String message)
    {
        this.code = code;
        this.message = message;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

}

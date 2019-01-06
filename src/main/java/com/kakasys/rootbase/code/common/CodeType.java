package com.kakasys.rootbase.code.common;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2019/1/6 15:19</p>
 * <p>类全名：com.kakasys.rootbase.code.common.CodeType</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public enum CodeType
{
    VERIFY_CODE("1001", "验证码"), QR_CODE("1002", "二维码");

    private String type;
    private String remark;

     CodeType(String type, String remark)
    {
        this.type = type;
        this.remark = remark;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getRemark()
    {
        return remark;
    }

    public void setRemark(String remark)
    {
        this.remark = remark;
    }}

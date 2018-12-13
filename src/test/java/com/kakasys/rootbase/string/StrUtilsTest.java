package com.kakasys.rootbase.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/6 14:15</p>
 * <p>类全名：com.kakasys.rootbase.string.StrUtilsTest</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class StrUtilsTest
{
    @Test
    public void test()
    {
        Assert.assertTrue(StrUtils.isNull(new User().getName()));
        Assert.assertTrue(StrUtils.isNull(""));
        Assert.assertTrue(StrUtils.isNotNull("123456"));
        System.out.println(StrUtils.strConcat("1001",",","1002"));
        System.out.println(StrUtils.strConcat("",",","1002"));
        System.out.println(StrUtils.strConcat("1001",",",""));

    }

    class User
    {
        private String name;

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }
    }
}

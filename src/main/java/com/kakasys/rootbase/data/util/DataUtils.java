package com.kakasys.rootbase.data.util;

import com.kakasys.rootbase.date.util.DateUtils;
import com.kakasys.rootbase.string.StrUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/16 20:29</p>
 * <p>类全名：com.kakasys.rootbase.data.util.DataUtils</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class DataUtils
{
    private static Logger logger = LogManager.getLogger(DataUtils.class);

    private static String[] arrays = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static String buildRandomCode(int length)
    {
        int arraysLength = arrays.length;
        String str = null;
        for (int i = 0; i < length; i++)
        {
            int index = new Random().nextInt(arraysLength);
            str = StrUtils.strConcat(str, "", arrays[index]);
        }
        return str;
    }

    public static <T> List<T> buildRandomListData(Class<T> tClass, int size)
    {
        List<T> ts = new ArrayList<>();
        for (int i = 0; i < size; i++)
        {
            T t = buildRandomData(tClass);
            ts.add(t);
        }
        return ts;
    }

    public static <T> T buildRandomData(Class<T> tClass)
    {
        T instance = null;
        int index = new Random().nextInt(1000);
        try
        {
            instance = tClass.newInstance();
            Field[] fields = tClass.getDeclaredFields();
            for (Field field : fields)
            {
                String fldname = field.getName();
                PropertyDescriptor property = new PropertyDescriptor(fldname, tClass);
                Method setMehod = property.getWriteMethod();
                if (setMehod == null)
                {
                    logger.warn("类：{} 属性字段：{} 未定义Set方法", tClass, fldname);
                    continue;
                }
                Class<?>[] fldParamClass = setMehod.getParameterTypes();
                Object fldvalue = buildFldValue(fldname, index, fldParamClass[0]);
                setMehod.invoke(instance, fldvalue);
            }
        } catch (Exception e)
        {
            logger.error("随机对象异常", e);
        }
        return instance;
    }

    private static Object buildFldValue(String fldname, int index, Class<?> paramsClass)
    {
        if (String.class == paramsClass)
        {
            return fldname.concat(String.valueOf(index));
        } else if (Boolean.class == paramsClass)
        {
            return true;
        } else if (Integer.class == paramsClass || Float.class == paramsClass || Double.class == paramsClass || Long.class == paramsClass)
        {
            return 1;
        } else if (BigDecimal.class == paramsClass)
        {
            return BigDecimal.ZERO;
        } else if (Date.class == paramsClass)
        {
            return DateUtils.getServerDate();
        }
        return null;
    }
}

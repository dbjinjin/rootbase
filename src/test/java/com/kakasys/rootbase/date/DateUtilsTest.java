package com.kakasys.rootbase.date;

import com.kakasys.rootbase.date.util.DateUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.Date;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/6 14:40</p>
 * <p>类全名：com.kakasys.rootbase.date.DateUtilsTest</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class DateUtilsTest
{
    private Logger logger = LogManager.getLogger(DateUtilsTest.class);
    @Test
    public void test()
    {
        logger.info(DateUtils.getServerDate());
        logger.info(DateUtils.getServerDate(true));
        logger.info(DateUtils.getStrDate("1990-06-24",FormatStyle.STYLE_DATE));
        logger.info(DateUtils.getDateStr(new Date(),FormatStyle.STYLE_TIME));
    }
}

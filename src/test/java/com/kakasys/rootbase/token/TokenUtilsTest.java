package com.kakasys.rootbase.token;

import com.kakasys.rootbase.BaseTest;
import com.kakasys.rootbase.date.DateUtilsTest;
import com.kakasys.rootbase.token.util.TokenUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/13 19:59</p>
 * <p>类全名：com.kakasys.rootbase.token.TokenUtilsTest</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class TokenUtilsTest extends BaseTest
{
    @Test
    public void test()
    {
        logger.info(TokenUtils.buildToken());
    }
}

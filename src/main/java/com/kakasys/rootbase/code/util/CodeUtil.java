package com.kakasys.rootbase.code.util;

import com.kakasys.rootbase.code.model.ImageSize;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2019/1/6 15:20</p>
 * <p>类全名：com.kakasys.rootbase.code.util.CodeUtil</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class CodeUtil
{
    /**
     * 生成二维码
     *
     * @param imageSize 图片大小信息
     * @param info      内容
     */
    public static BufferedImage genVerifyCode(ImageSize imageSize, String info)
    {
        int width = imageSize.getWidth();
        int height = imageSize.getHeight();
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics graphic = image.getGraphics();
        graphic.setColor(Color.WHITE);
        graphic.fillRect(0, 0, width, height);
        graphic.setFont(new Font("Comic Sans MS", Font.BOLD, height-6));
        Random random = new Random();
        for (int i = 0; i < 10; i++)
        {
            graphic.setColor(randomColor());
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int xl = random.nextInt(12);
            int yl = random.nextInt(12);
            graphic.drawLine(x, y, x + xl, y + yl);
        }
        char[] chars = info.toCharArray();
        for (int i = 0; i < info.length(); i++)
        {
            String charStr = String.valueOf(chars[i]);
            graphic.setColor(randomColor());
            graphic.drawString(charStr, i * (width / info.length()) + 4, height - (height / 3)+6);
        }
        graphic.dispose();
        return image;
    }

    public static Color randomColor()
    {
        Random random = new Random();
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);
        return new Color(red, green, blue);
    }
}

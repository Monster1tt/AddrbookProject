package com.wler.addrbook.util;

import java.io.InputStream;
import java.util.Properties;

/**
 * <b>常量工具类</b>
 * @author Monster
 * @version 5.0.0
 */
public class Constants {
	private static Properties props = new Properties();

	static {
		try {
			// 读取位于 src 下的 addrbook.properties 配置文件
			InputStream in = Constants.class.getClassLoader().getResourceAsStream("addrbook.properties");
			// 使用 Properties 加载输入流
			props.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * <b>分页信息：默认当前页码</b>
	 */
	public static final Integer PAGE_NUM = Integer.parseInt(props.getProperty("page.num"));

	/**
	 * <b>分页信息：每页显示数量</b>
	 */
	public static final Integer PAGE_SIZE = Integer.parseInt(props.getProperty("page.size"));
}

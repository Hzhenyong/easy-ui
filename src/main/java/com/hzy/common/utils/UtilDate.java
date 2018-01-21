package com.hzy.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间转换类
 * @author hzy
 *
 */
public class UtilDate {
	public final static String yyyyMMdd = "yyyyMMdd";

    public static String formDate(Date date, String parttern) {
        SimpleDateFormat sdf = new SimpleDateFormat(parttern);
        return sdf.format(date);
    }

}

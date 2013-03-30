package com.xuan.tuya.common;

import android.os.Environment;

/**
 * 常量类
 * 
 * @author xuan
 */
public abstract class Constants {

	// 日志输出标志
	public static final String TAG = "tuya";

	// 手机SD卡的路径
	public static final String SDCARD = Environment
			.getExternalStorageDirectory().getPath();

	// 更新apk时，下载下来存放的文件夹路径
	public static final String PIC_STORE_PATH = SDCARD + "/tuya/";

}

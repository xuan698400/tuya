package com.xuan.tuya;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自动输入view的注解
 * 
 * @author xuan
 * @version $Revision: 32935 $, $Date: 2012-11-30 14:17:17 +0800 (星期五, 30 十一月
 *          2012) $
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface InjectView {

	/**
	 * view的id索引
	 * 
	 * @return
	 */
	int value() default -1;

	/**
	 * 注解
	 * 
	 * @return
	 */
	String tag() default "";
}
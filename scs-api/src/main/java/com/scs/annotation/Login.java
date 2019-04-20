/**
 * Copyright (c) 2016-2019 智慧校园 All rights reserved.
 *
 * http://www.overlv.com
 *
 * 版权所有，侵权必究！
 */

package com.scs.annotation;

import java.lang.annotation.*;

/**
 * 登录效验
 *
 * @author Over situ_linfeng@foxmail.com
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Login {
}

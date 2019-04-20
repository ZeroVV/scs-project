/**
 * Copyright (c) 2016-2019 智慧校园 All rights reserved.
 *
 * http://www.overlv.com
 *
 * 版权所有，侵权必究！
 */

package com.scs.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.scs.entity.UserEntity;
import com.scs.form.LoginForm;

import java.util.Map;

/**
 * 用户
 *
 * @author Over situ_linfeng@foxmail.com
 */
public interface UserService extends IService<UserEntity> {

	UserEntity queryByMobile(String mobile);

	/**
	 * 用户登录
	 * @param form    登录表单
	 * @return        返回登录信息
	 */
	Map<String, Object> login(LoginForm form);
}

/**
 * Copyright (c) 2016-2019 智慧校园 All rights reserved.
 *
 * http://www.overlv.com
 *
 * 版权所有，侵权必究！
 */

package com.scs.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.scs.common.utils.PageUtils;
import com.scs.modules.sys.entity.SysRoleEntity;

import java.util.Map;


/**
 * 角色
 *
 * @author Over situ_linfeng@foxmail.com
 */
public interface SysRoleService extends IService<SysRoleEntity> {

	PageUtils queryPage(Map<String, Object> params);

	void saveRole(SysRoleEntity role);

	void update(SysRoleEntity role);
	
	void deleteBatch(Long[] roleIds);

}

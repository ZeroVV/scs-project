/**
 * Copyright (c) 2016-2019 智慧校园 All rights reserved.
 *
 * http://www.overlv.com
 *
 * 版权所有，侵权必究！
 */

package com.scs.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scs.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 *
 * @author Over situ_linfeng@foxmail.com
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}

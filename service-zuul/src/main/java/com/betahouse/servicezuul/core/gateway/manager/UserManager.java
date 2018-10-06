/**
 * betahouse.us
 * CopyRight (c) 2012 - 2018
 */
package com.betahouse.servicezuul.core.gateway.manager;

import com.betahouse.servicezuul.core.gateway.model.UserBO;
import request.UserRegisterRequest;

/**
 * 用户管理器
 *
 * @author dango.yxm
 * @version : UserManager.java 2018/10/06 上午12:01 dango.yxm
 */
public interface UserManager {

    /**
     * 注册账号
     *
     * @param registerRequest
     * @return
     */
    UserBO register(UserRegisterRequest registerRequest);
}
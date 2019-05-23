package com.zt.service;

import com.baomidou.mybatisplus.extension.api.R;
import com.zt.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zt.shiro.AccountProfile;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author John
 * @since 2019-04-29
 */
public interface UserService extends BaseService<User> {
    /**
     * 注册
     * @param user
     * @return
     */
    R register(User user);

    /**
     * 用于用户登录
     * AccountProfile是有用户基本信息的类，包括私信、通知数量，头像等
     * @param email
     * @param password
     * @return
     */
    AccountProfile login(String email, String password);


}

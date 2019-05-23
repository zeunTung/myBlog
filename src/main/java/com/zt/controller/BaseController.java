package com.zt.controller;

import com.zt.service.CategoryService;
import com.zt.service.CommentService;
import com.zt.service.PostService;
import com.zt.service.UserService;
import com.zt.shiro.AccountProfile;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

@Slf4j
public class BaseController {

    @Autowired
    HttpServletRequest request;

    @Autowired
    PostService postService;

    @Autowired
    UserService userService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    CommentService commentService;

    protected AccountProfile getProfile(){
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

    protected Long getProfileId(){
        return getProfile().getId();
    }
}

package com.zt.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zt.entity.Post;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author John
 * @since 2019-04-29
 */
@Slf4j
@Controller
@RequestMapping("/post")
public class PostController extends BaseController {

    @GetMapping("/post/{id}")
    public String index(@PathVariable Long id) {

        Map<String, Object> post = postService.getMap(new QueryWrapper<Post>().eq("id", id));

        userService.join(post, "user_id");

        Assert.notNull(post, "该文章已被删除");

        request.setAttribute("post", post);
        return "post";
    }
}


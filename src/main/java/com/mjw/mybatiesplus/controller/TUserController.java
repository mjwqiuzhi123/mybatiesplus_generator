package com.mjw.mybatiesplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mjw.mybatiesplus.entity.TUser;
import com.mjw.mybatiesplus.service.ITUserService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author mjw
 * @since 2018-09-17
 */
@RestController
@RequestMapping("/mybatiesplus/t-user")
public class TUserController {
	@Autowired
	private ITUserService service;

	@GetMapping("/list")
	public List<TUser> getUser() {
		return service.list(new QueryWrapper<TUser>());
	}
}

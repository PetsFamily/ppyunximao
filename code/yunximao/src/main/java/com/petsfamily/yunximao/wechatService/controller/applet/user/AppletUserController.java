package com.petsfamily.yunximao.wechatService.controller.applet.user;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.petsfamily.yunximao.common.model.BaseController;
import com.petsfamily.yunximao.common.model.ResponseEntity;
import com.petsfamily.yunximao.userService.service.UserService;
import com.petsfamily.yunximao.wechatService.service.applet.AppletInterfaseService;

@RestController
@RequestMapping("/applet")
public class AppletUserController extends BaseController{
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	@Resource
	private AppletInterfaseService appletInterfaseService;
	@Resource
	private UserService userService;
	
	@RequestMapping(value = "/user/createUser", method = {RequestMethod.POST })
	public ResponseEntity createUser(@RequestBody JSONObject dataJson) throws Exception {
		JSONObject userData = appletInterfaseService.getUserInfo(dataJson);
		return userService.createUserByWeChat(userData);
	}
	
	@RequestMapping(value = "/user/modifyUser", method = {RequestMethod.POST })
	public ResponseEntity modifyUser(@RequestBody JSONObject dataJson) throws Exception {
		return userService.modifyUserInfo(dataJson);
	}
	
	@RequestMapping(value = "/user/addFriend", method = {RequestMethod.POST })
	public ResponseEntity addFriend(@RequestBody JSONObject dataJson) throws Exception {
		return userService.addFriend(dataJson);
	}
	
	@RequestMapping(value = "/user/deleFriend", method = {RequestMethod.POST })
	public ResponseEntity deleFriend(@RequestBody JSONObject dataJson) throws Exception {
		return userService.deleFriend(dataJson);
	}
	
	@RequestMapping(value = "/user/queryFriends", method = {RequestMethod.POST })
	public ResponseEntity queryFriends(@RequestBody JSONObject dataJson) throws Exception {
		return userService.queryFriends(dataJson);
	}
	
	
	@RequestMapping(value = "/user/queryFriendNum", method = {RequestMethod.POST })
	public ResponseEntity queryFriendNum(@RequestBody JSONObject dataJson) throws Exception {
		String token = dataJson.getString("token");
		dataJson = new JSONObject();
		dataJson.put("token",token);
		ResponseEntity response = userService.queryFriendNum(dataJson);
		return response;
	}
	
	
}

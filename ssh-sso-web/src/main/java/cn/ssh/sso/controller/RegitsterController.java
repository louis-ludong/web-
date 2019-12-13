package cn.ssh.sso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ssh.common.utils.sshResult;
import cn.ssh.pojo.TbUser;
import cn.ssh.sso.service.RegisterService;

/**
 * 注册功能Controller
 * <p>Title: RegitsterController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Controller
public class RegitsterController {
	
	@Autowired
	private RegisterService registerService;

	@RequestMapping("/page/register")
	public String showRegister() {
		return "register";
	}
	
	@RequestMapping("/user/check/{param}/{type}")
	@ResponseBody
	public sshResult checkData(@PathVariable String param, @PathVariable Integer type) {
		sshResult sshResult = registerService.checkData(param, type);
		return sshResult;
	}
	
	@RequestMapping(value="/user/register", method=RequestMethod.POST)
	@ResponseBody
	public sshResult register(TbUser user) {
		sshResult sshResult = registerService.register(user);
		return sshResult;
	}
}

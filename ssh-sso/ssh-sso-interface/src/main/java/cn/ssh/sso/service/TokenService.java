package cn.ssh.sso.service;

import cn.ssh.common.utils.sshResult;

/**
 * 根据token查询用户信息
 * <p>Title: TokenService</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
public interface TokenService {

	sshResult getUserByToken(String token);
}

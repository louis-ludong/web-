package cn.ssh.sso.service;

import cn.ssh.common.utils.sshResult;
import cn.ssh.pojo.TbUser;

public interface RegisterService {

	sshResult checkData(String param, int type);
	sshResult register(TbUser user);
}

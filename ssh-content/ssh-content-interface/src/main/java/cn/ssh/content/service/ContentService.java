package cn.ssh.content.service;

import java.util.List;

import cn.ssh.common.utils.sshResult;
import cn.ssh.pojo.TbContent;

public interface ContentService {

	sshResult addContent(TbContent content);
	List<TbContent> getContentListByCid(long cid);
}

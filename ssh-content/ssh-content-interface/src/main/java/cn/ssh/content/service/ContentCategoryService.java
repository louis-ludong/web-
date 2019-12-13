package cn.ssh.content.service;

import java.util.List;

import cn.ssh.common.pojo.EasyUITreeNode;
import cn.ssh.common.utils.sshResult;

public interface ContentCategoryService {

	List<EasyUITreeNode> getContentCatList(long parentId);
	sshResult addContentCategory(long parentId, String name);
}

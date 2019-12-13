package cn.ssh.service;


import java.util.List;

import cn.ssh.common.pojo.EasyUITreeNode;

public interface ItemCatService {

	List<EasyUITreeNode> getItemCatlist(long parentId);
}

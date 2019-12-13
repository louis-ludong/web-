package cn.ssh.service;

import cn.ssh.common.pojo.EasyUIGridResult;
import cn.ssh.common.utils.sshResult;
import cn.ssh.pojo.TbItem;
import cn.ssh.pojo.TbItemDesc;

public interface ItemService {

	TbItem getItemById(long itemId);
	EasyUIGridResult getItemList(int page, int rows);
	sshResult addItem(TbItem item, String desc);
	TbItemDesc getItemDescById(long itemId);
}

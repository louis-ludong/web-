package cn.ssh.search.mapper;

import java.util.List;

import cn.ssh.common.pojo.SearchItem;
import cn.ssh.common.pojo.SearchItem;
public interface ItemMapper {

	List<SearchItem> getItemList();
	SearchItem getItemById(long itemId);
}

package cn.ssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ssh.common.pojo.EasyUIGridResult;
import cn.ssh.common.utils.sshResult;
import cn.ssh.pojo.TbItem;
import cn.ssh.service.ItemService;

/**
 * 商品管理controller
 * @author Administrator
 *
 */
@Controller

public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem geTbItemById(@PathVariable long itemId) {
		TbItem tbItem=itemService.getItemById(itemId);
		return tbItem;
	}

	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIGridResult getItemList(Integer page, Integer rows) {
		//调用服务查询商品列表
		EasyUIGridResult result = itemService.getItemList(page, rows);
		return result;
	}
	
	/**
	 * 商品添加功能
	 */
	@RequestMapping(value="/item/save", method=RequestMethod.POST)
	@ResponseBody
	public sshResult addItem(TbItem item, String desc) {
		sshResult result = itemService.addItem(item, desc);
		return result;
	}
}

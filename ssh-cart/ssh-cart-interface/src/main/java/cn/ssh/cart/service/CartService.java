package cn.ssh.cart.service;

import java.util.List;

import cn.ssh.common.utils.sshResult;
import cn.ssh.pojo.TbItem;

public interface CartService {

	sshResult addCart(long userId, long itemId, int num);
	sshResult mergeCart(long userId, List<TbItem> itemList);
	List<TbItem> getCartList(long userId);
	sshResult updateCartNum(long userId, long itemId, int num);
	sshResult deleteCartItem(long userId, long itemId);
	sshResult clearCartItem(long userId);
}

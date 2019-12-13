package cn.ssh.order.service;

import cn.ssh.common.utils.sshResult;
import cn.ssh.order.pojo.OrderInfo;

public interface OrderService {

	sshResult createOrder(OrderInfo orderInfo);
}

package com.jf.nacos.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jf.common.utils.result.BaseResult;
import com.jf.nacos.client.hystrix.FcsClientFallback;
import com.jf.nacos.domain.dto.OrderDTO;

/**
 * fcs蜂羽主项目服务
 *
 * @author 江峰
 * @date 2020/7/19 15:02
 */
@FeignClient(name = "service-provider", fallbackFactory = FcsClientFallback.class)
public interface FcsClient {

	/**
	 * 根据订单id查询订单
	 *
	 * @return
	 */
	@GetMapping(value = "/order/{orderId}")
	BaseResult<OrderDTO> getOrderById(@PathVariable Integer orderId);

}
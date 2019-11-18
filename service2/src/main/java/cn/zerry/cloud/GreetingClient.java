package cn.zerry.cloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * xxx
 * @author linzengrui
 * @date 2019年11月18日 11:11
 */
//@FeignClient("service1")
public interface GreetingClient {
	@RequestMapping("/greeting")
	String greeting();
}

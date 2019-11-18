package cn.zerry.cloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * xxx
 * @author linzengrui
 * @date 2019年11月18日 11:30
 */
@FeignClient("service1")
public interface HelloClient {
	@GetMapping("hello")
	String hello();
}

package cn.zerry.cloud;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * xxx
 * @author linzengrui
 * @date 2019年11月18日 9:40
 */
public interface GreetingController {
	@RequestMapping("/greeting")
	String greeting();
}

package cn.zerry.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * xxx
 * @author linzengrui
 * @date 2019年11月18日 11:29
 */
@RestController
public class HelloController {

	@GetMapping("hello")
	public String hello(){
		return "hello world";
	}
}

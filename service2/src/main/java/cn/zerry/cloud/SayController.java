package cn.zerry.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * xxx
 * @author linzengrui
 * @date 2019年11月18日 11:32
 */
@RestController
public class SayController {

	@Autowired
	private HelloClient helloClient;

	@GetMapping("say")
	public String say(){
		return "service2 <-- service1: " + helloClient.hello();
	}
}

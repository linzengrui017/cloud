package cn.zerry.cloud;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;

/**
 * xxx
 * @author linzengrui
 * @date 2019年11月18日 14:07
 */
@Configuration
public class FeignConfiguration implements RequestInterceptor{

	@Override
	public void apply(RequestTemplate requestTemplate) {

	}
}

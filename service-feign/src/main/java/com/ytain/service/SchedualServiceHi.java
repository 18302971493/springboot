package com.ytain.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * 指定服务名称：<br>
 * 定义一个feign接口类,通过@ FeignClient（“服务名”），来指定调用哪个服务<br>
 * @author dww_w
 *
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface  SchedualServiceHi {

	@RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

package com.wler.addrbook.transport;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <b>用户功能传输层接口</b>
 * @author Monster
 * @version 5.0.0
 */
@FeignClient(name = "addrbook-provider")
@RequestMapping("/user/trans")
public interface UserTransport {
}

package com.wler.addrbook.transport.impl;

import com.wler.addrbook.transport.UserTransport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>用户功能传输层接口实现类</b>
 * @author Monster
 * @version 5.0.0
 */
@RestController("userTransport")
@RequestMapping("/user/trans")
public class UserTransportImpl implements UserTransport{
}

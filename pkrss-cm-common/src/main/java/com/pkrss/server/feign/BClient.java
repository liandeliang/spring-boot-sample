package com.pkrss.server.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.pkrss.server.service.BService;

@FeignClient("pkrss-microsrv-b")
public interface BClient extends BService {
}

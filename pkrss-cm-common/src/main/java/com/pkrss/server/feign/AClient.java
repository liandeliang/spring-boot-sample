package com.pkrss.server.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.pkrss.server.service.AService;

@FeignClient("pkrss-microsrv-a")
public interface AClient extends AService {
}

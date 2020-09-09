package com.kevin.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: kevin
 * @create: 2020-09-09 12:42
 */
@RestController
@RequestMapping("log")
@Slf4j
public class LogTestApi {

    @GetMapping("hello")
    public void hello(){

        log.trace("=========trace");
        log.info("=========info");
        log.debug("=========debug");
        log.warn("=========warn");
        log.error("=========error");
    }
}

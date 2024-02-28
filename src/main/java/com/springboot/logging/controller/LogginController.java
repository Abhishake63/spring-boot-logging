package com.springboot.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogginController {

    private static final Logger logger = LoggerFactory.getLogger(LogginController.class);

    @GetMapping("/")
    public Boolean sendMailWithAttachment() {

        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");

        return true;
    }
}
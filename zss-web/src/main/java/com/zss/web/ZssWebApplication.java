package com.zss.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @desc:
 * @author: zhangsongsong
 * @date: 2024-03-08 17:00
 */
@SpringBootApplication(scanBasePackages = "com.zss.web")
public class ZssWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZssWebApplication.class, args);
    }
}

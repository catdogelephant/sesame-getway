package com.zhumuchang.dongqu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@Slf4j
@SpringBootApplication
public class SesameGetwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SesameGetwayApplication.class, args);
        log.info("------------------------>>>>SesameGetwayApplication - 启动成功<<<<------------------------");
    }

}

package com.zhumuchang.dongqu;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @EnableAdminServer spring boot admin服务端
 */
@EnableAdminServer
@EnableDiscoveryClient
@Slf4j
@SpringBootApplication
public class SesameGetwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SesameGetwayApplication.class, args);
        log.info("------------------------>>>>SesameGetwayApplication - 启动成功<<<<------------------------");
    }

}

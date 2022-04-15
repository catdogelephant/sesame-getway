package com.zhumuchang.dongqu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//服务端的启动类，可以接受别人注册进来
//@EnableEurekaServer
@Slf4j
@SpringBootApplication
public class SesameGetwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SesameGetwayApplication.class, args);
        log.info("------------------------>>>>SesameGetwayApplication - 启动成功<<<<------------------------");
    }

}

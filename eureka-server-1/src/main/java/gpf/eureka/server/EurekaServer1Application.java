package gpf.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RestController;

/**
 * EnableEurekaServer 表明该服务是注册中心
 *
 * @author ge.pengfei
 */
@SpringBootApplication
@EnableEurekaServer
@RestController
public class EurekaServer1Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer1Application.class, args);
    }
}

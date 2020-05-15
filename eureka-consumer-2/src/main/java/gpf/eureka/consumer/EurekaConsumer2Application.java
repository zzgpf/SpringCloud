package gpf.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ge.pengfei
 */

@SpringBootApplication
@EnableFeignClients
@RestController
public class EurekaConsumer2Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumer2Application.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "this is EurekaConsumer2Application";
    }
}
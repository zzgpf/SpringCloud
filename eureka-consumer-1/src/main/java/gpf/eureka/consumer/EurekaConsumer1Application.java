package gpf.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ge.pengfei
 */

@SpringBootApplication
@RestController
public class EurekaConsumer1Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumer1Application.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "this is EurekaConsumer1Application";
    }
}

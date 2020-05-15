package gpf.eureka.consumer;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import gpf.base.ClosedBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

    /**
     * 开启负载均衡的 RestTemplate
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /**
     * 配置负载均衡算法，覆盖默认的轮询算法
     */
    @ConditionalOnBean(ClosedBean.class)
    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
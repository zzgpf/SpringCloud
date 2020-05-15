package gpf.eureka.consumer;

import gpf.base.api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author ge.pengfei
 */

@FeignClient(name = "eureka-provider-name/eureka-provider")
public interface UserService extends UserApi {

}

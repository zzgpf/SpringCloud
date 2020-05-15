package gpf.eureka.provider;

import gpf.base.api.UserApi;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ge.pengfei
 */

@RestController
public class UserController implements UserApi {
    @Override
    public String getName() {
        return "大壮";
    }
}

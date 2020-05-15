package gpf.base.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ge.pengfei
 */

@RequestMapping("/user")
public interface UserApi {
    /**
     * 获取姓名
     *
     * @return 姓名
     */
    @GetMapping("/name")
    String getName();
}

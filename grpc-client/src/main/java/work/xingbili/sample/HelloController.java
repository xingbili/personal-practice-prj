/*
 *  版权信息: © 聚均科技
 */

package work.xingbili.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xinghuolin
 * @date 2023/4/20 10:07
 */
@RestController
public class HelloController{
    @Autowired
    GrpcClientService grpcClientService;

    @GetMapping("/hello")
    public void hello() {
        grpcClientService.hello();
    }

}
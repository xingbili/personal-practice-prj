/*
 *  版权信息: © 聚均科技
 */

package work.xingbili;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xinghuolin
 * @date 2023/4/20 10:44
 */
@SpringBootApplication
public class ServiceApplication{
    public static void main(String[] args){
        SpringApplication.run(ServiceApplication.class,args);
    }
}
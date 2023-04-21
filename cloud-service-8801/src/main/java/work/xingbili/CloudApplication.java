/*
 *  版权信息: © 聚均科技
 */

package work.xingbili;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xinghuolin
 * @date 2023/4/20 11:01
 */

@EnableDiscoveryClient
@SpringBootApplication
public class CloudApplication{
    public static void main(String[] args){
        SpringApplication.run(CloudApplication.class,args);
    }
}
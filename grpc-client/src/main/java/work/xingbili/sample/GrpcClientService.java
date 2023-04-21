/*
 *  版权信息: © 聚均科技
 */

package work.xingbili.sample;

import com.google.protobuf.StringValue;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Component;
import work.xingbili.grpc.api.*;

/**
 * @author xinghuolin
 * @date 2023/4/20 10:07
 */
@Component
public class GrpcClientService{
    @GrpcClient("grpc_server")
    HelloServiceGrpc.HelloServiceBlockingStub helloServiceBlockingStub;

    public void hello() {
        StringValue s = helloServiceBlockingStub.sayHello(StringValue.newBuilder().setValue("javaboy").build());
        System.out.println("s = " + s.getValue());
    }
}
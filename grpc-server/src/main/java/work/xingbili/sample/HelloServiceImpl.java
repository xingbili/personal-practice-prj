/*
 *  版权信息: © 聚均科技
 */

package work.xingbili.sample;

import com.google.protobuf.StringValue;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import work.xingbili.grpc.api.HelloServiceGrpc;

/**
 * @author xinghuolin
 * @date 2023/4/20 10:42
 */
@GrpcService
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void sayHello(StringValue request,StreamObserver<StringValue> responseObserver) {
        String value = request.getValue();
        responseObserver.onNext(StringValue.newBuilder().setValue("hello " + value).build());
        responseObserver.onCompleted();
    }
}
package dev.vlaship.grpc.server;

import lombok.extern.slf4j.Slf4j;
import dev.vlaship.grpc.common.GreetingRequest;
import dev.vlaship.grpc.common.GreetingResponse;
import dev.vlaship.grpc.common.GreetingServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@Slf4j
@GRpcService
public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {

    @Override
    public void greeting(GreetingRequest request, StreamObserver<GreetingResponse> responseObserver) {
        var message = request.getMessage();
        log.info("Received Message: {}", message);

        var greetingResponse = GreetingResponse.newBuilder()
                .setMessage("Received your " + message + ". Hello From Server. ")
                .build();

        responseObserver.onNext(greetingResponse);
        responseObserver.onCompleted();
    }

}

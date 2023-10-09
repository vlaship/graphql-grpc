package dev.vlaship.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.NonNull;
import dev.vlaship.grpc.common.GreetingRequest;
import dev.vlaship.grpc.common.GreetingServiceGrpc;

@Slf4j
@RequiredArgsConstructor
public class GreetingClient {

    private final GreetingProperties properties;

    @NonNull
    public ClientResponse greeting(@NonNull ClientRequest request) {
        log.info("send request {}", request);
        ManagedChannel channel = null;
        try {
            channel = ManagedChannelBuilder.forAddress(properties.getHostname(), properties.getPort())
                    .usePlaintext()
                    .build();

            var stub = GreetingServiceGrpc.newBlockingStub(channel);

            var response = stub.greeting(GreetingRequest.newBuilder().setMessage(request.message()).build());
            log.info("get response {}", response);

            return new ClientResponse(request.message());
        } catch (RuntimeException ex){
            log.error(ex.getMessage(), ex);
            throw new GreetingException(ex);
        }
        finally {
            if (channel != null) {
                channel.shutdown();
            }
        }
    }

}

package dev.vlaship.graphql;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import dev.vlaship.grpc.client.GreetingClient;

@Slf4j
@Controller
@RequiredArgsConstructor
public class GreetingController {

    private final GreetingClient greetingClient;
    private final ClientMapper clientMapper;

    @NonNull
    @QueryMapping
    public GraphqlResponse greeting(@NonNull @Argument GraphqlRequest req) {
        log.info("get request {}", req);
        var greetingResponse = greetingClient.greeting(clientMapper.map(req));
        log.info("get response {}", greetingResponse);
        return clientMapper.map(greetingResponse);
    }

}

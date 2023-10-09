package dev.vlaship.grpc.client.autoconfigure;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import dev.vlaship.grpc.client.GreetingClient;
import dev.vlaship.grpc.client.GreetingProperties;

@AutoConfiguration
@RequiredArgsConstructor
@EnableConfigurationProperties(GreetingProperties.class)
public class GreetingClientAutoConfiguration {

    private final GreetingProperties greetingProperties;

    @Bean
    @ConditionalOnMissingBean
    public GreetingClient greetingClient() {
        return new GreetingClient(greetingProperties);
    }

}

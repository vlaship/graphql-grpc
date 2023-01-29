package vlaship.grpc.client;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("grpc.greeting")
public class GreetingProperties {
    private String hostname = "localhost";
    private int port = 6565;
}

package vlaship.graphql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.graphql.test.tester.GraphQlTester;
import vlaship.grpc.client.GreetingClient;

import static org.junit.jupiter.api.Assertions.*;

@GraphQlTest({GreetingController.class, ClientMapper.class})
class GreetingControllerTest {

    @Autowired
    private GraphQlTester graphQlTester;

    @MockBean
    private GreetingClient greetingClient;

    @Test
    void greeting() {
        GraphQlTester.Errors errors = graphQlTester
                .document("")
                .execute()
                .errors();

        assertNull(errors);
    }
}
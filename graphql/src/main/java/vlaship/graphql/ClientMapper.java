package vlaship.graphql;

import org.mapstruct.Mapper;
import vlaship.grpc.client.ClientRequest;
import vlaship.grpc.client.ClientResponse;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    ClientRequest map(GraphqlRequest graphqlRequest);

    GraphqlResponse map(ClientResponse clientResponse);

}

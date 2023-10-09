package dev.vlaship.graphql;

import org.mapstruct.Mapper;
import dev.vlaship.grpc.client.ClientRequest;
import dev.vlaship.grpc.client.ClientResponse;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    ClientRequest map(GraphqlRequest graphqlRequest);

    GraphqlResponse map(ClientResponse clientResponse);

}

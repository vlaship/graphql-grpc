package dev.vlaship.grpc.client;

public class GreetingException extends RuntimeException {
    public GreetingException(RuntimeException ex) {
        super(ex);
    }
}

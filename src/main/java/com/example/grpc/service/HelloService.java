package com.example.grpc.service;
import io.grpc.stub.StreamObserver;

public interface HelloService {

	void sayHello(SayHelloRequest request, StreamObserver<SayHelloResponse> responseObserver);
}

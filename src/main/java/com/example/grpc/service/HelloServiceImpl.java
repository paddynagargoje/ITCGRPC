package com.example.grpc.service;

import io.grpc.stub.StreamObserver;

public abstract class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

	@Override
	public void sayHello(SayHelloRequest request, StreamObserver<SayHelloResponse> responseObserver) {
		 String clientName = request.getClientName();

	        e
	        String responseMessage = "Hello " + clientName;

	        String soapResponse = callSoapService(clientName);

	        
	        String responseMessage = "Hello " + clientName + " from SOAP";

	        HelloResponse response = HelloResponse.newBuilder()
	                                              .setMessage(responseMessage)
	                                              .build();

	        responseObserver.onNext(response);
	        responseObserver.onCompleted();
	    }

	    private String callSoapService(String clientName) {
	       
	        return "SOAP Response for " + clientName;
	    }

}

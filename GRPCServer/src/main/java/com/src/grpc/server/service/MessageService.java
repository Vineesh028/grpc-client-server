package com.src.grpc.server.service;

import com.src.grpc.generated.MessageSenderServiceGrpc.MessageSenderServiceImplBase;
import com.src.grpc.generated.Response;
import com.src.grpc.generated.ResponseCode;
import com.src.grpc.generated.SendRequest;

import io.grpc.stub.StreamObserver;

public class MessageService extends MessageSenderServiceImplBase{

	@Override
	public void send(SendRequest request, StreamObserver<Response> responseObserver) {
		String responseMessage = "Hello, "+request.getName()+ "!";
		
		Response response = Response.newBuilder().setResponseMessage(responseMessage).setCode(ResponseCode.Success).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

}

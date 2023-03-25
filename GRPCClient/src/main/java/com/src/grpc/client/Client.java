package com.src.grpc.client;

import com.src.grpc.MessageSenderServiceGrpc;
import com.src.grpc.MessageSenderServiceGrpc.MessageSenderServiceBlockingStub;
import com.src.grpc.Response;
import com.src.grpc.SendRequest;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client {

	public static void main(String[] args) {
		// creating stub
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();

        MessageSenderServiceBlockingStub stub = MessageSenderServiceGrpc.newBlockingStub(channel);

		// Requests
		SendRequest sendRequest = SendRequest.newBuilder().setName("Tom").build();

		Response response = stub.send(sendRequest);
		System.out.println(response.getResponseMessage());

	}
}

package com.src.grpc.server;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.src.grpc.server.service.MessageService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GRPCServer {
	private Server server;

	public GRPCServer(int port) {

		server = ServerBuilder.forPort(port).addService(new MessageService()).build();
		
	}

	private void start() throws IOException {
		server.start();
		System.out.println("server started ..port no :"+server.getPort());
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.err.println("shut down gRPC server because JVM shuts down");
				try {
					GRPCServer.this.stop();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.err.println("server shut down");
			}
		});

	}

	protected void stop() throws InterruptedException {
		if (server != null) {
			server.shutdown().awaitTermination(30000, TimeUnit.MILLISECONDS);
		}

	}

	private void blockUntilShutdown() throws InterruptedException {
		if (server != null) {
			server.awaitTermination();
		}

	}

	public static void main(String[] args) throws IOException, InterruptedException {

		GRPCServer server = new GRPCServer(8080);

		server.start();

		server.blockUntilShutdown();

	}

}

package com.src.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: MessageService.proto")
public final class MessageSenderServiceGrpc {

  private MessageSenderServiceGrpc() {}

  public static final String SERVICE_NAME = "MessageSenderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.src.grpc.SendRequest,
      com.src.grpc.Response> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "send",
      requestType = com.src.grpc.SendRequest.class,
      responseType = com.src.grpc.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.src.grpc.SendRequest,
      com.src.grpc.Response> getSendMethod() {
    io.grpc.MethodDescriptor<com.src.grpc.SendRequest, com.src.grpc.Response> getSendMethod;
    if ((getSendMethod = MessageSenderServiceGrpc.getSendMethod) == null) {
      synchronized (MessageSenderServiceGrpc.class) {
        if ((getSendMethod = MessageSenderServiceGrpc.getSendMethod) == null) {
          MessageSenderServiceGrpc.getSendMethod = getSendMethod = 
              io.grpc.MethodDescriptor.<com.src.grpc.SendRequest, com.src.grpc.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MessageSenderService", "send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.src.grpc.SendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.src.grpc.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MessageSenderServiceMethodDescriptorSupplier("send"))
                  .build();
          }
        }
     }
     return getSendMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessageSenderServiceStub newStub(io.grpc.Channel channel) {
    return new MessageSenderServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessageSenderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MessageSenderServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessageSenderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MessageSenderServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MessageSenderServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void send(com.src.grpc.SendRequest request,
        io.grpc.stub.StreamObserver<com.src.grpc.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.src.grpc.SendRequest,
                com.src.grpc.Response>(
                  this, METHODID_SEND)))
          .build();
    }
  }

  /**
   */
  public static final class MessageSenderServiceStub extends io.grpc.stub.AbstractStub<MessageSenderServiceStub> {
    private MessageSenderServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessageSenderServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageSenderServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessageSenderServiceStub(channel, callOptions);
    }

    /**
     */
    public void send(com.src.grpc.SendRequest request,
        io.grpc.stub.StreamObserver<com.src.grpc.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MessageSenderServiceBlockingStub extends io.grpc.stub.AbstractStub<MessageSenderServiceBlockingStub> {
    private MessageSenderServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessageSenderServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageSenderServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessageSenderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.src.grpc.Response send(com.src.grpc.SendRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MessageSenderServiceFutureStub extends io.grpc.stub.AbstractStub<MessageSenderServiceFutureStub> {
    private MessageSenderServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessageSenderServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageSenderServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessageSenderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.src.grpc.Response> send(
        com.src.grpc.SendRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessageSenderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessageSenderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((com.src.grpc.SendRequest) request,
              (io.grpc.stub.StreamObserver<com.src.grpc.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MessageSenderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessageSenderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.src.grpc.MessageService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MessageSenderService");
    }
  }

  private static final class MessageSenderServiceFileDescriptorSupplier
      extends MessageSenderServiceBaseDescriptorSupplier {
    MessageSenderServiceFileDescriptorSupplier() {}
  }

  private static final class MessageSenderServiceMethodDescriptorSupplier
      extends MessageSenderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessageSenderServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MessageSenderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessageSenderServiceFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .build();
        }
      }
    }
    return result;
  }
}

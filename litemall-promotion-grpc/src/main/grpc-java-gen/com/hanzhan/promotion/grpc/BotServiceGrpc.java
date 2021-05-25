package com.hanzhan.promotion.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: prom-serv.proto")
public final class BotServiceGrpc {

  private BotServiceGrpc() {}

  public static final String SERVICE_NAME = "com.hanzhan.promotion.grpc.BotService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.hanzhan.promotion.grpc.PromServ.BotCreateRequest,
      com.hanzhan.promotion.grpc.PromServ.BotCreateResponse> getCreateBotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createBot",
      requestType = com.hanzhan.promotion.grpc.PromServ.BotCreateRequest.class,
      responseType = com.hanzhan.promotion.grpc.PromServ.BotCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hanzhan.promotion.grpc.PromServ.BotCreateRequest,
      com.hanzhan.promotion.grpc.PromServ.BotCreateResponse> getCreateBotMethod() {
    io.grpc.MethodDescriptor<com.hanzhan.promotion.grpc.PromServ.BotCreateRequest, com.hanzhan.promotion.grpc.PromServ.BotCreateResponse> getCreateBotMethod;
    if ((getCreateBotMethod = BotServiceGrpc.getCreateBotMethod) == null) {
      synchronized (BotServiceGrpc.class) {
        if ((getCreateBotMethod = BotServiceGrpc.getCreateBotMethod) == null) {
          BotServiceGrpc.getCreateBotMethod = getCreateBotMethod =
              io.grpc.MethodDescriptor.<com.hanzhan.promotion.grpc.PromServ.BotCreateRequest, com.hanzhan.promotion.grpc.PromServ.BotCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createBot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hanzhan.promotion.grpc.PromServ.BotCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hanzhan.promotion.grpc.PromServ.BotCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BotServiceMethodDescriptorSupplier("createBot"))
              .build();
        }
      }
    }
    return getCreateBotMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BotServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BotServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BotServiceStub>() {
        @java.lang.Override
        public BotServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BotServiceStub(channel, callOptions);
        }
      };
    return BotServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BotServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BotServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BotServiceBlockingStub>() {
        @java.lang.Override
        public BotServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BotServiceBlockingStub(channel, callOptions);
        }
      };
    return BotServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BotServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BotServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BotServiceFutureStub>() {
        @java.lang.Override
        public BotServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BotServiceFutureStub(channel, callOptions);
        }
      };
    return BotServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BotServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createBot(com.hanzhan.promotion.grpc.PromServ.BotCreateRequest request,
        io.grpc.stub.StreamObserver<com.hanzhan.promotion.grpc.PromServ.BotCreateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBotMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateBotMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.hanzhan.promotion.grpc.PromServ.BotCreateRequest,
                com.hanzhan.promotion.grpc.PromServ.BotCreateResponse>(
                  this, METHODID_CREATE_BOT)))
          .build();
    }
  }

  /**
   */
  public static final class BotServiceStub extends io.grpc.stub.AbstractAsyncStub<BotServiceStub> {
    private BotServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BotServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BotServiceStub(channel, callOptions);
    }

    /**
     */
    public void createBot(com.hanzhan.promotion.grpc.PromServ.BotCreateRequest request,
        io.grpc.stub.StreamObserver<com.hanzhan.promotion.grpc.PromServ.BotCreateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBotMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BotServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BotServiceBlockingStub> {
    private BotServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BotServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BotServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.hanzhan.promotion.grpc.PromServ.BotCreateResponse createBot(com.hanzhan.promotion.grpc.PromServ.BotCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBotMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BotServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BotServiceFutureStub> {
    private BotServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BotServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BotServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hanzhan.promotion.grpc.PromServ.BotCreateResponse> createBot(
        com.hanzhan.promotion.grpc.PromServ.BotCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBotMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BOT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BotServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BotServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BOT:
          serviceImpl.createBot((com.hanzhan.promotion.grpc.PromServ.BotCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.hanzhan.promotion.grpc.PromServ.BotCreateResponse>) responseObserver);
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

  private static abstract class BotServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BotServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hanzhan.promotion.grpc.PromServ.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BotService");
    }
  }

  private static final class BotServiceFileDescriptorSupplier
      extends BotServiceBaseDescriptorSupplier {
    BotServiceFileDescriptorSupplier() {}
  }

  private static final class BotServiceMethodDescriptorSupplier
      extends BotServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BotServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BotServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BotServiceFileDescriptorSupplier())
              .addMethod(getCreateBotMethod())
              .build();
        }
      }
    }
    return result;
  }
}

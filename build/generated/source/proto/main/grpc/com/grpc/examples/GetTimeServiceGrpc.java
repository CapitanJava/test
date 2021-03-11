package com.grpc.examples;

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
    value = "by gRPC proto compiler (version 1.29.0)",
    comments = "Source: GetTimeService.proto")
public final class GetTimeServiceGrpc {

  private GetTimeServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.examples.GetTimeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.examples.GetTimeServiceOuterClass.GetTimeRequest,
      com.grpc.examples.GetTimeServiceOuterClass.GetTimeResponse> getGetTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTime",
      requestType = com.grpc.examples.GetTimeServiceOuterClass.GetTimeRequest.class,
      responseType = com.grpc.examples.GetTimeServiceOuterClass.GetTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.examples.GetTimeServiceOuterClass.GetTimeRequest,
      com.grpc.examples.GetTimeServiceOuterClass.GetTimeResponse> getGetTimeMethod() {
    io.grpc.MethodDescriptor<com.grpc.examples.GetTimeServiceOuterClass.GetTimeRequest, com.grpc.examples.GetTimeServiceOuterClass.GetTimeResponse> getGetTimeMethod;
    if ((getGetTimeMethod = GetTimeServiceGrpc.getGetTimeMethod) == null) {
      synchronized (GetTimeServiceGrpc.class) {
        if ((getGetTimeMethod = GetTimeServiceGrpc.getGetTimeMethod) == null) {
          GetTimeServiceGrpc.getGetTimeMethod = getGetTimeMethod =
              io.grpc.MethodDescriptor.<com.grpc.examples.GetTimeServiceOuterClass.GetTimeRequest, com.grpc.examples.GetTimeServiceOuterClass.GetTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.examples.GetTimeServiceOuterClass.GetTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.examples.GetTimeServiceOuterClass.GetTimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GetTimeServiceMethodDescriptorSupplier("getTime"))
              .build();
        }
      }
    }
    return getGetTimeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetTimeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetTimeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetTimeServiceStub>() {
        @java.lang.Override
        public GetTimeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetTimeServiceStub(channel, callOptions);
        }
      };
    return GetTimeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetTimeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetTimeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetTimeServiceBlockingStub>() {
        @java.lang.Override
        public GetTimeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetTimeServiceBlockingStub(channel, callOptions);
        }
      };
    return GetTimeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetTimeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetTimeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetTimeServiceFutureStub>() {
        @java.lang.Override
        public GetTimeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetTimeServiceFutureStub(channel, callOptions);
        }
      };
    return GetTimeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GetTimeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTime(com.grpc.examples.GetTimeServiceOuterClass.GetTimeRequest request,
        io.grpc.stub.StreamObserver<com.grpc.examples.GetTimeServiceOuterClass.GetTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTimeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTimeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.examples.GetTimeServiceOuterClass.GetTimeRequest,
                com.grpc.examples.GetTimeServiceOuterClass.GetTimeResponse>(
                  this, METHODID_GET_TIME)))
          .build();
    }
  }

  /**
   */
  public static final class GetTimeServiceStub extends io.grpc.stub.AbstractAsyncStub<GetTimeServiceStub> {
    private GetTimeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetTimeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetTimeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getTime(com.grpc.examples.GetTimeServiceOuterClass.GetTimeRequest request,
        io.grpc.stub.StreamObserver<com.grpc.examples.GetTimeServiceOuterClass.GetTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTimeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GetTimeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GetTimeServiceBlockingStub> {
    private GetTimeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetTimeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetTimeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.examples.GetTimeServiceOuterClass.GetTimeResponse getTime(com.grpc.examples.GetTimeServiceOuterClass.GetTimeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTimeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GetTimeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GetTimeServiceFutureStub> {
    private GetTimeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetTimeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetTimeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.examples.GetTimeServiceOuterClass.GetTimeResponse> getTime(
        com.grpc.examples.GetTimeServiceOuterClass.GetTimeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTimeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TIME = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GetTimeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GetTimeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TIME:
          serviceImpl.getTime((com.grpc.examples.GetTimeServiceOuterClass.GetTimeRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.examples.GetTimeServiceOuterClass.GetTimeResponse>) responseObserver);
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

  private static abstract class GetTimeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GetTimeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.examples.GetTimeServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GetTimeService");
    }
  }

  private static final class GetTimeServiceFileDescriptorSupplier
      extends GetTimeServiceBaseDescriptorSupplier {
    GetTimeServiceFileDescriptorSupplier() {}
  }

  private static final class GetTimeServiceMethodDescriptorSupplier
      extends GetTimeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GetTimeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GetTimeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetTimeServiceFileDescriptorSupplier())
              .addMethod(getGetTimeMethod())
              .build();
        }
      }
    }
    return result;
  }
}

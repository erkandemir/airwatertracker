package com.caproject.protos;

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
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: waterInformationService.proto")
public final class WaterInformationServiceGrpc {

  private WaterInformationServiceGrpc() {}

  public static final String SERVICE_NAME = "airWaterTrackerService.WaterInformationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.caproject.protos.WaterInformationRequest,
      com.caproject.protos.WaterInformationResponse> getGetWaterInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWaterInformation",
      requestType = com.caproject.protos.WaterInformationRequest.class,
      responseType = com.caproject.protos.WaterInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.caproject.protos.WaterInformationRequest,
      com.caproject.protos.WaterInformationResponse> getGetWaterInformationMethod() {
    io.grpc.MethodDescriptor<com.caproject.protos.WaterInformationRequest, com.caproject.protos.WaterInformationResponse> getGetWaterInformationMethod;
    if ((getGetWaterInformationMethod = WaterInformationServiceGrpc.getGetWaterInformationMethod) == null) {
      synchronized (WaterInformationServiceGrpc.class) {
        if ((getGetWaterInformationMethod = WaterInformationServiceGrpc.getGetWaterInformationMethod) == null) {
          WaterInformationServiceGrpc.getGetWaterInformationMethod = getGetWaterInformationMethod = 
              io.grpc.MethodDescriptor.<com.caproject.protos.WaterInformationRequest, com.caproject.protos.WaterInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "airWaterTrackerService.WaterInformationService", "GetWaterInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caproject.protos.WaterInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caproject.protos.WaterInformationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WaterInformationServiceMethodDescriptorSupplier("GetWaterInformation"))
                  .build();
          }
        }
     }
     return getGetWaterInformationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.caproject.protos.WaterPhRequest,
      com.caproject.protos.WaterPhResponse> getGetWaterPhValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWaterPhValue",
      requestType = com.caproject.protos.WaterPhRequest.class,
      responseType = com.caproject.protos.WaterPhResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.caproject.protos.WaterPhRequest,
      com.caproject.protos.WaterPhResponse> getGetWaterPhValueMethod() {
    io.grpc.MethodDescriptor<com.caproject.protos.WaterPhRequest, com.caproject.protos.WaterPhResponse> getGetWaterPhValueMethod;
    if ((getGetWaterPhValueMethod = WaterInformationServiceGrpc.getGetWaterPhValueMethod) == null) {
      synchronized (WaterInformationServiceGrpc.class) {
        if ((getGetWaterPhValueMethod = WaterInformationServiceGrpc.getGetWaterPhValueMethod) == null) {
          WaterInformationServiceGrpc.getGetWaterPhValueMethod = getGetWaterPhValueMethod = 
              io.grpc.MethodDescriptor.<com.caproject.protos.WaterPhRequest, com.caproject.protos.WaterPhResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "airWaterTrackerService.WaterInformationService", "GetWaterPhValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caproject.protos.WaterPhRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caproject.protos.WaterPhResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WaterInformationServiceMethodDescriptorSupplier("GetWaterPhValue"))
                  .build();
          }
        }
     }
     return getGetWaterPhValueMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WaterInformationServiceStub newStub(io.grpc.Channel channel) {
    return new WaterInformationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WaterInformationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WaterInformationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WaterInformationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WaterInformationServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class WaterInformationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getWaterInformation(com.caproject.protos.WaterInformationRequest request,
        io.grpc.stub.StreamObserver<com.caproject.protos.WaterInformationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWaterInformationMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.caproject.protos.WaterPhRequest> getWaterPhValue(
        io.grpc.stub.StreamObserver<com.caproject.protos.WaterPhResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetWaterPhValueMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetWaterInformationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.caproject.protos.WaterInformationRequest,
                com.caproject.protos.WaterInformationResponse>(
                  this, METHODID_GET_WATER_INFORMATION)))
          .addMethod(
            getGetWaterPhValueMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.caproject.protos.WaterPhRequest,
                com.caproject.protos.WaterPhResponse>(
                  this, METHODID_GET_WATER_PH_VALUE)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class WaterInformationServiceStub extends io.grpc.stub.AbstractStub<WaterInformationServiceStub> {
    private WaterInformationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterInformationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterInformationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterInformationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getWaterInformation(com.caproject.protos.WaterInformationRequest request,
        io.grpc.stub.StreamObserver<com.caproject.protos.WaterInformationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWaterInformationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.caproject.protos.WaterPhRequest> getWaterPhValue(
        io.grpc.stub.StreamObserver<com.caproject.protos.WaterPhResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetWaterPhValueMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class WaterInformationServiceBlockingStub extends io.grpc.stub.AbstractStub<WaterInformationServiceBlockingStub> {
    private WaterInformationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterInformationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterInformationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterInformationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.caproject.protos.WaterInformationResponse getWaterInformation(com.caproject.protos.WaterInformationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWaterInformationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class WaterInformationServiceFutureStub extends io.grpc.stub.AbstractStub<WaterInformationServiceFutureStub> {
    private WaterInformationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterInformationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterInformationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterInformationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.caproject.protos.WaterInformationResponse> getWaterInformation(
        com.caproject.protos.WaterInformationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWaterInformationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WATER_INFORMATION = 0;
  private static final int METHODID_GET_WATER_PH_VALUE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WaterInformationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WaterInformationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_WATER_INFORMATION:
          serviceImpl.getWaterInformation((com.caproject.protos.WaterInformationRequest) request,
              (io.grpc.stub.StreamObserver<com.caproject.protos.WaterInformationResponse>) responseObserver);
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
        case METHODID_GET_WATER_PH_VALUE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getWaterPhValue(
              (io.grpc.stub.StreamObserver<com.caproject.protos.WaterPhResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WaterInformationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WaterInformationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.caproject.protos.WaterInformationServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WaterInformationService");
    }
  }

  private static final class WaterInformationServiceFileDescriptorSupplier
      extends WaterInformationServiceBaseDescriptorSupplier {
    WaterInformationServiceFileDescriptorSupplier() {}
  }

  private static final class WaterInformationServiceMethodDescriptorSupplier
      extends WaterInformationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WaterInformationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WaterInformationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WaterInformationServiceFileDescriptorSupplier())
              .addMethod(getGetWaterInformationMethod())
              .addMethod(getGetWaterPhValueMethod())
              .build();
        }
      }
    }
    return result;
  }
}

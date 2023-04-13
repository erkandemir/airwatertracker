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
    comments = "Source: airInformationService.proto")
public final class AirInformationServiceGrpc {

  private AirInformationServiceGrpc() {}

  public static final String SERVICE_NAME = "airWaterTrackerService.AirInformationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.caproject.protos.AirInfoRequest,
      com.caproject.protos.AirInfoResponse> getGetCarbonMonoxideLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCarbonMonoxideLevel",
      requestType = com.caproject.protos.AirInfoRequest.class,
      responseType = com.caproject.protos.AirInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.caproject.protos.AirInfoRequest,
      com.caproject.protos.AirInfoResponse> getGetCarbonMonoxideLevelMethod() {
    io.grpc.MethodDescriptor<com.caproject.protos.AirInfoRequest, com.caproject.protos.AirInfoResponse> getGetCarbonMonoxideLevelMethod;
    if ((getGetCarbonMonoxideLevelMethod = AirInformationServiceGrpc.getGetCarbonMonoxideLevelMethod) == null) {
      synchronized (AirInformationServiceGrpc.class) {
        if ((getGetCarbonMonoxideLevelMethod = AirInformationServiceGrpc.getGetCarbonMonoxideLevelMethod) == null) {
          AirInformationServiceGrpc.getGetCarbonMonoxideLevelMethod = getGetCarbonMonoxideLevelMethod = 
              io.grpc.MethodDescriptor.<com.caproject.protos.AirInfoRequest, com.caproject.protos.AirInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "airWaterTrackerService.AirInformationService", "GetCarbonMonoxideLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caproject.protos.AirInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caproject.protos.AirInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirInformationServiceMethodDescriptorSupplier("GetCarbonMonoxideLevel"))
                  .build();
          }
        }
     }
     return getGetCarbonMonoxideLevelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.caproject.protos.ActivateFilterRequest,
      com.caproject.protos.ActivateFilterResponse> getActivateFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivateFilter",
      requestType = com.caproject.protos.ActivateFilterRequest.class,
      responseType = com.caproject.protos.ActivateFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.caproject.protos.ActivateFilterRequest,
      com.caproject.protos.ActivateFilterResponse> getActivateFilterMethod() {
    io.grpc.MethodDescriptor<com.caproject.protos.ActivateFilterRequest, com.caproject.protos.ActivateFilterResponse> getActivateFilterMethod;
    if ((getActivateFilterMethod = AirInformationServiceGrpc.getActivateFilterMethod) == null) {
      synchronized (AirInformationServiceGrpc.class) {
        if ((getActivateFilterMethod = AirInformationServiceGrpc.getActivateFilterMethod) == null) {
          AirInformationServiceGrpc.getActivateFilterMethod = getActivateFilterMethod = 
              io.grpc.MethodDescriptor.<com.caproject.protos.ActivateFilterRequest, com.caproject.protos.ActivateFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "airWaterTrackerService.AirInformationService", "ActivateFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caproject.protos.ActivateFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caproject.protos.ActivateFilterResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirInformationServiceMethodDescriptorSupplier("ActivateFilter"))
                  .build();
          }
        }
     }
     return getActivateFilterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AirInformationServiceStub newStub(io.grpc.Channel channel) {
    return new AirInformationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AirInformationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AirInformationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AirInformationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AirInformationServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class AirInformationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCarbonMonoxideLevel(com.caproject.protos.AirInfoRequest request,
        io.grpc.stub.StreamObserver<com.caproject.protos.AirInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCarbonMonoxideLevelMethod(), responseObserver);
    }

    /**
     */
    public void activateFilter(com.caproject.protos.ActivateFilterRequest request,
        io.grpc.stub.StreamObserver<com.caproject.protos.ActivateFilterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateFilterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCarbonMonoxideLevelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.caproject.protos.AirInfoRequest,
                com.caproject.protos.AirInfoResponse>(
                  this, METHODID_GET_CARBON_MONOXIDE_LEVEL)))
          .addMethod(
            getActivateFilterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.caproject.protos.ActivateFilterRequest,
                com.caproject.protos.ActivateFilterResponse>(
                  this, METHODID_ACTIVATE_FILTER)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AirInformationServiceStub extends io.grpc.stub.AbstractStub<AirInformationServiceStub> {
    private AirInformationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirInformationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirInformationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirInformationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCarbonMonoxideLevel(com.caproject.protos.AirInfoRequest request,
        io.grpc.stub.StreamObserver<com.caproject.protos.AirInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCarbonMonoxideLevelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void activateFilter(com.caproject.protos.ActivateFilterRequest request,
        io.grpc.stub.StreamObserver<com.caproject.protos.ActivateFilterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateFilterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AirInformationServiceBlockingStub extends io.grpc.stub.AbstractStub<AirInformationServiceBlockingStub> {
    private AirInformationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirInformationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirInformationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirInformationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.caproject.protos.AirInfoResponse getCarbonMonoxideLevel(com.caproject.protos.AirInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCarbonMonoxideLevelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.caproject.protos.ActivateFilterResponse activateFilter(com.caproject.protos.ActivateFilterRequest request) {
      return blockingUnaryCall(
          getChannel(), getActivateFilterMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AirInformationServiceFutureStub extends io.grpc.stub.AbstractStub<AirInformationServiceFutureStub> {
    private AirInformationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirInformationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirInformationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirInformationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.caproject.protos.AirInfoResponse> getCarbonMonoxideLevel(
        com.caproject.protos.AirInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCarbonMonoxideLevelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.caproject.protos.ActivateFilterResponse> activateFilter(
        com.caproject.protos.ActivateFilterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateFilterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CARBON_MONOXIDE_LEVEL = 0;
  private static final int METHODID_ACTIVATE_FILTER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AirInformationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AirInformationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CARBON_MONOXIDE_LEVEL:
          serviceImpl.getCarbonMonoxideLevel((com.caproject.protos.AirInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.caproject.protos.AirInfoResponse>) responseObserver);
          break;
        case METHODID_ACTIVATE_FILTER:
          serviceImpl.activateFilter((com.caproject.protos.ActivateFilterRequest) request,
              (io.grpc.stub.StreamObserver<com.caproject.protos.ActivateFilterResponse>) responseObserver);
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

  private static abstract class AirInformationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AirInformationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.caproject.protos.AirInformationServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AirInformationService");
    }
  }

  private static final class AirInformationServiceFileDescriptorSupplier
      extends AirInformationServiceBaseDescriptorSupplier {
    AirInformationServiceFileDescriptorSupplier() {}
  }

  private static final class AirInformationServiceMethodDescriptorSupplier
      extends AirInformationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AirInformationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AirInformationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AirInformationServiceFileDescriptorSupplier())
              .addMethod(getGetCarbonMonoxideLevelMethod())
              .addMethod(getActivateFilterMethod())
              .build();
        }
      }
    }
    return result;
  }
}

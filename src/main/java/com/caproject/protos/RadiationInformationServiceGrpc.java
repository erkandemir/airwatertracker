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
    comments = "Source: radiationInformationService.proto")
public final class RadiationInformationServiceGrpc {

  private RadiationInformationServiceGrpc() {}

  public static final String SERVICE_NAME = "airWaterTrackerService.RadiationInformationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.caproject.protos.RadiationLevelRequest,
      com.caproject.protos.RadiationLevelResponse> getGetRadiationLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRadiationLevel",
      requestType = com.caproject.protos.RadiationLevelRequest.class,
      responseType = com.caproject.protos.RadiationLevelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.caproject.protos.RadiationLevelRequest,
      com.caproject.protos.RadiationLevelResponse> getGetRadiationLevelMethod() {
    io.grpc.MethodDescriptor<com.caproject.protos.RadiationLevelRequest, com.caproject.protos.RadiationLevelResponse> getGetRadiationLevelMethod;
    if ((getGetRadiationLevelMethod = RadiationInformationServiceGrpc.getGetRadiationLevelMethod) == null) {
      synchronized (RadiationInformationServiceGrpc.class) {
        if ((getGetRadiationLevelMethod = RadiationInformationServiceGrpc.getGetRadiationLevelMethod) == null) {
          RadiationInformationServiceGrpc.getGetRadiationLevelMethod = getGetRadiationLevelMethod = 
              io.grpc.MethodDescriptor.<com.caproject.protos.RadiationLevelRequest, com.caproject.protos.RadiationLevelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "airWaterTrackerService.RadiationInformationService", "GetRadiationLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caproject.protos.RadiationLevelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caproject.protos.RadiationLevelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadiationInformationServiceMethodDescriptorSupplier("GetRadiationLevel"))
                  .build();
          }
        }
     }
     return getGetRadiationLevelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RadiationInformationServiceStub newStub(io.grpc.Channel channel) {
    return new RadiationInformationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RadiationInformationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RadiationInformationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RadiationInformationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RadiationInformationServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class RadiationInformationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRadiationLevel(com.caproject.protos.RadiationLevelRequest request,
        io.grpc.stub.StreamObserver<com.caproject.protos.RadiationLevelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRadiationLevelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRadiationLevelMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.caproject.protos.RadiationLevelRequest,
                com.caproject.protos.RadiationLevelResponse>(
                  this, METHODID_GET_RADIATION_LEVEL)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class RadiationInformationServiceStub extends io.grpc.stub.AbstractStub<RadiationInformationServiceStub> {
    private RadiationInformationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadiationInformationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadiationInformationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadiationInformationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRadiationLevel(com.caproject.protos.RadiationLevelRequest request,
        io.grpc.stub.StreamObserver<com.caproject.protos.RadiationLevelResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetRadiationLevelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class RadiationInformationServiceBlockingStub extends io.grpc.stub.AbstractStub<RadiationInformationServiceBlockingStub> {
    private RadiationInformationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadiationInformationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadiationInformationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadiationInformationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.caproject.protos.RadiationLevelResponse> getRadiationLevel(
        com.caproject.protos.RadiationLevelRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetRadiationLevelMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class RadiationInformationServiceFutureStub extends io.grpc.stub.AbstractStub<RadiationInformationServiceFutureStub> {
    private RadiationInformationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadiationInformationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadiationInformationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadiationInformationServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_RADIATION_LEVEL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RadiationInformationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RadiationInformationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RADIATION_LEVEL:
          serviceImpl.getRadiationLevel((com.caproject.protos.RadiationLevelRequest) request,
              (io.grpc.stub.StreamObserver<com.caproject.protos.RadiationLevelResponse>) responseObserver);
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

  private static abstract class RadiationInformationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RadiationInformationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.caproject.protos.RadiationInformationServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RadiationInformationService");
    }
  }

  private static final class RadiationInformationServiceFileDescriptorSupplier
      extends RadiationInformationServiceBaseDescriptorSupplier {
    RadiationInformationServiceFileDescriptorSupplier() {}
  }

  private static final class RadiationInformationServiceMethodDescriptorSupplier
      extends RadiationInformationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RadiationInformationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RadiationInformationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RadiationInformationServiceFileDescriptorSupplier())
              .addMethod(getGetRadiationLevelMethod())
              .build();
        }
      }
    }
    return result;
  }
}

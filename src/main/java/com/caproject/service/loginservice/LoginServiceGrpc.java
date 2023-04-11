package com.caproject.service.loginservice;

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
    comments = "Source: loginService.proto")
public final class LoginServiceGrpc {

  private LoginServiceGrpc() {}

  public static final String SERVICE_NAME = "airWaterTrackerService.LoginService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.caproject.service.loginservice.LoginRequest,
      com.caproject.service.loginservice.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.caproject.service.loginservice.LoginRequest.class,
      responseType = com.caproject.service.loginservice.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.caproject.service.loginservice.LoginRequest,
      com.caproject.service.loginservice.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.caproject.service.loginservice.LoginRequest, com.caproject.service.loginservice.LoginResponse> getLoginMethod;
    if ((getLoginMethod = LoginServiceGrpc.getLoginMethod) == null) {
      synchronized (LoginServiceGrpc.class) {
        if ((getLoginMethod = LoginServiceGrpc.getLoginMethod) == null) {
          LoginServiceGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.caproject.service.loginservice.LoginRequest, com.caproject.service.loginservice.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "airWaterTrackerService.LoginService", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caproject.service.loginservice.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caproject.service.loginservice.LoginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LoginServiceMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.caproject.service.loginservice.LogoutRequest,
      com.caproject.service.loginservice.LogoutResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = com.caproject.service.loginservice.LogoutRequest.class,
      responseType = com.caproject.service.loginservice.LogoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.caproject.service.loginservice.LogoutRequest,
      com.caproject.service.loginservice.LogoutResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<com.caproject.service.loginservice.LogoutRequest, com.caproject.service.loginservice.LogoutResponse> getLogoutMethod;
    if ((getLogoutMethod = LoginServiceGrpc.getLogoutMethod) == null) {
      synchronized (LoginServiceGrpc.class) {
        if ((getLogoutMethod = LoginServiceGrpc.getLogoutMethod) == null) {
          LoginServiceGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<com.caproject.service.loginservice.LogoutRequest, com.caproject.service.loginservice.LogoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "airWaterTrackerService.LoginService", "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caproject.service.loginservice.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caproject.service.loginservice.LogoutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LoginServiceMethodDescriptorSupplier("logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.caproject.service.loginservice.UserInfoRequest,
      com.caproject.service.loginservice.UserInfoResponse> getGetUserInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserInformation",
      requestType = com.caproject.service.loginservice.UserInfoRequest.class,
      responseType = com.caproject.service.loginservice.UserInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.caproject.service.loginservice.UserInfoRequest,
      com.caproject.service.loginservice.UserInfoResponse> getGetUserInformationMethod() {
    io.grpc.MethodDescriptor<com.caproject.service.loginservice.UserInfoRequest, com.caproject.service.loginservice.UserInfoResponse> getGetUserInformationMethod;
    if ((getGetUserInformationMethod = LoginServiceGrpc.getGetUserInformationMethod) == null) {
      synchronized (LoginServiceGrpc.class) {
        if ((getGetUserInformationMethod = LoginServiceGrpc.getGetUserInformationMethod) == null) {
          LoginServiceGrpc.getGetUserInformationMethod = getGetUserInformationMethod = 
              io.grpc.MethodDescriptor.<com.caproject.service.loginservice.UserInfoRequest, com.caproject.service.loginservice.UserInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "airWaterTrackerService.LoginService", "getUserInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caproject.service.loginservice.UserInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caproject.service.loginservice.UserInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LoginServiceMethodDescriptorSupplier("getUserInformation"))
                  .build();
          }
        }
     }
     return getGetUserInformationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LoginServiceStub newStub(io.grpc.Channel channel) {
    return new LoginServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LoginServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LoginServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LoginServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LoginServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class LoginServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(com.caproject.service.loginservice.LoginRequest request,
        io.grpc.stub.StreamObserver<com.caproject.service.loginservice.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(com.caproject.service.loginservice.LogoutRequest request,
        io.grpc.stub.StreamObserver<com.caproject.service.loginservice.LogoutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    /**
     */
    public void getUserInformation(com.caproject.service.loginservice.UserInfoRequest request,
        io.grpc.stub.StreamObserver<com.caproject.service.loginservice.UserInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserInformationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.caproject.service.loginservice.LoginRequest,
                com.caproject.service.loginservice.LoginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.caproject.service.loginservice.LogoutRequest,
                com.caproject.service.loginservice.LogoutResponse>(
                  this, METHODID_LOGOUT)))
          .addMethod(
            getGetUserInformationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.caproject.service.loginservice.UserInfoRequest,
                com.caproject.service.loginservice.UserInfoResponse>(
                  this, METHODID_GET_USER_INFORMATION)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class LoginServiceStub extends io.grpc.stub.AbstractStub<LoginServiceStub> {
    private LoginServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoginServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoginServiceStub(channel, callOptions);
    }

    /**
     */
    public void login(com.caproject.service.loginservice.LoginRequest request,
        io.grpc.stub.StreamObserver<com.caproject.service.loginservice.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(com.caproject.service.loginservice.LogoutRequest request,
        io.grpc.stub.StreamObserver<com.caproject.service.loginservice.LogoutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserInformation(com.caproject.service.loginservice.UserInfoRequest request,
        io.grpc.stub.StreamObserver<com.caproject.service.loginservice.UserInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserInformationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class LoginServiceBlockingStub extends io.grpc.stub.AbstractStub<LoginServiceBlockingStub> {
    private LoginServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoginServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoginServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.caproject.service.loginservice.LoginResponse login(com.caproject.service.loginservice.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.caproject.service.loginservice.LogoutResponse logout(com.caproject.service.loginservice.LogoutRequest request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.caproject.service.loginservice.UserInfoResponse getUserInformation(com.caproject.service.loginservice.UserInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserInformationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class LoginServiceFutureStub extends io.grpc.stub.AbstractStub<LoginServiceFutureStub> {
    private LoginServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoginServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoginServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.caproject.service.loginservice.LoginResponse> login(
        com.caproject.service.loginservice.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.caproject.service.loginservice.LogoutResponse> logout(
        com.caproject.service.loginservice.LogoutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.caproject.service.loginservice.UserInfoResponse> getUserInformation(
        com.caproject.service.loginservice.UserInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserInformationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;
  private static final int METHODID_GET_USER_INFORMATION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LoginServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LoginServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.caproject.service.loginservice.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.caproject.service.loginservice.LoginResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.caproject.service.loginservice.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<com.caproject.service.loginservice.LogoutResponse>) responseObserver);
          break;
        case METHODID_GET_USER_INFORMATION:
          serviceImpl.getUserInformation((com.caproject.service.loginservice.UserInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.caproject.service.loginservice.UserInfoResponse>) responseObserver);
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

  private static abstract class LoginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LoginServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.caproject.service.loginservice.LoginServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LoginService");
    }
  }

  private static final class LoginServiceFileDescriptorSupplier
      extends LoginServiceBaseDescriptorSupplier {
    LoginServiceFileDescriptorSupplier() {}
  }

  private static final class LoginServiceMethodDescriptorSupplier
      extends LoginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LoginServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LoginServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LoginServiceFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .addMethod(getGetUserInformationMethod())
              .build();
        }
      }
    }
    return result;
  }
}

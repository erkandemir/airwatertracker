// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: radiationInformationService.proto

package com.caproject.protos;

public final class RadiationInformationServiceImpl {
  private RadiationInformationServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_airWaterTrackerService_RadiationLevelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_airWaterTrackerService_RadiationLevelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_airWaterTrackerService_RadiationLevelResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_airWaterTrackerService_RadiationLevelResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!radiationInformationService.proto\022\026air" +
      "WaterTrackerService\"+\n\025RadiationLevelReq" +
      "uest\022\022\n\nlocationId\030\001 \001(\005\"[\n\026RadiationLev" +
      "elResponse\022\026\n\016radiationLevel\030\001 \001(\001\022\027\n\017ra" +
      "dioactiveType\030\002 \001(\t\022\020\n\010sensorId\030\003 \001(\0052\225\001" +
      "\n\033RadiationInformationService\022v\n\021GetRadi" +
      "ationLevel\022-.airWaterTrackerService.Radi" +
      "ationLevelRequest\032..airWaterTrackerServi" +
      "ce.RadiationLevelResponse\"\0000\001B9\n\024com.cap" +
      "roject.protosB\037RadiationInformationServi" +
      "ceImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_airWaterTrackerService_RadiationLevelRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_airWaterTrackerService_RadiationLevelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_airWaterTrackerService_RadiationLevelRequest_descriptor,
        new java.lang.String[] { "LocationId", });
    internal_static_airWaterTrackerService_RadiationLevelResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_airWaterTrackerService_RadiationLevelResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_airWaterTrackerService_RadiationLevelResponse_descriptor,
        new java.lang.String[] { "RadiationLevel", "RadioactiveType", "SensorId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

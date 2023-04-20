// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: airInformationService.proto

package com.caproject.protos;

public final class AirInformationServiceImpl {
  private AirInformationServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_airWaterTrackerService_AirInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_airWaterTrackerService_AirInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_airWaterTrackerService_AirInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_airWaterTrackerService_AirInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_airWaterTrackerService_ActivateFilterRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_airWaterTrackerService_ActivateFilterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_airWaterTrackerService_ActivateFilterResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_airWaterTrackerService_ActivateFilterResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033airInformationService.proto\022\026airWaterT" +
      "rackerService\"$\n\016AirInfoRequest\022\022\n\nlocat" +
      "ionId\030\001 \001(\005\"Z\n\017AirInfoResponse\022\020\n\010zoneNa" +
      "me\030\001 \001(\t\022\033\n\023carbonMonoxideLevel\030\002 \001(\001\022\030\n" +
      "\020airQualityStatus\030\003 \001(\t\")\n\025ActivateFilte" +
      "rRequest\022\020\n\010filterId\030\001 \001(\005\"@\n\026ActivateFi" +
      "lterResponse\022\020\n\010filterId\030\001 \001(\005\022\024\n\014filter" +
      "Status\030\002 \001(\0102\373\001\n\025AirInformationService\022o" +
      "\n\026GetCarbonMonoxideLevel\022&.airWaterTrack" +
      "erService.AirInfoRequest\032\'.airWaterTrack" +
      "erService.AirInfoResponse\"\000(\0010\001\022q\n\016Activ" +
      "ateFilter\022-.airWaterTrackerService.Activ" +
      "ateFilterRequest\032..airWaterTrackerServic" +
      "e.ActivateFilterResponse\"\000B3\n\024com.caproj" +
      "ect.protosB\031AirInformationServiceImplP\001b" +
      "\006proto3"
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
    internal_static_airWaterTrackerService_AirInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_airWaterTrackerService_AirInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_airWaterTrackerService_AirInfoRequest_descriptor,
        new java.lang.String[] { "LocationId", });
    internal_static_airWaterTrackerService_AirInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_airWaterTrackerService_AirInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_airWaterTrackerService_AirInfoResponse_descriptor,
        new java.lang.String[] { "ZoneName", "CarbonMonoxideLevel", "AirQualityStatus", });
    internal_static_airWaterTrackerService_ActivateFilterRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_airWaterTrackerService_ActivateFilterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_airWaterTrackerService_ActivateFilterRequest_descriptor,
        new java.lang.String[] { "FilterId", });
    internal_static_airWaterTrackerService_ActivateFilterResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_airWaterTrackerService_ActivateFilterResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_airWaterTrackerService_ActivateFilterResponse_descriptor,
        new java.lang.String[] { "FilterId", "FilterStatus", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

package co.rira.kafka.model;

public final class OpennmsModelProtos {
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_NodeCriteria_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_NodeCriteria_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_EventParameter_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_EventParameter_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_Event_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_Event_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_Alarm_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_Alarm_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_AlarmFeedback_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_AlarmFeedback_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_IpInterface_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_IpInterface_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_SnmpInterface_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_SnmpInterface_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_HwAlias_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_HwAlias_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_HwEntity_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_HwEntity_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_Node_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_Node_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_TopologyRef_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_TopologyRef_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_TopologySegment_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_TopologySegment_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_TopologyPort_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_TopologyPort_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_TopologyEdge_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_TopologyEdge_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n#main/resources/openNMS_protos.proto\"F\n" +
                        "\014NodeCriteria\022\n\n\002id\030\001 \001(\004\022\026\n\016foreign_sou" +
                        "rce\030\002 \001(\t\022\022\n\nforeign_id\030\003 \001(\t\";\n\016EventPa" +
                        "rameter\022\014\n\004name\030\001 \001(\t\022\r\n\005value\030\002 \001(\t\022\014\n\004" +
                        "type\030\003 \001(\t\"\245\002\n\005Event\022\n\n\002id\030\001 \001(\004\022\013\n\003uei\030" +
                        "\002 \001(\t\022\r\n\005label\030\003 \001(\t\022\014\n\004time\030\004 \001(\004\022\016\n\006so" +
                        "urce\030\005 \001(\t\022\"\n\tparameter\030\006 \003(\0132\017.EventPar" +
                        "ameter\022\023\n\013create_time\030\007 \001(\004\022\023\n\013descripti" +
                        "on\030\010 \001(\t\022\023\n\013log_message\030\t \001(\t\022\033\n\010severit" +
                        "y\030\n \001(\0162\t.Severity\022\013\n\003log\030\013 \001(\010\022\017\n\007displ" +
                        "ay\030\014 \001(\010\022$\n\rnode_criteria\030\r \001(\0132\r.NodeCr" +
                        "iteria\022\022\n\nip_address\030\016 \001(\t\"\321\004\n\005Alarm\022\n\n\002" +
                        "id\030\001 \001(\004\022\013\n\003uei\030\002 \001(\t\022$\n\rnode_criteria\030\003" +
                        " \001(\0132\r.NodeCriteria\022\022\n\nip_address\030\004 \001(\t\022" +
                        "\024\n\014service_name\030\005 \001(\t\022\025\n\rreduction_key\030\006" +
                        " \001(\t\022\031\n\004type\030\007 \001(\0162\013.Alarm.Type\022\r\n\005count" +
                        "\030\010 \001(\004\022\033\n\010severity\030\t \001(\0162\t.Severity\022\030\n\020f" +
                        "irst_event_time\030\n \001(\004\022\023\n\013description\030\013 \001" +
                        "(\t\022\023\n\013log_message\030\014 \001(\t\022\020\n\010ack_user\030\r \001(" +
                        "\t\022\020\n\010ack_time\030\016 \001(\004\022\032\n\nlast_event\030\017 \001(\0132" +
                        "\006.Event\022\027\n\017last_event_time\030\020 \001(\004\022\020\n\010if_i" +
                        "ndex\030\021 \001(\r\022\035\n\025operator_instructions\030\022 \001(" +
                        "\t\022\021\n\tclear_key\030\023 \001(\t\022\037\n\027managed_object_i" +
                        "nstance\030\024 \001(\t\022\033\n\023managed_object_type\030\025 \001" +
                        "(\t\022\034\n\014relatedAlarm\030\026 \003(\0132\006.Alarm\"D\n\004Type" +
                        "\022\026\n\022PROBLEM_WITH_CLEAR\020\000\022\t\n\005CLEAR\020\001\022\031\n\025P" +
                        "ROBLEM_WITHOUT_CLEAR\020\002\"\217\002\n\rAlarmFeedback" +
                        "\022\025\n\rsituation_key\030\001 \001(\t\022\035\n\025situation_fin" +
                        "gerprint\030\002 \001(\t\022\021\n\talarm_key\030\003 \001(\t\0222\n\rfee" +
                        "dback_type\030\004 \001(\0162\033.AlarmFeedback.Feedbac" +
                        "kType\022\016\n\006reason\030\005 \001(\t\022\014\n\004user\030\006 \001(\t\022\021\n\tt" +
                        "imestamp\030\007 \001(\004\"P\n\014FeedbackType\022\022\n\016FALSE_" +
                        "POSITIVE\020\000\022\022\n\016FALSE_NEGATIVE\020\001\022\013\n\007CORREC" +
                        "T\020\002\022\013\n\007UNKNOWN\020\003\"\275\001\n\013IpInterface\022\n\n\002id\030\001" +
                        " \001(\004\022\022\n\nip_address\030\002 \001(\t\022\020\n\010if_index\030\003 \001" +
                        "(\r\022.\n\014primary_type\030\004 \001(\0162\030.IpInterface.P" +
                        "rimaryType\022\017\n\007service\030\005 \003(\t\";\n\013PrimaryTy" +
                        "pe\022\013\n\007PRIMARY\020\000\022\r\n\tSECONDARY\020\001\022\020\n\014NOT_EL" +
                        "IGIBLE\020\002\"\317\001\n\rSnmpInterface\022\n\n\002id\030\001 \001(\004\022\020" +
                        "\n\010if_index\030\002 \001(\r\022\020\n\010if_descr\030\003 \001(\t\022\017\n\007if" +
                        "_type\030\004 \001(\r\022\017\n\007if_name\030\005 \001(\t\022\020\n\010if_speed" +
                        "\030\006 \001(\004\022\027\n\017if_phys_address\030\007 \001(\t\022\027\n\017if_ad" +
                        "min_status\030\010 \001(\r\022\026\n\016if_oper_status\030\t \001(\r" +
                        "\022\020\n\010if_alias\030\n \001(\t\"%\n\007HwAlias\022\r\n\005index\030\001" +
                        " \001(\r\022\013\n\003oid\030\002 \001(\t\"\210\002\n\010HwEntity\022\032\n\022ent_ph" +
                        "ysical_index\030\001 \001(\r\022\021\n\tentity_id\030\002 \001(\r\022\032\n" +
                        "\022ent_physical_class\030\003 \001(\t\022\032\n\022ent_physica" +
                        "l_descr\030\004 \001(\t\022\033\n\023ent_physical_is_fru\030\005 \001" +
                        "(\010\022\031\n\021ent_physical_name\030\006 \001(\t\022 \n\030ent_phy" +
                        "sical_vendor_type\030\007 \001(\t\022\036\n\014ent_hw_alias\030" +
                        "\010 \003(\0132\010.HwAlias\022\033\n\010children\030\t \003(\0132\t.HwEn" +
                        "tity\"\270\002\n\004Node\022\n\n\002id\030\001 \001(\004\022\026\n\016foreign_sou" +
                        "rce\030\002 \001(\t\022\022\n\nforeign_id\030\003 \001(\t\022\020\n\010locatio" +
                        "n\030\004 \001(\t\022\020\n\010category\030\005 \003(\t\022\r\n\005label\030\006 \001(\t" +
                        "\022\023\n\013create_time\030\007 \001(\004\022\023\n\013sys_contact\030\010 \001" +
                        "(\t\022\027\n\017sys_description\030\t \001(\t\022\025\n\rsys_objec" +
                        "t_id\030\n \001(\t\022\"\n\014ip_interface\030\013 \003(\0132\014.IpInt" +
                        "erface\022&\n\016snmp_interface\030\014 \003(\0132\016.SnmpInt" +
                        "erface\022\037\n\014hw_inventory\030\r \001(\0132\t.HwEntity\"" +
                        "\222\001\n\013TopologyRef\022\n\n\002id\030\001 \001(\t\022\'\n\010protocol\030" +
                        "\002 \001(\0162\025.TopologyRef.Protocol\"N\n\010Protocol" +
                        "\022\010\n\004LLDP\020\000\022\010\n\004OSPF\020\001\022\010\n\004ISIS\020\002\022\n\n\006BRIDGE" +
                        "\020\003\022\007\n\003CDP\020\004\022\017\n\013USERDEFINED\020\005\",\n\017Topology" +
                        "Segment\022\031\n\003ref\030\001 \001(\0132\014.TopologyRef\"{\n\014To" +
                        "pologyPort\022\021\n\tvertex_id\030\001 \001(\t\022\020\n\010if_inde" +
                        "x\030\002 \001(\004\022\017\n\007if_name\030\003 \001(\t\022\017\n\007address\030\004 \001(" +
                        "\t\022$\n\rnode_criteria\030\005 \001(\0132\r.NodeCriteria\"" +
                        "\227\002\n\014TopologyEdge\022\031\n\003ref\030\001 \001(\0132\014.Topology" +
                        "Ref\022#\n\nsourcePort\030\003 \001(\0132\r.TopologyPortH\000" +
                        "\022)\n\rsourceSegment\030\004 \001(\0132\020.TopologySegmen" +
                        "tH\000\022\033\n\nsourceNode\030\005 \001(\0132\005.NodeH\000\022#\n\ntarg" +
                        "etPort\030\006 \001(\0132\r.TopologyPortH\001\022)\n\rtargetS" +
                        "egment\030\007 \001(\0132\020.TopologySegmentH\001\022\033\n\ntarg" +
                        "etNode\030\010 \001(\0132\005.NodeH\001B\010\n\006sourceB\010\n\006targe" +
                        "t*g\n\010Severity\022\021\n\rINDETERMINATE\020\000\022\013\n\007CLEA" +
                        "RED\020\001\022\n\n\006NORMAL\020\002\022\013\n\007WARNING\020\003\022\t\n\005MINOR\020" +
                        "\004\022\t\n\005MAJOR\020\005\022\014\n\010CRITICAL\020\006B-\n\027ir.kafka.m" +
                        "odel.producerB\022OpennmsModelProtosb\006proto" +
                        "3"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        });
        internal_static_NodeCriteria_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_NodeCriteria_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_NodeCriteria_descriptor,
                new java.lang.String[]{"Id", "ForeignSource", "ForeignId",});
        internal_static_EventParameter_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_EventParameter_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_EventParameter_descriptor,
                new java.lang.String[]{"Name", "Value", "Type",});
        internal_static_Event_descriptor =
                getDescriptor().getMessageTypes().get(2);
        internal_static_Event_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_Event_descriptor,
                new java.lang.String[]{"Id", "Uei", "Label", "Time", "Source", "Parameter", "CreateTime", "Description", "LogMessage", "Severity", "Log", "Display", "NodeCriteria", "IpAddress",});
        internal_static_Alarm_descriptor =
                getDescriptor().getMessageTypes().get(3);
        internal_static_Alarm_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_Alarm_descriptor,
                new java.lang.String[]{"Id", "Uei", "NodeCriteria", "IpAddress", "ServiceName", "ReductionKey", "Type", "Count", "Severity", "FirstEventTime", "Description", "LogMessage", "AckUser", "AckTime", "LastEvent", "LastEventTime", "IfIndex", "OperatorInstructions", "ClearKey", "ManagedObjectInstance", "ManagedObjectType", "RelatedAlarm",});
        internal_static_AlarmFeedback_descriptor =
                getDescriptor().getMessageTypes().get(4);
        internal_static_AlarmFeedback_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_AlarmFeedback_descriptor,
                new java.lang.String[]{"SituationKey", "SituationFingerprint", "AlarmKey", "FeedbackType", "Reason", "User", "Timestamp",});
        internal_static_IpInterface_descriptor =
                getDescriptor().getMessageTypes().get(5);
        internal_static_IpInterface_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_IpInterface_descriptor,
                new java.lang.String[]{"Id", "IpAddress", "IfIndex", "PrimaryType", "Service",});
        internal_static_SnmpInterface_descriptor =
                getDescriptor().getMessageTypes().get(6);
        internal_static_SnmpInterface_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_SnmpInterface_descriptor,
                new java.lang.String[]{"Id", "IfIndex", "IfDescr", "IfType", "IfName", "IfSpeed", "IfPhysAddress", "IfAdminStatus", "IfOperStatus", "IfAlias",});
        internal_static_HwAlias_descriptor =
                getDescriptor().getMessageTypes().get(7);
        internal_static_HwAlias_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_HwAlias_descriptor,
                new java.lang.String[]{"Index", "Oid",});
        internal_static_HwEntity_descriptor =
                getDescriptor().getMessageTypes().get(8);
        internal_static_HwEntity_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_HwEntity_descriptor,
                new java.lang.String[]{"EntPhysicalIndex", "EntityId", "EntPhysicalClass", "EntPhysicalDescr", "EntPhysicalIsFru", "EntPhysicalName", "EntPhysicalVendorType", "EntHwAlias", "Children",});
        internal_static_Node_descriptor =
                getDescriptor().getMessageTypes().get(9);
        internal_static_Node_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_Node_descriptor,
                new java.lang.String[]{"Id", "ForeignSource", "ForeignId", "Location", "Category", "Label", "CreateTime", "SysContact", "SysDescription", "SysObjectId", "IpInterface", "SnmpInterface", "HwInventory",});
        internal_static_TopologyRef_descriptor =
                getDescriptor().getMessageTypes().get(10);
        internal_static_TopologyRef_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_TopologyRef_descriptor,
                new java.lang.String[]{"Id", "Protocol",});
        internal_static_TopologySegment_descriptor =
                getDescriptor().getMessageTypes().get(11);
        internal_static_TopologySegment_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_TopologySegment_descriptor,
                new java.lang.String[]{"Ref",});
        internal_static_TopologyPort_descriptor =
                getDescriptor().getMessageTypes().get(12);
        internal_static_TopologyPort_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_TopologyPort_descriptor,
                new java.lang.String[]{"VertexId", "IfIndex", "IfName", "Address", "NodeCriteria",});
        internal_static_TopologyEdge_descriptor =
                getDescriptor().getMessageTypes().get(13);
        internal_static_TopologyEdge_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_TopologyEdge_descriptor,
                new java.lang.String[]{"Ref", "SourcePort", "SourceSegment", "SourceNode", "TargetPort", "TargetSegment", "TargetNode", "Source", "Target",});
    }

    private OpennmsModelProtos() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    /**
     * Protobuf enum {@code Severity}
     */
    public enum Severity
            implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <code>INDETERMINATE = 0;</code>
         */
        INDETERMINATE(0),
        /**
         * <code>CLEARED = 1;</code>
         */
        CLEARED(1),
        /**
         * <code>NORMAL = 2;</code>
         */
        NORMAL(2),
        /**
         * <code>WARNING = 3;</code>
         */
        WARNING(3),
        /**
         * <code>MINOR = 4;</code>
         */
        MINOR(4),
        /**
         * <code>MAJOR = 5;</code>
         */
        MAJOR(5),
        /**
         * <code>CRITICAL = 6;</code>
         */
        CRITICAL(6),
        UNRECOGNIZED(-1),
        ;

        /**
         * <code>INDETERMINATE = 0;</code>
         */
        public static final int INDETERMINATE_VALUE = 0;
        /**
         * <code>CLEARED = 1;</code>
         */
        public static final int CLEARED_VALUE = 1;
        /**
         * <code>NORMAL = 2;</code>
         */
        public static final int NORMAL_VALUE = 2;
        /**
         * <code>WARNING = 3;</code>
         */
        public static final int WARNING_VALUE = 3;
        /**
         * <code>MINOR = 4;</code>
         */
        public static final int MINOR_VALUE = 4;
        /**
         * <code>MAJOR = 5;</code>
         */
        public static final int MAJOR_VALUE = 5;
        /**
         * <code>CRITICAL = 6;</code>
         */
        public static final int CRITICAL_VALUE = 6;
        private static final com.google.protobuf.Internal.EnumLiteMap<
                Severity> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<Severity>() {
                    public Severity findValueByNumber(int number) {
                        return Severity.forNumber(number);
                    }
                };
        private static final Severity[] VALUES = values();
        private final int value;

        Severity(int value) {
            this.value = value;
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
        public static Severity valueOf(int value) {
            return forNumber(value);
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         */
        public static Severity forNumber(int value) {
            switch (value) {
                case 0:
                    return INDETERMINATE;
                case 1:
                    return CLEARED;
                case 2:
                    return NORMAL;
                case 3:
                    return WARNING;
                case 4:
                    return MINOR;
                case 5:
                    return MAJOR;
                case 6:
                    return CRITICAL;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<Severity>
        internalGetValueMap() {
            return internalValueMap;
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
            return co.rira.kafka.model.OpennmsModelProtos.getDescriptor().getEnumTypes().get(0);
        }

        public static Severity valueOf(
                com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException(
                        "EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException(
                        "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
            return getDescriptor();
        }

        // @@protoc_insertion_point(enum_scope:Severity)
    }

    public interface NodeCriteriaOrBuilder extends
            // @@protoc_insertion_point(interface_extends:NodeCriteria)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint64 id = 1;</code>
         *
         * @return The id.
         */
        long getId();

        /**
         * <code>string foreign_source = 2;</code>
         *
         * @return The foreignSource.
         */
        java.lang.String getForeignSource();

        /**
         * <code>string foreign_source = 2;</code>
         *
         * @return The bytes for foreignSource.
         */
        com.google.protobuf.ByteString
        getForeignSourceBytes();

        /**
         * <code>string foreign_id = 3;</code>
         *
         * @return The foreignId.
         */
        java.lang.String getForeignId();

        /**
         * <code>string foreign_id = 3;</code>
         *
         * @return The bytes for foreignId.
         */
        com.google.protobuf.ByteString
        getForeignIdBytes();
    }

    public interface EventParameterOrBuilder extends
            // @@protoc_insertion_point(interface_extends:EventParameter)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string name = 1;</code>
         *
         * @return The name.
         */
        java.lang.String getName();

        /**
         * <code>string name = 1;</code>
         *
         * @return The bytes for name.
         */
        com.google.protobuf.ByteString
        getNameBytes();

        /**
         * <code>string value = 2;</code>
         *
         * @return The value.
         */
        java.lang.String getValue();

        /**
         * <code>string value = 2;</code>
         *
         * @return The bytes for value.
         */
        com.google.protobuf.ByteString
        getValueBytes();

        /**
         * <code>string type = 3;</code>
         *
         * @return The type.
         */
        java.lang.String getType();

        /**
         * <code>string type = 3;</code>
         *
         * @return The bytes for type.
         */
        com.google.protobuf.ByteString
        getTypeBytes();
    }

    public interface EventOrBuilder extends
            // @@protoc_insertion_point(interface_extends:Event)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint64 id = 1;</code>
         *
         * @return The id.
         */
        long getId();

        /**
         * <code>string uei = 2;</code>
         *
         * @return The uei.
         */
        java.lang.String getUei();

        /**
         * <code>string uei = 2;</code>
         *
         * @return The bytes for uei.
         */
        com.google.protobuf.ByteString
        getUeiBytes();

        /**
         * <code>string label = 3;</code>
         *
         * @return The label.
         */
        java.lang.String getLabel();

        /**
         * <code>string label = 3;</code>
         *
         * @return The bytes for label.
         */
        com.google.protobuf.ByteString
        getLabelBytes();

        /**
         * <code>uint64 time = 4;</code>
         *
         * @return The time.
         */
        long getTime();

        /**
         * <code>string source = 5;</code>
         *
         * @return The source.
         */
        java.lang.String getSource();

        /**
         * <code>string source = 5;</code>
         *
         * @return The bytes for source.
         */
        com.google.protobuf.ByteString
        getSourceBytes();

        /**
         * <code>repeated .EventParameter parameter = 6;</code>
         */
        java.util.List<co.rira.kafka.model.OpennmsModelProtos.EventParameter>
        getParameterList();

        /**
         * <code>repeated .EventParameter parameter = 6;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.EventParameter getParameter(int index);

        /**
         * <code>repeated .EventParameter parameter = 6;</code>
         */
        int getParameterCount();

        /**
         * <code>repeated .EventParameter parameter = 6;</code>
         */
        java.util.List<? extends co.rira.kafka.model.OpennmsModelProtos.EventParameterOrBuilder>
        getParameterOrBuilderList();

        /**
         * <code>repeated .EventParameter parameter = 6;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.EventParameterOrBuilder getParameterOrBuilder(
                int index);

        /**
         * <code>uint64 create_time = 7;</code>
         *
         * @return The createTime.
         */
        long getCreateTime();

        /**
         * <code>string description = 8;</code>
         *
         * @return The description.
         */
        java.lang.String getDescription();

        /**
         * <code>string description = 8;</code>
         *
         * @return The bytes for description.
         */
        com.google.protobuf.ByteString
        getDescriptionBytes();

        /**
         * <code>string log_message = 9;</code>
         *
         * @return The logMessage.
         */
        java.lang.String getLogMessage();

        /**
         * <code>string log_message = 9;</code>
         *
         * @return The bytes for logMessage.
         */
        com.google.protobuf.ByteString
        getLogMessageBytes();

        /**
         * <code>.Severity severity = 10;</code>
         *
         * @return The enum numeric value on the wire for severity.
         */
        int getSeverityValue();

        /**
         * <code>.Severity severity = 10;</code>
         *
         * @return The severity.
         */
        co.rira.kafka.model.OpennmsModelProtos.Severity getSeverity();

        /**
         * <code>bool log = 11;</code>
         *
         * @return The log.
         */
        boolean getLog();

        /**
         * <code>bool display = 12;</code>
         *
         * @return The display.
         */
        boolean getDisplay();

        /**
         * <code>.NodeCriteria node_criteria = 13;</code>
         *
         * @return Whether the nodeCriteria field is set.
         */
        boolean hasNodeCriteria();

        /**
         * <code>.NodeCriteria node_criteria = 13;</code>
         *
         * @return The nodeCriteria.
         */
        co.rira.kafka.model.OpennmsModelProtos.NodeCriteria getNodeCriteria();

        /**
         * <code>.NodeCriteria node_criteria = 13;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.NodeCriteriaOrBuilder getNodeCriteriaOrBuilder();

        /**
         * <code>string ip_address = 14;</code>
         *
         * @return The ipAddress.
         */
        java.lang.String getIpAddress();

        /**
         * <code>string ip_address = 14;</code>
         *
         * @return The bytes for ipAddress.
         */
        com.google.protobuf.ByteString
        getIpAddressBytes();
    }

    public interface AlarmOrBuilder extends
            // @@protoc_insertion_point(interface_extends:Alarm)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint64 id = 1;</code>
         *
         * @return The id.
         */
        long getId();

        /**
         * <code>string uei = 2;</code>
         *
         * @return The uei.
         */
        java.lang.String getUei();

        /**
         * <code>string uei = 2;</code>
         *
         * @return The bytes for uei.
         */
        com.google.protobuf.ByteString
        getUeiBytes();

        /**
         * <code>.NodeCriteria node_criteria = 3;</code>
         *
         * @return Whether the nodeCriteria field is set.
         */
        boolean hasNodeCriteria();

        /**
         * <code>.NodeCriteria node_criteria = 3;</code>
         *
         * @return The nodeCriteria.
         */
        co.rira.kafka.model.OpennmsModelProtos.NodeCriteria getNodeCriteria();

        /**
         * <code>.NodeCriteria node_criteria = 3;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.NodeCriteriaOrBuilder getNodeCriteriaOrBuilder();

        /**
         * <code>string ip_address = 4;</code>
         *
         * @return The ipAddress.
         */
        java.lang.String getIpAddress();

        /**
         * <code>string ip_address = 4;</code>
         *
         * @return The bytes for ipAddress.
         */
        com.google.protobuf.ByteString
        getIpAddressBytes();

        /**
         * <code>string service_name = 5;</code>
         *
         * @return The serviceName.
         */
        java.lang.String getServiceName();

        /**
         * <code>string service_name = 5;</code>
         *
         * @return The bytes for serviceName.
         */
        com.google.protobuf.ByteString
        getServiceNameBytes();

        /**
         * <code>string reduction_key = 6;</code>
         *
         * @return The reductionKey.
         */
        java.lang.String getReductionKey();

        /**
         * <code>string reduction_key = 6;</code>
         *
         * @return The bytes for reductionKey.
         */
        com.google.protobuf.ByteString
        getReductionKeyBytes();

        /**
         * <code>.Alarm.Type type = 7;</code>
         *
         * @return The enum numeric value on the wire for type.
         */
        int getTypeValue();

        /**
         * <code>.Alarm.Type type = 7;</code>
         *
         * @return The type.
         */
        co.rira.kafka.model.OpennmsModelProtos.Alarm.Type getType();

        /**
         * <code>uint64 count = 8;</code>
         *
         * @return The count.
         */
        long getCount();

        /**
         * <code>.Severity severity = 9;</code>
         *
         * @return The enum numeric value on the wire for severity.
         */
        int getSeverityValue();

        /**
         * <code>.Severity severity = 9;</code>
         *
         * @return The severity.
         */
        co.rira.kafka.model.OpennmsModelProtos.Severity getSeverity();

        /**
         * <code>uint64 first_event_time = 10;</code>
         *
         * @return The firstEventTime.
         */
        long getFirstEventTime();

        /**
         * <code>string description = 11;</code>
         *
         * @return The description.
         */
        java.lang.String getDescription();

        /**
         * <code>string description = 11;</code>
         *
         * @return The bytes for description.
         */
        com.google.protobuf.ByteString
        getDescriptionBytes();

        /**
         * <code>string log_message = 12;</code>
         *
         * @return The logMessage.
         */
        java.lang.String getLogMessage();

        /**
         * <code>string log_message = 12;</code>
         *
         * @return The bytes for logMessage.
         */
        com.google.protobuf.ByteString
        getLogMessageBytes();

        /**
         * <code>string ack_user = 13;</code>
         *
         * @return The ackUser.
         */
        java.lang.String getAckUser();

        /**
         * <code>string ack_user = 13;</code>
         *
         * @return The bytes for ackUser.
         */
        com.google.protobuf.ByteString
        getAckUserBytes();

        /**
         * <code>uint64 ack_time = 14;</code>
         *
         * @return The ackTime.
         */
        long getAckTime();

        /**
         * <code>.Event last_event = 15;</code>
         *
         * @return Whether the lastEvent field is set.
         */
        boolean hasLastEvent();

        /**
         * <code>.Event last_event = 15;</code>
         *
         * @return The lastEvent.
         */
        co.rira.kafka.model.OpennmsModelProtos.Event getLastEvent();

        /**
         * <code>.Event last_event = 15;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.EventOrBuilder getLastEventOrBuilder();

        /**
         * <code>uint64 last_event_time = 16;</code>
         *
         * @return The lastEventTime.
         */
        long getLastEventTime();

        /**
         * <code>uint32 if_index = 17;</code>
         *
         * @return The ifIndex.
         */
        int getIfIndex();

        /**
         * <code>string operator_instructions = 18;</code>
         *
         * @return The operatorInstructions.
         */
        java.lang.String getOperatorInstructions();

        /**
         * <code>string operator_instructions = 18;</code>
         *
         * @return The bytes for operatorInstructions.
         */
        com.google.protobuf.ByteString
        getOperatorInstructionsBytes();

        /**
         * <code>string clear_key = 19;</code>
         *
         * @return The clearKey.
         */
        java.lang.String getClearKey();

        /**
         * <code>string clear_key = 19;</code>
         *
         * @return The bytes for clearKey.
         */
        com.google.protobuf.ByteString
        getClearKeyBytes();

        /**
         * <code>string managed_object_instance = 20;</code>
         *
         * @return The managedObjectInstance.
         */
        java.lang.String getManagedObjectInstance();

        /**
         * <code>string managed_object_instance = 20;</code>
         *
         * @return The bytes for managedObjectInstance.
         */
        com.google.protobuf.ByteString
        getManagedObjectInstanceBytes();

        /**
         * <code>string managed_object_type = 21;</code>
         *
         * @return The managedObjectType.
         */
        java.lang.String getManagedObjectType();

        /**
         * <code>string managed_object_type = 21;</code>
         *
         * @return The bytes for managedObjectType.
         */
        com.google.protobuf.ByteString
        getManagedObjectTypeBytes();

        /**
         * <code>repeated .Alarm relatedAlarm = 22;</code>
         */
        java.util.List<co.rira.kafka.model.OpennmsModelProtos.Alarm>
        getRelatedAlarmList();

        /**
         * <code>repeated .Alarm relatedAlarm = 22;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.Alarm getRelatedAlarm(int index);

        /**
         * <code>repeated .Alarm relatedAlarm = 22;</code>
         */
        int getRelatedAlarmCount();

        /**
         * <code>repeated .Alarm relatedAlarm = 22;</code>
         */
        java.util.List<? extends co.rira.kafka.model.OpennmsModelProtos.AlarmOrBuilder>
        getRelatedAlarmOrBuilderList();

        /**
         * <code>repeated .Alarm relatedAlarm = 22;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.AlarmOrBuilder getRelatedAlarmOrBuilder(
                int index);
    }

    public interface AlarmFeedbackOrBuilder extends
            // @@protoc_insertion_point(interface_extends:AlarmFeedback)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string situation_key = 1;</code>
         *
         * @return The situationKey.
         */
        java.lang.String getSituationKey();

        /**
         * <code>string situation_key = 1;</code>
         *
         * @return The bytes for situationKey.
         */
        com.google.protobuf.ByteString
        getSituationKeyBytes();

        /**
         * <code>string situation_fingerprint = 2;</code>
         *
         * @return The situationFingerprint.
         */
        java.lang.String getSituationFingerprint();

        /**
         * <code>string situation_fingerprint = 2;</code>
         *
         * @return The bytes for situationFingerprint.
         */
        com.google.protobuf.ByteString
        getSituationFingerprintBytes();

        /**
         * <code>string alarm_key = 3;</code>
         *
         * @return The alarmKey.
         */
        java.lang.String getAlarmKey();

        /**
         * <code>string alarm_key = 3;</code>
         *
         * @return The bytes for alarmKey.
         */
        com.google.protobuf.ByteString
        getAlarmKeyBytes();

        /**
         * <code>.AlarmFeedback.FeedbackType feedback_type = 4;</code>
         *
         * @return The enum numeric value on the wire for feedbackType.
         */
        int getFeedbackTypeValue();

        /**
         * <code>.AlarmFeedback.FeedbackType feedback_type = 4;</code>
         *
         * @return The feedbackType.
         */
        co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.FeedbackType getFeedbackType();

        /**
         * <code>string reason = 5;</code>
         *
         * @return The reason.
         */
        java.lang.String getReason();

        /**
         * <code>string reason = 5;</code>
         *
         * @return The bytes for reason.
         */
        com.google.protobuf.ByteString
        getReasonBytes();

        /**
         * <code>string user = 6;</code>
         *
         * @return The user.
         */
        java.lang.String getUser();

        /**
         * <code>string user = 6;</code>
         *
         * @return The bytes for user.
         */
        com.google.protobuf.ByteString
        getUserBytes();

        /**
         * <code>uint64 timestamp = 7;</code>
         *
         * @return The timestamp.
         */
        long getTimestamp();
    }

    public interface IpInterfaceOrBuilder extends
            // @@protoc_insertion_point(interface_extends:IpInterface)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint64 id = 1;</code>
         *
         * @return The id.
         */
        long getId();

        /**
         * <code>string ip_address = 2;</code>
         *
         * @return The ipAddress.
         */
        java.lang.String getIpAddress();

        /**
         * <code>string ip_address = 2;</code>
         *
         * @return The bytes for ipAddress.
         */
        com.google.protobuf.ByteString
        getIpAddressBytes();

        /**
         * <code>uint32 if_index = 3;</code>
         *
         * @return The ifIndex.
         */
        int getIfIndex();

        /**
         * <code>.IpInterface.PrimaryType primary_type = 4;</code>
         *
         * @return The enum numeric value on the wire for primaryType.
         */
        int getPrimaryTypeValue();

        /**
         * <code>.IpInterface.PrimaryType primary_type = 4;</code>
         *
         * @return The primaryType.
         */
        co.rira.kafka.model.OpennmsModelProtos.IpInterface.PrimaryType getPrimaryType();

        /**
         * <code>repeated string service = 5;</code>
         *
         * @return A list containing the service.
         */
        java.util.List<java.lang.String>
        getServiceList();

        /**
         * <code>repeated string service = 5;</code>
         *
         * @return The count of service.
         */
        int getServiceCount();

        /**
         * <code>repeated string service = 5;</code>
         *
         * @param index The index of the element to return.
         * @return The service at the given index.
         */
        java.lang.String getService(int index);

        /**
         * <code>repeated string service = 5;</code>
         *
         * @param index The index of the value to return.
         * @return The bytes of the service at the given index.
         */
        com.google.protobuf.ByteString
        getServiceBytes(int index);
    }

    public interface SnmpInterfaceOrBuilder extends
            // @@protoc_insertion_point(interface_extends:SnmpInterface)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint64 id = 1;</code>
         *
         * @return The id.
         */
        long getId();

        /**
         * <code>uint32 if_index = 2;</code>
         *
         * @return The ifIndex.
         */
        int getIfIndex();

        /**
         * <code>string if_descr = 3;</code>
         *
         * @return The ifDescr.
         */
        java.lang.String getIfDescr();

        /**
         * <code>string if_descr = 3;</code>
         *
         * @return The bytes for ifDescr.
         */
        com.google.protobuf.ByteString
        getIfDescrBytes();

        /**
         * <code>uint32 if_type = 4;</code>
         *
         * @return The ifType.
         */
        int getIfType();

        /**
         * <code>string if_name = 5;</code>
         *
         * @return The ifName.
         */
        java.lang.String getIfName();

        /**
         * <code>string if_name = 5;</code>
         *
         * @return The bytes for ifName.
         */
        com.google.protobuf.ByteString
        getIfNameBytes();

        /**
         * <code>uint64 if_speed = 6;</code>
         *
         * @return The ifSpeed.
         */
        long getIfSpeed();

        /**
         * <code>string if_phys_address = 7;</code>
         *
         * @return The ifPhysAddress.
         */
        java.lang.String getIfPhysAddress();

        /**
         * <code>string if_phys_address = 7;</code>
         *
         * @return The bytes for ifPhysAddress.
         */
        com.google.protobuf.ByteString
        getIfPhysAddressBytes();

        /**
         * <code>uint32 if_admin_status = 8;</code>
         *
         * @return The ifAdminStatus.
         */
        int getIfAdminStatus();

        /**
         * <code>uint32 if_oper_status = 9;</code>
         *
         * @return The ifOperStatus.
         */
        int getIfOperStatus();

        /**
         * <code>string if_alias = 10;</code>
         *
         * @return The ifAlias.
         */
        java.lang.String getIfAlias();

        /**
         * <code>string if_alias = 10;</code>
         *
         * @return The bytes for ifAlias.
         */
        com.google.protobuf.ByteString
        getIfAliasBytes();
    }

    public interface HwAliasOrBuilder extends
            // @@protoc_insertion_point(interface_extends:HwAlias)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 index = 1;</code>
         *
         * @return The index.
         */
        int getIndex();

        /**
         * <code>string oid = 2;</code>
         *
         * @return The oid.
         */
        java.lang.String getOid();

        /**
         * <code>string oid = 2;</code>
         *
         * @return The bytes for oid.
         */
        com.google.protobuf.ByteString
        getOidBytes();
    }

    public interface HwEntityOrBuilder extends
            // @@protoc_insertion_point(interface_extends:HwEntity)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 ent_physical_index = 1;</code>
         *
         * @return The entPhysicalIndex.
         */
        int getEntPhysicalIndex();

        /**
         * <code>uint32 entity_id = 2;</code>
         *
         * @return The entityId.
         */
        int getEntityId();

        /**
         * <code>string ent_physical_class = 3;</code>
         *
         * @return The entPhysicalClass.
         */
        java.lang.String getEntPhysicalClass();

        /**
         * <code>string ent_physical_class = 3;</code>
         *
         * @return The bytes for entPhysicalClass.
         */
        com.google.protobuf.ByteString
        getEntPhysicalClassBytes();

        /**
         * <code>string ent_physical_descr = 4;</code>
         *
         * @return The entPhysicalDescr.
         */
        java.lang.String getEntPhysicalDescr();

        /**
         * <code>string ent_physical_descr = 4;</code>
         *
         * @return The bytes for entPhysicalDescr.
         */
        com.google.protobuf.ByteString
        getEntPhysicalDescrBytes();

        /**
         * <code>bool ent_physical_is_fru = 5;</code>
         *
         * @return The entPhysicalIsFru.
         */
        boolean getEntPhysicalIsFru();

        /**
         * <code>string ent_physical_name = 6;</code>
         *
         * @return The entPhysicalName.
         */
        java.lang.String getEntPhysicalName();

        /**
         * <code>string ent_physical_name = 6;</code>
         *
         * @return The bytes for entPhysicalName.
         */
        com.google.protobuf.ByteString
        getEntPhysicalNameBytes();

        /**
         * <code>string ent_physical_vendor_type = 7;</code>
         *
         * @return The entPhysicalVendorType.
         */
        java.lang.String getEntPhysicalVendorType();

        /**
         * <code>string ent_physical_vendor_type = 7;</code>
         *
         * @return The bytes for entPhysicalVendorType.
         */
        com.google.protobuf.ByteString
        getEntPhysicalVendorTypeBytes();

        /**
         * <code>repeated .HwAlias ent_hw_alias = 8;</code>
         */
        java.util.List<co.rira.kafka.model.OpennmsModelProtos.HwAlias>
        getEntHwAliasList();

        /**
         * <code>repeated .HwAlias ent_hw_alias = 8;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.HwAlias getEntHwAlias(int index);

        /**
         * <code>repeated .HwAlias ent_hw_alias = 8;</code>
         */
        int getEntHwAliasCount();

        /**
         * <code>repeated .HwAlias ent_hw_alias = 8;</code>
         */
        java.util.List<? extends co.rira.kafka.model.OpennmsModelProtos.HwAliasOrBuilder>
        getEntHwAliasOrBuilderList();

        /**
         * <code>repeated .HwAlias ent_hw_alias = 8;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.HwAliasOrBuilder getEntHwAliasOrBuilder(
                int index);

        /**
         * <code>repeated .HwEntity children = 9;</code>
         */
        java.util.List<co.rira.kafka.model.OpennmsModelProtos.HwEntity>
        getChildrenList();

        /**
         * <code>repeated .HwEntity children = 9;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.HwEntity getChildren(int index);

        /**
         * <code>repeated .HwEntity children = 9;</code>
         */
        int getChildrenCount();

        /**
         * <code>repeated .HwEntity children = 9;</code>
         */
        java.util.List<? extends co.rira.kafka.model.OpennmsModelProtos.HwEntityOrBuilder>
        getChildrenOrBuilderList();

        /**
         * <code>repeated .HwEntity children = 9;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.HwEntityOrBuilder getChildrenOrBuilder(
                int index);
    }

    public interface NodeOrBuilder extends
            // @@protoc_insertion_point(interface_extends:Node)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint64 id = 1;</code>
         *
         * @return The id.
         */
        long getId();

        /**
         * <code>string foreign_source = 2;</code>
         *
         * @return The foreignSource.
         */
        java.lang.String getForeignSource();

        /**
         * <code>string foreign_source = 2;</code>
         *
         * @return The bytes for foreignSource.
         */
        com.google.protobuf.ByteString
        getForeignSourceBytes();

        /**
         * <code>string foreign_id = 3;</code>
         *
         * @return The foreignId.
         */
        java.lang.String getForeignId();

        /**
         * <code>string foreign_id = 3;</code>
         *
         * @return The bytes for foreignId.
         */
        com.google.protobuf.ByteString
        getForeignIdBytes();

        /**
         * <code>string location = 4;</code>
         *
         * @return The location.
         */
        java.lang.String getLocation();

        /**
         * <code>string location = 4;</code>
         *
         * @return The bytes for location.
         */
        com.google.protobuf.ByteString
        getLocationBytes();

        /**
         * <code>repeated string category = 5;</code>
         *
         * @return A list containing the category.
         */
        java.util.List<java.lang.String>
        getCategoryList();

        /**
         * <code>repeated string category = 5;</code>
         *
         * @return The count of category.
         */
        int getCategoryCount();

        /**
         * <code>repeated string category = 5;</code>
         *
         * @param index The index of the element to return.
         * @return The category at the given index.
         */
        java.lang.String getCategory(int index);

        /**
         * <code>repeated string category = 5;</code>
         *
         * @param index The index of the value to return.
         * @return The bytes of the category at the given index.
         */
        com.google.protobuf.ByteString
        getCategoryBytes(int index);

        /**
         * <code>string label = 6;</code>
         *
         * @return The label.
         */
        java.lang.String getLabel();

        /**
         * <code>string label = 6;</code>
         *
         * @return The bytes for label.
         */
        com.google.protobuf.ByteString
        getLabelBytes();

        /**
         * <code>uint64 create_time = 7;</code>
         *
         * @return The createTime.
         */
        long getCreateTime();

        /**
         * <code>string sys_contact = 8;</code>
         *
         * @return The sysContact.
         */
        java.lang.String getSysContact();

        /**
         * <code>string sys_contact = 8;</code>
         *
         * @return The bytes for sysContact.
         */
        com.google.protobuf.ByteString
        getSysContactBytes();

        /**
         * <code>string sys_description = 9;</code>
         *
         * @return The sysDescription.
         */
        java.lang.String getSysDescription();

        /**
         * <code>string sys_description = 9;</code>
         *
         * @return The bytes for sysDescription.
         */
        com.google.protobuf.ByteString
        getSysDescriptionBytes();

        /**
         * <code>string sys_object_id = 10;</code>
         *
         * @return The sysObjectId.
         */
        java.lang.String getSysObjectId();

        /**
         * <code>string sys_object_id = 10;</code>
         *
         * @return The bytes for sysObjectId.
         */
        com.google.protobuf.ByteString
        getSysObjectIdBytes();

        /**
         * <code>repeated .IpInterface ip_interface = 11;</code>
         */
        java.util.List<co.rira.kafka.model.OpennmsModelProtos.IpInterface>
        getIpInterfaceList();

        /**
         * <code>repeated .IpInterface ip_interface = 11;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.IpInterface getIpInterface(int index);

        /**
         * <code>repeated .IpInterface ip_interface = 11;</code>
         */
        int getIpInterfaceCount();

        /**
         * <code>repeated .IpInterface ip_interface = 11;</code>
         */
        java.util.List<? extends co.rira.kafka.model.OpennmsModelProtos.IpInterfaceOrBuilder>
        getIpInterfaceOrBuilderList();

        /**
         * <code>repeated .IpInterface ip_interface = 11;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.IpInterfaceOrBuilder getIpInterfaceOrBuilder(
                int index);

        /**
         * <code>repeated .SnmpInterface snmp_interface = 12;</code>
         */
        java.util.List<co.rira.kafka.model.OpennmsModelProtos.SnmpInterface>
        getSnmpInterfaceList();

        /**
         * <code>repeated .SnmpInterface snmp_interface = 12;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.SnmpInterface getSnmpInterface(int index);

        /**
         * <code>repeated .SnmpInterface snmp_interface = 12;</code>
         */
        int getSnmpInterfaceCount();

        /**
         * <code>repeated .SnmpInterface snmp_interface = 12;</code>
         */
        java.util.List<? extends co.rira.kafka.model.OpennmsModelProtos.SnmpInterfaceOrBuilder>
        getSnmpInterfaceOrBuilderList();

        /**
         * <code>repeated .SnmpInterface snmp_interface = 12;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.SnmpInterfaceOrBuilder getSnmpInterfaceOrBuilder(
                int index);

        /**
         * <code>.HwEntity hw_inventory = 13;</code>
         *
         * @return Whether the hwInventory field is set.
         */
        boolean hasHwInventory();

        /**
         * <code>.HwEntity hw_inventory = 13;</code>
         *
         * @return The hwInventory.
         */
        co.rira.kafka.model.OpennmsModelProtos.HwEntity getHwInventory();

        /**
         * <code>.HwEntity hw_inventory = 13;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.HwEntityOrBuilder getHwInventoryOrBuilder();
    }

    public interface TopologyRefOrBuilder extends
            // @@protoc_insertion_point(interface_extends:TopologyRef)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string id = 1;</code>
         *
         * @return The id.
         */
        java.lang.String getId();

        /**
         * <code>string id = 1;</code>
         *
         * @return The bytes for id.
         */
        com.google.protobuf.ByteString
        getIdBytes();

        /**
         * <code>.TopologyRef.Protocol protocol = 2;</code>
         *
         * @return The enum numeric value on the wire for protocol.
         */
        int getProtocolValue();

        /**
         * <code>.TopologyRef.Protocol protocol = 2;</code>
         *
         * @return The protocol.
         */
        co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Protocol getProtocol();
    }

    public interface TopologySegmentOrBuilder extends
            // @@protoc_insertion_point(interface_extends:TopologySegment)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.TopologyRef ref = 1;</code>
         *
         * @return Whether the ref field is set.
         */
        boolean hasRef();

        /**
         * <code>.TopologyRef ref = 1;</code>
         *
         * @return The ref.
         */
        co.rira.kafka.model.OpennmsModelProtos.TopologyRef getRef();

        /**
         * <code>.TopologyRef ref = 1;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.TopologyRefOrBuilder getRefOrBuilder();
    }

    public interface TopologyPortOrBuilder extends
            // @@protoc_insertion_point(interface_extends:TopologyPort)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string vertex_id = 1;</code>
         *
         * @return The vertexId.
         */
        java.lang.String getVertexId();

        /**
         * <code>string vertex_id = 1;</code>
         *
         * @return The bytes for vertexId.
         */
        com.google.protobuf.ByteString
        getVertexIdBytes();

        /**
         * <code>uint64 if_index = 2;</code>
         *
         * @return The ifIndex.
         */
        long getIfIndex();

        /**
         * <code>string if_name = 3;</code>
         *
         * @return The ifName.
         */
        java.lang.String getIfName();

        /**
         * <code>string if_name = 3;</code>
         *
         * @return The bytes for ifName.
         */
        com.google.protobuf.ByteString
        getIfNameBytes();

        /**
         * <code>string address = 4;</code>
         *
         * @return The address.
         */
        java.lang.String getAddress();

        /**
         * <code>string address = 4;</code>
         *
         * @return The bytes for address.
         */
        com.google.protobuf.ByteString
        getAddressBytes();

        /**
         * <code>.NodeCriteria node_criteria = 5;</code>
         *
         * @return Whether the nodeCriteria field is set.
         */
        boolean hasNodeCriteria();

        /**
         * <code>.NodeCriteria node_criteria = 5;</code>
         *
         * @return The nodeCriteria.
         */
        co.rira.kafka.model.OpennmsModelProtos.NodeCriteria getNodeCriteria();

        /**
         * <code>.NodeCriteria node_criteria = 5;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.NodeCriteriaOrBuilder getNodeCriteriaOrBuilder();
    }

    public interface TopologyEdgeOrBuilder extends
            // @@protoc_insertion_point(interface_extends:TopologyEdge)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.TopologyRef ref = 1;</code>
         *
         * @return Whether the ref field is set.
         */
        boolean hasRef();

        /**
         * <code>.TopologyRef ref = 1;</code>
         *
         * @return The ref.
         */
        co.rira.kafka.model.OpennmsModelProtos.TopologyRef getRef();

        /**
         * <code>.TopologyRef ref = 1;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.TopologyRefOrBuilder getRefOrBuilder();

        /**
         * <code>.TopologyPort sourcePort = 3;</code>
         *
         * @return Whether the sourcePort field is set.
         */
        boolean hasSourcePort();

        /**
         * <code>.TopologyPort sourcePort = 3;</code>
         *
         * @return The sourcePort.
         */
        co.rira.kafka.model.OpennmsModelProtos.TopologyPort getSourcePort();

        /**
         * <code>.TopologyPort sourcePort = 3;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.TopologyPortOrBuilder getSourcePortOrBuilder();

        /**
         * <code>.TopologySegment sourceSegment = 4;</code>
         *
         * @return Whether the sourceSegment field is set.
         */
        boolean hasSourceSegment();

        /**
         * <code>.TopologySegment sourceSegment = 4;</code>
         *
         * @return The sourceSegment.
         */
        co.rira.kafka.model.OpennmsModelProtos.TopologySegment getSourceSegment();

        /**
         * <code>.TopologySegment sourceSegment = 4;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.TopologySegmentOrBuilder getSourceSegmentOrBuilder();

        /**
         * <code>.Node sourceNode = 5;</code>
         *
         * @return Whether the sourceNode field is set.
         */
        boolean hasSourceNode();

        /**
         * <code>.Node sourceNode = 5;</code>
         *
         * @return The sourceNode.
         */
        co.rira.kafka.model.OpennmsModelProtos.Node getSourceNode();

        /**
         * <code>.Node sourceNode = 5;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.NodeOrBuilder getSourceNodeOrBuilder();

        /**
         * <code>.TopologyPort targetPort = 6;</code>
         *
         * @return Whether the targetPort field is set.
         */
        boolean hasTargetPort();

        /**
         * <code>.TopologyPort targetPort = 6;</code>
         *
         * @return The targetPort.
         */
        co.rira.kafka.model.OpennmsModelProtos.TopologyPort getTargetPort();

        /**
         * <code>.TopologyPort targetPort = 6;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.TopologyPortOrBuilder getTargetPortOrBuilder();

        /**
         * <code>.TopologySegment targetSegment = 7;</code>
         *
         * @return Whether the targetSegment field is set.
         */
        boolean hasTargetSegment();

        /**
         * <code>.TopologySegment targetSegment = 7;</code>
         *
         * @return The targetSegment.
         */
        co.rira.kafka.model.OpennmsModelProtos.TopologySegment getTargetSegment();

        /**
         * <code>.TopologySegment targetSegment = 7;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.TopologySegmentOrBuilder getTargetSegmentOrBuilder();

        /**
         * <code>.Node targetNode = 8;</code>
         *
         * @return Whether the targetNode field is set.
         */
        boolean hasTargetNode();

        /**
         * <code>.Node targetNode = 8;</code>
         *
         * @return The targetNode.
         */
        co.rira.kafka.model.OpennmsModelProtos.Node getTargetNode();

        /**
         * <code>.Node targetNode = 8;</code>
         */
        co.rira.kafka.model.OpennmsModelProtos.NodeOrBuilder getTargetNodeOrBuilder();

        co.rira.kafka.model.OpennmsModelProtos.TopologyEdge.SourceCase getSourceCase();

        co.rira.kafka.model.OpennmsModelProtos.TopologyEdge.TargetCase getTargetCase();
    }

    /**
     * Protobuf type {@code NodeCriteria}
     */
    public static final class NodeCriteria extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:NodeCriteria)
            NodeCriteriaOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int FOREIGN_SOURCE_FIELD_NUMBER = 2;
        public static final int FOREIGN_ID_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:NodeCriteria)
        private static final co.rira.kafka.model.OpennmsModelProtos.NodeCriteria DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<NodeCriteria>
                PARSER = new com.google.protobuf.AbstractParser<NodeCriteria>() {
            @java.lang.Override
            public NodeCriteria parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new NodeCriteria(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new co.rira.kafka.model.OpennmsModelProtos.NodeCriteria();
        }

        private long id_;
        private volatile java.lang.Object foreignSource_;
        private volatile java.lang.Object foreignId_;
        private byte memoizedIsInitialized = -1;

        // Use NodeCriteria.newBuilder() to construct.
        private NodeCriteria(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private NodeCriteria() {
            foreignSource_ = "";
            foreignId_ = "";
        }

        private NodeCriteria(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8: {

                            id_ = input.readUInt64();
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            foreignSource_ = s;
                            break;
                        }
                        case 26: {
                            java.lang.String s = input.readStringRequireUtf8();

                            foreignId_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_NodeCriteria_descriptor;
        }

        public static co.rira.kafka.model.OpennmsModelProtos.NodeCriteria parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.NodeCriteria parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.NodeCriteria parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.NodeCriteria parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.NodeCriteria parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.NodeCriteria parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.NodeCriteria parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.NodeCriteria parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.NodeCriteria parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.NodeCriteria parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.NodeCriteria parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.NodeCriteria parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(co.rira.kafka.model.OpennmsModelProtos.NodeCriteria prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.NodeCriteria getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<NodeCriteria> parser() {
            return PARSER;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new NodeCriteria();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_NodeCriteria_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.class, co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder.class);
        }

        /**
         * <code>uint64 id = 1;</code>
         *
         * @return The id.
         */
        public long getId() {
            return id_;
        }

        /**
         * <code>string foreign_source = 2;</code>
         *
         * @return The foreignSource.
         */
        public java.lang.String getForeignSource() {
            java.lang.Object ref = foreignSource_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                foreignSource_ = s;
                return s;
            }
        }

        /**
         * <code>string foreign_source = 2;</code>
         *
         * @return The bytes for foreignSource.
         */
        public com.google.protobuf.ByteString
        getForeignSourceBytes() {
            java.lang.Object ref = foreignSource_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                foreignSource_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string foreign_id = 3;</code>
         *
         * @return The foreignId.
         */
        public java.lang.String getForeignId() {
            java.lang.Object ref = foreignId_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                foreignId_ = s;
                return s;
            }
        }

        /**
         * <code>string foreign_id = 3;</code>
         *
         * @return The bytes for foreignId.
         */
        public com.google.protobuf.ByteString
        getForeignIdBytes() {
            java.lang.Object ref = foreignId_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                foreignId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (id_ != 0L) {
                output.writeUInt64(1, id_);
            }
            if (!getForeignSourceBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, foreignSource_);
            }
            if (!getForeignIdBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, foreignId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(1, id_);
            }
            if (!getForeignSourceBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, foreignSource_);
            }
            if (!getForeignIdBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, foreignId_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof co.rira.kafka.model.OpennmsModelProtos.NodeCriteria)) {
                return super.equals(obj);
            }
            co.rira.kafka.model.OpennmsModelProtos.NodeCriteria other = (co.rira.kafka.model.OpennmsModelProtos.NodeCriteria) obj;

            if (getId()
                    != other.getId()) return false;
            if (!getForeignSource()
                    .equals(other.getForeignSource())) return false;
            if (!getForeignId()
                    .equals(other.getForeignId())) return false;
            return unknownFields.equals(other.unknownFields);
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getId());
            hash = (37 * hash) + FOREIGN_SOURCE_FIELD_NUMBER;
            hash = (53 * hash) + getForeignSource().hashCode();
            hash = (37 * hash) + FOREIGN_ID_FIELD_NUMBER;
            hash = (53 * hash) + getForeignId().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<NodeCriteria> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public co.rira.kafka.model.OpennmsModelProtos.NodeCriteria getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code NodeCriteria}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:NodeCriteria)
                co.rira.kafka.model.OpennmsModelProtos.NodeCriteriaOrBuilder {
            private long id_;
            private java.lang.Object foreignSource_ = "";
            private java.lang.Object foreignId_ = "";

            // Construct using co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_NodeCriteria_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_NodeCriteria_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.class, co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                id_ = 0L;

                foreignSource_ = "";

                foreignId_ = "";

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_NodeCriteria_descriptor;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.NodeCriteria getDefaultInstanceForType() {
                return co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.getDefaultInstance();
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.NodeCriteria build() {
                co.rira.kafka.model.OpennmsModelProtos.NodeCriteria result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.NodeCriteria buildPartial() {
                co.rira.kafka.model.OpennmsModelProtos.NodeCriteria result = new co.rira.kafka.model.OpennmsModelProtos.NodeCriteria(this);
                result.id_ = id_;
                result.foreignSource_ = foreignSource_;
                result.foreignId_ = foreignId_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof co.rira.kafka.model.OpennmsModelProtos.NodeCriteria) {
                    return mergeFrom((co.rira.kafka.model.OpennmsModelProtos.NodeCriteria) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(co.rira.kafka.model.OpennmsModelProtos.NodeCriteria other) {
                if (other == co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.getDefaultInstance()) return this;
                if (other.getId() != 0L) {
                    setId(other.getId());
                }
                if (!other.getForeignSource().isEmpty()) {
                    foreignSource_ = other.foreignSource_;
                    onChanged();
                }
                if (!other.getForeignId().isEmpty()) {
                    foreignId_ = other.foreignId_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                co.rira.kafka.model.OpennmsModelProtos.NodeCriteria parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (co.rira.kafka.model.OpennmsModelProtos.NodeCriteria) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>uint64 id = 1;</code>
             *
             * @return The id.
             */
            public long getId() {
                return id_;
            }

            /**
             * <code>uint64 id = 1;</code>
             *
             * @param value The id to set.
             * @return This builder for chaining.
             */
            public Builder setId(long value) {

                id_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 id = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearId() {

                id_ = 0L;
                onChanged();
                return this;
            }

            /**
             * <code>string foreign_source = 2;</code>
             *
             * @return The foreignSource.
             */
            public java.lang.String getForeignSource() {
                java.lang.Object ref = foreignSource_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    foreignSource_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string foreign_source = 2;</code>
             *
             * @param value The foreignSource to set.
             * @return This builder for chaining.
             */
            public Builder setForeignSource(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                foreignSource_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string foreign_source = 2;</code>
             *
             * @return The bytes for foreignSource.
             */
            public com.google.protobuf.ByteString
            getForeignSourceBytes() {
                java.lang.Object ref = foreignSource_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    foreignSource_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string foreign_source = 2;</code>
             *
             * @param value The bytes for foreignSource to set.
             * @return This builder for chaining.
             */
            public Builder setForeignSourceBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                foreignSource_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string foreign_source = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearForeignSource() {

                foreignSource_ = getDefaultInstance().getForeignSource();
                onChanged();
                return this;
            }

            /**
             * <code>string foreign_id = 3;</code>
             *
             * @return The foreignId.
             */
            public java.lang.String getForeignId() {
                java.lang.Object ref = foreignId_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    foreignId_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string foreign_id = 3;</code>
             *
             * @param value The foreignId to set.
             * @return This builder for chaining.
             */
            public Builder setForeignId(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                foreignId_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string foreign_id = 3;</code>
             *
             * @return The bytes for foreignId.
             */
            public com.google.protobuf.ByteString
            getForeignIdBytes() {
                java.lang.Object ref = foreignId_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    foreignId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string foreign_id = 3;</code>
             *
             * @param value The bytes for foreignId to set.
             * @return This builder for chaining.
             */
            public Builder setForeignIdBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                foreignId_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string foreign_id = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearForeignId() {

                foreignId_ = getDefaultInstance().getForeignId();
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:NodeCriteria)
        }

    }

    /**
     * Protobuf type {@code EventParameter}
     */
    public static final class EventParameter extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:EventParameter)
            EventParameterOrBuilder {
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:EventParameter)
        private static final co.rira.kafka.model.OpennmsModelProtos.EventParameter DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<EventParameter>
                PARSER = new com.google.protobuf.AbstractParser<EventParameter>() {
            @java.lang.Override
            public EventParameter parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new EventParameter(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new co.rira.kafka.model.OpennmsModelProtos.EventParameter();
        }

        private volatile java.lang.Object name_;
        private volatile java.lang.Object value_;
        private volatile java.lang.Object type_;
        private byte memoizedIsInitialized = -1;

        // Use EventParameter.newBuilder() to construct.
        private EventParameter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private EventParameter() {
            name_ = "";
            value_ = "";
            type_ = "";
        }

        private EventParameter(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            name_ = s;
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            value_ = s;
                            break;
                        }
                        case 26: {
                            java.lang.String s = input.readStringRequireUtf8();

                            type_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_EventParameter_descriptor;
        }

        public static co.rira.kafka.model.OpennmsModelProtos.EventParameter parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.EventParameter parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.EventParameter parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.EventParameter parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.EventParameter parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.EventParameter parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.EventParameter parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.EventParameter parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.EventParameter parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.EventParameter parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.EventParameter parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.EventParameter parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(co.rira.kafka.model.OpennmsModelProtos.EventParameter prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.EventParameter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<EventParameter> parser() {
            return PARSER;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new EventParameter();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_EventParameter_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            co.rira.kafka.model.OpennmsModelProtos.EventParameter.class, co.rira.kafka.model.OpennmsModelProtos.EventParameter.Builder.class);
        }

        /**
         * <code>string name = 1;</code>
         *
         * @return The name.
         */
        public java.lang.String getName() {
            java.lang.Object ref = name_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                name_ = s;
                return s;
            }
        }

        /**
         * <code>string name = 1;</code>
         *
         * @return The bytes for name.
         */
        public com.google.protobuf.ByteString
        getNameBytes() {
            java.lang.Object ref = name_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                name_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string value = 2;</code>
         *
         * @return The value.
         */
        public java.lang.String getValue() {
            java.lang.Object ref = value_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                value_ = s;
                return s;
            }
        }

        /**
         * <code>string value = 2;</code>
         *
         * @return The bytes for value.
         */
        public com.google.protobuf.ByteString
        getValueBytes() {
            java.lang.Object ref = value_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                value_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string type = 3;</code>
         *
         * @return The type.
         */
        public java.lang.String getType() {
            java.lang.Object ref = type_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                type_ = s;
                return s;
            }
        }

        /**
         * <code>string type = 3;</code>
         *
         * @return The bytes for type.
         */
        public com.google.protobuf.ByteString
        getTypeBytes() {
            java.lang.Object ref = type_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                type_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
            }
            if (!getValueBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
            }
            if (!getTypeBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, type_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
            }
            if (!getValueBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
            }
            if (!getTypeBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, type_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof co.rira.kafka.model.OpennmsModelProtos.EventParameter)) {
                return super.equals(obj);
            }
            co.rira.kafka.model.OpennmsModelProtos.EventParameter other = (co.rira.kafka.model.OpennmsModelProtos.EventParameter) obj;

            if (!getName()
                    .equals(other.getName())) return false;
            if (!getValue()
                    .equals(other.getValue())) return false;
            if (!getType()
                    .equals(other.getType())) return false;
            return unknownFields.equals(other.unknownFields);
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + NAME_FIELD_NUMBER;
            hash = (53 * hash) + getName().hashCode();
            hash = (37 * hash) + VALUE_FIELD_NUMBER;
            hash = (53 * hash) + getValue().hashCode();
            hash = (37 * hash) + TYPE_FIELD_NUMBER;
            hash = (53 * hash) + getType().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<EventParameter> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public co.rira.kafka.model.OpennmsModelProtos.EventParameter getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code EventParameter}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:EventParameter)
                co.rira.kafka.model.OpennmsModelProtos.EventParameterOrBuilder {
            private java.lang.Object name_ = "";
            private java.lang.Object value_ = "";
            private java.lang.Object type_ = "";

            // Construct using co.rira.kafka.model.OpennmsModelProtos.EventParameter.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_EventParameter_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_EventParameter_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                co.rira.kafka.model.OpennmsModelProtos.EventParameter.class, co.rira.kafka.model.OpennmsModelProtos.EventParameter.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                name_ = "";

                value_ = "";

                type_ = "";

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_EventParameter_descriptor;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.EventParameter getDefaultInstanceForType() {
                return co.rira.kafka.model.OpennmsModelProtos.EventParameter.getDefaultInstance();
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.EventParameter build() {
                co.rira.kafka.model.OpennmsModelProtos.EventParameter result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.EventParameter buildPartial() {
                co.rira.kafka.model.OpennmsModelProtos.EventParameter result = new co.rira.kafka.model.OpennmsModelProtos.EventParameter(this);
                result.name_ = name_;
                result.value_ = value_;
                result.type_ = type_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof co.rira.kafka.model.OpennmsModelProtos.EventParameter) {
                    return mergeFrom((co.rira.kafka.model.OpennmsModelProtos.EventParameter) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(co.rira.kafka.model.OpennmsModelProtos.EventParameter other) {
                if (other == co.rira.kafka.model.OpennmsModelProtos.EventParameter.getDefaultInstance())
                    return this;
                if (!other.getName().isEmpty()) {
                    name_ = other.name_;
                    onChanged();
                }
                if (!other.getValue().isEmpty()) {
                    value_ = other.value_;
                    onChanged();
                }
                if (!other.getType().isEmpty()) {
                    type_ = other.type_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                co.rira.kafka.model.OpennmsModelProtos.EventParameter parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (co.rira.kafka.model.OpennmsModelProtos.EventParameter) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>string name = 1;</code>
             *
             * @return The name.
             */
            public java.lang.String getName() {
                java.lang.Object ref = name_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    name_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string name = 1;</code>
             *
             * @param value The name to set.
             * @return This builder for chaining.
             */
            public Builder setName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                name_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string name = 1;</code>
             *
             * @return The bytes for name.
             */
            public com.google.protobuf.ByteString
            getNameBytes() {
                java.lang.Object ref = name_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    name_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string name = 1;</code>
             *
             * @param value The bytes for name to set.
             * @return This builder for chaining.
             */
            public Builder setNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                name_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string name = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearName() {

                name_ = getDefaultInstance().getName();
                onChanged();
                return this;
            }

            /**
             * <code>string value = 2;</code>
             *
             * @return The value.
             */
            public java.lang.String getValue() {
                java.lang.Object ref = value_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    value_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string value = 2;</code>
             *
             * @param value The value to set.
             * @return This builder for chaining.
             */
            public Builder setValue(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                value_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string value = 2;</code>
             *
             * @return The bytes for value.
             */
            public com.google.protobuf.ByteString
            getValueBytes() {
                java.lang.Object ref = value_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    value_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string value = 2;</code>
             *
             * @param value The bytes for value to set.
             * @return This builder for chaining.
             */
            public Builder setValueBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                value_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string value = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearValue() {

                value_ = getDefaultInstance().getValue();
                onChanged();
                return this;
            }

            /**
             * <code>string type = 3;</code>
             *
             * @return The type.
             */
            public java.lang.String getType() {
                java.lang.Object ref = type_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    type_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string type = 3;</code>
             *
             * @param value The type to set.
             * @return This builder for chaining.
             */
            public Builder setType(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                type_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string type = 3;</code>
             *
             * @return The bytes for type.
             */
            public com.google.protobuf.ByteString
            getTypeBytes() {
                java.lang.Object ref = type_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    type_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string type = 3;</code>
             *
             * @param value The bytes for type to set.
             * @return This builder for chaining.
             */
            public Builder setTypeBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                type_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string type = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearType() {

                type_ = getDefaultInstance().getType();
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:EventParameter)
        }

    }

    /**
     * Protobuf type {@code Event}
     */
    public static final class Event extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:Event)
            EventOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int UEI_FIELD_NUMBER = 2;
        public static final int LABEL_FIELD_NUMBER = 3;
        public static final int TIME_FIELD_NUMBER = 4;
        public static final int SOURCE_FIELD_NUMBER = 5;
        public static final int PARAMETER_FIELD_NUMBER = 6;
        public static final int CREATE_TIME_FIELD_NUMBER = 7;
        public static final int DESCRIPTION_FIELD_NUMBER = 8;
        public static final int LOG_MESSAGE_FIELD_NUMBER = 9;
        public static final int SEVERITY_FIELD_NUMBER = 10;
        public static final int LOG_FIELD_NUMBER = 11;
        public static final int DISPLAY_FIELD_NUMBER = 12;
        public static final int NODE_CRITERIA_FIELD_NUMBER = 13;
        public static final int IP_ADDRESS_FIELD_NUMBER = 14;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:Event)
        private static final co.rira.kafka.model.OpennmsModelProtos.Event DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<Event>
                PARSER = new com.google.protobuf.AbstractParser<Event>() {
            @java.lang.Override
            public Event parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Event(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new co.rira.kafka.model.OpennmsModelProtos.Event();
        }

        private long id_;
        /**
         * Unique event identifier
         */
        private volatile java.lang.Object uei_;
        private volatile java.lang.Object label_;
        private long time_;
        private volatile java.lang.Object source_;
        private java.util.List<co.rira.kafka.model.OpennmsModelProtos.EventParameter> parameter_;
        private long createTime_;
        private volatile java.lang.Object description_;
        private volatile java.lang.Object logMessage_;
        private int severity_;
        private boolean log_;
        private boolean display_;
        private co.rira.kafka.model.OpennmsModelProtos.NodeCriteria nodeCriteria_;
        private volatile java.lang.Object ipAddress_;
        private byte memoizedIsInitialized = -1;

        // Use Event.newBuilder() to construct.
        private Event(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Event() {
            uei_ = "";
            label_ = "";
            source_ = "";
            parameter_ = java.util.Collections.emptyList();
            description_ = "";
            logMessage_ = "";
            severity_ = 0;
            ipAddress_ = "";
        }

        private Event(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8: {

                            id_ = input.readUInt64();
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            uei_ = s;
                            break;
                        }
                        case 26: {
                            java.lang.String s = input.readStringRequireUtf8();

                            label_ = s;
                            break;
                        }
                        case 32: {

                            time_ = input.readUInt64();
                            break;
                        }
                        case 42: {
                            java.lang.String s = input.readStringRequireUtf8();

                            source_ = s;
                            break;
                        }
                        case 50: {
                            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                parameter_ = new java.util.ArrayList<co.rira.kafka.model.OpennmsModelProtos.EventParameter>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            parameter_.add(
                                    input.readMessage(co.rira.kafka.model.OpennmsModelProtos.EventParameter.parser(), extensionRegistry));
                            break;
                        }
                        case 56: {

                            createTime_ = input.readUInt64();
                            break;
                        }
                        case 66: {
                            java.lang.String s = input.readStringRequireUtf8();

                            description_ = s;
                            break;
                        }
                        case 74: {
                            java.lang.String s = input.readStringRequireUtf8();

                            logMessage_ = s;
                            break;
                        }
                        case 80: {
                            int rawValue = input.readEnum();

                            severity_ = rawValue;
                            break;
                        }
                        case 88: {

                            log_ = input.readBool();
                            break;
                        }
                        case 96: {

                            display_ = input.readBool();
                            break;
                        }
                        case 106: {
                            co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder subBuilder = null;
                            if (nodeCriteria_ != null) {
                                subBuilder = nodeCriteria_.toBuilder();
                            }
                            nodeCriteria_ = input.readMessage(co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(nodeCriteria_);
                                nodeCriteria_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 114: {
                            java.lang.String s = input.readStringRequireUtf8();

                            ipAddress_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    parameter_ = java.util.Collections.unmodifiableList(parameter_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_Event_descriptor;
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Event parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Event parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Event parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Event parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Event parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Event parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Event parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Event parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Event parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Event parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Event parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Event parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(co.rira.kafka.model.OpennmsModelProtos.Event prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Event getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<Event> parser() {
            return PARSER;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new Event();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_Event_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            co.rira.kafka.model.OpennmsModelProtos.Event.class, co.rira.kafka.model.OpennmsModelProtos.Event.Builder.class);
        }

        /**
         * <code>uint64 id = 1;</code>
         *
         * @return The id.
         */
        public long getId() {
            return id_;
        }

        /**
         * <code>string uei = 2;</code>
         *
         * @return The uei.
         */
        public java.lang.String getUei() {
            java.lang.Object ref = uei_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                uei_ = s;
                return s;
            }
        }

        /**
         * <code>string uei = 2;</code>
         *
         * @return The bytes for uei.
         */
        public com.google.protobuf.ByteString
        getUeiBytes() {
            java.lang.Object ref = uei_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                uei_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string label = 3;</code>
         *
         * @return The label.
         */
        public java.lang.String getLabel() {
            java.lang.Object ref = label_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                label_ = s;
                return s;
            }
        }

        /**
         * <code>string label = 3;</code>
         *
         * @return The bytes for label.
         */
        public com.google.protobuf.ByteString
        getLabelBytes() {
            java.lang.Object ref = label_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                label_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>uint64 time = 4;</code>
         *
         * @return The time.
         */
        public long getTime() {
            return time_;
        }

        /**
         * <code>string source = 5;</code>
         *
         * @return The source.
         */
        public java.lang.String getSource() {
            java.lang.Object ref = source_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                source_ = s;
                return s;
            }
        }

        /**
         * <code>string source = 5;</code>
         *
         * @return The bytes for source.
         */
        public com.google.protobuf.ByteString
        getSourceBytes() {
            java.lang.Object ref = source_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                source_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>repeated .EventParameter parameter = 6;</code>
         */
        public java.util.List<co.rira.kafka.model.OpennmsModelProtos.EventParameter> getParameterList() {
            return parameter_;
        }

        /**
         * <code>repeated .EventParameter parameter = 6;</code>
         */
        public java.util.List<? extends co.rira.kafka.model.OpennmsModelProtos.EventParameterOrBuilder>
        getParameterOrBuilderList() {
            return parameter_;
        }

        /**
         * <code>repeated .EventParameter parameter = 6;</code>
         */
        public int getParameterCount() {
            return parameter_.size();
        }

        /**
         * <code>repeated .EventParameter parameter = 6;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.EventParameter getParameter(int index) {
            return parameter_.get(index);
        }

        /**
         * <code>repeated .EventParameter parameter = 6;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.EventParameterOrBuilder getParameterOrBuilder(
                int index) {
            return parameter_.get(index);
        }

        /**
         * <code>uint64 create_time = 7;</code>
         *
         * @return The createTime.
         */
        public long getCreateTime() {
            return createTime_;
        }

        /**
         * <code>string description = 8;</code>
         *
         * @return The description.
         */
        public java.lang.String getDescription() {
            java.lang.Object ref = description_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                description_ = s;
                return s;
            }
        }

        /**
         * <code>string description = 8;</code>
         *
         * @return The bytes for description.
         */
        public com.google.protobuf.ByteString
        getDescriptionBytes() {
            java.lang.Object ref = description_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                description_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string log_message = 9;</code>
         *
         * @return The logMessage.
         */
        public java.lang.String getLogMessage() {
            java.lang.Object ref = logMessage_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                logMessage_ = s;
                return s;
            }
        }

        /**
         * <code>string log_message = 9;</code>
         *
         * @return The bytes for logMessage.
         */
        public com.google.protobuf.ByteString
        getLogMessageBytes() {
            java.lang.Object ref = logMessage_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                logMessage_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>.Severity severity = 10;</code>
         *
         * @return The enum numeric value on the wire for severity.
         */
        public int getSeverityValue() {
            return severity_;
        }

        /**
         * <code>.Severity severity = 10;</code>
         *
         * @return The severity.
         */
        public co.rira.kafka.model.OpennmsModelProtos.Severity getSeverity() {
            @SuppressWarnings("deprecation")
            co.rira.kafka.model.OpennmsModelProtos.Severity result = co.rira.kafka.model.OpennmsModelProtos.Severity.valueOf(severity_);
            return result == null ? co.rira.kafka.model.OpennmsModelProtos.Severity.UNRECOGNIZED : result;
        }

        /**
         * <code>bool log = 11;</code>
         *
         * @return The log.
         */
        public boolean getLog() {
            return log_;
        }

        /**
         * <code>bool display = 12;</code>
         *
         * @return The display.
         */
        public boolean getDisplay() {
            return display_;
        }

        /**
         * <code>.NodeCriteria node_criteria = 13;</code>
         *
         * @return Whether the nodeCriteria field is set.
         */
        public boolean hasNodeCriteria() {
            return nodeCriteria_ != null;
        }

        /**
         * <code>.NodeCriteria node_criteria = 13;</code>
         *
         * @return The nodeCriteria.
         */
        public co.rira.kafka.model.OpennmsModelProtos.NodeCriteria getNodeCriteria() {
            return nodeCriteria_ == null ? co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.getDefaultInstance() : nodeCriteria_;
        }

        /**
         * <code>.NodeCriteria node_criteria = 13;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.NodeCriteriaOrBuilder getNodeCriteriaOrBuilder() {
            return getNodeCriteria();
        }

        /**
         * <code>string ip_address = 14;</code>
         *
         * @return The ipAddress.
         */
        public java.lang.String getIpAddress() {
            java.lang.Object ref = ipAddress_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                ipAddress_ = s;
                return s;
            }
        }

        /**
         * <code>string ip_address = 14;</code>
         *
         * @return The bytes for ipAddress.
         */
        public com.google.protobuf.ByteString
        getIpAddressBytes() {
            java.lang.Object ref = ipAddress_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                ipAddress_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (id_ != 0L) {
                output.writeUInt64(1, id_);
            }
            if (!getUeiBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uei_);
            }
            if (!getLabelBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, label_);
            }
            if (time_ != 0L) {
                output.writeUInt64(4, time_);
            }
            if (!getSourceBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 5, source_);
            }
            for (int i = 0; i < parameter_.size(); i++) {
                output.writeMessage(6, parameter_.get(i));
            }
            if (createTime_ != 0L) {
                output.writeUInt64(7, createTime_);
            }
            if (!getDescriptionBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 8, description_);
            }
            if (!getLogMessageBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 9, logMessage_);
            }
            if (severity_ != co.rira.kafka.model.OpennmsModelProtos.Severity.INDETERMINATE.getNumber()) {
                output.writeEnum(10, severity_);
            }
            if (log_ != false) {
                output.writeBool(11, log_);
            }
            if (display_ != false) {
                output.writeBool(12, display_);
            }
            if (nodeCriteria_ != null) {
                output.writeMessage(13, getNodeCriteria());
            }
            if (!getIpAddressBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 14, ipAddress_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(1, id_);
            }
            if (!getUeiBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, uei_);
            }
            if (!getLabelBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, label_);
            }
            if (time_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(4, time_);
            }
            if (!getSourceBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, source_);
            }
            for (int i = 0; i < parameter_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(6, parameter_.get(i));
            }
            if (createTime_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(7, createTime_);
            }
            if (!getDescriptionBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, description_);
            }
            if (!getLogMessageBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, logMessage_);
            }
            if (severity_ != co.rira.kafka.model.OpennmsModelProtos.Severity.INDETERMINATE.getNumber()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(10, severity_);
            }
            if (log_ != false) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(11, log_);
            }
            if (display_ != false) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(12, display_);
            }
            if (nodeCriteria_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(13, getNodeCriteria());
            }
            if (!getIpAddressBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, ipAddress_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof co.rira.kafka.model.OpennmsModelProtos.Event)) {
                return super.equals(obj);
            }
            co.rira.kafka.model.OpennmsModelProtos.Event other = (co.rira.kafka.model.OpennmsModelProtos.Event) obj;

            if (getId()
                    != other.getId()) return false;
            if (!getUei()
                    .equals(other.getUei())) return false;
            if (!getLabel()
                    .equals(other.getLabel())) return false;
            if (getTime()
                    != other.getTime()) return false;
            if (!getSource()
                    .equals(other.getSource())) return false;
            if (!getParameterList()
                    .equals(other.getParameterList())) return false;
            if (getCreateTime()
                    != other.getCreateTime()) return false;
            if (!getDescription()
                    .equals(other.getDescription())) return false;
            if (!getLogMessage()
                    .equals(other.getLogMessage())) return false;
            if (severity_ != other.severity_) return false;
            if (getLog()
                    != other.getLog()) return false;
            if (getDisplay()
                    != other.getDisplay()) return false;
            if (hasNodeCriteria() != other.hasNodeCriteria()) return false;
            if (hasNodeCriteria()) {
                if (!getNodeCriteria()
                        .equals(other.getNodeCriteria())) return false;
            }
            if (!getIpAddress()
                    .equals(other.getIpAddress())) return false;
            return unknownFields.equals(other.unknownFields);
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getId());
            hash = (37 * hash) + UEI_FIELD_NUMBER;
            hash = (53 * hash) + getUei().hashCode();
            hash = (37 * hash) + LABEL_FIELD_NUMBER;
            hash = (53 * hash) + getLabel().hashCode();
            hash = (37 * hash) + TIME_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getTime());
            hash = (37 * hash) + SOURCE_FIELD_NUMBER;
            hash = (53 * hash) + getSource().hashCode();
            if (getParameterCount() > 0) {
                hash = (37 * hash) + PARAMETER_FIELD_NUMBER;
                hash = (53 * hash) + getParameterList().hashCode();
            }
            hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getCreateTime());
            hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
            hash = (53 * hash) + getDescription().hashCode();
            hash = (37 * hash) + LOG_MESSAGE_FIELD_NUMBER;
            hash = (53 * hash) + getLogMessage().hashCode();
            hash = (37 * hash) + SEVERITY_FIELD_NUMBER;
            hash = (53 * hash) + severity_;
            hash = (37 * hash) + LOG_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                    getLog());
            hash = (37 * hash) + DISPLAY_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                    getDisplay());
            if (hasNodeCriteria()) {
                hash = (37 * hash) + NODE_CRITERIA_FIELD_NUMBER;
                hash = (53 * hash) + getNodeCriteria().hashCode();
            }
            hash = (37 * hash) + IP_ADDRESS_FIELD_NUMBER;
            hash = (53 * hash) + getIpAddress().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<Event> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public co.rira.kafka.model.OpennmsModelProtos.Event getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code Event}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:Event)
                co.rira.kafka.model.OpennmsModelProtos.EventOrBuilder {
            private int bitField0_;
            private long id_;
            private java.lang.Object uei_ = "";
            private java.lang.Object label_ = "";
            private long time_;
            private java.lang.Object source_ = "";
            private java.util.List<co.rira.kafka.model.OpennmsModelProtos.EventParameter> parameter_ =
                    java.util.Collections.emptyList();
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.EventParameter, co.rira.kafka.model.OpennmsModelProtos.EventParameter.Builder, co.rira.kafka.model.OpennmsModelProtos.EventParameterOrBuilder> parameterBuilder_;
            private long createTime_;
            private java.lang.Object description_ = "";
            private java.lang.Object logMessage_ = "";
            private int severity_ = 0;
            private boolean log_;
            private boolean display_;
            private co.rira.kafka.model.OpennmsModelProtos.NodeCriteria nodeCriteria_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.NodeCriteria, co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder, co.rira.kafka.model.OpennmsModelProtos.NodeCriteriaOrBuilder> nodeCriteriaBuilder_;
            private java.lang.Object ipAddress_ = "";

            // Construct using co.rira.kafka.model.OpennmsModelProtos.Event.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_Event_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_Event_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                co.rira.kafka.model.OpennmsModelProtos.Event.class, co.rira.kafka.model.OpennmsModelProtos.Event.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getParameterFieldBuilder();
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                id_ = 0L;

                uei_ = "";

                label_ = "";

                time_ = 0L;

                source_ = "";

                if (parameterBuilder_ == null) {
                    parameter_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    parameterBuilder_.clear();
                }
                createTime_ = 0L;

                description_ = "";

                logMessage_ = "";

                severity_ = 0;

                log_ = false;

                display_ = false;

                if (nodeCriteriaBuilder_ == null) {
                    nodeCriteria_ = null;
                } else {
                    nodeCriteria_ = null;
                    nodeCriteriaBuilder_ = null;
                }
                ipAddress_ = "";

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_Event_descriptor;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.Event getDefaultInstanceForType() {
                return co.rira.kafka.model.OpennmsModelProtos.Event.getDefaultInstance();
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.Event build() {
                co.rira.kafka.model.OpennmsModelProtos.Event result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.Event buildPartial() {
                co.rira.kafka.model.OpennmsModelProtos.Event result = new co.rira.kafka.model.OpennmsModelProtos.Event(this);
                int from_bitField0_ = bitField0_;
                result.id_ = id_;
                result.uei_ = uei_;
                result.label_ = label_;
                result.time_ = time_;
                result.source_ = source_;
                if (parameterBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0)) {
                        parameter_ = java.util.Collections.unmodifiableList(parameter_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.parameter_ = parameter_;
                } else {
                    result.parameter_ = parameterBuilder_.build();
                }
                result.createTime_ = createTime_;
                result.description_ = description_;
                result.logMessage_ = logMessage_;
                result.severity_ = severity_;
                result.log_ = log_;
                result.display_ = display_;
                if (nodeCriteriaBuilder_ == null) {
                    result.nodeCriteria_ = nodeCriteria_;
                } else {
                    result.nodeCriteria_ = nodeCriteriaBuilder_.build();
                }
                result.ipAddress_ = ipAddress_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof co.rira.kafka.model.OpennmsModelProtos.Event) {
                    return mergeFrom((co.rira.kafka.model.OpennmsModelProtos.Event) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(co.rira.kafka.model.OpennmsModelProtos.Event other) {
                if (other == co.rira.kafka.model.OpennmsModelProtos.Event.getDefaultInstance()) return this;
                if (other.getId() != 0L) {
                    setId(other.getId());
                }
                if (!other.getUei().isEmpty()) {
                    uei_ = other.uei_;
                    onChanged();
                }
                if (!other.getLabel().isEmpty()) {
                    label_ = other.label_;
                    onChanged();
                }
                if (other.getTime() != 0L) {
                    setTime(other.getTime());
                }
                if (!other.getSource().isEmpty()) {
                    source_ = other.source_;
                    onChanged();
                }
                if (parameterBuilder_ == null) {
                    if (!other.parameter_.isEmpty()) {
                        if (parameter_.isEmpty()) {
                            parameter_ = other.parameter_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureParameterIsMutable();
                            parameter_.addAll(other.parameter_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.parameter_.isEmpty()) {
                        if (parameterBuilder_.isEmpty()) {
                            parameterBuilder_.dispose();
                            parameterBuilder_ = null;
                            parameter_ = other.parameter_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            parameterBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getParameterFieldBuilder() : null;
                        } else {
                            parameterBuilder_.addAllMessages(other.parameter_);
                        }
                    }
                }
                if (other.getCreateTime() != 0L) {
                    setCreateTime(other.getCreateTime());
                }
                if (!other.getDescription().isEmpty()) {
                    description_ = other.description_;
                    onChanged();
                }
                if (!other.getLogMessage().isEmpty()) {
                    logMessage_ = other.logMessage_;
                    onChanged();
                }
                if (other.severity_ != 0) {
                    setSeverityValue(other.getSeverityValue());
                }
                if (other.getLog() != false) {
                    setLog(other.getLog());
                }
                if (other.getDisplay() != false) {
                    setDisplay(other.getDisplay());
                }
                if (other.hasNodeCriteria()) {
                    mergeNodeCriteria(other.getNodeCriteria());
                }
                if (!other.getIpAddress().isEmpty()) {
                    ipAddress_ = other.ipAddress_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                co.rira.kafka.model.OpennmsModelProtos.Event parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (co.rira.kafka.model.OpennmsModelProtos.Event) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>uint64 id = 1;</code>
             *
             * @return The id.
             */
            public long getId() {
                return id_;
            }

            /**
             * <code>uint64 id = 1;</code>
             *
             * @param value The id to set.
             * @return This builder for chaining.
             */
            public Builder setId(long value) {

                id_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 id = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearId() {

                id_ = 0L;
                onChanged();
                return this;
            }

            /**
             * <code>string uei = 2;</code>
             *
             * @return The uei.
             */
            public java.lang.String getUei() {
                java.lang.Object ref = uei_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    uei_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string uei = 2;</code>
             *
             * @param value The uei to set.
             * @return This builder for chaining.
             */
            public Builder setUei(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                uei_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string uei = 2;</code>
             *
             * @return The bytes for uei.
             */
            public com.google.protobuf.ByteString
            getUeiBytes() {
                java.lang.Object ref = uei_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    uei_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string uei = 2;</code>
             *
             * @param value The bytes for uei to set.
             * @return This builder for chaining.
             */
            public Builder setUeiBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                uei_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string uei = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearUei() {

                uei_ = getDefaultInstance().getUei();
                onChanged();
                return this;
            }

            /**
             * <code>string label = 3;</code>
             *
             * @return The label.
             */
            public java.lang.String getLabel() {
                java.lang.Object ref = label_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    label_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string label = 3;</code>
             *
             * @param value The label to set.
             * @return This builder for chaining.
             */
            public Builder setLabel(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                label_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string label = 3;</code>
             *
             * @return The bytes for label.
             */
            public com.google.protobuf.ByteString
            getLabelBytes() {
                java.lang.Object ref = label_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    label_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string label = 3;</code>
             *
             * @param value The bytes for label to set.
             * @return This builder for chaining.
             */
            public Builder setLabelBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                label_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string label = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLabel() {

                label_ = getDefaultInstance().getLabel();
                onChanged();
                return this;
            }

            /**
             * <code>uint64 time = 4;</code>
             *
             * @return The time.
             */
            public long getTime() {
                return time_;
            }

            /**
             * <code>uint64 time = 4;</code>
             *
             * @param value The time to set.
             * @return This builder for chaining.
             */
            public Builder setTime(long value) {

                time_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 time = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearTime() {

                time_ = 0L;
                onChanged();
                return this;
            }

            /**
             * <code>string source = 5;</code>
             *
             * @return The source.
             */
            public java.lang.String getSource() {
                java.lang.Object ref = source_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    source_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string source = 5;</code>
             *
             * @param value The source to set.
             * @return This builder for chaining.
             */
            public Builder setSource(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                source_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string source = 5;</code>
             *
             * @return The bytes for source.
             */
            public com.google.protobuf.ByteString
            getSourceBytes() {
                java.lang.Object ref = source_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    source_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string source = 5;</code>
             *
             * @param value The bytes for source to set.
             * @return This builder for chaining.
             */
            public Builder setSourceBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                source_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string source = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSource() {

                source_ = getDefaultInstance().getSource();
                onChanged();
                return this;
            }

            private void ensureParameterIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    parameter_ = new java.util.ArrayList<co.rira.kafka.model.OpennmsModelProtos.EventParameter>(parameter_);
                    bitField0_ |= 0x00000001;
                }
            }

            /**
             * <code>repeated .EventParameter parameter = 6;</code>
             */
            public java.util.List<co.rira.kafka.model.OpennmsModelProtos.EventParameter> getParameterList() {
                if (parameterBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(parameter_);
                } else {
                    return parameterBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .EventParameter parameter = 6;</code>
             */
            public int getParameterCount() {
                if (parameterBuilder_ == null) {
                    return parameter_.size();
                } else {
                    return parameterBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .EventParameter parameter = 6;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.EventParameter getParameter(int index) {
                if (parameterBuilder_ == null) {
                    return parameter_.get(index);
                } else {
                    return parameterBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .EventParameter parameter = 6;</code>
             */
            public Builder setParameter(
                    int index, co.rira.kafka.model.OpennmsModelProtos.EventParameter value) {
                if (parameterBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureParameterIsMutable();
                    parameter_.set(index, value);
                    onChanged();
                } else {
                    parameterBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .EventParameter parameter = 6;</code>
             */
            public Builder setParameter(
                    int index, co.rira.kafka.model.OpennmsModelProtos.EventParameter.Builder builderForValue) {
                if (parameterBuilder_ == null) {
                    ensureParameterIsMutable();
                    parameter_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    parameterBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .EventParameter parameter = 6;</code>
             */
            public Builder addParameter(co.rira.kafka.model.OpennmsModelProtos.EventParameter value) {
                if (parameterBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureParameterIsMutable();
                    parameter_.add(value);
                    onChanged();
                } else {
                    parameterBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .EventParameter parameter = 6;</code>
             */
            public Builder addParameter(
                    int index, co.rira.kafka.model.OpennmsModelProtos.EventParameter value) {
                if (parameterBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureParameterIsMutable();
                    parameter_.add(index, value);
                    onChanged();
                } else {
                    parameterBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .EventParameter parameter = 6;</code>
             */
            public Builder addParameter(
                    co.rira.kafka.model.OpennmsModelProtos.EventParameter.Builder builderForValue) {
                if (parameterBuilder_ == null) {
                    ensureParameterIsMutable();
                    parameter_.add(builderForValue.build());
                    onChanged();
                } else {
                    parameterBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .EventParameter parameter = 6;</code>
             */
            public Builder addParameter(
                    int index, co.rira.kafka.model.OpennmsModelProtos.EventParameter.Builder builderForValue) {
                if (parameterBuilder_ == null) {
                    ensureParameterIsMutable();
                    parameter_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    parameterBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .EventParameter parameter = 6;</code>
             */
            public Builder addAllParameter(
                    java.lang.Iterable<? extends co.rira.kafka.model.OpennmsModelProtos.EventParameter> values) {
                if (parameterBuilder_ == null) {
                    ensureParameterIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, parameter_);
                    onChanged();
                } else {
                    parameterBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .EventParameter parameter = 6;</code>
             */
            public Builder clearParameter() {
                if (parameterBuilder_ == null) {
                    parameter_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    parameterBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .EventParameter parameter = 6;</code>
             */
            public Builder removeParameter(int index) {
                if (parameterBuilder_ == null) {
                    ensureParameterIsMutable();
                    parameter_.remove(index);
                    onChanged();
                } else {
                    parameterBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .EventParameter parameter = 6;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.EventParameter.Builder getParameterBuilder(
                    int index) {
                return getParameterFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .EventParameter parameter = 6;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.EventParameterOrBuilder getParameterOrBuilder(
                    int index) {
                if (parameterBuilder_ == null) {
                    return parameter_.get(index);
                } else {
                    return parameterBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .EventParameter parameter = 6;</code>
             */
            public java.util.List<? extends co.rira.kafka.model.OpennmsModelProtos.EventParameterOrBuilder>
            getParameterOrBuilderList() {
                if (parameterBuilder_ != null) {
                    return parameterBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(parameter_);
                }
            }

            /**
             * <code>repeated .EventParameter parameter = 6;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.EventParameter.Builder addParameterBuilder() {
                return getParameterFieldBuilder().addBuilder(
                        co.rira.kafka.model.OpennmsModelProtos.EventParameter.getDefaultInstance());
            }

            /**
             * <code>repeated .EventParameter parameter = 6;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.EventParameter.Builder addParameterBuilder(
                    int index) {
                return getParameterFieldBuilder().addBuilder(
                        index, co.rira.kafka.model.OpennmsModelProtos.EventParameter.getDefaultInstance());
            }

            /**
             * <code>repeated .EventParameter parameter = 6;</code>
             */
            public java.util.List<co.rira.kafka.model.OpennmsModelProtos.EventParameter.Builder>
            getParameterBuilderList() {
                return getParameterFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.EventParameter, co.rira.kafka.model.OpennmsModelProtos.EventParameter.Builder, co.rira.kafka.model.OpennmsModelProtos.EventParameterOrBuilder>
            getParameterFieldBuilder() {
                if (parameterBuilder_ == null) {
                    parameterBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            co.rira.kafka.model.OpennmsModelProtos.EventParameter, co.rira.kafka.model.OpennmsModelProtos.EventParameter.Builder, co.rira.kafka.model.OpennmsModelProtos.EventParameterOrBuilder>(
                            parameter_,
                            ((bitField0_ & 0x00000001) != 0),
                            getParentForChildren(),
                            isClean());
                    parameter_ = null;
                }
                return parameterBuilder_;
            }

            /**
             * <code>uint64 create_time = 7;</code>
             *
             * @return The createTime.
             */
            public long getCreateTime() {
                return createTime_;
            }

            /**
             * <code>uint64 create_time = 7;</code>
             *
             * @param value The createTime to set.
             * @return This builder for chaining.
             */
            public Builder setCreateTime(long value) {

                createTime_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 create_time = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCreateTime() {

                createTime_ = 0L;
                onChanged();
                return this;
            }

            /**
             * <code>string description = 8;</code>
             *
             * @return The description.
             */
            public java.lang.String getDescription() {
                java.lang.Object ref = description_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    description_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string description = 8;</code>
             *
             * @param value The description to set.
             * @return This builder for chaining.
             */
            public Builder setDescription(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                description_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string description = 8;</code>
             *
             * @return The bytes for description.
             */
            public com.google.protobuf.ByteString
            getDescriptionBytes() {
                java.lang.Object ref = description_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    description_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string description = 8;</code>
             *
             * @param value The bytes for description to set.
             * @return This builder for chaining.
             */
            public Builder setDescriptionBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                description_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string description = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearDescription() {

                description_ = getDefaultInstance().getDescription();
                onChanged();
                return this;
            }

            /**
             * <code>string log_message = 9;</code>
             *
             * @return The logMessage.
             */
            public java.lang.String getLogMessage() {
                java.lang.Object ref = logMessage_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    logMessage_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string log_message = 9;</code>
             *
             * @param value The logMessage to set.
             * @return This builder for chaining.
             */
            public Builder setLogMessage(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                logMessage_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string log_message = 9;</code>
             *
             * @return The bytes for logMessage.
             */
            public com.google.protobuf.ByteString
            getLogMessageBytes() {
                java.lang.Object ref = logMessage_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    logMessage_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string log_message = 9;</code>
             *
             * @param value The bytes for logMessage to set.
             * @return This builder for chaining.
             */
            public Builder setLogMessageBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                logMessage_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string log_message = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLogMessage() {

                logMessage_ = getDefaultInstance().getLogMessage();
                onChanged();
                return this;
            }

            /**
             * <code>.Severity severity = 10;</code>
             *
             * @return The enum numeric value on the wire for severity.
             */
            public int getSeverityValue() {
                return severity_;
            }

            /**
             * <code>.Severity severity = 10;</code>
             *
             * @param value The enum numeric value on the wire for severity to set.
             * @return This builder for chaining.
             */
            public Builder setSeverityValue(int value) {
                severity_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>.Severity severity = 10;</code>
             *
             * @return The severity.
             */
            public co.rira.kafka.model.OpennmsModelProtos.Severity getSeverity() {
                @SuppressWarnings("deprecation")
                co.rira.kafka.model.OpennmsModelProtos.Severity result = co.rira.kafka.model.OpennmsModelProtos.Severity.valueOf(severity_);
                return result == null ? co.rira.kafka.model.OpennmsModelProtos.Severity.UNRECOGNIZED : result;
            }

            /**
             * <code>.Severity severity = 10;</code>
             *
             * @param value The severity to set.
             * @return This builder for chaining.
             */
            public Builder setSeverity(co.rira.kafka.model.OpennmsModelProtos.Severity value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                severity_ = value.getNumber();
                onChanged();
                return this;
            }

            /**
             * <code>.Severity severity = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSeverity() {

                severity_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>bool log = 11;</code>
             *
             * @return The log.
             */
            public boolean getLog() {
                return log_;
            }

            /**
             * <code>bool log = 11;</code>
             *
             * @param value The log to set.
             * @return This builder for chaining.
             */
            public Builder setLog(boolean value) {

                log_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>bool log = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLog() {

                log_ = false;
                onChanged();
                return this;
            }

            /**
             * <code>bool display = 12;</code>
             *
             * @return The display.
             */
            public boolean getDisplay() {
                return display_;
            }

            /**
             * <code>bool display = 12;</code>
             *
             * @param value The display to set.
             * @return This builder for chaining.
             */
            public Builder setDisplay(boolean value) {

                display_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>bool display = 12;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearDisplay() {

                display_ = false;
                onChanged();
                return this;
            }

            /**
             * <code>.NodeCriteria node_criteria = 13;</code>
             *
             * @return Whether the nodeCriteria field is set.
             */
            public boolean hasNodeCriteria() {
                return nodeCriteriaBuilder_ != null || nodeCriteria_ != null;
            }

            /**
             * <code>.NodeCriteria node_criteria = 13;</code>
             *
             * @return The nodeCriteria.
             */
            public co.rira.kafka.model.OpennmsModelProtos.NodeCriteria getNodeCriteria() {
                if (nodeCriteriaBuilder_ == null) {
                    return nodeCriteria_ == null ? co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.getDefaultInstance() : nodeCriteria_;
                } else {
                    return nodeCriteriaBuilder_.getMessage();
                }
            }

            /**
             * <code>.NodeCriteria node_criteria = 13;</code>
             */
            public Builder setNodeCriteria(co.rira.kafka.model.OpennmsModelProtos.NodeCriteria value) {
                if (nodeCriteriaBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    nodeCriteria_ = value;
                    onChanged();
                } else {
                    nodeCriteriaBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.NodeCriteria node_criteria = 13;</code>
             */
            public Builder setNodeCriteria(
                    co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder builderForValue) {
                if (nodeCriteriaBuilder_ == null) {
                    nodeCriteria_ = builderForValue.build();
                    onChanged();
                } else {
                    nodeCriteriaBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.NodeCriteria node_criteria = 13;</code>
             */
            public Builder mergeNodeCriteria(co.rira.kafka.model.OpennmsModelProtos.NodeCriteria value) {
                if (nodeCriteriaBuilder_ == null) {
                    if (nodeCriteria_ != null) {
                        nodeCriteria_ =
                                co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.newBuilder(nodeCriteria_).mergeFrom(value).buildPartial();
                    } else {
                        nodeCriteria_ = value;
                    }
                    onChanged();
                } else {
                    nodeCriteriaBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.NodeCriteria node_criteria = 13;</code>
             */
            public Builder clearNodeCriteria() {
                if (nodeCriteriaBuilder_ == null) {
                    nodeCriteria_ = null;
                    onChanged();
                } else {
                    nodeCriteria_ = null;
                    nodeCriteriaBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.NodeCriteria node_criteria = 13;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder getNodeCriteriaBuilder() {

                onChanged();
                return getNodeCriteriaFieldBuilder().getBuilder();
            }

            /**
             * <code>.NodeCriteria node_criteria = 13;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.NodeCriteriaOrBuilder getNodeCriteriaOrBuilder() {
                if (nodeCriteriaBuilder_ != null) {
                    return nodeCriteriaBuilder_.getMessageOrBuilder();
                } else {
                    return nodeCriteria_ == null ?
                            co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.getDefaultInstance() : nodeCriteria_;
                }
            }

            /**
             * <code>.NodeCriteria node_criteria = 13;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.NodeCriteria, co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder, co.rira.kafka.model.OpennmsModelProtos.NodeCriteriaOrBuilder>
            getNodeCriteriaFieldBuilder() {
                if (nodeCriteriaBuilder_ == null) {
                    nodeCriteriaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            co.rira.kafka.model.OpennmsModelProtos.NodeCriteria, co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder, co.rira.kafka.model.OpennmsModelProtos.NodeCriteriaOrBuilder>(
                            getNodeCriteria(),
                            getParentForChildren(),
                            isClean());
                    nodeCriteria_ = null;
                }
                return nodeCriteriaBuilder_;
            }

            /**
             * <code>string ip_address = 14;</code>
             *
             * @return The ipAddress.
             */
            public java.lang.String getIpAddress() {
                java.lang.Object ref = ipAddress_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    ipAddress_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string ip_address = 14;</code>
             *
             * @param value The ipAddress to set.
             * @return This builder for chaining.
             */
            public Builder setIpAddress(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                ipAddress_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string ip_address = 14;</code>
             *
             * @return The bytes for ipAddress.
             */
            public com.google.protobuf.ByteString
            getIpAddressBytes() {
                java.lang.Object ref = ipAddress_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    ipAddress_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string ip_address = 14;</code>
             *
             * @param value The bytes for ipAddress to set.
             * @return This builder for chaining.
             */
            public Builder setIpAddressBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                ipAddress_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string ip_address = 14;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIpAddress() {

                ipAddress_ = getDefaultInstance().getIpAddress();
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:Event)
        }

    }


    /**
     * Protobuf type {@code Alarm}
     */
    public static final class Alarm extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:Alarm)
            AlarmOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int UEI_FIELD_NUMBER = 2;
        public static final int NODE_CRITERIA_FIELD_NUMBER = 3;
        public static final int IP_ADDRESS_FIELD_NUMBER = 4;
        public static final int SERVICE_NAME_FIELD_NUMBER = 5;
        public static final int REDUCTION_KEY_FIELD_NUMBER = 6;
        public static final int TYPE_FIELD_NUMBER = 7;
        public static final int COUNT_FIELD_NUMBER = 8;
        public static final int SEVERITY_FIELD_NUMBER = 9;
        public static final int FIRST_EVENT_TIME_FIELD_NUMBER = 10;
        public static final int DESCRIPTION_FIELD_NUMBER = 11;
        public static final int LOG_MESSAGE_FIELD_NUMBER = 12;
        public static final int ACK_USER_FIELD_NUMBER = 13;
        public static final int ACK_TIME_FIELD_NUMBER = 14;
        public static final int LAST_EVENT_FIELD_NUMBER = 15;
        public static final int LAST_EVENT_TIME_FIELD_NUMBER = 16;
        public static final int IF_INDEX_FIELD_NUMBER = 17;
        public static final int OPERATOR_INSTRUCTIONS_FIELD_NUMBER = 18;
        public static final int CLEAR_KEY_FIELD_NUMBER = 19;
        public static final int MANAGED_OBJECT_INSTANCE_FIELD_NUMBER = 20;
        public static final int MANAGED_OBJECT_TYPE_FIELD_NUMBER = 21;
        public static final int RELATEDALARM_FIELD_NUMBER = 22;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:Alarm)
        private static final co.rira.kafka.model.OpennmsModelProtos.Alarm DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<Alarm>
                PARSER = new com.google.protobuf.AbstractParser<Alarm>() {
            @java.lang.Override
            public Alarm parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Alarm(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new co.rira.kafka.model.OpennmsModelProtos.Alarm();
        }

        private long id_;
        private volatile java.lang.Object uei_;
        private co.rira.kafka.model.OpennmsModelProtos.NodeCriteria nodeCriteria_;
        private volatile java.lang.Object ipAddress_;
        private volatile java.lang.Object serviceName_;
        private volatile java.lang.Object reductionKey_;
        private int type_;
        private long count_;
        private int severity_;
        private long firstEventTime_;
        private volatile java.lang.Object description_;
        private volatile java.lang.Object logMessage_;
        private volatile java.lang.Object ackUser_;
        private long ackTime_;
        private co.rira.kafka.model.OpennmsModelProtos.Event lastEvent_;
        private long lastEventTime_;
        private int ifIndex_;
        private volatile java.lang.Object operatorInstructions_;
        private volatile java.lang.Object clearKey_;
        private volatile java.lang.Object managedObjectInstance_;
        private volatile java.lang.Object managedObjectType_;
        private java.util.List<co.rira.kafka.model.OpennmsModelProtos.Alarm> relatedAlarm_;
        private byte memoizedIsInitialized = -1;

        // Use Alarm.newBuilder() to construct.
        private Alarm(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Alarm() {
            uei_ = "";
            ipAddress_ = "";
            serviceName_ = "";
            reductionKey_ = "";
            type_ = 0;
            severity_ = 0;
            description_ = "";
            logMessage_ = "";
            ackUser_ = "";
            operatorInstructions_ = "";
            clearKey_ = "";
            managedObjectInstance_ = "";
            managedObjectType_ = "";
            relatedAlarm_ = java.util.Collections.emptyList();
        }

        private Alarm(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8: {

                            id_ = input.readUInt64();
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            uei_ = s;
                            break;
                        }
                        case 26: {
                            co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder subBuilder = null;
                            if (nodeCriteria_ != null) {
                                subBuilder = nodeCriteria_.toBuilder();
                            }
                            nodeCriteria_ = input.readMessage(co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(nodeCriteria_);
                                nodeCriteria_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 34: {
                            java.lang.String s = input.readStringRequireUtf8();

                            ipAddress_ = s;
                            break;
                        }
                        case 42: {
                            java.lang.String s = input.readStringRequireUtf8();

                            serviceName_ = s;
                            break;
                        }
                        case 50: {
                            java.lang.String s = input.readStringRequireUtf8();

                            reductionKey_ = s;
                            break;
                        }
                        case 56: {
                            int rawValue = input.readEnum();

                            type_ = rawValue;
                            break;
                        }
                        case 64: {

                            count_ = input.readUInt64();
                            break;
                        }
                        case 72: {
                            int rawValue = input.readEnum();

                            severity_ = rawValue;
                            break;
                        }
                        case 80: {

                            firstEventTime_ = input.readUInt64();
                            break;
                        }
                        case 90: {
                            java.lang.String s = input.readStringRequireUtf8();

                            description_ = s;
                            break;
                        }
                        case 98: {
                            java.lang.String s = input.readStringRequireUtf8();

                            logMessage_ = s;
                            break;
                        }
                        case 106: {
                            java.lang.String s = input.readStringRequireUtf8();

                            ackUser_ = s;
                            break;
                        }
                        case 112: {

                            ackTime_ = input.readUInt64();
                            break;
                        }
                        case 122: {
                            co.rira.kafka.model.OpennmsModelProtos.Event.Builder subBuilder = null;
                            if (lastEvent_ != null) {
                                subBuilder = lastEvent_.toBuilder();
                            }
                            lastEvent_ = input.readMessage(co.rira.kafka.model.OpennmsModelProtos.Event.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(lastEvent_);
                                lastEvent_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 128: {

                            lastEventTime_ = input.readUInt64();
                            break;
                        }
                        case 136: {

                            ifIndex_ = input.readUInt32();
                            break;
                        }
                        case 146: {
                            java.lang.String s = input.readStringRequireUtf8();

                            operatorInstructions_ = s;
                            break;
                        }
                        case 154: {
                            java.lang.String s = input.readStringRequireUtf8();

                            clearKey_ = s;
                            break;
                        }
                        case 162: {
                            java.lang.String s = input.readStringRequireUtf8();

                            managedObjectInstance_ = s;
                            break;
                        }
                        case 170: {
                            java.lang.String s = input.readStringRequireUtf8();

                            managedObjectType_ = s;
                            break;
                        }
                        case 178: {
                            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                relatedAlarm_ = new java.util.ArrayList<co.rira.kafka.model.OpennmsModelProtos.Alarm>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            relatedAlarm_.add(
                                    input.readMessage(co.rira.kafka.model.OpennmsModelProtos.Alarm.parser(), extensionRegistry));
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    relatedAlarm_ = java.util.Collections.unmodifiableList(relatedAlarm_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_Alarm_descriptor;
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Alarm parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Alarm parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Alarm parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Alarm parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Alarm parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Alarm parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Alarm parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Alarm parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Alarm parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Alarm parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Alarm parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Alarm parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(co.rira.kafka.model.OpennmsModelProtos.Alarm prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Alarm getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<Alarm> parser() {
            return PARSER;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new Alarm();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_Alarm_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            co.rira.kafka.model.OpennmsModelProtos.Alarm.class, co.rira.kafka.model.OpennmsModelProtos.Alarm.Builder.class);
        }

        /**
         * <code>uint64 id = 1;</code>
         *
         * @return The id.
         */
        public long getId() {
            return id_;
        }

        /**
         * <code>string uei = 2;</code>
         *
         * @return The uei.
         */
        public java.lang.String getUei() {
            java.lang.Object ref = uei_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                uei_ = s;
                return s;
            }
        }

        /**
         * <code>string uei = 2;</code>
         *
         * @return The bytes for uei.
         */
        public com.google.protobuf.ByteString
        getUeiBytes() {
            java.lang.Object ref = uei_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                uei_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>.NodeCriteria node_criteria = 3;</code>
         *
         * @return Whether the nodeCriteria field is set.
         */
        public boolean hasNodeCriteria() {
            return nodeCriteria_ != null;
        }

        /**
         * <code>.NodeCriteria node_criteria = 3;</code>
         *
         * @return The nodeCriteria.
         */
        public co.rira.kafka.model.OpennmsModelProtos.NodeCriteria getNodeCriteria() {
            return nodeCriteria_ == null ? co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.getDefaultInstance() : nodeCriteria_;
        }

        /**
         * <code>.NodeCriteria node_criteria = 3;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.NodeCriteriaOrBuilder getNodeCriteriaOrBuilder() {
            return getNodeCriteria();
        }

        /**
         * <code>string ip_address = 4;</code>
         *
         * @return The ipAddress.
         */
        public java.lang.String getIpAddress() {
            java.lang.Object ref = ipAddress_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                ipAddress_ = s;
                return s;
            }
        }

        /**
         * <code>string ip_address = 4;</code>
         *
         * @return The bytes for ipAddress.
         */
        public com.google.protobuf.ByteString
        getIpAddressBytes() {
            java.lang.Object ref = ipAddress_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                ipAddress_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string service_name = 5;</code>
         *
         * @return The serviceName.
         */
        public java.lang.String getServiceName() {
            java.lang.Object ref = serviceName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                serviceName_ = s;
                return s;
            }
        }

        /**
         * <code>string service_name = 5;</code>
         *
         * @return The bytes for serviceName.
         */
        public com.google.protobuf.ByteString
        getServiceNameBytes() {
            java.lang.Object ref = serviceName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                serviceName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string reduction_key = 6;</code>
         *
         * @return The reductionKey.
         */
        public java.lang.String getReductionKey() {
            java.lang.Object ref = reductionKey_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                reductionKey_ = s;
                return s;
            }
        }

        /**
         * <code>string reduction_key = 6;</code>
         *
         * @return The bytes for reductionKey.
         */
        public com.google.protobuf.ByteString
        getReductionKeyBytes() {
            java.lang.Object ref = reductionKey_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                reductionKey_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>.Alarm.Type type = 7;</code>
         *
         * @return The enum numeric value on the wire for type.
         */
        public int getTypeValue() {
            return type_;
        }

        /**
         * <code>.Alarm.Type type = 7;</code>
         *
         * @return The type.
         */
        public co.rira.kafka.model.OpennmsModelProtos.Alarm.Type getType() {
            @SuppressWarnings("deprecation")
            co.rira.kafka.model.OpennmsModelProtos.Alarm.Type result = co.rira.kafka.model.OpennmsModelProtos.Alarm.Type.valueOf(type_);
            return result == null ? co.rira.kafka.model.OpennmsModelProtos.Alarm.Type.UNRECOGNIZED : result;
        }

        /**
         * <code>uint64 count = 8;</code>
         *
         * @return The count.
         */
        public long getCount() {
            return count_;
        }

        /**
         * <code>.Severity severity = 9;</code>
         *
         * @return The enum numeric value on the wire for severity.
         */
        public int getSeverityValue() {
            return severity_;
        }

        /**
         * <code>.Severity severity = 9;</code>
         *
         * @return The severity.
         */
        public co.rira.kafka.model.OpennmsModelProtos.Severity getSeverity() {
            @SuppressWarnings("deprecation")
            co.rira.kafka.model.OpennmsModelProtos.Severity result = co.rira.kafka.model.OpennmsModelProtos.Severity.valueOf(severity_);
            return result == null ? co.rira.kafka.model.OpennmsModelProtos.Severity.UNRECOGNIZED : result;
        }

        /**
         * <code>uint64 first_event_time = 10;</code>
         *
         * @return The firstEventTime.
         */
        public long getFirstEventTime() {
            return firstEventTime_;
        }

        /**
         * <code>string description = 11;</code>
         *
         * @return The description.
         */
        public java.lang.String getDescription() {
            java.lang.Object ref = description_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                description_ = s;
                return s;
            }
        }

        /**
         * <code>string description = 11;</code>
         *
         * @return The bytes for description.
         */
        public com.google.protobuf.ByteString
        getDescriptionBytes() {
            java.lang.Object ref = description_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                description_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string log_message = 12;</code>
         *
         * @return The logMessage.
         */
        public java.lang.String getLogMessage() {
            java.lang.Object ref = logMessage_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                logMessage_ = s;
                return s;
            }
        }

        /**
         * <code>string log_message = 12;</code>
         *
         * @return The bytes for logMessage.
         */
        public com.google.protobuf.ByteString
        getLogMessageBytes() {
            java.lang.Object ref = logMessage_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                logMessage_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string ack_user = 13;</code>
         *
         * @return The ackUser.
         */
        public java.lang.String getAckUser() {
            java.lang.Object ref = ackUser_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                ackUser_ = s;
                return s;
            }
        }

        /**
         * <code>string ack_user = 13;</code>
         *
         * @return The bytes for ackUser.
         */
        public com.google.protobuf.ByteString
        getAckUserBytes() {
            java.lang.Object ref = ackUser_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                ackUser_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>uint64 ack_time = 14;</code>
         *
         * @return The ackTime.
         */
        public long getAckTime() {
            return ackTime_;
        }

        /**
         * <code>.Event last_event = 15;</code>
         *
         * @return Whether the lastEvent field is set.
         */
        public boolean hasLastEvent() {
            return lastEvent_ != null;
        }

        /**
         * <code>.Event last_event = 15;</code>
         *
         * @return The lastEvent.
         */
        public co.rira.kafka.model.OpennmsModelProtos.Event getLastEvent() {
            return lastEvent_ == null ? co.rira.kafka.model.OpennmsModelProtos.Event.getDefaultInstance() : lastEvent_;
        }

        /**
         * <code>.Event last_event = 15;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.EventOrBuilder getLastEventOrBuilder() {
            return getLastEvent();
        }

        /**
         * <code>uint64 last_event_time = 16;</code>
         *
         * @return The lastEventTime.
         */
        public long getLastEventTime() {
            return lastEventTime_;
        }

        /**
         * <code>uint32 if_index = 17;</code>
         *
         * @return The ifIndex.
         */
        public int getIfIndex() {
            return ifIndex_;
        }

        /**
         * <code>string operator_instructions = 18;</code>
         *
         * @return The operatorInstructions.
         */
        public java.lang.String getOperatorInstructions() {
            java.lang.Object ref = operatorInstructions_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                operatorInstructions_ = s;
                return s;
            }
        }

        /**
         * <code>string operator_instructions = 18;</code>
         *
         * @return The bytes for operatorInstructions.
         */
        public com.google.protobuf.ByteString
        getOperatorInstructionsBytes() {
            java.lang.Object ref = operatorInstructions_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                operatorInstructions_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string clear_key = 19;</code>
         *
         * @return The clearKey.
         */
        public java.lang.String getClearKey() {
            java.lang.Object ref = clearKey_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                clearKey_ = s;
                return s;
            }
        }

        /**
         * <code>string clear_key = 19;</code>
         *
         * @return The bytes for clearKey.
         */
        public com.google.protobuf.ByteString
        getClearKeyBytes() {
            java.lang.Object ref = clearKey_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                clearKey_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string managed_object_instance = 20;</code>
         *
         * @return The managedObjectInstance.
         */
        public java.lang.String getManagedObjectInstance() {
            java.lang.Object ref = managedObjectInstance_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                managedObjectInstance_ = s;
                return s;
            }
        }

        /**
         * <code>string managed_object_instance = 20;</code>
         *
         * @return The bytes for managedObjectInstance.
         */
        public com.google.protobuf.ByteString
        getManagedObjectInstanceBytes() {
            java.lang.Object ref = managedObjectInstance_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                managedObjectInstance_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string managed_object_type = 21;</code>
         *
         * @return The managedObjectType.
         */
        public java.lang.String getManagedObjectType() {
            java.lang.Object ref = managedObjectType_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                managedObjectType_ = s;
                return s;
            }
        }

        /**
         * <code>string managed_object_type = 21;</code>
         *
         * @return The bytes for managedObjectType.
         */
        public com.google.protobuf.ByteString
        getManagedObjectTypeBytes() {
            java.lang.Object ref = managedObjectType_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                managedObjectType_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>repeated .Alarm relatedAlarm = 22;</code>
         */
        public java.util.List<co.rira.kafka.model.OpennmsModelProtos.Alarm> getRelatedAlarmList() {
            return relatedAlarm_;
        }

        /**
         * <code>repeated .Alarm relatedAlarm = 22;</code>
         */
        public java.util.List<? extends co.rira.kafka.model.OpennmsModelProtos.AlarmOrBuilder>
        getRelatedAlarmOrBuilderList() {
            return relatedAlarm_;
        }

        /**
         * <code>repeated .Alarm relatedAlarm = 22;</code>
         */
        public int getRelatedAlarmCount() {
            return relatedAlarm_.size();
        }

        /**
         * <code>repeated .Alarm relatedAlarm = 22;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.Alarm getRelatedAlarm(int index) {
            return relatedAlarm_.get(index);
        }

        /**
         * <code>repeated .Alarm relatedAlarm = 22;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.AlarmOrBuilder getRelatedAlarmOrBuilder(
                int index) {
            return relatedAlarm_.get(index);
        }

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (id_ != 0L) {
                output.writeUInt64(1, id_);
            }
            if (!getUeiBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uei_);
            }
            if (nodeCriteria_ != null) {
                output.writeMessage(3, getNodeCriteria());
            }
            if (!getIpAddressBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 4, ipAddress_);
            }
            if (!getServiceNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 5, serviceName_);
            }
            if (!getReductionKeyBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 6, reductionKey_);
            }
            if (type_ != co.rira.kafka.model.OpennmsModelProtos.Alarm.Type.PROBLEM_WITH_CLEAR.getNumber()) {
                output.writeEnum(7, type_);
            }
            if (count_ != 0L) {
                output.writeUInt64(8, count_);
            }
            if (severity_ != co.rira.kafka.model.OpennmsModelProtos.Severity.INDETERMINATE.getNumber()) {
                output.writeEnum(9, severity_);
            }
            if (firstEventTime_ != 0L) {
                output.writeUInt64(10, firstEventTime_);
            }
            if (!getDescriptionBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 11, description_);
            }
            if (!getLogMessageBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 12, logMessage_);
            }
            if (!getAckUserBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 13, ackUser_);
            }
            if (ackTime_ != 0L) {
                output.writeUInt64(14, ackTime_);
            }
            if (lastEvent_ != null) {
                output.writeMessage(15, getLastEvent());
            }
            if (lastEventTime_ != 0L) {
                output.writeUInt64(16, lastEventTime_);
            }
            if (ifIndex_ != 0) {
                output.writeUInt32(17, ifIndex_);
            }
            if (!getOperatorInstructionsBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 18, operatorInstructions_);
            }
            if (!getClearKeyBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 19, clearKey_);
            }
            if (!getManagedObjectInstanceBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 20, managedObjectInstance_);
            }
            if (!getManagedObjectTypeBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 21, managedObjectType_);
            }
            for (int i = 0; i < relatedAlarm_.size(); i++) {
                output.writeMessage(22, relatedAlarm_.get(i));
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(1, id_);
            }
            if (!getUeiBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, uei_);
            }
            if (nodeCriteria_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, getNodeCriteria());
            }
            if (!getIpAddressBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, ipAddress_);
            }
            if (!getServiceNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, serviceName_);
            }
            if (!getReductionKeyBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, reductionKey_);
            }
            if (type_ != co.rira.kafka.model.OpennmsModelProtos.Alarm.Type.PROBLEM_WITH_CLEAR.getNumber()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(7, type_);
            }
            if (count_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(8, count_);
            }
            if (severity_ != co.rira.kafka.model.OpennmsModelProtos.Severity.INDETERMINATE.getNumber()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(9, severity_);
            }
            if (firstEventTime_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(10, firstEventTime_);
            }
            if (!getDescriptionBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, description_);
            }
            if (!getLogMessageBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, logMessage_);
            }
            if (!getAckUserBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, ackUser_);
            }
            if (ackTime_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(14, ackTime_);
            }
            if (lastEvent_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(15, getLastEvent());
            }
            if (lastEventTime_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(16, lastEventTime_);
            }
            if (ifIndex_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(17, ifIndex_);
            }
            if (!getOperatorInstructionsBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(18, operatorInstructions_);
            }
            if (!getClearKeyBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(19, clearKey_);
            }
            if (!getManagedObjectInstanceBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(20, managedObjectInstance_);
            }
            if (!getManagedObjectTypeBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(21, managedObjectType_);
            }
            for (int i = 0; i < relatedAlarm_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(22, relatedAlarm_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof co.rira.kafka.model.OpennmsModelProtos.Alarm)) {
                return super.equals(obj);
            }
            co.rira.kafka.model.OpennmsModelProtos.Alarm other = (co.rira.kafka.model.OpennmsModelProtos.Alarm) obj;

            if (getId()
                    != other.getId()) return false;
            if (!getUei()
                    .equals(other.getUei())) return false;
            if (hasNodeCriteria() != other.hasNodeCriteria()) return false;
            if (hasNodeCriteria()) {
                if (!getNodeCriteria()
                        .equals(other.getNodeCriteria())) return false;
            }
            if (!getIpAddress()
                    .equals(other.getIpAddress())) return false;
            if (!getServiceName()
                    .equals(other.getServiceName())) return false;
            if (!getReductionKey()
                    .equals(other.getReductionKey())) return false;
            if (type_ != other.type_) return false;
            if (getCount()
                    != other.getCount()) return false;
            if (severity_ != other.severity_) return false;
            if (getFirstEventTime()
                    != other.getFirstEventTime()) return false;
            if (!getDescription()
                    .equals(other.getDescription())) return false;
            if (!getLogMessage()
                    .equals(other.getLogMessage())) return false;
            if (!getAckUser()
                    .equals(other.getAckUser())) return false;
            if (getAckTime()
                    != other.getAckTime()) return false;
            if (hasLastEvent() != other.hasLastEvent()) return false;
            if (hasLastEvent()) {
                if (!getLastEvent()
                        .equals(other.getLastEvent())) return false;
            }
            if (getLastEventTime()
                    != other.getLastEventTime()) return false;
            if (getIfIndex()
                    != other.getIfIndex()) return false;
            if (!getOperatorInstructions()
                    .equals(other.getOperatorInstructions())) return false;
            if (!getClearKey()
                    .equals(other.getClearKey())) return false;
            if (!getManagedObjectInstance()
                    .equals(other.getManagedObjectInstance())) return false;
            if (!getManagedObjectType()
                    .equals(other.getManagedObjectType())) return false;
            if (!getRelatedAlarmList()
                    .equals(other.getRelatedAlarmList())) return false;
            return unknownFields.equals(other.unknownFields);
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getId());
            hash = (37 * hash) + UEI_FIELD_NUMBER;
            hash = (53 * hash) + getUei().hashCode();
            if (hasNodeCriteria()) {
                hash = (37 * hash) + NODE_CRITERIA_FIELD_NUMBER;
                hash = (53 * hash) + getNodeCriteria().hashCode();
            }
            hash = (37 * hash) + IP_ADDRESS_FIELD_NUMBER;
            hash = (53 * hash) + getIpAddress().hashCode();
            hash = (37 * hash) + SERVICE_NAME_FIELD_NUMBER;
            hash = (53 * hash) + getServiceName().hashCode();
            hash = (37 * hash) + REDUCTION_KEY_FIELD_NUMBER;
            hash = (53 * hash) + getReductionKey().hashCode();
            hash = (37 * hash) + TYPE_FIELD_NUMBER;
            hash = (53 * hash) + type_;
            hash = (37 * hash) + COUNT_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getCount());
            hash = (37 * hash) + SEVERITY_FIELD_NUMBER;
            hash = (53 * hash) + severity_;
            hash = (37 * hash) + FIRST_EVENT_TIME_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getFirstEventTime());
            hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
            hash = (53 * hash) + getDescription().hashCode();
            hash = (37 * hash) + LOG_MESSAGE_FIELD_NUMBER;
            hash = (53 * hash) + getLogMessage().hashCode();
            hash = (37 * hash) + ACK_USER_FIELD_NUMBER;
            hash = (53 * hash) + getAckUser().hashCode();
            hash = (37 * hash) + ACK_TIME_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getAckTime());
            if (hasLastEvent()) {
                hash = (37 * hash) + LAST_EVENT_FIELD_NUMBER;
                hash = (53 * hash) + getLastEvent().hashCode();
            }
            hash = (37 * hash) + LAST_EVENT_TIME_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getLastEventTime());
            hash = (37 * hash) + IF_INDEX_FIELD_NUMBER;
            hash = (53 * hash) + getIfIndex();
            hash = (37 * hash) + OPERATOR_INSTRUCTIONS_FIELD_NUMBER;
            hash = (53 * hash) + getOperatorInstructions().hashCode();
            hash = (37 * hash) + CLEAR_KEY_FIELD_NUMBER;
            hash = (53 * hash) + getClearKey().hashCode();
            hash = (37 * hash) + MANAGED_OBJECT_INSTANCE_FIELD_NUMBER;
            hash = (53 * hash) + getManagedObjectInstance().hashCode();
            hash = (37 * hash) + MANAGED_OBJECT_TYPE_FIELD_NUMBER;
            hash = (53 * hash) + getManagedObjectType().hashCode();
            if (getRelatedAlarmCount() > 0) {
                hash = (37 * hash) + RELATEDALARM_FIELD_NUMBER;
                hash = (53 * hash) + getRelatedAlarmList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<Alarm> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public co.rira.kafka.model.OpennmsModelProtos.Alarm getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf enum {@code Alarm.Type}
         */
        public enum Type
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>PROBLEM_WITH_CLEAR = 0;</code>
             */
            PROBLEM_WITH_CLEAR(0),
            /**
             * <code>CLEAR = 1;</code>
             */
            CLEAR(1),
            /**
             * <code>PROBLEM_WITHOUT_CLEAR = 2;</code>
             */
            PROBLEM_WITHOUT_CLEAR(2),
            UNRECOGNIZED(-1),
            ;

            /**
             * <code>PROBLEM_WITH_CLEAR = 0;</code>
             */
            public static final int PROBLEM_WITH_CLEAR_VALUE = 0;
            /**
             * <code>CLEAR = 1;</code>
             */
            public static final int CLEAR_VALUE = 1;
            /**
             * <code>PROBLEM_WITHOUT_CLEAR = 2;</code>
             */
            public static final int PROBLEM_WITHOUT_CLEAR_VALUE = 2;
            private static final com.google.protobuf.Internal.EnumLiteMap<
                    Type> internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<Type>() {
                        public Type findValueByNumber(int number) {
                            return Type.forNumber(number);
                        }
                    };
            private static final Type[] VALUES = values();
            private final int value;

            Type(int value) {
                this.value = value;
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @java.lang.Deprecated
            public static Type valueOf(int value) {
                return forNumber(value);
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             */
            public static Type forNumber(int value) {
                switch (value) {
                    case 0:
                        return PROBLEM_WITH_CLEAR;
                    case 1:
                        return CLEAR;
                    case 2:
                        return PROBLEM_WITHOUT_CLEAR;
                    default:
                        return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<Type>
            internalGetValueMap() {
                return internalValueMap;
            }

            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return co.rira.kafka.model.OpennmsModelProtos.Alarm.getDescriptor().getEnumTypes().get(0);
            }

            public static Type valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[desc.getIndex()];
            }

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new java.lang.IllegalArgumentException(
                            "Can't get the number of an unknown enum value.");
                }
                return value;
            }

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }

            // @@protoc_insertion_point(enum_scope:Alarm.Type)
        }

        /**
         * Protobuf type {@code Alarm}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:Alarm)
                co.rira.kafka.model.OpennmsModelProtos.AlarmOrBuilder {
            private int bitField0_;
            private long id_;
            private java.lang.Object uei_ = "";
            private co.rira.kafka.model.OpennmsModelProtos.NodeCriteria nodeCriteria_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.NodeCriteria, co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder, co.rira.kafka.model.OpennmsModelProtos.NodeCriteriaOrBuilder> nodeCriteriaBuilder_;
            private java.lang.Object ipAddress_ = "";
            private java.lang.Object serviceName_ = "";
            private java.lang.Object reductionKey_ = "";
            private int type_ = 0;
            private long count_;
            private int severity_ = 0;
            private long firstEventTime_;
            private java.lang.Object description_ = "";
            private java.lang.Object logMessage_ = "";
            private java.lang.Object ackUser_ = "";
            private long ackTime_;
            private co.rira.kafka.model.OpennmsModelProtos.Event lastEvent_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.Event, co.rira.kafka.model.OpennmsModelProtos.Event.Builder, co.rira.kafka.model.OpennmsModelProtos.EventOrBuilder> lastEventBuilder_;
            private long lastEventTime_;
            private int ifIndex_;
            private java.lang.Object operatorInstructions_ = "";
            private java.lang.Object clearKey_ = "";
            private java.lang.Object managedObjectInstance_ = "";
            private java.lang.Object managedObjectType_ = "";
            private java.util.List<co.rira.kafka.model.OpennmsModelProtos.Alarm> relatedAlarm_ =
                    java.util.Collections.emptyList();
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.Alarm, co.rira.kafka.model.OpennmsModelProtos.Alarm.Builder, co.rira.kafka.model.OpennmsModelProtos.AlarmOrBuilder> relatedAlarmBuilder_;

            // Construct using co.rira.kafka.model.OpennmsModelProtos.Alarm.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_Alarm_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_Alarm_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                co.rira.kafka.model.OpennmsModelProtos.Alarm.class, co.rira.kafka.model.OpennmsModelProtos.Alarm.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getRelatedAlarmFieldBuilder();
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                id_ = 0L;

                uei_ = "";

                if (nodeCriteriaBuilder_ == null) {
                    nodeCriteria_ = null;
                } else {
                    nodeCriteria_ = null;
                    nodeCriteriaBuilder_ = null;
                }
                ipAddress_ = "";

                serviceName_ = "";

                reductionKey_ = "";

                type_ = 0;

                count_ = 0L;

                severity_ = 0;

                firstEventTime_ = 0L;

                description_ = "";

                logMessage_ = "";

                ackUser_ = "";

                ackTime_ = 0L;

                if (lastEventBuilder_ == null) {
                    lastEvent_ = null;
                } else {
                    lastEvent_ = null;
                    lastEventBuilder_ = null;
                }
                lastEventTime_ = 0L;

                ifIndex_ = 0;

                operatorInstructions_ = "";

                clearKey_ = "";

                managedObjectInstance_ = "";

                managedObjectType_ = "";

                if (relatedAlarmBuilder_ == null) {
                    relatedAlarm_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    relatedAlarmBuilder_.clear();
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_Alarm_descriptor;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.Alarm getDefaultInstanceForType() {
                return co.rira.kafka.model.OpennmsModelProtos.Alarm.getDefaultInstance();
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.Alarm build() {
                co.rira.kafka.model.OpennmsModelProtos.Alarm result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.Alarm buildPartial() {
                co.rira.kafka.model.OpennmsModelProtos.Alarm result = new co.rira.kafka.model.OpennmsModelProtos.Alarm(this);
                int from_bitField0_ = bitField0_;
                result.id_ = id_;
                result.uei_ = uei_;
                if (nodeCriteriaBuilder_ == null) {
                    result.nodeCriteria_ = nodeCriteria_;
                } else {
                    result.nodeCriteria_ = nodeCriteriaBuilder_.build();
                }
                result.ipAddress_ = ipAddress_;
                result.serviceName_ = serviceName_;
                result.reductionKey_ = reductionKey_;
                result.type_ = type_;
                result.count_ = count_;
                result.severity_ = severity_;
                result.firstEventTime_ = firstEventTime_;
                result.description_ = description_;
                result.logMessage_ = logMessage_;
                result.ackUser_ = ackUser_;
                result.ackTime_ = ackTime_;
                if (lastEventBuilder_ == null) {
                    result.lastEvent_ = lastEvent_;
                } else {
                    result.lastEvent_ = lastEventBuilder_.build();
                }
                result.lastEventTime_ = lastEventTime_;
                result.ifIndex_ = ifIndex_;
                result.operatorInstructions_ = operatorInstructions_;
                result.clearKey_ = clearKey_;
                result.managedObjectInstance_ = managedObjectInstance_;
                result.managedObjectType_ = managedObjectType_;
                if (relatedAlarmBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0)) {
                        relatedAlarm_ = java.util.Collections.unmodifiableList(relatedAlarm_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.relatedAlarm_ = relatedAlarm_;
                } else {
                    result.relatedAlarm_ = relatedAlarmBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof co.rira.kafka.model.OpennmsModelProtos.Alarm) {
                    return mergeFrom((co.rira.kafka.model.OpennmsModelProtos.Alarm) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(co.rira.kafka.model.OpennmsModelProtos.Alarm other) {
                if (other == co.rira.kafka.model.OpennmsModelProtos.Alarm.getDefaultInstance()) return this;
                if (other.getId() != 0L) {
                    setId(other.getId());
                }
                if (!other.getUei().isEmpty()) {
                    uei_ = other.uei_;
                    onChanged();
                }
                if (other.hasNodeCriteria()) {
                    mergeNodeCriteria(other.getNodeCriteria());
                }
                if (!other.getIpAddress().isEmpty()) {
                    ipAddress_ = other.ipAddress_;
                    onChanged();
                }
                if (!other.getServiceName().isEmpty()) {
                    serviceName_ = other.serviceName_;
                    onChanged();
                }
                if (!other.getReductionKey().isEmpty()) {
                    reductionKey_ = other.reductionKey_;
                    onChanged();
                }
                if (other.type_ != 0) {
                    setTypeValue(other.getTypeValue());
                }
                if (other.getCount() != 0L) {
                    setCount(other.getCount());
                }
                if (other.severity_ != 0) {
                    setSeverityValue(other.getSeverityValue());
                }
                if (other.getFirstEventTime() != 0L) {
                    setFirstEventTime(other.getFirstEventTime());
                }
                if (!other.getDescription().isEmpty()) {
                    description_ = other.description_;
                    onChanged();
                }
                if (!other.getLogMessage().isEmpty()) {
                    logMessage_ = other.logMessage_;
                    onChanged();
                }
                if (!other.getAckUser().isEmpty()) {
                    ackUser_ = other.ackUser_;
                    onChanged();
                }
                if (other.getAckTime() != 0L) {
                    setAckTime(other.getAckTime());
                }
                if (other.hasLastEvent()) {
                    mergeLastEvent(other.getLastEvent());
                }
                if (other.getLastEventTime() != 0L) {
                    setLastEventTime(other.getLastEventTime());
                }
                if (other.getIfIndex() != 0) {
                    setIfIndex(other.getIfIndex());
                }
                if (!other.getOperatorInstructions().isEmpty()) {
                    operatorInstructions_ = other.operatorInstructions_;
                    onChanged();
                }
                if (!other.getClearKey().isEmpty()) {
                    clearKey_ = other.clearKey_;
                    onChanged();
                }
                if (!other.getManagedObjectInstance().isEmpty()) {
                    managedObjectInstance_ = other.managedObjectInstance_;
                    onChanged();
                }
                if (!other.getManagedObjectType().isEmpty()) {
                    managedObjectType_ = other.managedObjectType_;
                    onChanged();
                }
                if (relatedAlarmBuilder_ == null) {
                    if (!other.relatedAlarm_.isEmpty()) {
                        if (relatedAlarm_.isEmpty()) {
                            relatedAlarm_ = other.relatedAlarm_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureRelatedAlarmIsMutable();
                            relatedAlarm_.addAll(other.relatedAlarm_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.relatedAlarm_.isEmpty()) {
                        if (relatedAlarmBuilder_.isEmpty()) {
                            relatedAlarmBuilder_.dispose();
                            relatedAlarmBuilder_ = null;
                            relatedAlarm_ = other.relatedAlarm_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            relatedAlarmBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getRelatedAlarmFieldBuilder() : null;
                        } else {
                            relatedAlarmBuilder_.addAllMessages(other.relatedAlarm_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                co.rira.kafka.model.OpennmsModelProtos.Alarm parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (co.rira.kafka.model.OpennmsModelProtos.Alarm) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>uint64 id = 1;</code>
             *
             * @return The id.
             */
            public long getId() {
                return id_;
            }

            /**
             * <code>uint64 id = 1;</code>
             *
             * @param value The id to set.
             * @return This builder for chaining.
             */
            public Builder setId(long value) {

                id_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 id = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearId() {

                id_ = 0L;
                onChanged();
                return this;
            }

            /**
             * <code>string uei = 2;</code>
             *
             * @return The uei.
             */
            public java.lang.String getUei() {
                java.lang.Object ref = uei_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    uei_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string uei = 2;</code>
             *
             * @param value The uei to set.
             * @return This builder for chaining.
             */
            public Builder setUei(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                uei_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string uei = 2;</code>
             *
             * @return The bytes for uei.
             */
            public com.google.protobuf.ByteString
            getUeiBytes() {
                java.lang.Object ref = uei_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    uei_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string uei = 2;</code>
             *
             * @param value The bytes for uei to set.
             * @return This builder for chaining.
             */
            public Builder setUeiBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                uei_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string uei = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearUei() {

                uei_ = getDefaultInstance().getUei();
                onChanged();
                return this;
            }

            /**
             * <code>.NodeCriteria node_criteria = 3;</code>
             *
             * @return Whether the nodeCriteria field is set.
             */
            public boolean hasNodeCriteria() {
                return nodeCriteriaBuilder_ != null || nodeCriteria_ != null;
            }

            /**
             * <code>.NodeCriteria node_criteria = 3;</code>
             *
             * @return The nodeCriteria.
             */
            public co.rira.kafka.model.OpennmsModelProtos.NodeCriteria getNodeCriteria() {
                if (nodeCriteriaBuilder_ == null) {
                    return nodeCriteria_ == null ? co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.getDefaultInstance() : nodeCriteria_;
                } else {
                    return nodeCriteriaBuilder_.getMessage();
                }
            }

            /**
             * <code>.NodeCriteria node_criteria = 3;</code>
             */
            public Builder setNodeCriteria(co.rira.kafka.model.OpennmsModelProtos.NodeCriteria value) {
                if (nodeCriteriaBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    nodeCriteria_ = value;
                    onChanged();
                } else {
                    nodeCriteriaBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.NodeCriteria node_criteria = 3;</code>
             */
            public Builder setNodeCriteria(
                    co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder builderForValue) {
                if (nodeCriteriaBuilder_ == null) {
                    nodeCriteria_ = builderForValue.build();
                    onChanged();
                } else {
                    nodeCriteriaBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.NodeCriteria node_criteria = 3;</code>
             */
            public Builder mergeNodeCriteria(co.rira.kafka.model.OpennmsModelProtos.NodeCriteria value) {
                if (nodeCriteriaBuilder_ == null) {
                    if (nodeCriteria_ != null) {
                        nodeCriteria_ =
                                co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.newBuilder(nodeCriteria_).mergeFrom(value).buildPartial();
                    } else {
                        nodeCriteria_ = value;
                    }
                    onChanged();
                } else {
                    nodeCriteriaBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.NodeCriteria node_criteria = 3;</code>
             */
            public Builder clearNodeCriteria() {
                if (nodeCriteriaBuilder_ == null) {
                    nodeCriteria_ = null;
                    onChanged();
                } else {
                    nodeCriteria_ = null;
                    nodeCriteriaBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.NodeCriteria node_criteria = 3;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder getNodeCriteriaBuilder() {

                onChanged();
                return getNodeCriteriaFieldBuilder().getBuilder();
            }

            /**
             * <code>.NodeCriteria node_criteria = 3;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.NodeCriteriaOrBuilder getNodeCriteriaOrBuilder() {
                if (nodeCriteriaBuilder_ != null) {
                    return nodeCriteriaBuilder_.getMessageOrBuilder();
                } else {
                    return nodeCriteria_ == null ?
                            co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.getDefaultInstance() : nodeCriteria_;
                }
            }

            /**
             * <code>.NodeCriteria node_criteria = 3;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.NodeCriteria, co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder, co.rira.kafka.model.OpennmsModelProtos.NodeCriteriaOrBuilder>
            getNodeCriteriaFieldBuilder() {
                if (nodeCriteriaBuilder_ == null) {
                    nodeCriteriaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            co.rira.kafka.model.OpennmsModelProtos.NodeCriteria, co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder, co.rira.kafka.model.OpennmsModelProtos.NodeCriteriaOrBuilder>(
                            getNodeCriteria(),
                            getParentForChildren(),
                            isClean());
                    nodeCriteria_ = null;
                }
                return nodeCriteriaBuilder_;
            }

            /**
             * <code>string ip_address = 4;</code>
             *
             * @return The ipAddress.
             */
            public java.lang.String getIpAddress() {
                java.lang.Object ref = ipAddress_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    ipAddress_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string ip_address = 4;</code>
             *
             * @param value The ipAddress to set.
             * @return This builder for chaining.
             */
            public Builder setIpAddress(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                ipAddress_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string ip_address = 4;</code>
             *
             * @return The bytes for ipAddress.
             */
            public com.google.protobuf.ByteString
            getIpAddressBytes() {
                java.lang.Object ref = ipAddress_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    ipAddress_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string ip_address = 4;</code>
             *
             * @param value The bytes for ipAddress to set.
             * @return This builder for chaining.
             */
            public Builder setIpAddressBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                ipAddress_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string ip_address = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIpAddress() {

                ipAddress_ = getDefaultInstance().getIpAddress();
                onChanged();
                return this;
            }

            /**
             * <code>string service_name = 5;</code>
             *
             * @return The serviceName.
             */
            public java.lang.String getServiceName() {
                java.lang.Object ref = serviceName_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    serviceName_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string service_name = 5;</code>
             *
             * @param value The serviceName to set.
             * @return This builder for chaining.
             */
            public Builder setServiceName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                serviceName_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string service_name = 5;</code>
             *
             * @return The bytes for serviceName.
             */
            public com.google.protobuf.ByteString
            getServiceNameBytes() {
                java.lang.Object ref = serviceName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    serviceName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string service_name = 5;</code>
             *
             * @param value The bytes for serviceName to set.
             * @return This builder for chaining.
             */
            public Builder setServiceNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                serviceName_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string service_name = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearServiceName() {

                serviceName_ = getDefaultInstance().getServiceName();
                onChanged();
                return this;
            }

            /**
             * <code>string reduction_key = 6;</code>
             *
             * @return The reductionKey.
             */
            public java.lang.String getReductionKey() {
                java.lang.Object ref = reductionKey_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    reductionKey_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string reduction_key = 6;</code>
             *
             * @param value The reductionKey to set.
             * @return This builder for chaining.
             */
            public Builder setReductionKey(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                reductionKey_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string reduction_key = 6;</code>
             *
             * @return The bytes for reductionKey.
             */
            public com.google.protobuf.ByteString
            getReductionKeyBytes() {
                java.lang.Object ref = reductionKey_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    reductionKey_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string reduction_key = 6;</code>
             *
             * @param value The bytes for reductionKey to set.
             * @return This builder for chaining.
             */
            public Builder setReductionKeyBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                reductionKey_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string reduction_key = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearReductionKey() {

                reductionKey_ = getDefaultInstance().getReductionKey();
                onChanged();
                return this;
            }

            /**
             * <code>.Alarm.Type type = 7;</code>
             *
             * @return The enum numeric value on the wire for type.
             */
            public int getTypeValue() {
                return type_;
            }

            /**
             * <code>.Alarm.Type type = 7;</code>
             *
             * @param value The enum numeric value on the wire for type to set.
             * @return This builder for chaining.
             */
            public Builder setTypeValue(int value) {
                type_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>.Alarm.Type type = 7;</code>
             *
             * @return The type.
             */
            public co.rira.kafka.model.OpennmsModelProtos.Alarm.Type getType() {
                @SuppressWarnings("deprecation")
                co.rira.kafka.model.OpennmsModelProtos.Alarm.Type result = co.rira.kafka.model.OpennmsModelProtos.Alarm.Type.valueOf(type_);
                return result == null ? co.rira.kafka.model.OpennmsModelProtos.Alarm.Type.UNRECOGNIZED : result;
            }

            /**
             * <code>.Alarm.Type type = 7;</code>
             *
             * @param value The type to set.
             * @return This builder for chaining.
             */
            public Builder setType(co.rira.kafka.model.OpennmsModelProtos.Alarm.Type value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                type_ = value.getNumber();
                onChanged();
                return this;
            }

            /**
             * <code>.Alarm.Type type = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearType() {

                type_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 count = 8;</code>
             *
             * @return The count.
             */
            public long getCount() {
                return count_;
            }

            /**
             * <code>uint64 count = 8;</code>
             *
             * @param value The count to set.
             * @return This builder for chaining.
             */
            public Builder setCount(long value) {

                count_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 count = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCount() {

                count_ = 0L;
                onChanged();
                return this;
            }

            /**
             * <code>.Severity severity = 9;</code>
             *
             * @return The enum numeric value on the wire for severity.
             */
            public int getSeverityValue() {
                return severity_;
            }

            /**
             * <code>.Severity severity = 9;</code>
             *
             * @param value The enum numeric value on the wire for severity to set.
             * @return This builder for chaining.
             */
            public Builder setSeverityValue(int value) {
                severity_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>.Severity severity = 9;</code>
             *
             * @return The severity.
             */
            public co.rira.kafka.model.OpennmsModelProtos.Severity getSeverity() {
                @SuppressWarnings("deprecation")
                co.rira.kafka.model.OpennmsModelProtos.Severity result = co.rira.kafka.model.OpennmsModelProtos.Severity.valueOf(severity_);
                return result == null ? co.rira.kafka.model.OpennmsModelProtos.Severity.UNRECOGNIZED : result;
            }

            /**
             * <code>.Severity severity = 9;</code>
             *
             * @param value The severity to set.
             * @return This builder for chaining.
             */
            public Builder setSeverity(co.rira.kafka.model.OpennmsModelProtos.Severity value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                severity_ = value.getNumber();
                onChanged();
                return this;
            }

            /**
             * <code>.Severity severity = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSeverity() {

                severity_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 first_event_time = 10;</code>
             *
             * @return The firstEventTime.
             */
            public long getFirstEventTime() {
                return firstEventTime_;
            }

            /**
             * <code>uint64 first_event_time = 10;</code>
             *
             * @param value The firstEventTime to set.
             * @return This builder for chaining.
             */
            public Builder setFirstEventTime(long value) {

                firstEventTime_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 first_event_time = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearFirstEventTime() {

                firstEventTime_ = 0L;
                onChanged();
                return this;
            }

            /**
             * <code>string description = 11;</code>
             *
             * @return The description.
             */
            public java.lang.String getDescription() {
                java.lang.Object ref = description_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    description_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string description = 11;</code>
             *
             * @param value The description to set.
             * @return This builder for chaining.
             */
            public Builder setDescription(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                description_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string description = 11;</code>
             *
             * @return The bytes for description.
             */
            public com.google.protobuf.ByteString
            getDescriptionBytes() {
                java.lang.Object ref = description_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    description_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string description = 11;</code>
             *
             * @param value The bytes for description to set.
             * @return This builder for chaining.
             */
            public Builder setDescriptionBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                description_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string description = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearDescription() {

                description_ = getDefaultInstance().getDescription();
                onChanged();
                return this;
            }

            /**
             * <code>string log_message = 12;</code>
             *
             * @return The logMessage.
             */
            public java.lang.String getLogMessage() {
                java.lang.Object ref = logMessage_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    logMessage_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string log_message = 12;</code>
             *
             * @param value The logMessage to set.
             * @return This builder for chaining.
             */
            public Builder setLogMessage(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                logMessage_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string log_message = 12;</code>
             *
             * @return The bytes for logMessage.
             */
            public com.google.protobuf.ByteString
            getLogMessageBytes() {
                java.lang.Object ref = logMessage_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    logMessage_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string log_message = 12;</code>
             *
             * @param value The bytes for logMessage to set.
             * @return This builder for chaining.
             */
            public Builder setLogMessageBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                logMessage_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string log_message = 12;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLogMessage() {

                logMessage_ = getDefaultInstance().getLogMessage();
                onChanged();
                return this;
            }

            /**
             * <code>string ack_user = 13;</code>
             *
             * @return The ackUser.
             */
            public java.lang.String getAckUser() {
                java.lang.Object ref = ackUser_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    ackUser_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string ack_user = 13;</code>
             *
             * @param value The ackUser to set.
             * @return This builder for chaining.
             */
            public Builder setAckUser(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                ackUser_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string ack_user = 13;</code>
             *
             * @return The bytes for ackUser.
             */
            public com.google.protobuf.ByteString
            getAckUserBytes() {
                java.lang.Object ref = ackUser_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    ackUser_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string ack_user = 13;</code>
             *
             * @param value The bytes for ackUser to set.
             * @return This builder for chaining.
             */
            public Builder setAckUserBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                ackUser_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string ack_user = 13;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAckUser() {

                ackUser_ = getDefaultInstance().getAckUser();
                onChanged();
                return this;
            }

            /**
             * <code>uint64 ack_time = 14;</code>
             *
             * @return The ackTime.
             */
            public long getAckTime() {
                return ackTime_;
            }

            /**
             * <code>uint64 ack_time = 14;</code>
             *
             * @param value The ackTime to set.
             * @return This builder for chaining.
             */
            public Builder setAckTime(long value) {

                ackTime_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 ack_time = 14;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAckTime() {

                ackTime_ = 0L;
                onChanged();
                return this;
            }

            /**
             * <code>.Event last_event = 15;</code>
             *
             * @return Whether the lastEvent field is set.
             */
            public boolean hasLastEvent() {
                return lastEventBuilder_ != null || lastEvent_ != null;
            }

            /**
             * <code>.Event last_event = 15;</code>
             *
             * @return The lastEvent.
             */
            public co.rira.kafka.model.OpennmsModelProtos.Event getLastEvent() {
                if (lastEventBuilder_ == null) {
                    return lastEvent_ == null ? co.rira.kafka.model.OpennmsModelProtos.Event.getDefaultInstance() : lastEvent_;
                } else {
                    return lastEventBuilder_.getMessage();
                }
            }

            /**
             * <code>.Event last_event = 15;</code>
             */
            public Builder setLastEvent(co.rira.kafka.model.OpennmsModelProtos.Event value) {
                if (lastEventBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    lastEvent_ = value;
                    onChanged();
                } else {
                    lastEventBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.Event last_event = 15;</code>
             */
            public Builder setLastEvent(
                    co.rira.kafka.model.OpennmsModelProtos.Event.Builder builderForValue) {
                if (lastEventBuilder_ == null) {
                    lastEvent_ = builderForValue.build();
                    onChanged();
                } else {
                    lastEventBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.Event last_event = 15;</code>
             */
            public Builder mergeLastEvent(co.rira.kafka.model.OpennmsModelProtos.Event value) {
                if (lastEventBuilder_ == null) {
                    if (lastEvent_ != null) {
                        lastEvent_ =
                                co.rira.kafka.model.OpennmsModelProtos.Event.newBuilder(lastEvent_).mergeFrom(value).buildPartial();
                    } else {
                        lastEvent_ = value;
                    }
                    onChanged();
                } else {
                    lastEventBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.Event last_event = 15;</code>
             */
            public Builder clearLastEvent() {
                if (lastEventBuilder_ == null) {
                    lastEvent_ = null;
                    onChanged();
                } else {
                    lastEvent_ = null;
                    lastEventBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.Event last_event = 15;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.Event.Builder getLastEventBuilder() {

                onChanged();
                return getLastEventFieldBuilder().getBuilder();
            }

            /**
             * <code>.Event last_event = 15;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.EventOrBuilder getLastEventOrBuilder() {
                if (lastEventBuilder_ != null) {
                    return lastEventBuilder_.getMessageOrBuilder();
                } else {
                    return lastEvent_ == null ?
                            co.rira.kafka.model.OpennmsModelProtos.Event.getDefaultInstance() : lastEvent_;
                }
            }

            /**
             * <code>.Event last_event = 15;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.Event, co.rira.kafka.model.OpennmsModelProtos.Event.Builder, co.rira.kafka.model.OpennmsModelProtos.EventOrBuilder>
            getLastEventFieldBuilder() {
                if (lastEventBuilder_ == null) {
                    lastEventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            co.rira.kafka.model.OpennmsModelProtos.Event, co.rira.kafka.model.OpennmsModelProtos.Event.Builder, co.rira.kafka.model.OpennmsModelProtos.EventOrBuilder>(
                            getLastEvent(),
                            getParentForChildren(),
                            isClean());
                    lastEvent_ = null;
                }
                return lastEventBuilder_;
            }

            /**
             * <code>uint64 last_event_time = 16;</code>
             *
             * @return The lastEventTime.
             */
            public long getLastEventTime() {
                return lastEventTime_;
            }

            /**
             * <code>uint64 last_event_time = 16;</code>
             *
             * @param value The lastEventTime to set.
             * @return This builder for chaining.
             */
            public Builder setLastEventTime(long value) {

                lastEventTime_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 last_event_time = 16;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLastEventTime() {

                lastEventTime_ = 0L;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 if_index = 17;</code>
             *
             * @return The ifIndex.
             */
            public int getIfIndex() {
                return ifIndex_;
            }

            /**
             * <code>uint32 if_index = 17;</code>
             *
             * @param value The ifIndex to set.
             * @return This builder for chaining.
             */
            public Builder setIfIndex(int value) {

                ifIndex_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 if_index = 17;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIfIndex() {

                ifIndex_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>string operator_instructions = 18;</code>
             *
             * @return The operatorInstructions.
             */
            public java.lang.String getOperatorInstructions() {
                java.lang.Object ref = operatorInstructions_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    operatorInstructions_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string operator_instructions = 18;</code>
             *
             * @param value The operatorInstructions to set.
             * @return This builder for chaining.
             */
            public Builder setOperatorInstructions(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                operatorInstructions_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string operator_instructions = 18;</code>
             *
             * @return The bytes for operatorInstructions.
             */
            public com.google.protobuf.ByteString
            getOperatorInstructionsBytes() {
                java.lang.Object ref = operatorInstructions_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    operatorInstructions_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string operator_instructions = 18;</code>
             *
             * @param value The bytes for operatorInstructions to set.
             * @return This builder for chaining.
             */
            public Builder setOperatorInstructionsBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                operatorInstructions_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string operator_instructions = 18;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearOperatorInstructions() {

                operatorInstructions_ = getDefaultInstance().getOperatorInstructions();
                onChanged();
                return this;
            }

            /**
             * <code>string clear_key = 19;</code>
             *
             * @return The clearKey.
             */
            public java.lang.String getClearKey() {
                java.lang.Object ref = clearKey_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    clearKey_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string clear_key = 19;</code>
             *
             * @param value The clearKey to set.
             * @return This builder for chaining.
             */
            public Builder setClearKey(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                clearKey_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string clear_key = 19;</code>
             *
             * @return The bytes for clearKey.
             */
            public com.google.protobuf.ByteString
            getClearKeyBytes() {
                java.lang.Object ref = clearKey_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    clearKey_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string clear_key = 19;</code>
             *
             * @param value The bytes for clearKey to set.
             * @return This builder for chaining.
             */
            public Builder setClearKeyBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                clearKey_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string clear_key = 19;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearClearKey() {

                clearKey_ = getDefaultInstance().getClearKey();
                onChanged();
                return this;
            }

            /**
             * <code>string managed_object_instance = 20;</code>
             *
             * @return The managedObjectInstance.
             */
            public java.lang.String getManagedObjectInstance() {
                java.lang.Object ref = managedObjectInstance_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    managedObjectInstance_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string managed_object_instance = 20;</code>
             *
             * @param value The managedObjectInstance to set.
             * @return This builder for chaining.
             */
            public Builder setManagedObjectInstance(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                managedObjectInstance_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string managed_object_instance = 20;</code>
             *
             * @return The bytes for managedObjectInstance.
             */
            public com.google.protobuf.ByteString
            getManagedObjectInstanceBytes() {
                java.lang.Object ref = managedObjectInstance_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    managedObjectInstance_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string managed_object_instance = 20;</code>
             *
             * @param value The bytes for managedObjectInstance to set.
             * @return This builder for chaining.
             */
            public Builder setManagedObjectInstanceBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                managedObjectInstance_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string managed_object_instance = 20;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearManagedObjectInstance() {

                managedObjectInstance_ = getDefaultInstance().getManagedObjectInstance();
                onChanged();
                return this;
            }

            /**
             * <code>string managed_object_type = 21;</code>
             *
             * @return The managedObjectType.
             */
            public java.lang.String getManagedObjectType() {
                java.lang.Object ref = managedObjectType_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    managedObjectType_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string managed_object_type = 21;</code>
             *
             * @param value The managedObjectType to set.
             * @return This builder for chaining.
             */
            public Builder setManagedObjectType(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                managedObjectType_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string managed_object_type = 21;</code>
             *
             * @return The bytes for managedObjectType.
             */
            public com.google.protobuf.ByteString
            getManagedObjectTypeBytes() {
                java.lang.Object ref = managedObjectType_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    managedObjectType_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string managed_object_type = 21;</code>
             *
             * @param value The bytes for managedObjectType to set.
             * @return This builder for chaining.
             */
            public Builder setManagedObjectTypeBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                managedObjectType_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string managed_object_type = 21;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearManagedObjectType() {

                managedObjectType_ = getDefaultInstance().getManagedObjectType();
                onChanged();
                return this;
            }

            private void ensureRelatedAlarmIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    relatedAlarm_ = new java.util.ArrayList<co.rira.kafka.model.OpennmsModelProtos.Alarm>(relatedAlarm_);
                    bitField0_ |= 0x00000001;
                }
            }

            /**
             * <code>repeated .Alarm relatedAlarm = 22;</code>
             */
            public java.util.List<co.rira.kafka.model.OpennmsModelProtos.Alarm> getRelatedAlarmList() {
                if (relatedAlarmBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(relatedAlarm_);
                } else {
                    return relatedAlarmBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .Alarm relatedAlarm = 22;</code>
             */
            public int getRelatedAlarmCount() {
                if (relatedAlarmBuilder_ == null) {
                    return relatedAlarm_.size();
                } else {
                    return relatedAlarmBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .Alarm relatedAlarm = 22;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.Alarm getRelatedAlarm(int index) {
                if (relatedAlarmBuilder_ == null) {
                    return relatedAlarm_.get(index);
                } else {
                    return relatedAlarmBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .Alarm relatedAlarm = 22;</code>
             */
            public Builder setRelatedAlarm(
                    int index, co.rira.kafka.model.OpennmsModelProtos.Alarm value) {
                if (relatedAlarmBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureRelatedAlarmIsMutable();
                    relatedAlarm_.set(index, value);
                    onChanged();
                } else {
                    relatedAlarmBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .Alarm relatedAlarm = 22;</code>
             */
            public Builder setRelatedAlarm(
                    int index, co.rira.kafka.model.OpennmsModelProtos.Alarm.Builder builderForValue) {
                if (relatedAlarmBuilder_ == null) {
                    ensureRelatedAlarmIsMutable();
                    relatedAlarm_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    relatedAlarmBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .Alarm relatedAlarm = 22;</code>
             */
            public Builder addRelatedAlarm(co.rira.kafka.model.OpennmsModelProtos.Alarm value) {
                if (relatedAlarmBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureRelatedAlarmIsMutable();
                    relatedAlarm_.add(value);
                    onChanged();
                } else {
                    relatedAlarmBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .Alarm relatedAlarm = 22;</code>
             */
            public Builder addRelatedAlarm(
                    int index, co.rira.kafka.model.OpennmsModelProtos.Alarm value) {
                if (relatedAlarmBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureRelatedAlarmIsMutable();
                    relatedAlarm_.add(index, value);
                    onChanged();
                } else {
                    relatedAlarmBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .Alarm relatedAlarm = 22;</code>
             */
            public Builder addRelatedAlarm(
                    co.rira.kafka.model.OpennmsModelProtos.Alarm.Builder builderForValue) {
                if (relatedAlarmBuilder_ == null) {
                    ensureRelatedAlarmIsMutable();
                    relatedAlarm_.add(builderForValue.build());
                    onChanged();
                } else {
                    relatedAlarmBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .Alarm relatedAlarm = 22;</code>
             */
            public Builder addRelatedAlarm(
                    int index, co.rira.kafka.model.OpennmsModelProtos.Alarm.Builder builderForValue) {
                if (relatedAlarmBuilder_ == null) {
                    ensureRelatedAlarmIsMutable();
                    relatedAlarm_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    relatedAlarmBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .Alarm relatedAlarm = 22;</code>
             */
            public Builder addAllRelatedAlarm(
                    java.lang.Iterable<? extends co.rira.kafka.model.OpennmsModelProtos.Alarm> values) {
                if (relatedAlarmBuilder_ == null) {
                    ensureRelatedAlarmIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, relatedAlarm_);
                    onChanged();
                } else {
                    relatedAlarmBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .Alarm relatedAlarm = 22;</code>
             */
            public Builder clearRelatedAlarm() {
                if (relatedAlarmBuilder_ == null) {
                    relatedAlarm_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    relatedAlarmBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .Alarm relatedAlarm = 22;</code>
             */
            public Builder removeRelatedAlarm(int index) {
                if (relatedAlarmBuilder_ == null) {
                    ensureRelatedAlarmIsMutable();
                    relatedAlarm_.remove(index);
                    onChanged();
                } else {
                    relatedAlarmBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .Alarm relatedAlarm = 22;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.Alarm.Builder getRelatedAlarmBuilder(
                    int index) {
                return getRelatedAlarmFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .Alarm relatedAlarm = 22;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.AlarmOrBuilder getRelatedAlarmOrBuilder(
                    int index) {
                if (relatedAlarmBuilder_ == null) {
                    return relatedAlarm_.get(index);
                } else {
                    return relatedAlarmBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .Alarm relatedAlarm = 22;</code>
             */
            public java.util.List<? extends co.rira.kafka.model.OpennmsModelProtos.AlarmOrBuilder>
            getRelatedAlarmOrBuilderList() {
                if (relatedAlarmBuilder_ != null) {
                    return relatedAlarmBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(relatedAlarm_);
                }
            }

            /**
             * <code>repeated .Alarm relatedAlarm = 22;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.Alarm.Builder addRelatedAlarmBuilder() {
                return getRelatedAlarmFieldBuilder().addBuilder(
                        co.rira.kafka.model.OpennmsModelProtos.Alarm.getDefaultInstance());
            }

            /**
             * <code>repeated .Alarm relatedAlarm = 22;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.Alarm.Builder addRelatedAlarmBuilder(
                    int index) {
                return getRelatedAlarmFieldBuilder().addBuilder(
                        index, co.rira.kafka.model.OpennmsModelProtos.Alarm.getDefaultInstance());
            }

            /**
             * <code>repeated .Alarm relatedAlarm = 22;</code>
             */
            public java.util.List<co.rira.kafka.model.OpennmsModelProtos.Alarm.Builder>
            getRelatedAlarmBuilderList() {
                return getRelatedAlarmFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.Alarm, co.rira.kafka.model.OpennmsModelProtos.Alarm.Builder, co.rira.kafka.model.OpennmsModelProtos.AlarmOrBuilder>
            getRelatedAlarmFieldBuilder() {
                if (relatedAlarmBuilder_ == null) {
                    relatedAlarmBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            co.rira.kafka.model.OpennmsModelProtos.Alarm, co.rira.kafka.model.OpennmsModelProtos.Alarm.Builder, co.rira.kafka.model.OpennmsModelProtos.AlarmOrBuilder>(
                            relatedAlarm_,
                            ((bitField0_ & 0x00000001) != 0),
                            getParentForChildren(),
                            isClean());
                    relatedAlarm_ = null;
                }
                return relatedAlarmBuilder_;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:Alarm)
        }

    }

    /**
     * Protobuf type {@code AlarmFeedback}
     */
    public static final class AlarmFeedback extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:AlarmFeedback)
            AlarmFeedbackOrBuilder {
        public static final int SITUATION_KEY_FIELD_NUMBER = 1;
        public static final int SITUATION_FINGERPRINT_FIELD_NUMBER = 2;
        public static final int ALARM_KEY_FIELD_NUMBER = 3;
        public static final int FEEDBACK_TYPE_FIELD_NUMBER = 4;
        public static final int REASON_FIELD_NUMBER = 5;
        public static final int USER_FIELD_NUMBER = 6;
        public static final int TIMESTAMP_FIELD_NUMBER = 7;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:AlarmFeedback)
        private static final co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<AlarmFeedback>
                PARSER = new com.google.protobuf.AbstractParser<AlarmFeedback>() {
            @java.lang.Override
            public AlarmFeedback parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new AlarmFeedback(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback();
        }

        private volatile java.lang.Object situationKey_;
        private volatile java.lang.Object situationFingerprint_;
        private volatile java.lang.Object alarmKey_;
        private int feedbackType_;
        private volatile java.lang.Object reason_;
        private volatile java.lang.Object user_;
        private long timestamp_;
        private byte memoizedIsInitialized = -1;

        // Use AlarmFeedback.newBuilder() to construct.
        private AlarmFeedback(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private AlarmFeedback() {
            situationKey_ = "";
            situationFingerprint_ = "";
            alarmKey_ = "";
            feedbackType_ = 0;
            reason_ = "";
            user_ = "";
        }

        private AlarmFeedback(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            situationKey_ = s;
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            situationFingerprint_ = s;
                            break;
                        }
                        case 26: {
                            java.lang.String s = input.readStringRequireUtf8();

                            alarmKey_ = s;
                            break;
                        }
                        case 32: {
                            int rawValue = input.readEnum();

                            feedbackType_ = rawValue;
                            break;
                        }
                        case 42: {
                            java.lang.String s = input.readStringRequireUtf8();

                            reason_ = s;
                            break;
                        }
                        case 50: {
                            java.lang.String s = input.readStringRequireUtf8();

                            user_ = s;
                            break;
                        }
                        case 56: {

                            timestamp_ = input.readUInt64();
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_AlarmFeedback_descriptor;
        }

        public static co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<AlarmFeedback> parser() {
            return PARSER;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new AlarmFeedback();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_AlarmFeedback_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.class, co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.Builder.class);
        }

        /**
         * <code>string situation_key = 1;</code>
         *
         * @return The situationKey.
         */
        public java.lang.String getSituationKey() {
            java.lang.Object ref = situationKey_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                situationKey_ = s;
                return s;
            }
        }

        /**
         * <code>string situation_key = 1;</code>
         *
         * @return The bytes for situationKey.
         */
        public com.google.protobuf.ByteString
        getSituationKeyBytes() {
            java.lang.Object ref = situationKey_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                situationKey_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string situation_fingerprint = 2;</code>
         *
         * @return The situationFingerprint.
         */
        public java.lang.String getSituationFingerprint() {
            java.lang.Object ref = situationFingerprint_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                situationFingerprint_ = s;
                return s;
            }
        }

        /**
         * <code>string situation_fingerprint = 2;</code>
         *
         * @return The bytes for situationFingerprint.
         */
        public com.google.protobuf.ByteString
        getSituationFingerprintBytes() {
            java.lang.Object ref = situationFingerprint_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                situationFingerprint_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string alarm_key = 3;</code>
         *
         * @return The alarmKey.
         */
        public java.lang.String getAlarmKey() {
            java.lang.Object ref = alarmKey_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                alarmKey_ = s;
                return s;
            }
        }

        /**
         * <code>string alarm_key = 3;</code>
         *
         * @return The bytes for alarmKey.
         */
        public com.google.protobuf.ByteString
        getAlarmKeyBytes() {
            java.lang.Object ref = alarmKey_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                alarmKey_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>.AlarmFeedback.FeedbackType feedback_type = 4;</code>
         *
         * @return The enum numeric value on the wire for feedbackType.
         */
        public int getFeedbackTypeValue() {
            return feedbackType_;
        }

        /**
         * <code>.AlarmFeedback.FeedbackType feedback_type = 4;</code>
         *
         * @return The feedbackType.
         */
        public co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.FeedbackType getFeedbackType() {
            @SuppressWarnings("deprecation")
            co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.FeedbackType result = co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.FeedbackType.valueOf(feedbackType_);
            return result == null ? co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.FeedbackType.UNRECOGNIZED : result;
        }

        /**
         * <code>string reason = 5;</code>
         *
         * @return The reason.
         */
        public java.lang.String getReason() {
            java.lang.Object ref = reason_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                reason_ = s;
                return s;
            }
        }

        /**
         * <code>string reason = 5;</code>
         *
         * @return The bytes for reason.
         */
        public com.google.protobuf.ByteString
        getReasonBytes() {
            java.lang.Object ref = reason_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                reason_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string user = 6;</code>
         *
         * @return The user.
         */
        public java.lang.String getUser() {
            java.lang.Object ref = user_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                user_ = s;
                return s;
            }
        }

        /**
         * <code>string user = 6;</code>
         *
         * @return The bytes for user.
         */
        public com.google.protobuf.ByteString
        getUserBytes() {
            java.lang.Object ref = user_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                user_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>uint64 timestamp = 7;</code>
         *
         * @return The timestamp.
         */
        public long getTimestamp() {
            return timestamp_;
        }

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getSituationKeyBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, situationKey_);
            }
            if (!getSituationFingerprintBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, situationFingerprint_);
            }
            if (!getAlarmKeyBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, alarmKey_);
            }
            if (feedbackType_ != co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.FeedbackType.FALSE_POSITIVE.getNumber()) {
                output.writeEnum(4, feedbackType_);
            }
            if (!getReasonBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 5, reason_);
            }
            if (!getUserBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 6, user_);
            }
            if (timestamp_ != 0L) {
                output.writeUInt64(7, timestamp_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getSituationKeyBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, situationKey_);
            }
            if (!getSituationFingerprintBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, situationFingerprint_);
            }
            if (!getAlarmKeyBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, alarmKey_);
            }
            if (feedbackType_ != co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.FeedbackType.FALSE_POSITIVE.getNumber()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(4, feedbackType_);
            }
            if (!getReasonBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, reason_);
            }
            if (!getUserBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, user_);
            }
            if (timestamp_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(7, timestamp_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback)) {
                return super.equals(obj);
            }
            co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback other = (co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback) obj;

            if (!getSituationKey()
                    .equals(other.getSituationKey())) return false;
            if (!getSituationFingerprint()
                    .equals(other.getSituationFingerprint())) return false;
            if (!getAlarmKey()
                    .equals(other.getAlarmKey())) return false;
            if (feedbackType_ != other.feedbackType_) return false;
            if (!getReason()
                    .equals(other.getReason())) return false;
            if (!getUser()
                    .equals(other.getUser())) return false;
            if (getTimestamp()
                    != other.getTimestamp()) return false;
            return unknownFields.equals(other.unknownFields);
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + SITUATION_KEY_FIELD_NUMBER;
            hash = (53 * hash) + getSituationKey().hashCode();
            hash = (37 * hash) + SITUATION_FINGERPRINT_FIELD_NUMBER;
            hash = (53 * hash) + getSituationFingerprint().hashCode();
            hash = (37 * hash) + ALARM_KEY_FIELD_NUMBER;
            hash = (53 * hash) + getAlarmKey().hashCode();
            hash = (37 * hash) + FEEDBACK_TYPE_FIELD_NUMBER;
            hash = (53 * hash) + feedbackType_;
            hash = (37 * hash) + REASON_FIELD_NUMBER;
            hash = (53 * hash) + getReason().hashCode();
            hash = (37 * hash) + USER_FIELD_NUMBER;
            hash = (53 * hash) + getUser().hashCode();
            hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getTimestamp());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<AlarmFeedback> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf enum {@code AlarmFeedback.FeedbackType}
         */
        public enum FeedbackType
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>FALSE_POSITIVE = 0;</code>
             */
            FALSE_POSITIVE(0),
            /**
             * <code>FALSE_NEGATIVE = 1;</code>
             */
            FALSE_NEGATIVE(1),
            /**
             * <code>CORRECT = 2;</code>
             */
            CORRECT(2),
            /**
             * <code>UNKNOWN = 3;</code>
             */
            UNKNOWN(3),
            UNRECOGNIZED(-1),
            ;

            /**
             * <code>FALSE_POSITIVE = 0;</code>
             */
            public static final int FALSE_POSITIVE_VALUE = 0;
            /**
             * <code>FALSE_NEGATIVE = 1;</code>
             */
            public static final int FALSE_NEGATIVE_VALUE = 1;
            /**
             * <code>CORRECT = 2;</code>
             */
            public static final int CORRECT_VALUE = 2;
            /**
             * <code>UNKNOWN = 3;</code>
             */
            public static final int UNKNOWN_VALUE = 3;
            private static final com.google.protobuf.Internal.EnumLiteMap<
                    FeedbackType> internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<FeedbackType>() {
                        public FeedbackType findValueByNumber(int number) {
                            return FeedbackType.forNumber(number);
                        }
                    };
            private static final FeedbackType[] VALUES = values();
            private final int value;

            FeedbackType(int value) {
                this.value = value;
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @java.lang.Deprecated
            public static FeedbackType valueOf(int value) {
                return forNumber(value);
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             */
            public static FeedbackType forNumber(int value) {
                switch (value) {
                    case 0:
                        return FALSE_POSITIVE;
                    case 1:
                        return FALSE_NEGATIVE;
                    case 2:
                        return CORRECT;
                    case 3:
                        return UNKNOWN;
                    default:
                        return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<FeedbackType>
            internalGetValueMap() {
                return internalValueMap;
            }

            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.getDescriptor().getEnumTypes().get(0);
            }

            public static FeedbackType valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[desc.getIndex()];
            }

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new java.lang.IllegalArgumentException(
                            "Can't get the number of an unknown enum value.");
                }
                return value;
            }

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }

            // @@protoc_insertion_point(enum_scope:AlarmFeedback.FeedbackType)
        }

        /**
         * Protobuf type {@code AlarmFeedback}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:AlarmFeedback)
                co.rira.kafka.model.OpennmsModelProtos.AlarmFeedbackOrBuilder {
            private java.lang.Object situationKey_ = "";
            private java.lang.Object situationFingerprint_ = "";
            private java.lang.Object alarmKey_ = "";
            private int feedbackType_ = 0;
            private java.lang.Object reason_ = "";
            private java.lang.Object user_ = "";
            private long timestamp_;

            // Construct using co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_AlarmFeedback_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_AlarmFeedback_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.class, co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                situationKey_ = "";

                situationFingerprint_ = "";

                alarmKey_ = "";

                feedbackType_ = 0;

                reason_ = "";

                user_ = "";

                timestamp_ = 0L;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_AlarmFeedback_descriptor;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback getDefaultInstanceForType() {
                return co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.getDefaultInstance();
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback build() {
                co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback buildPartial() {
                co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback result = new co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback(this);
                result.situationKey_ = situationKey_;
                result.situationFingerprint_ = situationFingerprint_;
                result.alarmKey_ = alarmKey_;
                result.feedbackType_ = feedbackType_;
                result.reason_ = reason_;
                result.user_ = user_;
                result.timestamp_ = timestamp_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback) {
                    return mergeFrom((co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback other) {
                if (other == co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.getDefaultInstance()) return this;
                if (!other.getSituationKey().isEmpty()) {
                    situationKey_ = other.situationKey_;
                    onChanged();
                }
                if (!other.getSituationFingerprint().isEmpty()) {
                    situationFingerprint_ = other.situationFingerprint_;
                    onChanged();
                }
                if (!other.getAlarmKey().isEmpty()) {
                    alarmKey_ = other.alarmKey_;
                    onChanged();
                }
                if (other.feedbackType_ != 0) {
                    setFeedbackTypeValue(other.getFeedbackTypeValue());
                }
                if (!other.getReason().isEmpty()) {
                    reason_ = other.reason_;
                    onChanged();
                }
                if (!other.getUser().isEmpty()) {
                    user_ = other.user_;
                    onChanged();
                }
                if (other.getTimestamp() != 0L) {
                    setTimestamp(other.getTimestamp());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>string situation_key = 1;</code>
             *
             * @return The situationKey.
             */
            public java.lang.String getSituationKey() {
                java.lang.Object ref = situationKey_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    situationKey_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string situation_key = 1;</code>
             *
             * @param value The situationKey to set.
             * @return This builder for chaining.
             */
            public Builder setSituationKey(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                situationKey_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string situation_key = 1;</code>
             *
             * @return The bytes for situationKey.
             */
            public com.google.protobuf.ByteString
            getSituationKeyBytes() {
                java.lang.Object ref = situationKey_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    situationKey_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string situation_key = 1;</code>
             *
             * @param value The bytes for situationKey to set.
             * @return This builder for chaining.
             */
            public Builder setSituationKeyBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                situationKey_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string situation_key = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSituationKey() {

                situationKey_ = getDefaultInstance().getSituationKey();
                onChanged();
                return this;
            }

            /**
             * <code>string situation_fingerprint = 2;</code>
             *
             * @return The situationFingerprint.
             */
            public java.lang.String getSituationFingerprint() {
                java.lang.Object ref = situationFingerprint_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    situationFingerprint_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string situation_fingerprint = 2;</code>
             *
             * @param value The situationFingerprint to set.
             * @return This builder for chaining.
             */
            public Builder setSituationFingerprint(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                situationFingerprint_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string situation_fingerprint = 2;</code>
             *
             * @return The bytes for situationFingerprint.
             */
            public com.google.protobuf.ByteString
            getSituationFingerprintBytes() {
                java.lang.Object ref = situationFingerprint_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    situationFingerprint_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string situation_fingerprint = 2;</code>
             *
             * @param value The bytes for situationFingerprint to set.
             * @return This builder for chaining.
             */
            public Builder setSituationFingerprintBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                situationFingerprint_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string situation_fingerprint = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSituationFingerprint() {

                situationFingerprint_ = getDefaultInstance().getSituationFingerprint();
                onChanged();
                return this;
            }

            /**
             * <code>string alarm_key = 3;</code>
             *
             * @return The alarmKey.
             */
            public java.lang.String getAlarmKey() {
                java.lang.Object ref = alarmKey_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    alarmKey_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string alarm_key = 3;</code>
             *
             * @param value The alarmKey to set.
             * @return This builder for chaining.
             */
            public Builder setAlarmKey(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                alarmKey_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string alarm_key = 3;</code>
             *
             * @return The bytes for alarmKey.
             */
            public com.google.protobuf.ByteString
            getAlarmKeyBytes() {
                java.lang.Object ref = alarmKey_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    alarmKey_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string alarm_key = 3;</code>
             *
             * @param value The bytes for alarmKey to set.
             * @return This builder for chaining.
             */
            public Builder setAlarmKeyBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                alarmKey_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string alarm_key = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAlarmKey() {

                alarmKey_ = getDefaultInstance().getAlarmKey();
                onChanged();
                return this;
            }

            /**
             * <code>.AlarmFeedback.FeedbackType feedback_type = 4;</code>
             *
             * @return The enum numeric value on the wire for feedbackType.
             */
            public int getFeedbackTypeValue() {
                return feedbackType_;
            }

            /**
             * <code>.AlarmFeedback.FeedbackType feedback_type = 4;</code>
             *
             * @param value The enum numeric value on the wire for feedbackType to set.
             * @return This builder for chaining.
             */
            public Builder setFeedbackTypeValue(int value) {
                feedbackType_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>.AlarmFeedback.FeedbackType feedback_type = 4;</code>
             *
             * @return The feedbackType.
             */
            public co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.FeedbackType getFeedbackType() {
                @SuppressWarnings("deprecation")
                co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.FeedbackType result = co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.FeedbackType.valueOf(feedbackType_);
                return result == null ? co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.FeedbackType.UNRECOGNIZED : result;
            }

            /**
             * <code>.AlarmFeedback.FeedbackType feedback_type = 4;</code>
             *
             * @param value The feedbackType to set.
             * @return This builder for chaining.
             */
            public Builder setFeedbackType(co.rira.kafka.model.OpennmsModelProtos.AlarmFeedback.FeedbackType value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                feedbackType_ = value.getNumber();
                onChanged();
                return this;
            }

            /**
             * <code>.AlarmFeedback.FeedbackType feedback_type = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearFeedbackType() {

                feedbackType_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>string reason = 5;</code>
             *
             * @return The reason.
             */
            public java.lang.String getReason() {
                java.lang.Object ref = reason_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    reason_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string reason = 5;</code>
             *
             * @param value The reason to set.
             * @return This builder for chaining.
             */
            public Builder setReason(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                reason_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string reason = 5;</code>
             *
             * @return The bytes for reason.
             */
            public com.google.protobuf.ByteString
            getReasonBytes() {
                java.lang.Object ref = reason_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    reason_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string reason = 5;</code>
             *
             * @param value The bytes for reason to set.
             * @return This builder for chaining.
             */
            public Builder setReasonBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                reason_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string reason = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearReason() {

                reason_ = getDefaultInstance().getReason();
                onChanged();
                return this;
            }

            /**
             * <code>string user = 6;</code>
             *
             * @return The user.
             */
            public java.lang.String getUser() {
                java.lang.Object ref = user_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    user_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string user = 6;</code>
             *
             * @param value The user to set.
             * @return This builder for chaining.
             */
            public Builder setUser(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                user_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string user = 6;</code>
             *
             * @return The bytes for user.
             */
            public com.google.protobuf.ByteString
            getUserBytes() {
                java.lang.Object ref = user_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    user_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string user = 6;</code>
             *
             * @param value The bytes for user to set.
             * @return This builder for chaining.
             */
            public Builder setUserBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                user_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string user = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearUser() {

                user_ = getDefaultInstance().getUser();
                onChanged();
                return this;
            }

            /**
             * <code>uint64 timestamp = 7;</code>
             *
             * @return The timestamp.
             */
            public long getTimestamp() {
                return timestamp_;
            }

            /**
             * <code>uint64 timestamp = 7;</code>
             *
             * @param value The timestamp to set.
             * @return This builder for chaining.
             */
            public Builder setTimestamp(long value) {

                timestamp_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 timestamp = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearTimestamp() {

                timestamp_ = 0L;
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:AlarmFeedback)
        }

    }

    /**
     * Protobuf type {@code IpInterface}
     */
    public static final class IpInterface extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:IpInterface)
            IpInterfaceOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int IP_ADDRESS_FIELD_NUMBER = 2;
        public static final int IF_INDEX_FIELD_NUMBER = 3;
        public static final int PRIMARY_TYPE_FIELD_NUMBER = 4;
        public static final int SERVICE_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:IpInterface)
        private static final co.rira.kafka.model.OpennmsModelProtos.IpInterface DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<IpInterface>
                PARSER = new com.google.protobuf.AbstractParser<IpInterface>() {
            @java.lang.Override
            public IpInterface parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new IpInterface(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new co.rira.kafka.model.OpennmsModelProtos.IpInterface();
        }

        private long id_;
        private volatile java.lang.Object ipAddress_;
        private int ifIndex_;
        private int primaryType_;
        private com.google.protobuf.LazyStringList service_;
        private byte memoizedIsInitialized = -1;

        // Use IpInterface.newBuilder() to construct.
        private IpInterface(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private IpInterface() {
            ipAddress_ = "";
            primaryType_ = 0;
            service_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        }

        private IpInterface(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8: {

                            id_ = input.readUInt64();
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            ipAddress_ = s;
                            break;
                        }
                        case 24: {

                            ifIndex_ = input.readUInt32();
                            break;
                        }
                        case 32: {
                            int rawValue = input.readEnum();

                            primaryType_ = rawValue;
                            break;
                        }
                        case 42: {
                            java.lang.String s = input.readStringRequireUtf8();
                            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                service_ = new com.google.protobuf.LazyStringArrayList();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            service_.add(s);
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    service_ = service_.getUnmodifiableView();
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_IpInterface_descriptor;
        }

        public static co.rira.kafka.model.OpennmsModelProtos.IpInterface parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.IpInterface parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.IpInterface parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.IpInterface parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.IpInterface parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.IpInterface parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.IpInterface parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.IpInterface parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.IpInterface parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.IpInterface parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.IpInterface parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.IpInterface parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(co.rira.kafka.model.OpennmsModelProtos.IpInterface prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.IpInterface getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<IpInterface> parser() {
            return PARSER;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new IpInterface();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_IpInterface_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            co.rira.kafka.model.OpennmsModelProtos.IpInterface.class, co.rira.kafka.model.OpennmsModelProtos.IpInterface.Builder.class);
        }

        /**
         * <code>uint64 id = 1;</code>
         *
         * @return The id.
         */
        public long getId() {
            return id_;
        }

        /**
         * <code>string ip_address = 2;</code>
         *
         * @return The ipAddress.
         */
        public java.lang.String getIpAddress() {
            java.lang.Object ref = ipAddress_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                ipAddress_ = s;
                return s;
            }
        }

        /**
         * <code>string ip_address = 2;</code>
         *
         * @return The bytes for ipAddress.
         */
        public com.google.protobuf.ByteString
        getIpAddressBytes() {
            java.lang.Object ref = ipAddress_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                ipAddress_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>uint32 if_index = 3;</code>
         *
         * @return The ifIndex.
         */
        public int getIfIndex() {
            return ifIndex_;
        }

        /**
         * <code>.IpInterface.PrimaryType primary_type = 4;</code>
         *
         * @return The enum numeric value on the wire for primaryType.
         */
        public int getPrimaryTypeValue() {
            return primaryType_;
        }

        /**
         * <code>.IpInterface.PrimaryType primary_type = 4;</code>
         *
         * @return The primaryType.
         */
        public co.rira.kafka.model.OpennmsModelProtos.IpInterface.PrimaryType getPrimaryType() {
            @SuppressWarnings("deprecation")
            co.rira.kafka.model.OpennmsModelProtos.IpInterface.PrimaryType result = co.rira.kafka.model.OpennmsModelProtos.IpInterface.PrimaryType.valueOf(primaryType_);
            return result == null ? co.rira.kafka.model.OpennmsModelProtos.IpInterface.PrimaryType.UNRECOGNIZED : result;
        }

        /**
         * <code>repeated string service = 5;</code>
         *
         * @return A list containing the service.
         */
        public com.google.protobuf.ProtocolStringList
        getServiceList() {
            return service_;
        }

        /**
         * <code>repeated string service = 5;</code>
         *
         * @return The count of service.
         */
        public int getServiceCount() {
            return service_.size();
        }

        /**
         * <code>repeated string service = 5;</code>
         *
         * @param index The index of the element to return.
         * @return The service at the given index.
         */
        public java.lang.String getService(int index) {
            return service_.get(index);
        }

        /**
         * <code>repeated string service = 5;</code>
         *
         * @param index The index of the value to return.
         * @return The bytes of the service at the given index.
         */
        public com.google.protobuf.ByteString
        getServiceBytes(int index) {
            return service_.getByteString(index);
        }

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (id_ != 0L) {
                output.writeUInt64(1, id_);
            }
            if (!getIpAddressBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ipAddress_);
            }
            if (ifIndex_ != 0) {
                output.writeUInt32(3, ifIndex_);
            }
            if (primaryType_ != co.rira.kafka.model.OpennmsModelProtos.IpInterface.PrimaryType.PRIMARY.getNumber()) {
                output.writeEnum(4, primaryType_);
            }
            for (int i = 0; i < service_.size(); i++) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 5, service_.getRaw(i));
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(1, id_);
            }
            if (!getIpAddressBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ipAddress_);
            }
            if (ifIndex_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(3, ifIndex_);
            }
            if (primaryType_ != co.rira.kafka.model.OpennmsModelProtos.IpInterface.PrimaryType.PRIMARY.getNumber()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(4, primaryType_);
            }
            {
                int dataSize = 0;
                for (int i = 0; i < service_.size(); i++) {
                    dataSize += computeStringSizeNoTag(service_.getRaw(i));
                }
                size += dataSize;
                size += 1 * getServiceList().size();
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof co.rira.kafka.model.OpennmsModelProtos.IpInterface)) {
                return super.equals(obj);
            }
            co.rira.kafka.model.OpennmsModelProtos.IpInterface other = (co.rira.kafka.model.OpennmsModelProtos.IpInterface) obj;

            if (getId()
                    != other.getId()) return false;
            if (!getIpAddress()
                    .equals(other.getIpAddress())) return false;
            if (getIfIndex()
                    != other.getIfIndex()) return false;
            if (primaryType_ != other.primaryType_) return false;
            if (!getServiceList()
                    .equals(other.getServiceList())) return false;
            return unknownFields.equals(other.unknownFields);
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getId());
            hash = (37 * hash) + IP_ADDRESS_FIELD_NUMBER;
            hash = (53 * hash) + getIpAddress().hashCode();
            hash = (37 * hash) + IF_INDEX_FIELD_NUMBER;
            hash = (53 * hash) + getIfIndex();
            hash = (37 * hash) + PRIMARY_TYPE_FIELD_NUMBER;
            hash = (53 * hash) + primaryType_;
            if (getServiceCount() > 0) {
                hash = (37 * hash) + SERVICE_FIELD_NUMBER;
                hash = (53 * hash) + getServiceList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<IpInterface> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public co.rira.kafka.model.OpennmsModelProtos.IpInterface getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf enum {@code IpInterface.PrimaryType}
         */
        public enum PrimaryType
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>PRIMARY = 0;</code>
             */
            PRIMARY(0),
            /**
             * <code>SECONDARY = 1;</code>
             */
            SECONDARY(1),
            /**
             * <code>NOT_ELIGIBLE = 2;</code>
             */
            NOT_ELIGIBLE(2),
            UNRECOGNIZED(-1),
            ;

            /**
             * <code>PRIMARY = 0;</code>
             */
            public static final int PRIMARY_VALUE = 0;
            /**
             * <code>SECONDARY = 1;</code>
             */
            public static final int SECONDARY_VALUE = 1;
            /**
             * <code>NOT_ELIGIBLE = 2;</code>
             */
            public static final int NOT_ELIGIBLE_VALUE = 2;
            private static final com.google.protobuf.Internal.EnumLiteMap<
                    PrimaryType> internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<PrimaryType>() {
                        public PrimaryType findValueByNumber(int number) {
                            return PrimaryType.forNumber(number);
                        }
                    };
            private static final PrimaryType[] VALUES = values();
            private final int value;

            PrimaryType(int value) {
                this.value = value;
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @java.lang.Deprecated
            public static PrimaryType valueOf(int value) {
                return forNumber(value);
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             */
            public static PrimaryType forNumber(int value) {
                switch (value) {
                    case 0:
                        return PRIMARY;
                    case 1:
                        return SECONDARY;
                    case 2:
                        return NOT_ELIGIBLE;
                    default:
                        return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<PrimaryType>
            internalGetValueMap() {
                return internalValueMap;
            }

            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return co.rira.kafka.model.OpennmsModelProtos.IpInterface.getDescriptor().getEnumTypes().get(0);
            }

            public static PrimaryType valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[desc.getIndex()];
            }

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new java.lang.IllegalArgumentException(
                            "Can't get the number of an unknown enum value.");
                }
                return value;
            }

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }

            // @@protoc_insertion_point(enum_scope:IpInterface.PrimaryType)
        }

        /**
         * Protobuf type {@code IpInterface}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:IpInterface)
                co.rira.kafka.model.OpennmsModelProtos.IpInterfaceOrBuilder {
            private int bitField0_;
            private long id_;
            private java.lang.Object ipAddress_ = "";
            private int ifIndex_;
            private int primaryType_ = 0;
            private com.google.protobuf.LazyStringList service_ = com.google.protobuf.LazyStringArrayList.EMPTY;

            // Construct using co.rira.kafka.model.OpennmsModelProtos.IpInterface.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_IpInterface_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_IpInterface_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                co.rira.kafka.model.OpennmsModelProtos.IpInterface.class, co.rira.kafka.model.OpennmsModelProtos.IpInterface.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                id_ = 0L;

                ipAddress_ = "";

                ifIndex_ = 0;

                primaryType_ = 0;

                service_ = com.google.protobuf.LazyStringArrayList.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_IpInterface_descriptor;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.IpInterface getDefaultInstanceForType() {
                return co.rira.kafka.model.OpennmsModelProtos.IpInterface.getDefaultInstance();
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.IpInterface build() {
                co.rira.kafka.model.OpennmsModelProtos.IpInterface result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.IpInterface buildPartial() {
                co.rira.kafka.model.OpennmsModelProtos.IpInterface result = new co.rira.kafka.model.OpennmsModelProtos.IpInterface(this);
                int from_bitField0_ = bitField0_;
                result.id_ = id_;
                result.ipAddress_ = ipAddress_;
                result.ifIndex_ = ifIndex_;
                result.primaryType_ = primaryType_;
                if (((bitField0_ & 0x00000001) != 0)) {
                    service_ = service_.getUnmodifiableView();
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.service_ = service_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof co.rira.kafka.model.OpennmsModelProtos.IpInterface) {
                    return mergeFrom((co.rira.kafka.model.OpennmsModelProtos.IpInterface) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(co.rira.kafka.model.OpennmsModelProtos.IpInterface other) {
                if (other == co.rira.kafka.model.OpennmsModelProtos.IpInterface.getDefaultInstance()) return this;
                if (other.getId() != 0L) {
                    setId(other.getId());
                }
                if (!other.getIpAddress().isEmpty()) {
                    ipAddress_ = other.ipAddress_;
                    onChanged();
                }
                if (other.getIfIndex() != 0) {
                    setIfIndex(other.getIfIndex());
                }
                if (other.primaryType_ != 0) {
                    setPrimaryTypeValue(other.getPrimaryTypeValue());
                }
                if (!other.service_.isEmpty()) {
                    if (service_.isEmpty()) {
                        service_ = other.service_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureServiceIsMutable();
                        service_.addAll(other.service_);
                    }
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                co.rira.kafka.model.OpennmsModelProtos.IpInterface parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (co.rira.kafka.model.OpennmsModelProtos.IpInterface) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>uint64 id = 1;</code>
             *
             * @return The id.
             */
            public long getId() {
                return id_;
            }

            /**
             * <code>uint64 id = 1;</code>
             *
             * @param value The id to set.
             * @return This builder for chaining.
             */
            public Builder setId(long value) {

                id_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 id = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearId() {

                id_ = 0L;
                onChanged();
                return this;
            }

            /**
             * <code>string ip_address = 2;</code>
             *
             * @return The ipAddress.
             */
            public java.lang.String getIpAddress() {
                java.lang.Object ref = ipAddress_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    ipAddress_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string ip_address = 2;</code>
             *
             * @param value The ipAddress to set.
             * @return This builder for chaining.
             */
            public Builder setIpAddress(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                ipAddress_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string ip_address = 2;</code>
             *
             * @return The bytes for ipAddress.
             */
            public com.google.protobuf.ByteString
            getIpAddressBytes() {
                java.lang.Object ref = ipAddress_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    ipAddress_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string ip_address = 2;</code>
             *
             * @param value The bytes for ipAddress to set.
             * @return This builder for chaining.
             */
            public Builder setIpAddressBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                ipAddress_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string ip_address = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIpAddress() {

                ipAddress_ = getDefaultInstance().getIpAddress();
                onChanged();
                return this;
            }

            /**
             * <code>uint32 if_index = 3;</code>
             *
             * @return The ifIndex.
             */
            public int getIfIndex() {
                return ifIndex_;
            }

            /**
             * <code>uint32 if_index = 3;</code>
             *
             * @param value The ifIndex to set.
             * @return This builder for chaining.
             */
            public Builder setIfIndex(int value) {

                ifIndex_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 if_index = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIfIndex() {

                ifIndex_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>.IpInterface.PrimaryType primary_type = 4;</code>
             *
             * @return The enum numeric value on the wire for primaryType.
             */
            public int getPrimaryTypeValue() {
                return primaryType_;
            }

            /**
             * <code>.IpInterface.PrimaryType primary_type = 4;</code>
             *
             * @param value The enum numeric value on the wire for primaryType to set.
             * @return This builder for chaining.
             */
            public Builder setPrimaryTypeValue(int value) {
                primaryType_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>.IpInterface.PrimaryType primary_type = 4;</code>
             *
             * @return The primaryType.
             */
            public co.rira.kafka.model.OpennmsModelProtos.IpInterface.PrimaryType getPrimaryType() {
                @SuppressWarnings("deprecation")
                co.rira.kafka.model.OpennmsModelProtos.IpInterface.PrimaryType result = co.rira.kafka.model.OpennmsModelProtos.IpInterface.PrimaryType.valueOf(primaryType_);
                return result == null ? co.rira.kafka.model.OpennmsModelProtos.IpInterface.PrimaryType.UNRECOGNIZED : result;
            }

            /**
             * <code>.IpInterface.PrimaryType primary_type = 4;</code>
             *
             * @param value The primaryType to set.
             * @return This builder for chaining.
             */
            public Builder setPrimaryType(co.rira.kafka.model.OpennmsModelProtos.IpInterface.PrimaryType value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                primaryType_ = value.getNumber();
                onChanged();
                return this;
            }

            /**
             * <code>.IpInterface.PrimaryType primary_type = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearPrimaryType() {

                primaryType_ = 0;
                onChanged();
                return this;
            }

            private void ensureServiceIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    service_ = new com.google.protobuf.LazyStringArrayList(service_);
                    bitField0_ |= 0x00000001;
                }
            }

            /**
             * <code>repeated string service = 5;</code>
             *
             * @return A list containing the service.
             */
            public com.google.protobuf.ProtocolStringList
            getServiceList() {
                return service_.getUnmodifiableView();
            }

            /**
             * <code>repeated string service = 5;</code>
             *
             * @return The count of service.
             */
            public int getServiceCount() {
                return service_.size();
            }

            /**
             * <code>repeated string service = 5;</code>
             *
             * @param index The index of the element to return.
             * @return The service at the given index.
             */
            public java.lang.String getService(int index) {
                return service_.get(index);
            }

            /**
             * <code>repeated string service = 5;</code>
             *
             * @param index The index of the value to return.
             * @return The bytes of the service at the given index.
             */
            public com.google.protobuf.ByteString
            getServiceBytes(int index) {
                return service_.getByteString(index);
            }

            /**
             * <code>repeated string service = 5;</code>
             *
             * @param index The index to set the value at.
             * @param value The service to set.
             * @return This builder for chaining.
             */
            public Builder setService(
                    int index, java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureServiceIsMutable();
                service_.set(index, value);
                onChanged();
                return this;
            }

            /**
             * <code>repeated string service = 5;</code>
             *
             * @param value The service to add.
             * @return This builder for chaining.
             */
            public Builder addService(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureServiceIsMutable();
                service_.add(value);
                onChanged();
                return this;
            }

            /**
             * <code>repeated string service = 5;</code>
             *
             * @param values The service to add.
             * @return This builder for chaining.
             */
            public Builder addAllService(
                    java.lang.Iterable<java.lang.String> values) {
                ensureServiceIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(
                        values, service_);
                onChanged();
                return this;
            }

            /**
             * <code>repeated string service = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearService() {
                service_ = com.google.protobuf.LazyStringArrayList.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
                return this;
            }

            /**
             * <code>repeated string service = 5;</code>
             *
             * @param value The bytes of the service to add.
             * @return This builder for chaining.
             */
            public Builder addServiceBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);
                ensureServiceIsMutable();
                service_.add(value);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:IpInterface)
        }

    }

    /**
     * Protobuf type {@code SnmpInterface}
     */
    public static final class SnmpInterface extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:SnmpInterface)
            SnmpInterfaceOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int IF_INDEX_FIELD_NUMBER = 2;
        public static final int IF_DESCR_FIELD_NUMBER = 3;
        public static final int IF_TYPE_FIELD_NUMBER = 4;
        public static final int IF_NAME_FIELD_NUMBER = 5;
        public static final int IF_SPEED_FIELD_NUMBER = 6;
        public static final int IF_PHYS_ADDRESS_FIELD_NUMBER = 7;
        public static final int IF_ADMIN_STATUS_FIELD_NUMBER = 8;
        public static final int IF_OPER_STATUS_FIELD_NUMBER = 9;
        public static final int IF_ALIAS_FIELD_NUMBER = 10;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:SnmpInterface)
        private static final co.rira.kafka.model.OpennmsModelProtos.SnmpInterface DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<SnmpInterface>
                PARSER = new com.google.protobuf.AbstractParser<SnmpInterface>() {
            @java.lang.Override
            public SnmpInterface parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new SnmpInterface(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new co.rira.kafka.model.OpennmsModelProtos.SnmpInterface();
        }

        private long id_;
        private int ifIndex_;
        private volatile java.lang.Object ifDescr_;
        private int ifType_;
        private volatile java.lang.Object ifName_;
        private long ifSpeed_;
        private volatile java.lang.Object ifPhysAddress_;
        private int ifAdminStatus_;
        private int ifOperStatus_;
        private volatile java.lang.Object ifAlias_;
        private byte memoizedIsInitialized = -1;

        // Use SnmpInterface.newBuilder() to construct.
        private SnmpInterface(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private SnmpInterface() {
            ifDescr_ = "";
            ifName_ = "";
            ifPhysAddress_ = "";
            ifAlias_ = "";
        }

        private SnmpInterface(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8: {

                            id_ = input.readUInt64();
                            break;
                        }
                        case 16: {

                            ifIndex_ = input.readUInt32();
                            break;
                        }
                        case 26: {
                            java.lang.String s = input.readStringRequireUtf8();

                            ifDescr_ = s;
                            break;
                        }
                        case 32: {

                            ifType_ = input.readUInt32();
                            break;
                        }
                        case 42: {
                            java.lang.String s = input.readStringRequireUtf8();

                            ifName_ = s;
                            break;
                        }
                        case 48: {

                            ifSpeed_ = input.readUInt64();
                            break;
                        }
                        case 58: {
                            java.lang.String s = input.readStringRequireUtf8();

                            ifPhysAddress_ = s;
                            break;
                        }
                        case 64: {

                            ifAdminStatus_ = input.readUInt32();
                            break;
                        }
                        case 72: {

                            ifOperStatus_ = input.readUInt32();
                            break;
                        }
                        case 82: {
                            java.lang.String s = input.readStringRequireUtf8();

                            ifAlias_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_SnmpInterface_descriptor;
        }

        public static co.rira.kafka.model.OpennmsModelProtos.SnmpInterface parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.SnmpInterface parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.SnmpInterface parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.SnmpInterface parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.SnmpInterface parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.SnmpInterface parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.SnmpInterface parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.SnmpInterface parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.SnmpInterface parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.SnmpInterface parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.SnmpInterface parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.SnmpInterface parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(co.rira.kafka.model.OpennmsModelProtos.SnmpInterface prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.SnmpInterface getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<SnmpInterface> parser() {
            return PARSER;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new SnmpInterface();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_SnmpInterface_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.class, co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.Builder.class);
        }

        /**
         * <code>uint64 id = 1;</code>
         *
         * @return The id.
         */
        public long getId() {
            return id_;
        }

        /**
         * <code>uint32 if_index = 2;</code>
         *
         * @return The ifIndex.
         */
        public int getIfIndex() {
            return ifIndex_;
        }

        /**
         * <code>string if_descr = 3;</code>
         *
         * @return The ifDescr.
         */
        public java.lang.String getIfDescr() {
            java.lang.Object ref = ifDescr_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                ifDescr_ = s;
                return s;
            }
        }

        /**
         * <code>string if_descr = 3;</code>
         *
         * @return The bytes for ifDescr.
         */
        public com.google.protobuf.ByteString
        getIfDescrBytes() {
            java.lang.Object ref = ifDescr_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                ifDescr_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>uint32 if_type = 4;</code>
         *
         * @return The ifType.
         */
        public int getIfType() {
            return ifType_;
        }

        /**
         * <code>string if_name = 5;</code>
         *
         * @return The ifName.
         */
        public java.lang.String getIfName() {
            java.lang.Object ref = ifName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                ifName_ = s;
                return s;
            }
        }

        /**
         * <code>string if_name = 5;</code>
         *
         * @return The bytes for ifName.
         */
        public com.google.protobuf.ByteString
        getIfNameBytes() {
            java.lang.Object ref = ifName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                ifName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>uint64 if_speed = 6;</code>
         *
         * @return The ifSpeed.
         */
        public long getIfSpeed() {
            return ifSpeed_;
        }

        /**
         * <code>string if_phys_address = 7;</code>
         *
         * @return The ifPhysAddress.
         */
        public java.lang.String getIfPhysAddress() {
            java.lang.Object ref = ifPhysAddress_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                ifPhysAddress_ = s;
                return s;
            }
        }

        /**
         * <code>string if_phys_address = 7;</code>
         *
         * @return The bytes for ifPhysAddress.
         */
        public com.google.protobuf.ByteString
        getIfPhysAddressBytes() {
            java.lang.Object ref = ifPhysAddress_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                ifPhysAddress_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>uint32 if_admin_status = 8;</code>
         *
         * @return The ifAdminStatus.
         */
        public int getIfAdminStatus() {
            return ifAdminStatus_;
        }

        /**
         * <code>uint32 if_oper_status = 9;</code>
         *
         * @return The ifOperStatus.
         */
        public int getIfOperStatus() {
            return ifOperStatus_;
        }

        /**
         * <code>string if_alias = 10;</code>
         *
         * @return The ifAlias.
         */
        public java.lang.String getIfAlias() {
            java.lang.Object ref = ifAlias_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                ifAlias_ = s;
                return s;
            }
        }

        /**
         * <code>string if_alias = 10;</code>
         *
         * @return The bytes for ifAlias.
         */
        public com.google.protobuf.ByteString
        getIfAliasBytes() {
            java.lang.Object ref = ifAlias_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                ifAlias_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (id_ != 0L) {
                output.writeUInt64(1, id_);
            }
            if (ifIndex_ != 0) {
                output.writeUInt32(2, ifIndex_);
            }
            if (!getIfDescrBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ifDescr_);
            }
            if (ifType_ != 0) {
                output.writeUInt32(4, ifType_);
            }
            if (!getIfNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 5, ifName_);
            }
            if (ifSpeed_ != 0L) {
                output.writeUInt64(6, ifSpeed_);
            }
            if (!getIfPhysAddressBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 7, ifPhysAddress_);
            }
            if (ifAdminStatus_ != 0) {
                output.writeUInt32(8, ifAdminStatus_);
            }
            if (ifOperStatus_ != 0) {
                output.writeUInt32(9, ifOperStatus_);
            }
            if (!getIfAliasBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 10, ifAlias_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(1, id_);
            }
            if (ifIndex_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(2, ifIndex_);
            }
            if (!getIfDescrBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ifDescr_);
            }
            if (ifType_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(4, ifType_);
            }
            if (!getIfNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, ifName_);
            }
            if (ifSpeed_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(6, ifSpeed_);
            }
            if (!getIfPhysAddressBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, ifPhysAddress_);
            }
            if (ifAdminStatus_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(8, ifAdminStatus_);
            }
            if (ifOperStatus_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(9, ifOperStatus_);
            }
            if (!getIfAliasBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, ifAlias_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof co.rira.kafka.model.OpennmsModelProtos.SnmpInterface)) {
                return super.equals(obj);
            }
            co.rira.kafka.model.OpennmsModelProtos.SnmpInterface other = (co.rira.kafka.model.OpennmsModelProtos.SnmpInterface) obj;

            if (getId()
                    != other.getId()) return false;
            if (getIfIndex()
                    != other.getIfIndex()) return false;
            if (!getIfDescr()
                    .equals(other.getIfDescr())) return false;
            if (getIfType()
                    != other.getIfType()) return false;
            if (!getIfName()
                    .equals(other.getIfName())) return false;
            if (getIfSpeed()
                    != other.getIfSpeed()) return false;
            if (!getIfPhysAddress()
                    .equals(other.getIfPhysAddress())) return false;
            if (getIfAdminStatus()
                    != other.getIfAdminStatus()) return false;
            if (getIfOperStatus()
                    != other.getIfOperStatus()) return false;
            if (!getIfAlias()
                    .equals(other.getIfAlias())) return false;
            return unknownFields.equals(other.unknownFields);
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getId());
            hash = (37 * hash) + IF_INDEX_FIELD_NUMBER;
            hash = (53 * hash) + getIfIndex();
            hash = (37 * hash) + IF_DESCR_FIELD_NUMBER;
            hash = (53 * hash) + getIfDescr().hashCode();
            hash = (37 * hash) + IF_TYPE_FIELD_NUMBER;
            hash = (53 * hash) + getIfType();
            hash = (37 * hash) + IF_NAME_FIELD_NUMBER;
            hash = (53 * hash) + getIfName().hashCode();
            hash = (37 * hash) + IF_SPEED_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getIfSpeed());
            hash = (37 * hash) + IF_PHYS_ADDRESS_FIELD_NUMBER;
            hash = (53 * hash) + getIfPhysAddress().hashCode();
            hash = (37 * hash) + IF_ADMIN_STATUS_FIELD_NUMBER;
            hash = (53 * hash) + getIfAdminStatus();
            hash = (37 * hash) + IF_OPER_STATUS_FIELD_NUMBER;
            hash = (53 * hash) + getIfOperStatus();
            hash = (37 * hash) + IF_ALIAS_FIELD_NUMBER;
            hash = (53 * hash) + getIfAlias().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<SnmpInterface> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public co.rira.kafka.model.OpennmsModelProtos.SnmpInterface getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code SnmpInterface}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:SnmpInterface)
                co.rira.kafka.model.OpennmsModelProtos.SnmpInterfaceOrBuilder {
            private long id_;
            private int ifIndex_;
            private java.lang.Object ifDescr_ = "";
            private int ifType_;
            private java.lang.Object ifName_ = "";
            private long ifSpeed_;
            private java.lang.Object ifPhysAddress_ = "";
            private int ifAdminStatus_;
            private int ifOperStatus_;
            private java.lang.Object ifAlias_ = "";

            // Construct using co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_SnmpInterface_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_SnmpInterface_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.class, co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                id_ = 0L;

                ifIndex_ = 0;

                ifDescr_ = "";

                ifType_ = 0;

                ifName_ = "";

                ifSpeed_ = 0L;

                ifPhysAddress_ = "";

                ifAdminStatus_ = 0;

                ifOperStatus_ = 0;

                ifAlias_ = "";

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_SnmpInterface_descriptor;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.SnmpInterface getDefaultInstanceForType() {
                return co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.getDefaultInstance();
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.SnmpInterface build() {
                co.rira.kafka.model.OpennmsModelProtos.SnmpInterface result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.SnmpInterface buildPartial() {
                co.rira.kafka.model.OpennmsModelProtos.SnmpInterface result = new co.rira.kafka.model.OpennmsModelProtos.SnmpInterface(this);
                result.id_ = id_;
                result.ifIndex_ = ifIndex_;
                result.ifDescr_ = ifDescr_;
                result.ifType_ = ifType_;
                result.ifName_ = ifName_;
                result.ifSpeed_ = ifSpeed_;
                result.ifPhysAddress_ = ifPhysAddress_;
                result.ifAdminStatus_ = ifAdminStatus_;
                result.ifOperStatus_ = ifOperStatus_;
                result.ifAlias_ = ifAlias_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof co.rira.kafka.model.OpennmsModelProtos.SnmpInterface) {
                    return mergeFrom((co.rira.kafka.model.OpennmsModelProtos.SnmpInterface) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(co.rira.kafka.model.OpennmsModelProtos.SnmpInterface other) {
                if (other == co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.getDefaultInstance()) return this;
                if (other.getId() != 0L) {
                    setId(other.getId());
                }
                if (other.getIfIndex() != 0) {
                    setIfIndex(other.getIfIndex());
                }
                if (!other.getIfDescr().isEmpty()) {
                    ifDescr_ = other.ifDescr_;
                    onChanged();
                }
                if (other.getIfType() != 0) {
                    setIfType(other.getIfType());
                }
                if (!other.getIfName().isEmpty()) {
                    ifName_ = other.ifName_;
                    onChanged();
                }
                if (other.getIfSpeed() != 0L) {
                    setIfSpeed(other.getIfSpeed());
                }
                if (!other.getIfPhysAddress().isEmpty()) {
                    ifPhysAddress_ = other.ifPhysAddress_;
                    onChanged();
                }
                if (other.getIfAdminStatus() != 0) {
                    setIfAdminStatus(other.getIfAdminStatus());
                }
                if (other.getIfOperStatus() != 0) {
                    setIfOperStatus(other.getIfOperStatus());
                }
                if (!other.getIfAlias().isEmpty()) {
                    ifAlias_ = other.ifAlias_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                co.rira.kafka.model.OpennmsModelProtos.SnmpInterface parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (co.rira.kafka.model.OpennmsModelProtos.SnmpInterface) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>uint64 id = 1;</code>
             *
             * @return The id.
             */
            public long getId() {
                return id_;
            }

            /**
             * <code>uint64 id = 1;</code>
             *
             * @param value The id to set.
             * @return This builder for chaining.
             */
            public Builder setId(long value) {

                id_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 id = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearId() {

                id_ = 0L;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 if_index = 2;</code>
             *
             * @return The ifIndex.
             */
            public int getIfIndex() {
                return ifIndex_;
            }

            /**
             * <code>uint32 if_index = 2;</code>
             *
             * @param value The ifIndex to set.
             * @return This builder for chaining.
             */
            public Builder setIfIndex(int value) {

                ifIndex_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 if_index = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIfIndex() {

                ifIndex_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>string if_descr = 3;</code>
             *
             * @return The ifDescr.
             */
            public java.lang.String getIfDescr() {
                java.lang.Object ref = ifDescr_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    ifDescr_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string if_descr = 3;</code>
             *
             * @param value The ifDescr to set.
             * @return This builder for chaining.
             */
            public Builder setIfDescr(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                ifDescr_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string if_descr = 3;</code>
             *
             * @return The bytes for ifDescr.
             */
            public com.google.protobuf.ByteString
            getIfDescrBytes() {
                java.lang.Object ref = ifDescr_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    ifDescr_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string if_descr = 3;</code>
             *
             * @param value The bytes for ifDescr to set.
             * @return This builder for chaining.
             */
            public Builder setIfDescrBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                ifDescr_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string if_descr = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIfDescr() {

                ifDescr_ = getDefaultInstance().getIfDescr();
                onChanged();
                return this;
            }

            /**
             * <code>uint32 if_type = 4;</code>
             *
             * @return The ifType.
             */
            public int getIfType() {
                return ifType_;
            }

            /**
             * <code>uint32 if_type = 4;</code>
             *
             * @param value The ifType to set.
             * @return This builder for chaining.
             */
            public Builder setIfType(int value) {

                ifType_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 if_type = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIfType() {

                ifType_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>string if_name = 5;</code>
             *
             * @return The ifName.
             */
            public java.lang.String getIfName() {
                java.lang.Object ref = ifName_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    ifName_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string if_name = 5;</code>
             *
             * @param value The ifName to set.
             * @return This builder for chaining.
             */
            public Builder setIfName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                ifName_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string if_name = 5;</code>
             *
             * @return The bytes for ifName.
             */
            public com.google.protobuf.ByteString
            getIfNameBytes() {
                java.lang.Object ref = ifName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    ifName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string if_name = 5;</code>
             *
             * @param value The bytes for ifName to set.
             * @return This builder for chaining.
             */
            public Builder setIfNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                ifName_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string if_name = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIfName() {

                ifName_ = getDefaultInstance().getIfName();
                onChanged();
                return this;
            }

            /**
             * <code>uint64 if_speed = 6;</code>
             *
             * @return The ifSpeed.
             */
            public long getIfSpeed() {
                return ifSpeed_;
            }

            /**
             * <code>uint64 if_speed = 6;</code>
             *
             * @param value The ifSpeed to set.
             * @return This builder for chaining.
             */
            public Builder setIfSpeed(long value) {

                ifSpeed_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 if_speed = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIfSpeed() {

                ifSpeed_ = 0L;
                onChanged();
                return this;
            }

            /**
             * <code>string if_phys_address = 7;</code>
             *
             * @return The ifPhysAddress.
             */
            public java.lang.String getIfPhysAddress() {
                java.lang.Object ref = ifPhysAddress_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    ifPhysAddress_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string if_phys_address = 7;</code>
             *
             * @param value The ifPhysAddress to set.
             * @return This builder for chaining.
             */
            public Builder setIfPhysAddress(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                ifPhysAddress_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string if_phys_address = 7;</code>
             *
             * @return The bytes for ifPhysAddress.
             */
            public com.google.protobuf.ByteString
            getIfPhysAddressBytes() {
                java.lang.Object ref = ifPhysAddress_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    ifPhysAddress_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string if_phys_address = 7;</code>
             *
             * @param value The bytes for ifPhysAddress to set.
             * @return This builder for chaining.
             */
            public Builder setIfPhysAddressBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                ifPhysAddress_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string if_phys_address = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIfPhysAddress() {

                ifPhysAddress_ = getDefaultInstance().getIfPhysAddress();
                onChanged();
                return this;
            }

            /**
             * <code>uint32 if_admin_status = 8;</code>
             *
             * @return The ifAdminStatus.
             */
            public int getIfAdminStatus() {
                return ifAdminStatus_;
            }

            /**
             * <code>uint32 if_admin_status = 8;</code>
             *
             * @param value The ifAdminStatus to set.
             * @return This builder for chaining.
             */
            public Builder setIfAdminStatus(int value) {

                ifAdminStatus_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 if_admin_status = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIfAdminStatus() {

                ifAdminStatus_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 if_oper_status = 9;</code>
             *
             * @return The ifOperStatus.
             */
            public int getIfOperStatus() {
                return ifOperStatus_;
            }

            /**
             * <code>uint32 if_oper_status = 9;</code>
             *
             * @param value The ifOperStatus to set.
             * @return This builder for chaining.
             */
            public Builder setIfOperStatus(int value) {

                ifOperStatus_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 if_oper_status = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIfOperStatus() {

                ifOperStatus_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>string if_alias = 10;</code>
             *
             * @return The ifAlias.
             */
            public java.lang.String getIfAlias() {
                java.lang.Object ref = ifAlias_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    ifAlias_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string if_alias = 10;</code>
             *
             * @param value The ifAlias to set.
             * @return This builder for chaining.
             */
            public Builder setIfAlias(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                ifAlias_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string if_alias = 10;</code>
             *
             * @return The bytes for ifAlias.
             */
            public com.google.protobuf.ByteString
            getIfAliasBytes() {
                java.lang.Object ref = ifAlias_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    ifAlias_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string if_alias = 10;</code>
             *
             * @param value The bytes for ifAlias to set.
             * @return This builder for chaining.
             */
            public Builder setIfAliasBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                ifAlias_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string if_alias = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIfAlias() {

                ifAlias_ = getDefaultInstance().getIfAlias();
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:SnmpInterface)
        }

    }

    /**
     * Protobuf type {@code HwAlias}
     */
    public static final class HwAlias extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:HwAlias)
            HwAliasOrBuilder {
        public static final int INDEX_FIELD_NUMBER = 1;
        public static final int OID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:HwAlias)
        private static final co.rira.kafka.model.OpennmsModelProtos.HwAlias DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<HwAlias>
                PARSER = new com.google.protobuf.AbstractParser<HwAlias>() {
            @java.lang.Override
            public HwAlias parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new HwAlias(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new co.rira.kafka.model.OpennmsModelProtos.HwAlias();
        }

        private int index_;
        private volatile java.lang.Object oid_;
        private byte memoizedIsInitialized = -1;

        // Use HwAlias.newBuilder() to construct.
        private HwAlias(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private HwAlias() {
            oid_ = "";
        }

        private HwAlias(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8: {

                            index_ = input.readUInt32();
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            oid_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_HwAlias_descriptor;
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwAlias parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwAlias parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwAlias parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwAlias parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwAlias parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwAlias parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwAlias parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwAlias parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwAlias parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwAlias parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwAlias parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwAlias parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(co.rira.kafka.model.OpennmsModelProtos.HwAlias prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwAlias getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<HwAlias> parser() {
            return PARSER;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new HwAlias();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_HwAlias_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            co.rira.kafka.model.OpennmsModelProtos.HwAlias.class, co.rira.kafka.model.OpennmsModelProtos.HwAlias.Builder.class);
        }

        /**
         * <code>uint32 index = 1;</code>
         *
         * @return The index.
         */
        public int getIndex() {
            return index_;
        }

        /**
         * <code>string oid = 2;</code>
         *
         * @return The oid.
         */
        public java.lang.String getOid() {
            java.lang.Object ref = oid_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                oid_ = s;
                return s;
            }
        }

        /**
         * <code>string oid = 2;</code>
         *
         * @return The bytes for oid.
         */
        public com.google.protobuf.ByteString
        getOidBytes() {
            java.lang.Object ref = oid_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                oid_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (index_ != 0) {
                output.writeUInt32(1, index_);
            }
            if (!getOidBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, oid_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (index_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(1, index_);
            }
            if (!getOidBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, oid_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof co.rira.kafka.model.OpennmsModelProtos.HwAlias)) {
                return super.equals(obj);
            }
            co.rira.kafka.model.OpennmsModelProtos.HwAlias other = (co.rira.kafka.model.OpennmsModelProtos.HwAlias) obj;

            if (getIndex()
                    != other.getIndex()) return false;
            if (!getOid()
                    .equals(other.getOid())) return false;
            return unknownFields.equals(other.unknownFields);
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + INDEX_FIELD_NUMBER;
            hash = (53 * hash) + getIndex();
            hash = (37 * hash) + OID_FIELD_NUMBER;
            hash = (53 * hash) + getOid().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<HwAlias> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public co.rira.kafka.model.OpennmsModelProtos.HwAlias getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code HwAlias}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:HwAlias)
                co.rira.kafka.model.OpennmsModelProtos.HwAliasOrBuilder {
            private int index_;
            private java.lang.Object oid_ = "";

            // Construct using co.rira.kafka.model.OpennmsModelProtos.HwAlias.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_HwAlias_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_HwAlias_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                co.rira.kafka.model.OpennmsModelProtos.HwAlias.class, co.rira.kafka.model.OpennmsModelProtos.HwAlias.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                index_ = 0;

                oid_ = "";

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_HwAlias_descriptor;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.HwAlias getDefaultInstanceForType() {
                return co.rira.kafka.model.OpennmsModelProtos.HwAlias.getDefaultInstance();
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.HwAlias build() {
                co.rira.kafka.model.OpennmsModelProtos.HwAlias result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.HwAlias buildPartial() {
                co.rira.kafka.model.OpennmsModelProtos.HwAlias result = new co.rira.kafka.model.OpennmsModelProtos.HwAlias(this);
                result.index_ = index_;
                result.oid_ = oid_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof co.rira.kafka.model.OpennmsModelProtos.HwAlias) {
                    return mergeFrom((co.rira.kafka.model.OpennmsModelProtos.HwAlias) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(co.rira.kafka.model.OpennmsModelProtos.HwAlias other) {
                if (other == co.rira.kafka.model.OpennmsModelProtos.HwAlias.getDefaultInstance()) return this;
                if (other.getIndex() != 0) {
                    setIndex(other.getIndex());
                }
                if (!other.getOid().isEmpty()) {
                    oid_ = other.oid_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                co.rira.kafka.model.OpennmsModelProtos.HwAlias parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (co.rira.kafka.model.OpennmsModelProtos.HwAlias) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>uint32 index = 1;</code>
             *
             * @return The index.
             */
            public int getIndex() {
                return index_;
            }

            /**
             * <code>uint32 index = 1;</code>
             *
             * @param value The index to set.
             * @return This builder for chaining.
             */
            public Builder setIndex(int value) {

                index_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 index = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIndex() {

                index_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>string oid = 2;</code>
             *
             * @return The oid.
             */
            public java.lang.String getOid() {
                java.lang.Object ref = oid_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    oid_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string oid = 2;</code>
             *
             * @param value The oid to set.
             * @return This builder for chaining.
             */
            public Builder setOid(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                oid_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string oid = 2;</code>
             *
             * @return The bytes for oid.
             */
            public com.google.protobuf.ByteString
            getOidBytes() {
                java.lang.Object ref = oid_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    oid_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string oid = 2;</code>
             *
             * @param value The bytes for oid to set.
             * @return This builder for chaining.
             */
            public Builder setOidBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                oid_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string oid = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearOid() {

                oid_ = getDefaultInstance().getOid();
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:HwAlias)
        }

    }

    /**
     * Protobuf type {@code HwEntity}
     */
    public static final class HwEntity extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:HwEntity)
            HwEntityOrBuilder {
        public static final int ENT_PHYSICAL_INDEX_FIELD_NUMBER = 1;
        public static final int ENTITY_ID_FIELD_NUMBER = 2;
        public static final int ENT_PHYSICAL_CLASS_FIELD_NUMBER = 3;
        public static final int ENT_PHYSICAL_DESCR_FIELD_NUMBER = 4;
        public static final int ENT_PHYSICAL_IS_FRU_FIELD_NUMBER = 5;
        public static final int ENT_PHYSICAL_NAME_FIELD_NUMBER = 6;
        public static final int ENT_PHYSICAL_VENDOR_TYPE_FIELD_NUMBER = 7;
        public static final int ENT_HW_ALIAS_FIELD_NUMBER = 8;
        public static final int CHILDREN_FIELD_NUMBER = 9;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:HwEntity)
        private static final co.rira.kafka.model.OpennmsModelProtos.HwEntity DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<HwEntity>
                PARSER = new com.google.protobuf.AbstractParser<HwEntity>() {
            @java.lang.Override
            public HwEntity parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new HwEntity(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new co.rira.kafka.model.OpennmsModelProtos.HwEntity();
        }

        private int entPhysicalIndex_;
        private int entityId_;
        private volatile java.lang.Object entPhysicalClass_;
        private volatile java.lang.Object entPhysicalDescr_;
        private boolean entPhysicalIsFru_;
        private volatile java.lang.Object entPhysicalName_;
        private volatile java.lang.Object entPhysicalVendorType_;
        private java.util.List<co.rira.kafka.model.OpennmsModelProtos.HwAlias> entHwAlias_;
        private java.util.List<co.rira.kafka.model.OpennmsModelProtos.HwEntity> children_;
        private byte memoizedIsInitialized = -1;

        // Use HwEntity.newBuilder() to construct.
        private HwEntity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private HwEntity() {
            entPhysicalClass_ = "";
            entPhysicalDescr_ = "";
            entPhysicalName_ = "";
            entPhysicalVendorType_ = "";
            entHwAlias_ = java.util.Collections.emptyList();
            children_ = java.util.Collections.emptyList();
        }

        private HwEntity(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8: {

                            entPhysicalIndex_ = input.readUInt32();
                            break;
                        }
                        case 16: {

                            entityId_ = input.readUInt32();
                            break;
                        }
                        case 26: {
                            java.lang.String s = input.readStringRequireUtf8();

                            entPhysicalClass_ = s;
                            break;
                        }
                        case 34: {
                            java.lang.String s = input.readStringRequireUtf8();

                            entPhysicalDescr_ = s;
                            break;
                        }
                        case 40: {

                            entPhysicalIsFru_ = input.readBool();
                            break;
                        }
                        case 50: {
                            java.lang.String s = input.readStringRequireUtf8();

                            entPhysicalName_ = s;
                            break;
                        }
                        case 58: {
                            java.lang.String s = input.readStringRequireUtf8();

                            entPhysicalVendorType_ = s;
                            break;
                        }
                        case 66: {
                            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                entHwAlias_ = new java.util.ArrayList<co.rira.kafka.model.OpennmsModelProtos.HwAlias>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            entHwAlias_.add(
                                    input.readMessage(co.rira.kafka.model.OpennmsModelProtos.HwAlias.parser(), extensionRegistry));
                            break;
                        }
                        case 74: {
                            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                                children_ = new java.util.ArrayList<co.rira.kafka.model.OpennmsModelProtos.HwEntity>();
                                mutable_bitField0_ |= 0x00000002;
                            }
                            children_.add(
                                    input.readMessage(co.rira.kafka.model.OpennmsModelProtos.HwEntity.parser(), extensionRegistry));
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    entHwAlias_ = java.util.Collections.unmodifiableList(entHwAlias_);
                }
                if (((mutable_bitField0_ & 0x00000002) != 0)) {
                    children_ = java.util.Collections.unmodifiableList(children_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_HwEntity_descriptor;
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwEntity parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwEntity parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwEntity parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwEntity parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwEntity parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwEntity parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwEntity parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwEntity parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwEntity parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwEntity parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwEntity parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwEntity parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(co.rira.kafka.model.OpennmsModelProtos.HwEntity prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.HwEntity getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<HwEntity> parser() {
            return PARSER;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new HwEntity();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_HwEntity_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            co.rira.kafka.model.OpennmsModelProtos.HwEntity.class, co.rira.kafka.model.OpennmsModelProtos.HwEntity.Builder.class);
        }

        /**
         * <code>uint32 ent_physical_index = 1;</code>
         *
         * @return The entPhysicalIndex.
         */
        public int getEntPhysicalIndex() {
            return entPhysicalIndex_;
        }

        /**
         * <code>uint32 entity_id = 2;</code>
         *
         * @return The entityId.
         */
        public int getEntityId() {
            return entityId_;
        }

        /**
         * <code>string ent_physical_class = 3;</code>
         *
         * @return The entPhysicalClass.
         */
        public java.lang.String getEntPhysicalClass() {
            java.lang.Object ref = entPhysicalClass_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                entPhysicalClass_ = s;
                return s;
            }
        }

        /**
         * <code>string ent_physical_class = 3;</code>
         *
         * @return The bytes for entPhysicalClass.
         */
        public com.google.protobuf.ByteString
        getEntPhysicalClassBytes() {
            java.lang.Object ref = entPhysicalClass_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                entPhysicalClass_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string ent_physical_descr = 4;</code>
         *
         * @return The entPhysicalDescr.
         */
        public java.lang.String getEntPhysicalDescr() {
            java.lang.Object ref = entPhysicalDescr_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                entPhysicalDescr_ = s;
                return s;
            }
        }

        /**
         * <code>string ent_physical_descr = 4;</code>
         *
         * @return The bytes for entPhysicalDescr.
         */
        public com.google.protobuf.ByteString
        getEntPhysicalDescrBytes() {
            java.lang.Object ref = entPhysicalDescr_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                entPhysicalDescr_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>bool ent_physical_is_fru = 5;</code>
         *
         * @return The entPhysicalIsFru.
         */
        public boolean getEntPhysicalIsFru() {
            return entPhysicalIsFru_;
        }

        /**
         * <code>string ent_physical_name = 6;</code>
         *
         * @return The entPhysicalName.
         */
        public java.lang.String getEntPhysicalName() {
            java.lang.Object ref = entPhysicalName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                entPhysicalName_ = s;
                return s;
            }
        }

        /**
         * <code>string ent_physical_name = 6;</code>
         *
         * @return The bytes for entPhysicalName.
         */
        public com.google.protobuf.ByteString
        getEntPhysicalNameBytes() {
            java.lang.Object ref = entPhysicalName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                entPhysicalName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string ent_physical_vendor_type = 7;</code>
         *
         * @return The entPhysicalVendorType.
         */
        public java.lang.String getEntPhysicalVendorType() {
            java.lang.Object ref = entPhysicalVendorType_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                entPhysicalVendorType_ = s;
                return s;
            }
        }

        /**
         * <code>string ent_physical_vendor_type = 7;</code>
         *
         * @return The bytes for entPhysicalVendorType.
         */
        public com.google.protobuf.ByteString
        getEntPhysicalVendorTypeBytes() {
            java.lang.Object ref = entPhysicalVendorType_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                entPhysicalVendorType_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>repeated .HwAlias ent_hw_alias = 8;</code>
         */
        public java.util.List<co.rira.kafka.model.OpennmsModelProtos.HwAlias> getEntHwAliasList() {
            return entHwAlias_;
        }

        /**
         * <code>repeated .HwAlias ent_hw_alias = 8;</code>
         */
        public java.util.List<? extends co.rira.kafka.model.OpennmsModelProtos.HwAliasOrBuilder>
        getEntHwAliasOrBuilderList() {
            return entHwAlias_;
        }

        /**
         * <code>repeated .HwAlias ent_hw_alias = 8;</code>
         */
        public int getEntHwAliasCount() {
            return entHwAlias_.size();
        }

        /**
         * <code>repeated .HwAlias ent_hw_alias = 8;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.HwAlias getEntHwAlias(int index) {
            return entHwAlias_.get(index);
        }

        /**
         * <code>repeated .HwAlias ent_hw_alias = 8;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.HwAliasOrBuilder getEntHwAliasOrBuilder(
                int index) {
            return entHwAlias_.get(index);
        }

        /**
         * <code>repeated .HwEntity children = 9;</code>
         */
        public java.util.List<co.rira.kafka.model.OpennmsModelProtos.HwEntity> getChildrenList() {
            return children_;
        }

        /**
         * <code>repeated .HwEntity children = 9;</code>
         */
        public java.util.List<? extends co.rira.kafka.model.OpennmsModelProtos.HwEntityOrBuilder>
        getChildrenOrBuilderList() {
            return children_;
        }

        /**
         * <code>repeated .HwEntity children = 9;</code>
         */
        public int getChildrenCount() {
            return children_.size();
        }

        /**
         * <code>repeated .HwEntity children = 9;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.HwEntity getChildren(int index) {
            return children_.get(index);
        }

        /**
         * <code>repeated .HwEntity children = 9;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.HwEntityOrBuilder getChildrenOrBuilder(
                int index) {
            return children_.get(index);
        }

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (entPhysicalIndex_ != 0) {
                output.writeUInt32(1, entPhysicalIndex_);
            }
            if (entityId_ != 0) {
                output.writeUInt32(2, entityId_);
            }
            if (!getEntPhysicalClassBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, entPhysicalClass_);
            }
            if (!getEntPhysicalDescrBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 4, entPhysicalDescr_);
            }
            if (entPhysicalIsFru_ != false) {
                output.writeBool(5, entPhysicalIsFru_);
            }
            if (!getEntPhysicalNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 6, entPhysicalName_);
            }
            if (!getEntPhysicalVendorTypeBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 7, entPhysicalVendorType_);
            }
            for (int i = 0; i < entHwAlias_.size(); i++) {
                output.writeMessage(8, entHwAlias_.get(i));
            }
            for (int i = 0; i < children_.size(); i++) {
                output.writeMessage(9, children_.get(i));
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (entPhysicalIndex_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(1, entPhysicalIndex_);
            }
            if (entityId_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(2, entityId_);
            }
            if (!getEntPhysicalClassBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, entPhysicalClass_);
            }
            if (!getEntPhysicalDescrBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, entPhysicalDescr_);
            }
            if (entPhysicalIsFru_ != false) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(5, entPhysicalIsFru_);
            }
            if (!getEntPhysicalNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, entPhysicalName_);
            }
            if (!getEntPhysicalVendorTypeBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, entPhysicalVendorType_);
            }
            for (int i = 0; i < entHwAlias_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(8, entHwAlias_.get(i));
            }
            for (int i = 0; i < children_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(9, children_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof co.rira.kafka.model.OpennmsModelProtos.HwEntity)) {
                return super.equals(obj);
            }
            co.rira.kafka.model.OpennmsModelProtos.HwEntity other = (co.rira.kafka.model.OpennmsModelProtos.HwEntity) obj;

            if (getEntPhysicalIndex()
                    != other.getEntPhysicalIndex()) return false;
            if (getEntityId()
                    != other.getEntityId()) return false;
            if (!getEntPhysicalClass()
                    .equals(other.getEntPhysicalClass())) return false;
            if (!getEntPhysicalDescr()
                    .equals(other.getEntPhysicalDescr())) return false;
            if (getEntPhysicalIsFru()
                    != other.getEntPhysicalIsFru()) return false;
            if (!getEntPhysicalName()
                    .equals(other.getEntPhysicalName())) return false;
            if (!getEntPhysicalVendorType()
                    .equals(other.getEntPhysicalVendorType())) return false;
            if (!getEntHwAliasList()
                    .equals(other.getEntHwAliasList())) return false;
            if (!getChildrenList()
                    .equals(other.getChildrenList())) return false;
            return unknownFields.equals(other.unknownFields);
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ENT_PHYSICAL_INDEX_FIELD_NUMBER;
            hash = (53 * hash) + getEntPhysicalIndex();
            hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
            hash = (53 * hash) + getEntityId();
            hash = (37 * hash) + ENT_PHYSICAL_CLASS_FIELD_NUMBER;
            hash = (53 * hash) + getEntPhysicalClass().hashCode();
            hash = (37 * hash) + ENT_PHYSICAL_DESCR_FIELD_NUMBER;
            hash = (53 * hash) + getEntPhysicalDescr().hashCode();
            hash = (37 * hash) + ENT_PHYSICAL_IS_FRU_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                    getEntPhysicalIsFru());
            hash = (37 * hash) + ENT_PHYSICAL_NAME_FIELD_NUMBER;
            hash = (53 * hash) + getEntPhysicalName().hashCode();
            hash = (37 * hash) + ENT_PHYSICAL_VENDOR_TYPE_FIELD_NUMBER;
            hash = (53 * hash) + getEntPhysicalVendorType().hashCode();
            if (getEntHwAliasCount() > 0) {
                hash = (37 * hash) + ENT_HW_ALIAS_FIELD_NUMBER;
                hash = (53 * hash) + getEntHwAliasList().hashCode();
            }
            if (getChildrenCount() > 0) {
                hash = (37 * hash) + CHILDREN_FIELD_NUMBER;
                hash = (53 * hash) + getChildrenList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<HwEntity> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public co.rira.kafka.model.OpennmsModelProtos.HwEntity getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code HwEntity}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:HwEntity)
                co.rira.kafka.model.OpennmsModelProtos.HwEntityOrBuilder {
            private int bitField0_;
            private int entPhysicalIndex_;
            private int entityId_;
            private java.lang.Object entPhysicalClass_ = "";
            private java.lang.Object entPhysicalDescr_ = "";
            private boolean entPhysicalIsFru_;
            private java.lang.Object entPhysicalName_ = "";
            private java.lang.Object entPhysicalVendorType_ = "";
            private java.util.List<co.rira.kafka.model.OpennmsModelProtos.HwAlias> entHwAlias_ =
                    java.util.Collections.emptyList();
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.HwAlias, co.rira.kafka.model.OpennmsModelProtos.HwAlias.Builder, co.rira.kafka.model.OpennmsModelProtos.HwAliasOrBuilder> entHwAliasBuilder_;
            private java.util.List<co.rira.kafka.model.OpennmsModelProtos.HwEntity> children_ =
                    java.util.Collections.emptyList();
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.HwEntity, co.rira.kafka.model.OpennmsModelProtos.HwEntity.Builder, co.rira.kafka.model.OpennmsModelProtos.HwEntityOrBuilder> childrenBuilder_;

            // Construct using co.rira.kafka.model.OpennmsModelProtos.HwEntity.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_HwEntity_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_HwEntity_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                co.rira.kafka.model.OpennmsModelProtos.HwEntity.class, co.rira.kafka.model.OpennmsModelProtos.HwEntity.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getEntHwAliasFieldBuilder();
                    getChildrenFieldBuilder();
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                entPhysicalIndex_ = 0;

                entityId_ = 0;

                entPhysicalClass_ = "";

                entPhysicalDescr_ = "";

                entPhysicalIsFru_ = false;

                entPhysicalName_ = "";

                entPhysicalVendorType_ = "";

                if (entHwAliasBuilder_ == null) {
                    entHwAlias_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    entHwAliasBuilder_.clear();
                }
                if (childrenBuilder_ == null) {
                    children_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                } else {
                    childrenBuilder_.clear();
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_HwEntity_descriptor;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.HwEntity getDefaultInstanceForType() {
                return co.rira.kafka.model.OpennmsModelProtos.HwEntity.getDefaultInstance();
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.HwEntity build() {
                co.rira.kafka.model.OpennmsModelProtos.HwEntity result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.HwEntity buildPartial() {
                co.rira.kafka.model.OpennmsModelProtos.HwEntity result = new co.rira.kafka.model.OpennmsModelProtos.HwEntity(this);
                int from_bitField0_ = bitField0_;
                result.entPhysicalIndex_ = entPhysicalIndex_;
                result.entityId_ = entityId_;
                result.entPhysicalClass_ = entPhysicalClass_;
                result.entPhysicalDescr_ = entPhysicalDescr_;
                result.entPhysicalIsFru_ = entPhysicalIsFru_;
                result.entPhysicalName_ = entPhysicalName_;
                result.entPhysicalVendorType_ = entPhysicalVendorType_;
                if (entHwAliasBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0)) {
                        entHwAlias_ = java.util.Collections.unmodifiableList(entHwAlias_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.entHwAlias_ = entHwAlias_;
                } else {
                    result.entHwAlias_ = entHwAliasBuilder_.build();
                }
                if (childrenBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) != 0)) {
                        children_ = java.util.Collections.unmodifiableList(children_);
                        bitField0_ = (bitField0_ & ~0x00000002);
                    }
                    result.children_ = children_;
                } else {
                    result.children_ = childrenBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof co.rira.kafka.model.OpennmsModelProtos.HwEntity) {
                    return mergeFrom((co.rira.kafka.model.OpennmsModelProtos.HwEntity) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(co.rira.kafka.model.OpennmsModelProtos.HwEntity other) {
                if (other == co.rira.kafka.model.OpennmsModelProtos.HwEntity.getDefaultInstance()) return this;
                if (other.getEntPhysicalIndex() != 0) {
                    setEntPhysicalIndex(other.getEntPhysicalIndex());
                }
                if (other.getEntityId() != 0) {
                    setEntityId(other.getEntityId());
                }
                if (!other.getEntPhysicalClass().isEmpty()) {
                    entPhysicalClass_ = other.entPhysicalClass_;
                    onChanged();
                }
                if (!other.getEntPhysicalDescr().isEmpty()) {
                    entPhysicalDescr_ = other.entPhysicalDescr_;
                    onChanged();
                }
                if (other.getEntPhysicalIsFru() != false) {
                    setEntPhysicalIsFru(other.getEntPhysicalIsFru());
                }
                if (!other.getEntPhysicalName().isEmpty()) {
                    entPhysicalName_ = other.entPhysicalName_;
                    onChanged();
                }
                if (!other.getEntPhysicalVendorType().isEmpty()) {
                    entPhysicalVendorType_ = other.entPhysicalVendorType_;
                    onChanged();
                }
                if (entHwAliasBuilder_ == null) {
                    if (!other.entHwAlias_.isEmpty()) {
                        if (entHwAlias_.isEmpty()) {
                            entHwAlias_ = other.entHwAlias_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureEntHwAliasIsMutable();
                            entHwAlias_.addAll(other.entHwAlias_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.entHwAlias_.isEmpty()) {
                        if (entHwAliasBuilder_.isEmpty()) {
                            entHwAliasBuilder_.dispose();
                            entHwAliasBuilder_ = null;
                            entHwAlias_ = other.entHwAlias_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            entHwAliasBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getEntHwAliasFieldBuilder() : null;
                        } else {
                            entHwAliasBuilder_.addAllMessages(other.entHwAlias_);
                        }
                    }
                }
                if (childrenBuilder_ == null) {
                    if (!other.children_.isEmpty()) {
                        if (children_.isEmpty()) {
                            children_ = other.children_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                        } else {
                            ensureChildrenIsMutable();
                            children_.addAll(other.children_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.children_.isEmpty()) {
                        if (childrenBuilder_.isEmpty()) {
                            childrenBuilder_.dispose();
                            childrenBuilder_ = null;
                            children_ = other.children_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                            childrenBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getChildrenFieldBuilder() : null;
                        } else {
                            childrenBuilder_.addAllMessages(other.children_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                co.rira.kafka.model.OpennmsModelProtos.HwEntity parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (co.rira.kafka.model.OpennmsModelProtos.HwEntity) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>uint32 ent_physical_index = 1;</code>
             *
             * @return The entPhysicalIndex.
             */
            public int getEntPhysicalIndex() {
                return entPhysicalIndex_;
            }

            /**
             * <code>uint32 ent_physical_index = 1;</code>
             *
             * @param value The entPhysicalIndex to set.
             * @return This builder for chaining.
             */
            public Builder setEntPhysicalIndex(int value) {

                entPhysicalIndex_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 ent_physical_index = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearEntPhysicalIndex() {

                entPhysicalIndex_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 entity_id = 2;</code>
             *
             * @return The entityId.
             */
            public int getEntityId() {
                return entityId_;
            }

            /**
             * <code>uint32 entity_id = 2;</code>
             *
             * @param value The entityId to set.
             * @return This builder for chaining.
             */
            public Builder setEntityId(int value) {

                entityId_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 entity_id = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearEntityId() {

                entityId_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>string ent_physical_class = 3;</code>
             *
             * @return The entPhysicalClass.
             */
            public java.lang.String getEntPhysicalClass() {
                java.lang.Object ref = entPhysicalClass_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    entPhysicalClass_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string ent_physical_class = 3;</code>
             *
             * @param value The entPhysicalClass to set.
             * @return This builder for chaining.
             */
            public Builder setEntPhysicalClass(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                entPhysicalClass_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string ent_physical_class = 3;</code>
             *
             * @return The bytes for entPhysicalClass.
             */
            public com.google.protobuf.ByteString
            getEntPhysicalClassBytes() {
                java.lang.Object ref = entPhysicalClass_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    entPhysicalClass_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string ent_physical_class = 3;</code>
             *
             * @param value The bytes for entPhysicalClass to set.
             * @return This builder for chaining.
             */
            public Builder setEntPhysicalClassBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                entPhysicalClass_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string ent_physical_class = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearEntPhysicalClass() {

                entPhysicalClass_ = getDefaultInstance().getEntPhysicalClass();
                onChanged();
                return this;
            }

            /**
             * <code>string ent_physical_descr = 4;</code>
             *
             * @return The entPhysicalDescr.
             */
            public java.lang.String getEntPhysicalDescr() {
                java.lang.Object ref = entPhysicalDescr_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    entPhysicalDescr_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string ent_physical_descr = 4;</code>
             *
             * @param value The entPhysicalDescr to set.
             * @return This builder for chaining.
             */
            public Builder setEntPhysicalDescr(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                entPhysicalDescr_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string ent_physical_descr = 4;</code>
             *
             * @return The bytes for entPhysicalDescr.
             */
            public com.google.protobuf.ByteString
            getEntPhysicalDescrBytes() {
                java.lang.Object ref = entPhysicalDescr_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    entPhysicalDescr_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string ent_physical_descr = 4;</code>
             *
             * @param value The bytes for entPhysicalDescr to set.
             * @return This builder for chaining.
             */
            public Builder setEntPhysicalDescrBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                entPhysicalDescr_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string ent_physical_descr = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearEntPhysicalDescr() {

                entPhysicalDescr_ = getDefaultInstance().getEntPhysicalDescr();
                onChanged();
                return this;
            }

            /**
             * <code>bool ent_physical_is_fru = 5;</code>
             *
             * @return The entPhysicalIsFru.
             */
            public boolean getEntPhysicalIsFru() {
                return entPhysicalIsFru_;
            }

            /**
             * <code>bool ent_physical_is_fru = 5;</code>
             *
             * @param value The entPhysicalIsFru to set.
             * @return This builder for chaining.
             */
            public Builder setEntPhysicalIsFru(boolean value) {

                entPhysicalIsFru_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>bool ent_physical_is_fru = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearEntPhysicalIsFru() {

                entPhysicalIsFru_ = false;
                onChanged();
                return this;
            }

            /**
             * <code>string ent_physical_name = 6;</code>
             *
             * @return The entPhysicalName.
             */
            public java.lang.String getEntPhysicalName() {
                java.lang.Object ref = entPhysicalName_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    entPhysicalName_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string ent_physical_name = 6;</code>
             *
             * @param value The entPhysicalName to set.
             * @return This builder for chaining.
             */
            public Builder setEntPhysicalName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                entPhysicalName_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string ent_physical_name = 6;</code>
             *
             * @return The bytes for entPhysicalName.
             */
            public com.google.protobuf.ByteString
            getEntPhysicalNameBytes() {
                java.lang.Object ref = entPhysicalName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    entPhysicalName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string ent_physical_name = 6;</code>
             *
             * @param value The bytes for entPhysicalName to set.
             * @return This builder for chaining.
             */
            public Builder setEntPhysicalNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                entPhysicalName_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string ent_physical_name = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearEntPhysicalName() {

                entPhysicalName_ = getDefaultInstance().getEntPhysicalName();
                onChanged();
                return this;
            }

            /**
             * <code>string ent_physical_vendor_type = 7;</code>
             *
             * @return The entPhysicalVendorType.
             */
            public java.lang.String getEntPhysicalVendorType() {
                java.lang.Object ref = entPhysicalVendorType_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    entPhysicalVendorType_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string ent_physical_vendor_type = 7;</code>
             *
             * @param value The entPhysicalVendorType to set.
             * @return This builder for chaining.
             */
            public Builder setEntPhysicalVendorType(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                entPhysicalVendorType_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string ent_physical_vendor_type = 7;</code>
             *
             * @return The bytes for entPhysicalVendorType.
             */
            public com.google.protobuf.ByteString
            getEntPhysicalVendorTypeBytes() {
                java.lang.Object ref = entPhysicalVendorType_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    entPhysicalVendorType_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string ent_physical_vendor_type = 7;</code>
             *
             * @param value The bytes for entPhysicalVendorType to set.
             * @return This builder for chaining.
             */
            public Builder setEntPhysicalVendorTypeBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                entPhysicalVendorType_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string ent_physical_vendor_type = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearEntPhysicalVendorType() {

                entPhysicalVendorType_ = getDefaultInstance().getEntPhysicalVendorType();
                onChanged();
                return this;
            }

            private void ensureEntHwAliasIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    entHwAlias_ = new java.util.ArrayList<co.rira.kafka.model.OpennmsModelProtos.HwAlias>(entHwAlias_);
                    bitField0_ |= 0x00000001;
                }
            }

            /**
             * <code>repeated .HwAlias ent_hw_alias = 8;</code>
             */
            public java.util.List<co.rira.kafka.model.OpennmsModelProtos.HwAlias> getEntHwAliasList() {
                if (entHwAliasBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(entHwAlias_);
                } else {
                    return entHwAliasBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .HwAlias ent_hw_alias = 8;</code>
             */
            public int getEntHwAliasCount() {
                if (entHwAliasBuilder_ == null) {
                    return entHwAlias_.size();
                } else {
                    return entHwAliasBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .HwAlias ent_hw_alias = 8;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.HwAlias getEntHwAlias(int index) {
                if (entHwAliasBuilder_ == null) {
                    return entHwAlias_.get(index);
                } else {
                    return entHwAliasBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .HwAlias ent_hw_alias = 8;</code>
             */
            public Builder setEntHwAlias(
                    int index, co.rira.kafka.model.OpennmsModelProtos.HwAlias value) {
                if (entHwAliasBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureEntHwAliasIsMutable();
                    entHwAlias_.set(index, value);
                    onChanged();
                } else {
                    entHwAliasBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .HwAlias ent_hw_alias = 8;</code>
             */
            public Builder setEntHwAlias(
                    int index, co.rira.kafka.model.OpennmsModelProtos.HwAlias.Builder builderForValue) {
                if (entHwAliasBuilder_ == null) {
                    ensureEntHwAliasIsMutable();
                    entHwAlias_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    entHwAliasBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .HwAlias ent_hw_alias = 8;</code>
             */
            public Builder addEntHwAlias(co.rira.kafka.model.OpennmsModelProtos.HwAlias value) {
                if (entHwAliasBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureEntHwAliasIsMutable();
                    entHwAlias_.add(value);
                    onChanged();
                } else {
                    entHwAliasBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .HwAlias ent_hw_alias = 8;</code>
             */
            public Builder addEntHwAlias(
                    int index, co.rira.kafka.model.OpennmsModelProtos.HwAlias value) {
                if (entHwAliasBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureEntHwAliasIsMutable();
                    entHwAlias_.add(index, value);
                    onChanged();
                } else {
                    entHwAliasBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .HwAlias ent_hw_alias = 8;</code>
             */
            public Builder addEntHwAlias(
                    co.rira.kafka.model.OpennmsModelProtos.HwAlias.Builder builderForValue) {
                if (entHwAliasBuilder_ == null) {
                    ensureEntHwAliasIsMutable();
                    entHwAlias_.add(builderForValue.build());
                    onChanged();
                } else {
                    entHwAliasBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .HwAlias ent_hw_alias = 8;</code>
             */
            public Builder addEntHwAlias(
                    int index, co.rira.kafka.model.OpennmsModelProtos.HwAlias.Builder builderForValue) {
                if (entHwAliasBuilder_ == null) {
                    ensureEntHwAliasIsMutable();
                    entHwAlias_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    entHwAliasBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .HwAlias ent_hw_alias = 8;</code>
             */
            public Builder addAllEntHwAlias(
                    java.lang.Iterable<? extends co.rira.kafka.model.OpennmsModelProtos.HwAlias> values) {
                if (entHwAliasBuilder_ == null) {
                    ensureEntHwAliasIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, entHwAlias_);
                    onChanged();
                } else {
                    entHwAliasBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .HwAlias ent_hw_alias = 8;</code>
             */
            public Builder clearEntHwAlias() {
                if (entHwAliasBuilder_ == null) {
                    entHwAlias_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    entHwAliasBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .HwAlias ent_hw_alias = 8;</code>
             */
            public Builder removeEntHwAlias(int index) {
                if (entHwAliasBuilder_ == null) {
                    ensureEntHwAliasIsMutable();
                    entHwAlias_.remove(index);
                    onChanged();
                } else {
                    entHwAliasBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .HwAlias ent_hw_alias = 8;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.HwAlias.Builder getEntHwAliasBuilder(
                    int index) {
                return getEntHwAliasFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .HwAlias ent_hw_alias = 8;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.HwAliasOrBuilder getEntHwAliasOrBuilder(
                    int index) {
                if (entHwAliasBuilder_ == null) {
                    return entHwAlias_.get(index);
                } else {
                    return entHwAliasBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .HwAlias ent_hw_alias = 8;</code>
             */
            public java.util.List<? extends co.rira.kafka.model.OpennmsModelProtos.HwAliasOrBuilder>
            getEntHwAliasOrBuilderList() {
                if (entHwAliasBuilder_ != null) {
                    return entHwAliasBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(entHwAlias_);
                }
            }

            /**
             * <code>repeated .HwAlias ent_hw_alias = 8;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.HwAlias.Builder addEntHwAliasBuilder() {
                return getEntHwAliasFieldBuilder().addBuilder(
                        co.rira.kafka.model.OpennmsModelProtos.HwAlias.getDefaultInstance());
            }

            /**
             * <code>repeated .HwAlias ent_hw_alias = 8;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.HwAlias.Builder addEntHwAliasBuilder(
                    int index) {
                return getEntHwAliasFieldBuilder().addBuilder(
                        index, co.rira.kafka.model.OpennmsModelProtos.HwAlias.getDefaultInstance());
            }

            /**
             * <code>repeated .HwAlias ent_hw_alias = 8;</code>
             */
            public java.util.List<co.rira.kafka.model.OpennmsModelProtos.HwAlias.Builder>
            getEntHwAliasBuilderList() {
                return getEntHwAliasFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.HwAlias, co.rira.kafka.model.OpennmsModelProtos.HwAlias.Builder, co.rira.kafka.model.OpennmsModelProtos.HwAliasOrBuilder>
            getEntHwAliasFieldBuilder() {
                if (entHwAliasBuilder_ == null) {
                    entHwAliasBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            co.rira.kafka.model.OpennmsModelProtos.HwAlias, co.rira.kafka.model.OpennmsModelProtos.HwAlias.Builder, co.rira.kafka.model.OpennmsModelProtos.HwAliasOrBuilder>(
                            entHwAlias_,
                            ((bitField0_ & 0x00000001) != 0),
                            getParentForChildren(),
                            isClean());
                    entHwAlias_ = null;
                }
                return entHwAliasBuilder_;
            }

            private void ensureChildrenIsMutable() {
                if (!((bitField0_ & 0x00000002) != 0)) {
                    children_ = new java.util.ArrayList<co.rira.kafka.model.OpennmsModelProtos.HwEntity>(children_);
                    bitField0_ |= 0x00000002;
                }
            }

            /**
             * <code>repeated .HwEntity children = 9;</code>
             */
            public java.util.List<co.rira.kafka.model.OpennmsModelProtos.HwEntity> getChildrenList() {
                if (childrenBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(children_);
                } else {
                    return childrenBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .HwEntity children = 9;</code>
             */
            public int getChildrenCount() {
                if (childrenBuilder_ == null) {
                    return children_.size();
                } else {
                    return childrenBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .HwEntity children = 9;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.HwEntity getChildren(int index) {
                if (childrenBuilder_ == null) {
                    return children_.get(index);
                } else {
                    return childrenBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .HwEntity children = 9;</code>
             */
            public Builder setChildren(
                    int index, co.rira.kafka.model.OpennmsModelProtos.HwEntity value) {
                if (childrenBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureChildrenIsMutable();
                    children_.set(index, value);
                    onChanged();
                } else {
                    childrenBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .HwEntity children = 9;</code>
             */
            public Builder setChildren(
                    int index, co.rira.kafka.model.OpennmsModelProtos.HwEntity.Builder builderForValue) {
                if (childrenBuilder_ == null) {
                    ensureChildrenIsMutable();
                    children_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    childrenBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .HwEntity children = 9;</code>
             */
            public Builder addChildren(co.rira.kafka.model.OpennmsModelProtos.HwEntity value) {
                if (childrenBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureChildrenIsMutable();
                    children_.add(value);
                    onChanged();
                } else {
                    childrenBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .HwEntity children = 9;</code>
             */
            public Builder addChildren(
                    int index, co.rira.kafka.model.OpennmsModelProtos.HwEntity value) {
                if (childrenBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureChildrenIsMutable();
                    children_.add(index, value);
                    onChanged();
                } else {
                    childrenBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .HwEntity children = 9;</code>
             */
            public Builder addChildren(
                    co.rira.kafka.model.OpennmsModelProtos.HwEntity.Builder builderForValue) {
                if (childrenBuilder_ == null) {
                    ensureChildrenIsMutable();
                    children_.add(builderForValue.build());
                    onChanged();
                } else {
                    childrenBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .HwEntity children = 9;</code>
             */
            public Builder addChildren(
                    int index, co.rira.kafka.model.OpennmsModelProtos.HwEntity.Builder builderForValue) {
                if (childrenBuilder_ == null) {
                    ensureChildrenIsMutable();
                    children_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    childrenBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .HwEntity children = 9;</code>
             */
            public Builder addAllChildren(
                    java.lang.Iterable<? extends co.rira.kafka.model.OpennmsModelProtos.HwEntity> values) {
                if (childrenBuilder_ == null) {
                    ensureChildrenIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, children_);
                    onChanged();
                } else {
                    childrenBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .HwEntity children = 9;</code>
             */
            public Builder clearChildren() {
                if (childrenBuilder_ == null) {
                    children_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                    onChanged();
                } else {
                    childrenBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .HwEntity children = 9;</code>
             */
            public Builder removeChildren(int index) {
                if (childrenBuilder_ == null) {
                    ensureChildrenIsMutable();
                    children_.remove(index);
                    onChanged();
                } else {
                    childrenBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .HwEntity children = 9;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.HwEntity.Builder getChildrenBuilder(
                    int index) {
                return getChildrenFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .HwEntity children = 9;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.HwEntityOrBuilder getChildrenOrBuilder(
                    int index) {
                if (childrenBuilder_ == null) {
                    return children_.get(index);
                } else {
                    return childrenBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .HwEntity children = 9;</code>
             */
            public java.util.List<? extends co.rira.kafka.model.OpennmsModelProtos.HwEntityOrBuilder>
            getChildrenOrBuilderList() {
                if (childrenBuilder_ != null) {
                    return childrenBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(children_);
                }
            }

            /**
             * <code>repeated .HwEntity children = 9;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.HwEntity.Builder addChildrenBuilder() {
                return getChildrenFieldBuilder().addBuilder(
                        co.rira.kafka.model.OpennmsModelProtos.HwEntity.getDefaultInstance());
            }

            /**
             * <code>repeated .HwEntity children = 9;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.HwEntity.Builder addChildrenBuilder(
                    int index) {
                return getChildrenFieldBuilder().addBuilder(
                        index, co.rira.kafka.model.OpennmsModelProtos.HwEntity.getDefaultInstance());
            }

            /**
             * <code>repeated .HwEntity children = 9;</code>
             */
            public java.util.List<co.rira.kafka.model.OpennmsModelProtos.HwEntity.Builder>
            getChildrenBuilderList() {
                return getChildrenFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.HwEntity, co.rira.kafka.model.OpennmsModelProtos.HwEntity.Builder, co.rira.kafka.model.OpennmsModelProtos.HwEntityOrBuilder>
            getChildrenFieldBuilder() {
                if (childrenBuilder_ == null) {
                    childrenBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            co.rira.kafka.model.OpennmsModelProtos.HwEntity, co.rira.kafka.model.OpennmsModelProtos.HwEntity.Builder, co.rira.kafka.model.OpennmsModelProtos.HwEntityOrBuilder>(
                            children_,
                            ((bitField0_ & 0x00000002) != 0),
                            getParentForChildren(),
                            isClean());
                    children_ = null;
                }
                return childrenBuilder_;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:HwEntity)
        }

    }

    /**
     * Protobuf type {@code Node}
     */
    public static final class Node extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:Node)
            NodeOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int FOREIGN_SOURCE_FIELD_NUMBER = 2;
        public static final int FOREIGN_ID_FIELD_NUMBER = 3;
        public static final int LOCATION_FIELD_NUMBER = 4;
        public static final int CATEGORY_FIELD_NUMBER = 5;
        public static final int LABEL_FIELD_NUMBER = 6;
        public static final int CREATE_TIME_FIELD_NUMBER = 7;
        public static final int SYS_CONTACT_FIELD_NUMBER = 8;
        public static final int SYS_DESCRIPTION_FIELD_NUMBER = 9;
        public static final int SYS_OBJECT_ID_FIELD_NUMBER = 10;
        public static final int IP_INTERFACE_FIELD_NUMBER = 11;
        public static final int SNMP_INTERFACE_FIELD_NUMBER = 12;
        public static final int HW_INVENTORY_FIELD_NUMBER = 13;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:Node)
        private static final co.rira.kafka.model.OpennmsModelProtos.Node DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<Node>
                PARSER = new com.google.protobuf.AbstractParser<Node>() {
            @java.lang.Override
            public Node parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Node(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new co.rira.kafka.model.OpennmsModelProtos.Node();
        }

        private long id_;
        private volatile java.lang.Object foreignSource_;
        private volatile java.lang.Object foreignId_;
        private volatile java.lang.Object location_;
        private com.google.protobuf.LazyStringList category_;
        private volatile java.lang.Object label_;
        private long createTime_;
        private volatile java.lang.Object sysContact_;
        private volatile java.lang.Object sysDescription_;
        private volatile java.lang.Object sysObjectId_;
        private java.util.List<co.rira.kafka.model.OpennmsModelProtos.IpInterface> ipInterface_;
        private java.util.List<co.rira.kafka.model.OpennmsModelProtos.SnmpInterface> snmpInterface_;
        private co.rira.kafka.model.OpennmsModelProtos.HwEntity hwInventory_;
        private byte memoizedIsInitialized = -1;

        // Use Node.newBuilder() to construct.
        private Node(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Node() {
            foreignSource_ = "";
            foreignId_ = "";
            location_ = "";
            category_ = com.google.protobuf.LazyStringArrayList.EMPTY;
            label_ = "";
            sysContact_ = "";
            sysDescription_ = "";
            sysObjectId_ = "";
            ipInterface_ = java.util.Collections.emptyList();
            snmpInterface_ = java.util.Collections.emptyList();
        }

        private Node(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8: {

                            id_ = input.readUInt64();
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            foreignSource_ = s;
                            break;
                        }
                        case 26: {
                            java.lang.String s = input.readStringRequireUtf8();

                            foreignId_ = s;
                            break;
                        }
                        case 34: {
                            java.lang.String s = input.readStringRequireUtf8();

                            location_ = s;
                            break;
                        }
                        case 42: {
                            java.lang.String s = input.readStringRequireUtf8();
                            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                category_ = new com.google.protobuf.LazyStringArrayList();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            category_.add(s);
                            break;
                        }
                        case 50: {
                            java.lang.String s = input.readStringRequireUtf8();

                            label_ = s;
                            break;
                        }
                        case 56: {

                            createTime_ = input.readUInt64();
                            break;
                        }
                        case 66: {
                            java.lang.String s = input.readStringRequireUtf8();

                            sysContact_ = s;
                            break;
                        }
                        case 74: {
                            java.lang.String s = input.readStringRequireUtf8();

                            sysDescription_ = s;
                            break;
                        }
                        case 82: {
                            java.lang.String s = input.readStringRequireUtf8();

                            sysObjectId_ = s;
                            break;
                        }
                        case 90: {
                            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                                ipInterface_ = new java.util.ArrayList<co.rira.kafka.model.OpennmsModelProtos.IpInterface>();
                                mutable_bitField0_ |= 0x00000002;
                            }
                            ipInterface_.add(
                                    input.readMessage(co.rira.kafka.model.OpennmsModelProtos.IpInterface.parser(), extensionRegistry));
                            break;
                        }
                        case 98: {
                            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                                snmpInterface_ = new java.util.ArrayList<co.rira.kafka.model.OpennmsModelProtos.SnmpInterface>();
                                mutable_bitField0_ |= 0x00000004;
                            }
                            snmpInterface_.add(
                                    input.readMessage(co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.parser(), extensionRegistry));
                            break;
                        }
                        case 106: {
                            co.rira.kafka.model.OpennmsModelProtos.HwEntity.Builder subBuilder = null;
                            if (hwInventory_ != null) {
                                subBuilder = hwInventory_.toBuilder();
                            }
                            hwInventory_ = input.readMessage(co.rira.kafka.model.OpennmsModelProtos.HwEntity.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(hwInventory_);
                                hwInventory_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    category_ = category_.getUnmodifiableView();
                }
                if (((mutable_bitField0_ & 0x00000002) != 0)) {
                    ipInterface_ = java.util.Collections.unmodifiableList(ipInterface_);
                }
                if (((mutable_bitField0_ & 0x00000004) != 0)) {
                    snmpInterface_ = java.util.Collections.unmodifiableList(snmpInterface_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_Node_descriptor;
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Node parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Node parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Node parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Node parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Node parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Node parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Node parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Node parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Node parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Node parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Node parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Node parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(co.rira.kafka.model.OpennmsModelProtos.Node prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.Node getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<Node> parser() {
            return PARSER;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new Node();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_Node_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            co.rira.kafka.model.OpennmsModelProtos.Node.class, co.rira.kafka.model.OpennmsModelProtos.Node.Builder.class);
        }

        /**
         * <code>uint64 id = 1;</code>
         *
         * @return The id.
         */
        public long getId() {
            return id_;
        }

        /**
         * <code>string foreign_source = 2;</code>
         *
         * @return The foreignSource.
         */
        public java.lang.String getForeignSource() {
            java.lang.Object ref = foreignSource_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                foreignSource_ = s;
                return s;
            }
        }

        /**
         * <code>string foreign_source = 2;</code>
         *
         * @return The bytes for foreignSource.
         */
        public com.google.protobuf.ByteString
        getForeignSourceBytes() {
            java.lang.Object ref = foreignSource_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                foreignSource_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string foreign_id = 3;</code>
         *
         * @return The foreignId.
         */
        public java.lang.String getForeignId() {
            java.lang.Object ref = foreignId_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                foreignId_ = s;
                return s;
            }
        }

        /**
         * <code>string foreign_id = 3;</code>
         *
         * @return The bytes for foreignId.
         */
        public com.google.protobuf.ByteString
        getForeignIdBytes() {
            java.lang.Object ref = foreignId_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                foreignId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string location = 4;</code>
         *
         * @return The location.
         */
        public java.lang.String getLocation() {
            java.lang.Object ref = location_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                location_ = s;
                return s;
            }
        }

        /**
         * <code>string location = 4;</code>
         *
         * @return The bytes for location.
         */
        public com.google.protobuf.ByteString
        getLocationBytes() {
            java.lang.Object ref = location_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                location_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>repeated string category = 5;</code>
         *
         * @return A list containing the category.
         */
        public com.google.protobuf.ProtocolStringList
        getCategoryList() {
            return category_;
        }

        /**
         * <code>repeated string category = 5;</code>
         *
         * @return The count of category.
         */
        public int getCategoryCount() {
            return category_.size();
        }

        /**
         * <code>repeated string category = 5;</code>
         *
         * @param index The index of the element to return.
         * @return The category at the given index.
         */
        public java.lang.String getCategory(int index) {
            return category_.get(index);
        }

        /**
         * <code>repeated string category = 5;</code>
         *
         * @param index The index of the value to return.
         * @return The bytes of the category at the given index.
         */
        public com.google.protobuf.ByteString
        getCategoryBytes(int index) {
            return category_.getByteString(index);
        }

        /**
         * <code>string label = 6;</code>
         *
         * @return The label.
         */
        public java.lang.String getLabel() {
            java.lang.Object ref = label_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                label_ = s;
                return s;
            }
        }

        /**
         * <code>string label = 6;</code>
         *
         * @return The bytes for label.
         */
        public com.google.protobuf.ByteString
        getLabelBytes() {
            java.lang.Object ref = label_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                label_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>uint64 create_time = 7;</code>
         *
         * @return The createTime.
         */
        public long getCreateTime() {
            return createTime_;
        }

        /**
         * <code>string sys_contact = 8;</code>
         *
         * @return The sysContact.
         */
        public java.lang.String getSysContact() {
            java.lang.Object ref = sysContact_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                sysContact_ = s;
                return s;
            }
        }

        /**
         * <code>string sys_contact = 8;</code>
         *
         * @return The bytes for sysContact.
         */
        public com.google.protobuf.ByteString
        getSysContactBytes() {
            java.lang.Object ref = sysContact_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                sysContact_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string sys_description = 9;</code>
         *
         * @return The sysDescription.
         */
        public java.lang.String getSysDescription() {
            java.lang.Object ref = sysDescription_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                sysDescription_ = s;
                return s;
            }
        }

        /**
         * <code>string sys_description = 9;</code>
         *
         * @return The bytes for sysDescription.
         */
        public com.google.protobuf.ByteString
        getSysDescriptionBytes() {
            java.lang.Object ref = sysDescription_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                sysDescription_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string sys_object_id = 10;</code>
         *
         * @return The sysObjectId.
         */
        public java.lang.String getSysObjectId() {
            java.lang.Object ref = sysObjectId_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                sysObjectId_ = s;
                return s;
            }
        }

        /**
         * <code>string sys_object_id = 10;</code>
         *
         * @return The bytes for sysObjectId.
         */
        public com.google.protobuf.ByteString
        getSysObjectIdBytes() {
            java.lang.Object ref = sysObjectId_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                sysObjectId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>repeated .IpInterface ip_interface = 11;</code>
         */
        public java.util.List<co.rira.kafka.model.OpennmsModelProtos.IpInterface> getIpInterfaceList() {
            return ipInterface_;
        }

        /**
         * <code>repeated .IpInterface ip_interface = 11;</code>
         */
        public java.util.List<? extends co.rira.kafka.model.OpennmsModelProtos.IpInterfaceOrBuilder>
        getIpInterfaceOrBuilderList() {
            return ipInterface_;
        }

        /**
         * <code>repeated .IpInterface ip_interface = 11;</code>
         */
        public int getIpInterfaceCount() {
            return ipInterface_.size();
        }

        /**
         * <code>repeated .IpInterface ip_interface = 11;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.IpInterface getIpInterface(int index) {
            return ipInterface_.get(index);
        }

        /**
         * <code>repeated .IpInterface ip_interface = 11;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.IpInterfaceOrBuilder getIpInterfaceOrBuilder(
                int index) {
            return ipInterface_.get(index);
        }

        /**
         * <code>repeated .SnmpInterface snmp_interface = 12;</code>
         */
        public java.util.List<co.rira.kafka.model.OpennmsModelProtos.SnmpInterface> getSnmpInterfaceList() {
            return snmpInterface_;
        }

        /**
         * <code>repeated .SnmpInterface snmp_interface = 12;</code>
         */
        public java.util.List<? extends co.rira.kafka.model.OpennmsModelProtos.SnmpInterfaceOrBuilder>
        getSnmpInterfaceOrBuilderList() {
            return snmpInterface_;
        }

        /**
         * <code>repeated .SnmpInterface snmp_interface = 12;</code>
         */
        public int getSnmpInterfaceCount() {
            return snmpInterface_.size();
        }

        /**
         * <code>repeated .SnmpInterface snmp_interface = 12;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.SnmpInterface getSnmpInterface(int index) {
            return snmpInterface_.get(index);
        }

        /**
         * <code>repeated .SnmpInterface snmp_interface = 12;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.SnmpInterfaceOrBuilder getSnmpInterfaceOrBuilder(
                int index) {
            return snmpInterface_.get(index);
        }

        /**
         * <code>.HwEntity hw_inventory = 13;</code>
         *
         * @return Whether the hwInventory field is set.
         */
        public boolean hasHwInventory() {
            return hwInventory_ != null;
        }

        /**
         * <code>.HwEntity hw_inventory = 13;</code>
         *
         * @return The hwInventory.
         */
        public co.rira.kafka.model.OpennmsModelProtos.HwEntity getHwInventory() {
            return hwInventory_ == null ? co.rira.kafka.model.OpennmsModelProtos.HwEntity.getDefaultInstance() : hwInventory_;
        }

        /**
         * <code>.HwEntity hw_inventory = 13;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.HwEntityOrBuilder getHwInventoryOrBuilder() {
            return getHwInventory();
        }

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (id_ != 0L) {
                output.writeUInt64(1, id_);
            }
            if (!getForeignSourceBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, foreignSource_);
            }
            if (!getForeignIdBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, foreignId_);
            }
            if (!getLocationBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 4, location_);
            }
            for (int i = 0; i < category_.size(); i++) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 5, category_.getRaw(i));
            }
            if (!getLabelBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 6, label_);
            }
            if (createTime_ != 0L) {
                output.writeUInt64(7, createTime_);
            }
            if (!getSysContactBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 8, sysContact_);
            }
            if (!getSysDescriptionBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 9, sysDescription_);
            }
            if (!getSysObjectIdBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 10, sysObjectId_);
            }
            for (int i = 0; i < ipInterface_.size(); i++) {
                output.writeMessage(11, ipInterface_.get(i));
            }
            for (int i = 0; i < snmpInterface_.size(); i++) {
                output.writeMessage(12, snmpInterface_.get(i));
            }
            if (hwInventory_ != null) {
                output.writeMessage(13, getHwInventory());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(1, id_);
            }
            if (!getForeignSourceBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, foreignSource_);
            }
            if (!getForeignIdBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, foreignId_);
            }
            if (!getLocationBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, location_);
            }
            {
                int dataSize = 0;
                for (int i = 0; i < category_.size(); i++) {
                    dataSize += computeStringSizeNoTag(category_.getRaw(i));
                }
                size += dataSize;
                size += 1 * getCategoryList().size();
            }
            if (!getLabelBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, label_);
            }
            if (createTime_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(7, createTime_);
            }
            if (!getSysContactBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, sysContact_);
            }
            if (!getSysDescriptionBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, sysDescription_);
            }
            if (!getSysObjectIdBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, sysObjectId_);
            }
            for (int i = 0; i < ipInterface_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(11, ipInterface_.get(i));
            }
            for (int i = 0; i < snmpInterface_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(12, snmpInterface_.get(i));
            }
            if (hwInventory_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(13, getHwInventory());
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof co.rira.kafka.model.OpennmsModelProtos.Node)) {
                return super.equals(obj);
            }
            co.rira.kafka.model.OpennmsModelProtos.Node other = (co.rira.kafka.model.OpennmsModelProtos.Node) obj;

            if (getId()
                    != other.getId()) return false;
            if (!getForeignSource()
                    .equals(other.getForeignSource())) return false;
            if (!getForeignId()
                    .equals(other.getForeignId())) return false;
            if (!getLocation()
                    .equals(other.getLocation())) return false;
            if (!getCategoryList()
                    .equals(other.getCategoryList())) return false;
            if (!getLabel()
                    .equals(other.getLabel())) return false;
            if (getCreateTime()
                    != other.getCreateTime()) return false;
            if (!getSysContact()
                    .equals(other.getSysContact())) return false;
            if (!getSysDescription()
                    .equals(other.getSysDescription())) return false;
            if (!getSysObjectId()
                    .equals(other.getSysObjectId())) return false;
            if (!getIpInterfaceList()
                    .equals(other.getIpInterfaceList())) return false;
            if (!getSnmpInterfaceList()
                    .equals(other.getSnmpInterfaceList())) return false;
            if (hasHwInventory() != other.hasHwInventory()) return false;
            if (hasHwInventory()) {
                if (!getHwInventory()
                        .equals(other.getHwInventory())) return false;
            }
            return unknownFields.equals(other.unknownFields);
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getId());
            hash = (37 * hash) + FOREIGN_SOURCE_FIELD_NUMBER;
            hash = (53 * hash) + getForeignSource().hashCode();
            hash = (37 * hash) + FOREIGN_ID_FIELD_NUMBER;
            hash = (53 * hash) + getForeignId().hashCode();
            hash = (37 * hash) + LOCATION_FIELD_NUMBER;
            hash = (53 * hash) + getLocation().hashCode();
            if (getCategoryCount() > 0) {
                hash = (37 * hash) + CATEGORY_FIELD_NUMBER;
                hash = (53 * hash) + getCategoryList().hashCode();
            }
            hash = (37 * hash) + LABEL_FIELD_NUMBER;
            hash = (53 * hash) + getLabel().hashCode();
            hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getCreateTime());
            hash = (37 * hash) + SYS_CONTACT_FIELD_NUMBER;
            hash = (53 * hash) + getSysContact().hashCode();
            hash = (37 * hash) + SYS_DESCRIPTION_FIELD_NUMBER;
            hash = (53 * hash) + getSysDescription().hashCode();
            hash = (37 * hash) + SYS_OBJECT_ID_FIELD_NUMBER;
            hash = (53 * hash) + getSysObjectId().hashCode();
            if (getIpInterfaceCount() > 0) {
                hash = (37 * hash) + IP_INTERFACE_FIELD_NUMBER;
                hash = (53 * hash) + getIpInterfaceList().hashCode();
            }
            if (getSnmpInterfaceCount() > 0) {
                hash = (37 * hash) + SNMP_INTERFACE_FIELD_NUMBER;
                hash = (53 * hash) + getSnmpInterfaceList().hashCode();
            }
            if (hasHwInventory()) {
                hash = (37 * hash) + HW_INVENTORY_FIELD_NUMBER;
                hash = (53 * hash) + getHwInventory().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<Node> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public co.rira.kafka.model.OpennmsModelProtos.Node getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code Node}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:Node)
                co.rira.kafka.model.OpennmsModelProtos.NodeOrBuilder {
            private int bitField0_;
            private long id_;
            private java.lang.Object foreignSource_ = "";
            private java.lang.Object foreignId_ = "";
            private java.lang.Object location_ = "";
            private com.google.protobuf.LazyStringList category_ = com.google.protobuf.LazyStringArrayList.EMPTY;
            private java.lang.Object label_ = "";
            private long createTime_;
            private java.lang.Object sysContact_ = "";
            private java.lang.Object sysDescription_ = "";
            private java.lang.Object sysObjectId_ = "";
            private java.util.List<co.rira.kafka.model.OpennmsModelProtos.IpInterface> ipInterface_ =
                    java.util.Collections.emptyList();
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.IpInterface, co.rira.kafka.model.OpennmsModelProtos.IpInterface.Builder, co.rira.kafka.model.OpennmsModelProtos.IpInterfaceOrBuilder> ipInterfaceBuilder_;
            private java.util.List<co.rira.kafka.model.OpennmsModelProtos.SnmpInterface> snmpInterface_ =
                    java.util.Collections.emptyList();
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.SnmpInterface, co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.Builder, co.rira.kafka.model.OpennmsModelProtos.SnmpInterfaceOrBuilder> snmpInterfaceBuilder_;
            private co.rira.kafka.model.OpennmsModelProtos.HwEntity hwInventory_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.HwEntity, co.rira.kafka.model.OpennmsModelProtos.HwEntity.Builder, co.rira.kafka.model.OpennmsModelProtos.HwEntityOrBuilder> hwInventoryBuilder_;

            // Construct using co.rira.kafka.model.OpennmsModelProtos.Node.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_Node_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_Node_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                co.rira.kafka.model.OpennmsModelProtos.Node.class, co.rira.kafka.model.OpennmsModelProtos.Node.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getIpInterfaceFieldBuilder();
                    getSnmpInterfaceFieldBuilder();
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                id_ = 0L;

                foreignSource_ = "";

                foreignId_ = "";

                location_ = "";

                category_ = com.google.protobuf.LazyStringArrayList.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000001);
                label_ = "";

                createTime_ = 0L;

                sysContact_ = "";

                sysDescription_ = "";

                sysObjectId_ = "";

                if (ipInterfaceBuilder_ == null) {
                    ipInterface_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                } else {
                    ipInterfaceBuilder_.clear();
                }
                if (snmpInterfaceBuilder_ == null) {
                    snmpInterface_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000004);
                } else {
                    snmpInterfaceBuilder_.clear();
                }
                if (hwInventoryBuilder_ == null) {
                    hwInventory_ = null;
                } else {
                    hwInventory_ = null;
                    hwInventoryBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_Node_descriptor;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.Node getDefaultInstanceForType() {
                return co.rira.kafka.model.OpennmsModelProtos.Node.getDefaultInstance();
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.Node build() {
                co.rira.kafka.model.OpennmsModelProtos.Node result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.Node buildPartial() {
                co.rira.kafka.model.OpennmsModelProtos.Node result = new co.rira.kafka.model.OpennmsModelProtos.Node(this);
                int from_bitField0_ = bitField0_;
                result.id_ = id_;
                result.foreignSource_ = foreignSource_;
                result.foreignId_ = foreignId_;
                result.location_ = location_;
                if (((bitField0_ & 0x00000001) != 0)) {
                    category_ = category_.getUnmodifiableView();
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.category_ = category_;
                result.label_ = label_;
                result.createTime_ = createTime_;
                result.sysContact_ = sysContact_;
                result.sysDescription_ = sysDescription_;
                result.sysObjectId_ = sysObjectId_;
                if (ipInterfaceBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) != 0)) {
                        ipInterface_ = java.util.Collections.unmodifiableList(ipInterface_);
                        bitField0_ = (bitField0_ & ~0x00000002);
                    }
                    result.ipInterface_ = ipInterface_;
                } else {
                    result.ipInterface_ = ipInterfaceBuilder_.build();
                }
                if (snmpInterfaceBuilder_ == null) {
                    if (((bitField0_ & 0x00000004) != 0)) {
                        snmpInterface_ = java.util.Collections.unmodifiableList(snmpInterface_);
                        bitField0_ = (bitField0_ & ~0x00000004);
                    }
                    result.snmpInterface_ = snmpInterface_;
                } else {
                    result.snmpInterface_ = snmpInterfaceBuilder_.build();
                }
                if (hwInventoryBuilder_ == null) {
                    result.hwInventory_ = hwInventory_;
                } else {
                    result.hwInventory_ = hwInventoryBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof co.rira.kafka.model.OpennmsModelProtos.Node) {
                    return mergeFrom((co.rira.kafka.model.OpennmsModelProtos.Node) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(co.rira.kafka.model.OpennmsModelProtos.Node other) {
                if (other == co.rira.kafka.model.OpennmsModelProtos.Node.getDefaultInstance()) return this;
                if (other.getId() != 0L) {
                    setId(other.getId());
                }
                if (!other.getForeignSource().isEmpty()) {
                    foreignSource_ = other.foreignSource_;
                    onChanged();
                }
                if (!other.getForeignId().isEmpty()) {
                    foreignId_ = other.foreignId_;
                    onChanged();
                }
                if (!other.getLocation().isEmpty()) {
                    location_ = other.location_;
                    onChanged();
                }
                if (!other.category_.isEmpty()) {
                    if (category_.isEmpty()) {
                        category_ = other.category_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureCategoryIsMutable();
                        category_.addAll(other.category_);
                    }
                    onChanged();
                }
                if (!other.getLabel().isEmpty()) {
                    label_ = other.label_;
                    onChanged();
                }
                if (other.getCreateTime() != 0L) {
                    setCreateTime(other.getCreateTime());
                }
                if (!other.getSysContact().isEmpty()) {
                    sysContact_ = other.sysContact_;
                    onChanged();
                }
                if (!other.getSysDescription().isEmpty()) {
                    sysDescription_ = other.sysDescription_;
                    onChanged();
                }
                if (!other.getSysObjectId().isEmpty()) {
                    sysObjectId_ = other.sysObjectId_;
                    onChanged();
                }
                if (ipInterfaceBuilder_ == null) {
                    if (!other.ipInterface_.isEmpty()) {
                        if (ipInterface_.isEmpty()) {
                            ipInterface_ = other.ipInterface_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                        } else {
                            ensureIpInterfaceIsMutable();
                            ipInterface_.addAll(other.ipInterface_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.ipInterface_.isEmpty()) {
                        if (ipInterfaceBuilder_.isEmpty()) {
                            ipInterfaceBuilder_.dispose();
                            ipInterfaceBuilder_ = null;
                            ipInterface_ = other.ipInterface_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                            ipInterfaceBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getIpInterfaceFieldBuilder() : null;
                        } else {
                            ipInterfaceBuilder_.addAllMessages(other.ipInterface_);
                        }
                    }
                }
                if (snmpInterfaceBuilder_ == null) {
                    if (!other.snmpInterface_.isEmpty()) {
                        if (snmpInterface_.isEmpty()) {
                            snmpInterface_ = other.snmpInterface_;
                            bitField0_ = (bitField0_ & ~0x00000004);
                        } else {
                            ensureSnmpInterfaceIsMutable();
                            snmpInterface_.addAll(other.snmpInterface_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.snmpInterface_.isEmpty()) {
                        if (snmpInterfaceBuilder_.isEmpty()) {
                            snmpInterfaceBuilder_.dispose();
                            snmpInterfaceBuilder_ = null;
                            snmpInterface_ = other.snmpInterface_;
                            bitField0_ = (bitField0_ & ~0x00000004);
                            snmpInterfaceBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getSnmpInterfaceFieldBuilder() : null;
                        } else {
                            snmpInterfaceBuilder_.addAllMessages(other.snmpInterface_);
                        }
                    }
                }
                if (other.hasHwInventory()) {
                    mergeHwInventory(other.getHwInventory());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                co.rira.kafka.model.OpennmsModelProtos.Node parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (co.rira.kafka.model.OpennmsModelProtos.Node) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>uint64 id = 1;</code>
             *
             * @return The id.
             */
            public long getId() {
                return id_;
            }

            /**
             * <code>uint64 id = 1;</code>
             *
             * @param value The id to set.
             * @return This builder for chaining.
             */
            public Builder setId(long value) {

                id_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 id = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearId() {

                id_ = 0L;
                onChanged();
                return this;
            }

            /**
             * <code>string foreign_source = 2;</code>
             *
             * @return The foreignSource.
             */
            public java.lang.String getForeignSource() {
                java.lang.Object ref = foreignSource_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    foreignSource_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string foreign_source = 2;</code>
             *
             * @param value The foreignSource to set.
             * @return This builder for chaining.
             */
            public Builder setForeignSource(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                foreignSource_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string foreign_source = 2;</code>
             *
             * @return The bytes for foreignSource.
             */
            public com.google.protobuf.ByteString
            getForeignSourceBytes() {
                java.lang.Object ref = foreignSource_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    foreignSource_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string foreign_source = 2;</code>
             *
             * @param value The bytes for foreignSource to set.
             * @return This builder for chaining.
             */
            public Builder setForeignSourceBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                foreignSource_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string foreign_source = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearForeignSource() {

                foreignSource_ = getDefaultInstance().getForeignSource();
                onChanged();
                return this;
            }

            /**
             * <code>string foreign_id = 3;</code>
             *
             * @return The foreignId.
             */
            public java.lang.String getForeignId() {
                java.lang.Object ref = foreignId_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    foreignId_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string foreign_id = 3;</code>
             *
             * @param value The foreignId to set.
             * @return This builder for chaining.
             */
            public Builder setForeignId(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                foreignId_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string foreign_id = 3;</code>
             *
             * @return The bytes for foreignId.
             */
            public com.google.protobuf.ByteString
            getForeignIdBytes() {
                java.lang.Object ref = foreignId_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    foreignId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string foreign_id = 3;</code>
             *
             * @param value The bytes for foreignId to set.
             * @return This builder for chaining.
             */
            public Builder setForeignIdBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                foreignId_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string foreign_id = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearForeignId() {

                foreignId_ = getDefaultInstance().getForeignId();
                onChanged();
                return this;
            }

            /**
             * <code>string location = 4;</code>
             *
             * @return The location.
             */
            public java.lang.String getLocation() {
                java.lang.Object ref = location_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    location_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string location = 4;</code>
             *
             * @param value The location to set.
             * @return This builder for chaining.
             */
            public Builder setLocation(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                location_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string location = 4;</code>
             *
             * @return The bytes for location.
             */
            public com.google.protobuf.ByteString
            getLocationBytes() {
                java.lang.Object ref = location_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    location_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string location = 4;</code>
             *
             * @param value The bytes for location to set.
             * @return This builder for chaining.
             */
            public Builder setLocationBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                location_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string location = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLocation() {

                location_ = getDefaultInstance().getLocation();
                onChanged();
                return this;
            }

            private void ensureCategoryIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    category_ = new com.google.protobuf.LazyStringArrayList(category_);
                    bitField0_ |= 0x00000001;
                }
            }

            /**
             * <code>repeated string category = 5;</code>
             *
             * @return A list containing the category.
             */
            public com.google.protobuf.ProtocolStringList
            getCategoryList() {
                return category_.getUnmodifiableView();
            }

            /**
             * <code>repeated string category = 5;</code>
             *
             * @return The count of category.
             */
            public int getCategoryCount() {
                return category_.size();
            }

            /**
             * <code>repeated string category = 5;</code>
             *
             * @param index The index of the element to return.
             * @return The category at the given index.
             */
            public java.lang.String getCategory(int index) {
                return category_.get(index);
            }

            /**
             * <code>repeated string category = 5;</code>
             *
             * @param index The index of the value to return.
             * @return The bytes of the category at the given index.
             */
            public com.google.protobuf.ByteString
            getCategoryBytes(int index) {
                return category_.getByteString(index);
            }

            /**
             * <code>repeated string category = 5;</code>
             *
             * @param index The index to set the value at.
             * @param value The category to set.
             * @return This builder for chaining.
             */
            public Builder setCategory(
                    int index, java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureCategoryIsMutable();
                category_.set(index, value);
                onChanged();
                return this;
            }

            /**
             * <code>repeated string category = 5;</code>
             *
             * @param value The category to add.
             * @return This builder for chaining.
             */
            public Builder addCategory(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureCategoryIsMutable();
                category_.add(value);
                onChanged();
                return this;
            }

            /**
             * <code>repeated string category = 5;</code>
             *
             * @param values The category to add.
             * @return This builder for chaining.
             */
            public Builder addAllCategory(
                    java.lang.Iterable<java.lang.String> values) {
                ensureCategoryIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(
                        values, category_);
                onChanged();
                return this;
            }

            /**
             * <code>repeated string category = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCategory() {
                category_ = com.google.protobuf.LazyStringArrayList.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
                return this;
            }

            /**
             * <code>repeated string category = 5;</code>
             *
             * @param value The bytes of the category to add.
             * @return This builder for chaining.
             */
            public Builder addCategoryBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);
                ensureCategoryIsMutable();
                category_.add(value);
                onChanged();
                return this;
            }

            /**
             * <code>string label = 6;</code>
             *
             * @return The label.
             */
            public java.lang.String getLabel() {
                java.lang.Object ref = label_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    label_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string label = 6;</code>
             *
             * @param value The label to set.
             * @return This builder for chaining.
             */
            public Builder setLabel(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                label_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string label = 6;</code>
             *
             * @return The bytes for label.
             */
            public com.google.protobuf.ByteString
            getLabelBytes() {
                java.lang.Object ref = label_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    label_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string label = 6;</code>
             *
             * @param value The bytes for label to set.
             * @return This builder for chaining.
             */
            public Builder setLabelBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                label_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string label = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLabel() {

                label_ = getDefaultInstance().getLabel();
                onChanged();
                return this;
            }

            /**
             * <code>uint64 create_time = 7;</code>
             *
             * @return The createTime.
             */
            public long getCreateTime() {
                return createTime_;
            }

            /**
             * <code>uint64 create_time = 7;</code>
             *
             * @param value The createTime to set.
             * @return This builder for chaining.
             */
            public Builder setCreateTime(long value) {

                createTime_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 create_time = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCreateTime() {

                createTime_ = 0L;
                onChanged();
                return this;
            }

            /**
             * <code>string sys_contact = 8;</code>
             *
             * @return The sysContact.
             */
            public java.lang.String getSysContact() {
                java.lang.Object ref = sysContact_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    sysContact_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string sys_contact = 8;</code>
             *
             * @param value The sysContact to set.
             * @return This builder for chaining.
             */
            public Builder setSysContact(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                sysContact_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string sys_contact = 8;</code>
             *
             * @return The bytes for sysContact.
             */
            public com.google.protobuf.ByteString
            getSysContactBytes() {
                java.lang.Object ref = sysContact_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    sysContact_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string sys_contact = 8;</code>
             *
             * @param value The bytes for sysContact to set.
             * @return This builder for chaining.
             */
            public Builder setSysContactBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                sysContact_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string sys_contact = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSysContact() {

                sysContact_ = getDefaultInstance().getSysContact();
                onChanged();
                return this;
            }

            /**
             * <code>string sys_description = 9;</code>
             *
             * @return The sysDescription.
             */
            public java.lang.String getSysDescription() {
                java.lang.Object ref = sysDescription_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    sysDescription_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string sys_description = 9;</code>
             *
             * @param value The sysDescription to set.
             * @return This builder for chaining.
             */
            public Builder setSysDescription(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                sysDescription_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string sys_description = 9;</code>
             *
             * @return The bytes for sysDescription.
             */
            public com.google.protobuf.ByteString
            getSysDescriptionBytes() {
                java.lang.Object ref = sysDescription_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    sysDescription_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string sys_description = 9;</code>
             *
             * @param value The bytes for sysDescription to set.
             * @return This builder for chaining.
             */
            public Builder setSysDescriptionBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                sysDescription_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string sys_description = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSysDescription() {

                sysDescription_ = getDefaultInstance().getSysDescription();
                onChanged();
                return this;
            }

            /**
             * <code>string sys_object_id = 10;</code>
             *
             * @return The sysObjectId.
             */
            public java.lang.String getSysObjectId() {
                java.lang.Object ref = sysObjectId_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    sysObjectId_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string sys_object_id = 10;</code>
             *
             * @param value The sysObjectId to set.
             * @return This builder for chaining.
             */
            public Builder setSysObjectId(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                sysObjectId_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string sys_object_id = 10;</code>
             *
             * @return The bytes for sysObjectId.
             */
            public com.google.protobuf.ByteString
            getSysObjectIdBytes() {
                java.lang.Object ref = sysObjectId_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    sysObjectId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string sys_object_id = 10;</code>
             *
             * @param value The bytes for sysObjectId to set.
             * @return This builder for chaining.
             */
            public Builder setSysObjectIdBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                sysObjectId_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string sys_object_id = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSysObjectId() {

                sysObjectId_ = getDefaultInstance().getSysObjectId();
                onChanged();
                return this;
            }

            private void ensureIpInterfaceIsMutable() {
                if (!((bitField0_ & 0x00000002) != 0)) {
                    ipInterface_ = new java.util.ArrayList<co.rira.kafka.model.OpennmsModelProtos.IpInterface>(ipInterface_);
                    bitField0_ |= 0x00000002;
                }
            }

            /**
             * <code>repeated .IpInterface ip_interface = 11;</code>
             */
            public java.util.List<co.rira.kafka.model.OpennmsModelProtos.IpInterface> getIpInterfaceList() {
                if (ipInterfaceBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(ipInterface_);
                } else {
                    return ipInterfaceBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .IpInterface ip_interface = 11;</code>
             */
            public int getIpInterfaceCount() {
                if (ipInterfaceBuilder_ == null) {
                    return ipInterface_.size();
                } else {
                    return ipInterfaceBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .IpInterface ip_interface = 11;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.IpInterface getIpInterface(int index) {
                if (ipInterfaceBuilder_ == null) {
                    return ipInterface_.get(index);
                } else {
                    return ipInterfaceBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .IpInterface ip_interface = 11;</code>
             */
            public Builder setIpInterface(
                    int index, co.rira.kafka.model.OpennmsModelProtos.IpInterface value) {
                if (ipInterfaceBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureIpInterfaceIsMutable();
                    ipInterface_.set(index, value);
                    onChanged();
                } else {
                    ipInterfaceBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .IpInterface ip_interface = 11;</code>
             */
            public Builder setIpInterface(
                    int index, co.rira.kafka.model.OpennmsModelProtos.IpInterface.Builder builderForValue) {
                if (ipInterfaceBuilder_ == null) {
                    ensureIpInterfaceIsMutable();
                    ipInterface_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    ipInterfaceBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .IpInterface ip_interface = 11;</code>
             */
            public Builder addIpInterface(co.rira.kafka.model.OpennmsModelProtos.IpInterface value) {
                if (ipInterfaceBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureIpInterfaceIsMutable();
                    ipInterface_.add(value);
                    onChanged();
                } else {
                    ipInterfaceBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .IpInterface ip_interface = 11;</code>
             */
            public Builder addIpInterface(
                    int index, co.rira.kafka.model.OpennmsModelProtos.IpInterface value) {
                if (ipInterfaceBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureIpInterfaceIsMutable();
                    ipInterface_.add(index, value);
                    onChanged();
                } else {
                    ipInterfaceBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .IpInterface ip_interface = 11;</code>
             */
            public Builder addIpInterface(
                    co.rira.kafka.model.OpennmsModelProtos.IpInterface.Builder builderForValue) {
                if (ipInterfaceBuilder_ == null) {
                    ensureIpInterfaceIsMutable();
                    ipInterface_.add(builderForValue.build());
                    onChanged();
                } else {
                    ipInterfaceBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .IpInterface ip_interface = 11;</code>
             */
            public Builder addIpInterface(
                    int index, co.rira.kafka.model.OpennmsModelProtos.IpInterface.Builder builderForValue) {
                if (ipInterfaceBuilder_ == null) {
                    ensureIpInterfaceIsMutable();
                    ipInterface_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    ipInterfaceBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .IpInterface ip_interface = 11;</code>
             */
            public Builder addAllIpInterface(
                    java.lang.Iterable<? extends co.rira.kafka.model.OpennmsModelProtos.IpInterface> values) {
                if (ipInterfaceBuilder_ == null) {
                    ensureIpInterfaceIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, ipInterface_);
                    onChanged();
                } else {
                    ipInterfaceBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .IpInterface ip_interface = 11;</code>
             */
            public Builder clearIpInterface() {
                if (ipInterfaceBuilder_ == null) {
                    ipInterface_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                    onChanged();
                } else {
                    ipInterfaceBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .IpInterface ip_interface = 11;</code>
             */
            public Builder removeIpInterface(int index) {
                if (ipInterfaceBuilder_ == null) {
                    ensureIpInterfaceIsMutable();
                    ipInterface_.remove(index);
                    onChanged();
                } else {
                    ipInterfaceBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .IpInterface ip_interface = 11;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.IpInterface.Builder getIpInterfaceBuilder(
                    int index) {
                return getIpInterfaceFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .IpInterface ip_interface = 11;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.IpInterfaceOrBuilder getIpInterfaceOrBuilder(
                    int index) {
                if (ipInterfaceBuilder_ == null) {
                    return ipInterface_.get(index);
                } else {
                    return ipInterfaceBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .IpInterface ip_interface = 11;</code>
             */
            public java.util.List<? extends co.rira.kafka.model.OpennmsModelProtos.IpInterfaceOrBuilder>
            getIpInterfaceOrBuilderList() {
                if (ipInterfaceBuilder_ != null) {
                    return ipInterfaceBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(ipInterface_);
                }
            }

            /**
             * <code>repeated .IpInterface ip_interface = 11;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.IpInterface.Builder addIpInterfaceBuilder() {
                return getIpInterfaceFieldBuilder().addBuilder(
                        co.rira.kafka.model.OpennmsModelProtos.IpInterface.getDefaultInstance());
            }

            /**
             * <code>repeated .IpInterface ip_interface = 11;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.IpInterface.Builder addIpInterfaceBuilder(
                    int index) {
                return getIpInterfaceFieldBuilder().addBuilder(
                        index, co.rira.kafka.model.OpennmsModelProtos.IpInterface.getDefaultInstance());
            }

            /**
             * <code>repeated .IpInterface ip_interface = 11;</code>
             */
            public java.util.List<co.rira.kafka.model.OpennmsModelProtos.IpInterface.Builder>
            getIpInterfaceBuilderList() {
                return getIpInterfaceFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.IpInterface, co.rira.kafka.model.OpennmsModelProtos.IpInterface.Builder, co.rira.kafka.model.OpennmsModelProtos.IpInterfaceOrBuilder>
            getIpInterfaceFieldBuilder() {
                if (ipInterfaceBuilder_ == null) {
                    ipInterfaceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            co.rira.kafka.model.OpennmsModelProtos.IpInterface, co.rira.kafka.model.OpennmsModelProtos.IpInterface.Builder, co.rira.kafka.model.OpennmsModelProtos.IpInterfaceOrBuilder>(
                            ipInterface_,
                            ((bitField0_ & 0x00000002) != 0),
                            getParentForChildren(),
                            isClean());
                    ipInterface_ = null;
                }
                return ipInterfaceBuilder_;
            }

            private void ensureSnmpInterfaceIsMutable() {
                if (!((bitField0_ & 0x00000004) != 0)) {
                    snmpInterface_ = new java.util.ArrayList<co.rira.kafka.model.OpennmsModelProtos.SnmpInterface>(snmpInterface_);
                    bitField0_ |= 0x00000004;
                }
            }

            /**
             * <code>repeated .SnmpInterface snmp_interface = 12;</code>
             */
            public java.util.List<co.rira.kafka.model.OpennmsModelProtos.SnmpInterface> getSnmpInterfaceList() {
                if (snmpInterfaceBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(snmpInterface_);
                } else {
                    return snmpInterfaceBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .SnmpInterface snmp_interface = 12;</code>
             */
            public int getSnmpInterfaceCount() {
                if (snmpInterfaceBuilder_ == null) {
                    return snmpInterface_.size();
                } else {
                    return snmpInterfaceBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .SnmpInterface snmp_interface = 12;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.SnmpInterface getSnmpInterface(int index) {
                if (snmpInterfaceBuilder_ == null) {
                    return snmpInterface_.get(index);
                } else {
                    return snmpInterfaceBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .SnmpInterface snmp_interface = 12;</code>
             */
            public Builder setSnmpInterface(
                    int index, co.rira.kafka.model.OpennmsModelProtos.SnmpInterface value) {
                if (snmpInterfaceBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureSnmpInterfaceIsMutable();
                    snmpInterface_.set(index, value);
                    onChanged();
                } else {
                    snmpInterfaceBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .SnmpInterface snmp_interface = 12;</code>
             */
            public Builder setSnmpInterface(
                    int index, co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.Builder builderForValue) {
                if (snmpInterfaceBuilder_ == null) {
                    ensureSnmpInterfaceIsMutable();
                    snmpInterface_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    snmpInterfaceBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .SnmpInterface snmp_interface = 12;</code>
             */
            public Builder addSnmpInterface(co.rira.kafka.model.OpennmsModelProtos.SnmpInterface value) {
                if (snmpInterfaceBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureSnmpInterfaceIsMutable();
                    snmpInterface_.add(value);
                    onChanged();
                } else {
                    snmpInterfaceBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .SnmpInterface snmp_interface = 12;</code>
             */
            public Builder addSnmpInterface(
                    int index, co.rira.kafka.model.OpennmsModelProtos.SnmpInterface value) {
                if (snmpInterfaceBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureSnmpInterfaceIsMutable();
                    snmpInterface_.add(index, value);
                    onChanged();
                } else {
                    snmpInterfaceBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .SnmpInterface snmp_interface = 12;</code>
             */
            public Builder addSnmpInterface(
                    co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.Builder builderForValue) {
                if (snmpInterfaceBuilder_ == null) {
                    ensureSnmpInterfaceIsMutable();
                    snmpInterface_.add(builderForValue.build());
                    onChanged();
                } else {
                    snmpInterfaceBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .SnmpInterface snmp_interface = 12;</code>
             */
            public Builder addSnmpInterface(
                    int index, co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.Builder builderForValue) {
                if (snmpInterfaceBuilder_ == null) {
                    ensureSnmpInterfaceIsMutable();
                    snmpInterface_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    snmpInterfaceBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .SnmpInterface snmp_interface = 12;</code>
             */
            public Builder addAllSnmpInterface(
                    java.lang.Iterable<? extends co.rira.kafka.model.OpennmsModelProtos.SnmpInterface> values) {
                if (snmpInterfaceBuilder_ == null) {
                    ensureSnmpInterfaceIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, snmpInterface_);
                    onChanged();
                } else {
                    snmpInterfaceBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .SnmpInterface snmp_interface = 12;</code>
             */
            public Builder clearSnmpInterface() {
                if (snmpInterfaceBuilder_ == null) {
                    snmpInterface_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000004);
                    onChanged();
                } else {
                    snmpInterfaceBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .SnmpInterface snmp_interface = 12;</code>
             */
            public Builder removeSnmpInterface(int index) {
                if (snmpInterfaceBuilder_ == null) {
                    ensureSnmpInterfaceIsMutable();
                    snmpInterface_.remove(index);
                    onChanged();
                } else {
                    snmpInterfaceBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .SnmpInterface snmp_interface = 12;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.Builder getSnmpInterfaceBuilder(
                    int index) {
                return getSnmpInterfaceFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .SnmpInterface snmp_interface = 12;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.SnmpInterfaceOrBuilder getSnmpInterfaceOrBuilder(
                    int index) {
                if (snmpInterfaceBuilder_ == null) {
                    return snmpInterface_.get(index);
                } else {
                    return snmpInterfaceBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .SnmpInterface snmp_interface = 12;</code>
             */
            public java.util.List<? extends co.rira.kafka.model.OpennmsModelProtos.SnmpInterfaceOrBuilder>
            getSnmpInterfaceOrBuilderList() {
                if (snmpInterfaceBuilder_ != null) {
                    return snmpInterfaceBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(snmpInterface_);
                }
            }

            /**
             * <code>repeated .SnmpInterface snmp_interface = 12;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.Builder addSnmpInterfaceBuilder() {
                return getSnmpInterfaceFieldBuilder().addBuilder(
                        co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.getDefaultInstance());
            }

            /**
             * <code>repeated .SnmpInterface snmp_interface = 12;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.Builder addSnmpInterfaceBuilder(
                    int index) {
                return getSnmpInterfaceFieldBuilder().addBuilder(
                        index, co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.getDefaultInstance());
            }

            /**
             * <code>repeated .SnmpInterface snmp_interface = 12;</code>
             */
            public java.util.List<co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.Builder>
            getSnmpInterfaceBuilderList() {
                return getSnmpInterfaceFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.SnmpInterface, co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.Builder, co.rira.kafka.model.OpennmsModelProtos.SnmpInterfaceOrBuilder>
            getSnmpInterfaceFieldBuilder() {
                if (snmpInterfaceBuilder_ == null) {
                    snmpInterfaceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            co.rira.kafka.model.OpennmsModelProtos.SnmpInterface, co.rira.kafka.model.OpennmsModelProtos.SnmpInterface.Builder, co.rira.kafka.model.OpennmsModelProtos.SnmpInterfaceOrBuilder>(
                            snmpInterface_,
                            ((bitField0_ & 0x00000004) != 0),
                            getParentForChildren(),
                            isClean());
                    snmpInterface_ = null;
                }
                return snmpInterfaceBuilder_;
            }

            /**
             * <code>.HwEntity hw_inventory = 13;</code>
             *
             * @return Whether the hwInventory field is set.
             */
            public boolean hasHwInventory() {
                return hwInventoryBuilder_ != null || hwInventory_ != null;
            }

            /**
             * <code>.HwEntity hw_inventory = 13;</code>
             *
             * @return The hwInventory.
             */
            public co.rira.kafka.model.OpennmsModelProtos.HwEntity getHwInventory() {
                if (hwInventoryBuilder_ == null) {
                    return hwInventory_ == null ? co.rira.kafka.model.OpennmsModelProtos.HwEntity.getDefaultInstance() : hwInventory_;
                } else {
                    return hwInventoryBuilder_.getMessage();
                }
            }

            /**
             * <code>.HwEntity hw_inventory = 13;</code>
             */
            public Builder setHwInventory(co.rira.kafka.model.OpennmsModelProtos.HwEntity value) {
                if (hwInventoryBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    hwInventory_ = value;
                    onChanged();
                } else {
                    hwInventoryBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.HwEntity hw_inventory = 13;</code>
             */
            public Builder setHwInventory(
                    co.rira.kafka.model.OpennmsModelProtos.HwEntity.Builder builderForValue) {
                if (hwInventoryBuilder_ == null) {
                    hwInventory_ = builderForValue.build();
                    onChanged();
                } else {
                    hwInventoryBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.HwEntity hw_inventory = 13;</code>
             */
            public Builder mergeHwInventory(co.rira.kafka.model.OpennmsModelProtos.HwEntity value) {
                if (hwInventoryBuilder_ == null) {
                    if (hwInventory_ != null) {
                        hwInventory_ =
                                co.rira.kafka.model.OpennmsModelProtos.HwEntity.newBuilder(hwInventory_).mergeFrom(value).buildPartial();
                    } else {
                        hwInventory_ = value;
                    }
                    onChanged();
                } else {
                    hwInventoryBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.HwEntity hw_inventory = 13;</code>
             */
            public Builder clearHwInventory() {
                if (hwInventoryBuilder_ == null) {
                    hwInventory_ = null;
                    onChanged();
                } else {
                    hwInventory_ = null;
                    hwInventoryBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.HwEntity hw_inventory = 13;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.HwEntity.Builder getHwInventoryBuilder() {

                onChanged();
                return getHwInventoryFieldBuilder().getBuilder();
            }

            /**
             * <code>.HwEntity hw_inventory = 13;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.HwEntityOrBuilder getHwInventoryOrBuilder() {
                if (hwInventoryBuilder_ != null) {
                    return hwInventoryBuilder_.getMessageOrBuilder();
                } else {
                    return hwInventory_ == null ?
                            co.rira.kafka.model.OpennmsModelProtos.HwEntity.getDefaultInstance() : hwInventory_;
                }
            }

            /**
             * <code>.HwEntity hw_inventory = 13;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.HwEntity, co.rira.kafka.model.OpennmsModelProtos.HwEntity.Builder, co.rira.kafka.model.OpennmsModelProtos.HwEntityOrBuilder>
            getHwInventoryFieldBuilder() {
                if (hwInventoryBuilder_ == null) {
                    hwInventoryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            co.rira.kafka.model.OpennmsModelProtos.HwEntity, co.rira.kafka.model.OpennmsModelProtos.HwEntity.Builder, co.rira.kafka.model.OpennmsModelProtos.HwEntityOrBuilder>(
                            getHwInventory(),
                            getParentForChildren(),
                            isClean());
                    hwInventory_ = null;
                }
                return hwInventoryBuilder_;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:Node)
        }

    }

    /**
     * Protobuf type {@code TopologyRef}
     */
    public static final class TopologyRef extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:TopologyRef)
            TopologyRefOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int PROTOCOL_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:TopologyRef)
        private static final co.rira.kafka.model.OpennmsModelProtos.TopologyRef DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<TopologyRef>
                PARSER = new com.google.protobuf.AbstractParser<TopologyRef>() {
            @java.lang.Override
            public TopologyRef parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new TopologyRef(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new co.rira.kafka.model.OpennmsModelProtos.TopologyRef();
        }

        private volatile java.lang.Object id_;
        private int protocol_;
        private byte memoizedIsInitialized = -1;

        // Use TopologyRef.newBuilder() to construct.
        private TopologyRef(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private TopologyRef() {
            id_ = "";
            protocol_ = 0;
        }

        private TopologyRef(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            id_ = s;
                            break;
                        }
                        case 16: {
                            int rawValue = input.readEnum();

                            protocol_ = rawValue;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologyRef_descriptor;
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyRef parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyRef parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyRef parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyRef parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyRef parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyRef parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyRef parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyRef parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyRef parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyRef parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyRef parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyRef parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(co.rira.kafka.model.OpennmsModelProtos.TopologyRef prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyRef getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<TopologyRef> parser() {
            return PARSER;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new TopologyRef();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologyRef_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            co.rira.kafka.model.OpennmsModelProtos.TopologyRef.class, co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Builder.class);
        }

        /**
         * <code>string id = 1;</code>
         *
         * @return The id.
         */
        public java.lang.String getId() {
            java.lang.Object ref = id_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                id_ = s;
                return s;
            }
        }

        /**
         * <code>string id = 1;</code>
         *
         * @return The bytes for id.
         */
        public com.google.protobuf.ByteString
        getIdBytes() {
            java.lang.Object ref = id_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                id_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>.TopologyRef.Protocol protocol = 2;</code>
         *
         * @return The enum numeric value on the wire for protocol.
         */
        public int getProtocolValue() {
            return protocol_;
        }

        /**
         * <code>.TopologyRef.Protocol protocol = 2;</code>
         *
         * @return The protocol.
         */
        public co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Protocol getProtocol() {
            @SuppressWarnings("deprecation")
            co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Protocol result = co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Protocol.valueOf(protocol_);
            return result == null ? co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Protocol.UNRECOGNIZED : result;
        }

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getIdBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
            }
            if (protocol_ != co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Protocol.LLDP.getNumber()) {
                output.writeEnum(2, protocol_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getIdBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
            }
            if (protocol_ != co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Protocol.LLDP.getNumber()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(2, protocol_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof co.rira.kafka.model.OpennmsModelProtos.TopologyRef)) {
                return super.equals(obj);
            }
            co.rira.kafka.model.OpennmsModelProtos.TopologyRef other = (co.rira.kafka.model.OpennmsModelProtos.TopologyRef) obj;

            if (!getId()
                    .equals(other.getId())) return false;
            if (protocol_ != other.protocol_) return false;
            return unknownFields.equals(other.unknownFields);
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + getId().hashCode();
            hash = (37 * hash) + PROTOCOL_FIELD_NUMBER;
            hash = (53 * hash) + protocol_;
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<TopologyRef> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public co.rira.kafka.model.OpennmsModelProtos.TopologyRef getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf enum {@code TopologyRef.Protocol}
         */
        public enum Protocol
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>LLDP = 0;</code>
             */
            LLDP(0),
            /**
             * <code>OSPF = 1;</code>
             */
            OSPF(1),
            /**
             * <code>ISIS = 2;</code>
             */
            ISIS(2),
            /**
             * <code>BRIDGE = 3;</code>
             */
            BRIDGE(3),
            /**
             * <code>CDP = 4;</code>
             */
            CDP(4),
            /**
             * <code>USERDEFINED = 5;</code>
             */
            USERDEFINED(5),
            UNRECOGNIZED(-1),
            ;

            /**
             * <code>LLDP = 0;</code>
             */
            public static final int LLDP_VALUE = 0;
            /**
             * <code>OSPF = 1;</code>
             */
            public static final int OSPF_VALUE = 1;
            /**
             * <code>ISIS = 2;</code>
             */
            public static final int ISIS_VALUE = 2;
            /**
             * <code>BRIDGE = 3;</code>
             */
            public static final int BRIDGE_VALUE = 3;
            /**
             * <code>CDP = 4;</code>
             */
            public static final int CDP_VALUE = 4;
            /**
             * <code>USERDEFINED = 5;</code>
             */
            public static final int USERDEFINED_VALUE = 5;
            private static final com.google.protobuf.Internal.EnumLiteMap<
                    Protocol> internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<Protocol>() {
                        public Protocol findValueByNumber(int number) {
                            return Protocol.forNumber(number);
                        }
                    };
            private static final Protocol[] VALUES = values();
            private final int value;

            Protocol(int value) {
                this.value = value;
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @java.lang.Deprecated
            public static Protocol valueOf(int value) {
                return forNumber(value);
            }

            /**
             * @param value The numeric wire value of the corresponding enum entry.
             * @return The enum associated with the given numeric wire value.
             */
            public static Protocol forNumber(int value) {
                switch (value) {
                    case 0:
                        return LLDP;
                    case 1:
                        return OSPF;
                    case 2:
                        return ISIS;
                    case 3:
                        return BRIDGE;
                    case 4:
                        return CDP;
                    case 5:
                        return USERDEFINED;
                    default:
                        return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<Protocol>
            internalGetValueMap() {
                return internalValueMap;
            }

            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return co.rira.kafka.model.OpennmsModelProtos.TopologyRef.getDescriptor().getEnumTypes().get(0);
            }

            public static Protocol valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[desc.getIndex()];
            }

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new java.lang.IllegalArgumentException(
                            "Can't get the number of an unknown enum value.");
                }
                return value;
            }

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }

            // @@protoc_insertion_point(enum_scope:TopologyRef.Protocol)
        }

        /**
         * Protobuf type {@code TopologyRef}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:TopologyRef)
                co.rira.kafka.model.OpennmsModelProtos.TopologyRefOrBuilder {
            private java.lang.Object id_ = "";
            private int protocol_ = 0;

            // Construct using co.rira.kafka.model.OpennmsModelProtos.TopologyRef.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologyRef_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologyRef_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                co.rira.kafka.model.OpennmsModelProtos.TopologyRef.class, co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                id_ = "";

                protocol_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologyRef_descriptor;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.TopologyRef getDefaultInstanceForType() {
                return co.rira.kafka.model.OpennmsModelProtos.TopologyRef.getDefaultInstance();
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.TopologyRef build() {
                co.rira.kafka.model.OpennmsModelProtos.TopologyRef result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.TopologyRef buildPartial() {
                co.rira.kafka.model.OpennmsModelProtos.TopologyRef result = new co.rira.kafka.model.OpennmsModelProtos.TopologyRef(this);
                result.id_ = id_;
                result.protocol_ = protocol_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof co.rira.kafka.model.OpennmsModelProtos.TopologyRef) {
                    return mergeFrom((co.rira.kafka.model.OpennmsModelProtos.TopologyRef) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(co.rira.kafka.model.OpennmsModelProtos.TopologyRef other) {
                if (other == co.rira.kafka.model.OpennmsModelProtos.TopologyRef.getDefaultInstance()) return this;
                if (!other.getId().isEmpty()) {
                    id_ = other.id_;
                    onChanged();
                }
                if (other.protocol_ != 0) {
                    setProtocolValue(other.getProtocolValue());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                co.rira.kafka.model.OpennmsModelProtos.TopologyRef parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (co.rira.kafka.model.OpennmsModelProtos.TopologyRef) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>string id = 1;</code>
             *
             * @return The id.
             */
            public java.lang.String getId() {
                java.lang.Object ref = id_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    id_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string id = 1;</code>
             *
             * @param value The id to set.
             * @return This builder for chaining.
             */
            public Builder setId(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                id_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string id = 1;</code>
             *
             * @return The bytes for id.
             */
            public com.google.protobuf.ByteString
            getIdBytes() {
                java.lang.Object ref = id_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    id_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string id = 1;</code>
             *
             * @param value The bytes for id to set.
             * @return This builder for chaining.
             */
            public Builder setIdBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                id_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string id = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearId() {

                id_ = getDefaultInstance().getId();
                onChanged();
                return this;
            }

            /**
             * <code>.TopologyRef.Protocol protocol = 2;</code>
             *
             * @return The enum numeric value on the wire for protocol.
             */
            public int getProtocolValue() {
                return protocol_;
            }

            /**
             * <code>.TopologyRef.Protocol protocol = 2;</code>
             *
             * @param value The enum numeric value on the wire for protocol to set.
             * @return This builder for chaining.
             */
            public Builder setProtocolValue(int value) {
                protocol_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>.TopologyRef.Protocol protocol = 2;</code>
             *
             * @return The protocol.
             */
            public co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Protocol getProtocol() {
                @SuppressWarnings("deprecation")
                co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Protocol result = co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Protocol.valueOf(protocol_);
                return result == null ? co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Protocol.UNRECOGNIZED : result;
            }

            /**
             * <code>.TopologyRef.Protocol protocol = 2;</code>
             *
             * @param value The protocol to set.
             * @return This builder for chaining.
             */
            public Builder setProtocol(co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Protocol value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                protocol_ = value.getNumber();
                onChanged();
                return this;
            }

            /**
             * <code>.TopologyRef.Protocol protocol = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearProtocol() {

                protocol_ = 0;
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:TopologyRef)
        }

    }

    /**
     * Protobuf type {@code TopologySegment}
     */
    public static final class TopologySegment extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:TopologySegment)
            TopologySegmentOrBuilder {
        public static final int REF_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:TopologySegment)
        private static final co.rira.kafka.model.OpennmsModelProtos.TopologySegment DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<TopologySegment>
                PARSER = new com.google.protobuf.AbstractParser<TopologySegment>() {
            @java.lang.Override
            public TopologySegment parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new TopologySegment(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new co.rira.kafka.model.OpennmsModelProtos.TopologySegment();
        }

        private co.rira.kafka.model.OpennmsModelProtos.TopologyRef ref_;
        private byte memoizedIsInitialized = -1;

        // Use TopologySegment.newBuilder() to construct.
        private TopologySegment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private TopologySegment() {
        }

        private TopologySegment(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Builder subBuilder = null;
                            if (ref_ != null) {
                                subBuilder = ref_.toBuilder();
                            }
                            ref_ = input.readMessage(co.rira.kafka.model.OpennmsModelProtos.TopologyRef.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(ref_);
                                ref_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologySegment_descriptor;
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologySegment parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologySegment parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologySegment parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologySegment parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologySegment parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologySegment parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologySegment parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologySegment parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologySegment parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologySegment parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologySegment parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologySegment parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(co.rira.kafka.model.OpennmsModelProtos.TopologySegment prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologySegment getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<TopologySegment> parser() {
            return PARSER;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new TopologySegment();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologySegment_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            co.rira.kafka.model.OpennmsModelProtos.TopologySegment.class, co.rira.kafka.model.OpennmsModelProtos.TopologySegment.Builder.class);
        }

        /**
         * <code>.TopologyRef ref = 1;</code>
         *
         * @return Whether the ref field is set.
         */
        public boolean hasRef() {
            return ref_ != null;
        }

        /**
         * <code>.TopologyRef ref = 1;</code>
         *
         * @return The ref.
         */
        public co.rira.kafka.model.OpennmsModelProtos.TopologyRef getRef() {
            return ref_ == null ? co.rira.kafka.model.OpennmsModelProtos.TopologyRef.getDefaultInstance() : ref_;
        }

        /**
         * <code>.TopologyRef ref = 1;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.TopologyRefOrBuilder getRefOrBuilder() {
            return getRef();
        }

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (ref_ != null) {
                output.writeMessage(1, getRef());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (ref_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, getRef());
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof co.rira.kafka.model.OpennmsModelProtos.TopologySegment)) {
                return super.equals(obj);
            }
            co.rira.kafka.model.OpennmsModelProtos.TopologySegment other = (co.rira.kafka.model.OpennmsModelProtos.TopologySegment) obj;

            if (hasRef() != other.hasRef()) return false;
            if (hasRef()) {
                if (!getRef()
                        .equals(other.getRef())) return false;
            }
            return unknownFields.equals(other.unknownFields);
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasRef()) {
                hash = (37 * hash) + REF_FIELD_NUMBER;
                hash = (53 * hash) + getRef().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<TopologySegment> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public co.rira.kafka.model.OpennmsModelProtos.TopologySegment getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code TopologySegment}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:TopologySegment)
                co.rira.kafka.model.OpennmsModelProtos.TopologySegmentOrBuilder {
            private co.rira.kafka.model.OpennmsModelProtos.TopologyRef ref_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.TopologyRef, co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Builder, co.rira.kafka.model.OpennmsModelProtos.TopologyRefOrBuilder> refBuilder_;

            // Construct using co.rira.kafka.model.OpennmsModelProtos.TopologySegment.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologySegment_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologySegment_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                co.rira.kafka.model.OpennmsModelProtos.TopologySegment.class, co.rira.kafka.model.OpennmsModelProtos.TopologySegment.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                if (refBuilder_ == null) {
                    ref_ = null;
                } else {
                    ref_ = null;
                    refBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologySegment_descriptor;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.TopologySegment getDefaultInstanceForType() {
                return co.rira.kafka.model.OpennmsModelProtos.TopologySegment.getDefaultInstance();
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.TopologySegment build() {
                co.rira.kafka.model.OpennmsModelProtos.TopologySegment result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.TopologySegment buildPartial() {
                co.rira.kafka.model.OpennmsModelProtos.TopologySegment result = new co.rira.kafka.model.OpennmsModelProtos.TopologySegment(this);
                if (refBuilder_ == null) {
                    result.ref_ = ref_;
                } else {
                    result.ref_ = refBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof co.rira.kafka.model.OpennmsModelProtos.TopologySegment) {
                    return mergeFrom((co.rira.kafka.model.OpennmsModelProtos.TopologySegment) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(co.rira.kafka.model.OpennmsModelProtos.TopologySegment other) {
                if (other == co.rira.kafka.model.OpennmsModelProtos.TopologySegment.getDefaultInstance())
                    return this;
                if (other.hasRef()) {
                    mergeRef(other.getRef());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                co.rira.kafka.model.OpennmsModelProtos.TopologySegment parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (co.rira.kafka.model.OpennmsModelProtos.TopologySegment) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>.TopologyRef ref = 1;</code>
             *
             * @return Whether the ref field is set.
             */
            public boolean hasRef() {
                return refBuilder_ != null || ref_ != null;
            }

            /**
             * <code>.TopologyRef ref = 1;</code>
             *
             * @return The ref.
             */
            public co.rira.kafka.model.OpennmsModelProtos.TopologyRef getRef() {
                if (refBuilder_ == null) {
                    return ref_ == null ? co.rira.kafka.model.OpennmsModelProtos.TopologyRef.getDefaultInstance() : ref_;
                } else {
                    return refBuilder_.getMessage();
                }
            }

            /**
             * <code>.TopologyRef ref = 1;</code>
             */
            public Builder setRef(co.rira.kafka.model.OpennmsModelProtos.TopologyRef value) {
                if (refBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ref_ = value;
                    onChanged();
                } else {
                    refBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.TopologyRef ref = 1;</code>
             */
            public Builder setRef(
                    co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Builder builderForValue) {
                if (refBuilder_ == null) {
                    ref_ = builderForValue.build();
                    onChanged();
                } else {
                    refBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.TopologyRef ref = 1;</code>
             */
            public Builder mergeRef(co.rira.kafka.model.OpennmsModelProtos.TopologyRef value) {
                if (refBuilder_ == null) {
                    if (ref_ != null) {
                        ref_ =
                                co.rira.kafka.model.OpennmsModelProtos.TopologyRef.newBuilder(ref_).mergeFrom(value).buildPartial();
                    } else {
                        ref_ = value;
                    }
                    onChanged();
                } else {
                    refBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.TopologyRef ref = 1;</code>
             */
            public Builder clearRef() {
                if (refBuilder_ == null) {
                    ref_ = null;
                    onChanged();
                } else {
                    ref_ = null;
                    refBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.TopologyRef ref = 1;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Builder getRefBuilder() {

                onChanged();
                return getRefFieldBuilder().getBuilder();
            }

            /**
             * <code>.TopologyRef ref = 1;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.TopologyRefOrBuilder getRefOrBuilder() {
                if (refBuilder_ != null) {
                    return refBuilder_.getMessageOrBuilder();
                } else {
                    return ref_ == null ?
                            co.rira.kafka.model.OpennmsModelProtos.TopologyRef.getDefaultInstance() : ref_;
                }
            }

            /**
             * <code>.TopologyRef ref = 1;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.TopologyRef, co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Builder, co.rira.kafka.model.OpennmsModelProtos.TopologyRefOrBuilder>
            getRefFieldBuilder() {
                if (refBuilder_ == null) {
                    refBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            co.rira.kafka.model.OpennmsModelProtos.TopologyRef, co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Builder, co.rira.kafka.model.OpennmsModelProtos.TopologyRefOrBuilder>(
                            getRef(),
                            getParentForChildren(),
                            isClean());
                    ref_ = null;
                }
                return refBuilder_;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:TopologySegment)
        }

    }

    /**
     * Protobuf type {@code TopologyPort}
     */
    public static final class TopologyPort extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:TopologyPort)
            TopologyPortOrBuilder {
        public static final int VERTEX_ID_FIELD_NUMBER = 1;
        public static final int IF_INDEX_FIELD_NUMBER = 2;
        public static final int IF_NAME_FIELD_NUMBER = 3;
        public static final int ADDRESS_FIELD_NUMBER = 4;
        public static final int NODE_CRITERIA_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:TopologyPort)
        private static final co.rira.kafka.model.OpennmsModelProtos.TopologyPort DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<TopologyPort>
                PARSER = new com.google.protobuf.AbstractParser<TopologyPort>() {
            @java.lang.Override
            public TopologyPort parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new TopologyPort(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new co.rira.kafka.model.OpennmsModelProtos.TopologyPort();
        }

        private volatile java.lang.Object vertexId_;
        private long ifIndex_;
        private volatile java.lang.Object ifName_;
        private volatile java.lang.Object address_;
        private co.rira.kafka.model.OpennmsModelProtos.NodeCriteria nodeCriteria_;
        private byte memoizedIsInitialized = -1;

        // Use TopologyPort.newBuilder() to construct.
        private TopologyPort(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private TopologyPort() {
            vertexId_ = "";
            ifName_ = "";
            address_ = "";
        }

        private TopologyPort(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            vertexId_ = s;
                            break;
                        }
                        case 16: {

                            ifIndex_ = input.readUInt64();
                            break;
                        }
                        case 26: {
                            java.lang.String s = input.readStringRequireUtf8();

                            ifName_ = s;
                            break;
                        }
                        case 34: {
                            java.lang.String s = input.readStringRequireUtf8();

                            address_ = s;
                            break;
                        }
                        case 42: {
                            co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder subBuilder = null;
                            if (nodeCriteria_ != null) {
                                subBuilder = nodeCriteria_.toBuilder();
                            }
                            nodeCriteria_ = input.readMessage(co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(nodeCriteria_);
                                nodeCriteria_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologyPort_descriptor;
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyPort parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyPort parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyPort parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyPort parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyPort parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyPort parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyPort parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyPort parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyPort parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyPort parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyPort parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyPort parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(co.rira.kafka.model.OpennmsModelProtos.TopologyPort prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyPort getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<TopologyPort> parser() {
            return PARSER;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new TopologyPort();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologyPort_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            co.rira.kafka.model.OpennmsModelProtos.TopologyPort.class, co.rira.kafka.model.OpennmsModelProtos.TopologyPort.Builder.class);
        }

        /**
         * <code>string vertex_id = 1;</code>
         *
         * @return The vertexId.
         */
        public java.lang.String getVertexId() {
            java.lang.Object ref = vertexId_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                vertexId_ = s;
                return s;
            }
        }

        /**
         * <code>string vertex_id = 1;</code>
         *
         * @return The bytes for vertexId.
         */
        public com.google.protobuf.ByteString
        getVertexIdBytes() {
            java.lang.Object ref = vertexId_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                vertexId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>uint64 if_index = 2;</code>
         *
         * @return The ifIndex.
         */
        public long getIfIndex() {
            return ifIndex_;
        }

        /**
         * <code>string if_name = 3;</code>
         *
         * @return The ifName.
         */
        public java.lang.String getIfName() {
            java.lang.Object ref = ifName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                ifName_ = s;
                return s;
            }
        }

        /**
         * <code>string if_name = 3;</code>
         *
         * @return The bytes for ifName.
         */
        public com.google.protobuf.ByteString
        getIfNameBytes() {
            java.lang.Object ref = ifName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                ifName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string address = 4;</code>
         *
         * @return The address.
         */
        public java.lang.String getAddress() {
            java.lang.Object ref = address_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                address_ = s;
                return s;
            }
        }

        /**
         * <code>string address = 4;</code>
         *
         * @return The bytes for address.
         */
        public com.google.protobuf.ByteString
        getAddressBytes() {
            java.lang.Object ref = address_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                address_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>.NodeCriteria node_criteria = 5;</code>
         *
         * @return Whether the nodeCriteria field is set.
         */
        public boolean hasNodeCriteria() {
            return nodeCriteria_ != null;
        }

        /**
         * <code>.NodeCriteria node_criteria = 5;</code>
         *
         * @return The nodeCriteria.
         */
        public co.rira.kafka.model.OpennmsModelProtos.NodeCriteria getNodeCriteria() {
            return nodeCriteria_ == null ? co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.getDefaultInstance() : nodeCriteria_;
        }

        /**
         * <code>.NodeCriteria node_criteria = 5;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.NodeCriteriaOrBuilder getNodeCriteriaOrBuilder() {
            return getNodeCriteria();
        }

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getVertexIdBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vertexId_);
            }
            if (ifIndex_ != 0L) {
                output.writeUInt64(2, ifIndex_);
            }
            if (!getIfNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ifName_);
            }
            if (!getAddressBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 4, address_);
            }
            if (nodeCriteria_ != null) {
                output.writeMessage(5, getNodeCriteria());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getVertexIdBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vertexId_);
            }
            if (ifIndex_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(2, ifIndex_);
            }
            if (!getIfNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ifName_);
            }
            if (!getAddressBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, address_);
            }
            if (nodeCriteria_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(5, getNodeCriteria());
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof co.rira.kafka.model.OpennmsModelProtos.TopologyPort)) {
                return super.equals(obj);
            }
            co.rira.kafka.model.OpennmsModelProtos.TopologyPort other = (co.rira.kafka.model.OpennmsModelProtos.TopologyPort) obj;

            if (!getVertexId()
                    .equals(other.getVertexId())) return false;
            if (getIfIndex()
                    != other.getIfIndex()) return false;
            if (!getIfName()
                    .equals(other.getIfName())) return false;
            if (!getAddress()
                    .equals(other.getAddress())) return false;
            if (hasNodeCriteria() != other.hasNodeCriteria()) return false;
            if (hasNodeCriteria()) {
                if (!getNodeCriteria()
                        .equals(other.getNodeCriteria())) return false;
            }
            return unknownFields.equals(other.unknownFields);
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + VERTEX_ID_FIELD_NUMBER;
            hash = (53 * hash) + getVertexId().hashCode();
            hash = (37 * hash) + IF_INDEX_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getIfIndex());
            hash = (37 * hash) + IF_NAME_FIELD_NUMBER;
            hash = (53 * hash) + getIfName().hashCode();
            hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
            hash = (53 * hash) + getAddress().hashCode();
            if (hasNodeCriteria()) {
                hash = (37 * hash) + NODE_CRITERIA_FIELD_NUMBER;
                hash = (53 * hash) + getNodeCriteria().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<TopologyPort> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public co.rira.kafka.model.OpennmsModelProtos.TopologyPort getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code TopologyPort}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:TopologyPort)
                co.rira.kafka.model.OpennmsModelProtos.TopologyPortOrBuilder {
            private java.lang.Object vertexId_ = "";
            private long ifIndex_;
            private java.lang.Object ifName_ = "";
            private java.lang.Object address_ = "";
            private co.rira.kafka.model.OpennmsModelProtos.NodeCriteria nodeCriteria_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.NodeCriteria, co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder, co.rira.kafka.model.OpennmsModelProtos.NodeCriteriaOrBuilder> nodeCriteriaBuilder_;

            // Construct using co.rira.kafka.model.OpennmsModelProtos.TopologyPort.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologyPort_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologyPort_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                co.rira.kafka.model.OpennmsModelProtos.TopologyPort.class, co.rira.kafka.model.OpennmsModelProtos.TopologyPort.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                vertexId_ = "";

                ifIndex_ = 0L;

                ifName_ = "";

                address_ = "";

                if (nodeCriteriaBuilder_ == null) {
                    nodeCriteria_ = null;
                } else {
                    nodeCriteria_ = null;
                    nodeCriteriaBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologyPort_descriptor;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.TopologyPort getDefaultInstanceForType() {
                return co.rira.kafka.model.OpennmsModelProtos.TopologyPort.getDefaultInstance();
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.TopologyPort build() {
                co.rira.kafka.model.OpennmsModelProtos.TopologyPort result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.TopologyPort buildPartial() {
                co.rira.kafka.model.OpennmsModelProtos.TopologyPort result = new co.rira.kafka.model.OpennmsModelProtos.TopologyPort(this);
                result.vertexId_ = vertexId_;
                result.ifIndex_ = ifIndex_;
                result.ifName_ = ifName_;
                result.address_ = address_;
                if (nodeCriteriaBuilder_ == null) {
                    result.nodeCriteria_ = nodeCriteria_;
                } else {
                    result.nodeCriteria_ = nodeCriteriaBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof co.rira.kafka.model.OpennmsModelProtos.TopologyPort) {
                    return mergeFrom((co.rira.kafka.model.OpennmsModelProtos.TopologyPort) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(co.rira.kafka.model.OpennmsModelProtos.TopologyPort other) {
                if (other == co.rira.kafka.model.OpennmsModelProtos.TopologyPort.getDefaultInstance()) return this;
                if (!other.getVertexId().isEmpty()) {
                    vertexId_ = other.vertexId_;
                    onChanged();
                }
                if (other.getIfIndex() != 0L) {
                    setIfIndex(other.getIfIndex());
                }
                if (!other.getIfName().isEmpty()) {
                    ifName_ = other.ifName_;
                    onChanged();
                }
                if (!other.getAddress().isEmpty()) {
                    address_ = other.address_;
                    onChanged();
                }
                if (other.hasNodeCriteria()) {
                    mergeNodeCriteria(other.getNodeCriteria());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                co.rira.kafka.model.OpennmsModelProtos.TopologyPort parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (co.rira.kafka.model.OpennmsModelProtos.TopologyPort) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>string vertex_id = 1;</code>
             *
             * @return The vertexId.
             */
            public java.lang.String getVertexId() {
                java.lang.Object ref = vertexId_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    vertexId_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string vertex_id = 1;</code>
             *
             * @param value The vertexId to set.
             * @return This builder for chaining.
             */
            public Builder setVertexId(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                vertexId_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string vertex_id = 1;</code>
             *
             * @return The bytes for vertexId.
             */
            public com.google.protobuf.ByteString
            getVertexIdBytes() {
                java.lang.Object ref = vertexId_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    vertexId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string vertex_id = 1;</code>
             *
             * @param value The bytes for vertexId to set.
             * @return This builder for chaining.
             */
            public Builder setVertexIdBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                vertexId_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string vertex_id = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearVertexId() {

                vertexId_ = getDefaultInstance().getVertexId();
                onChanged();
                return this;
            }

            /**
             * <code>uint64 if_index = 2;</code>
             *
             * @return The ifIndex.
             */
            public long getIfIndex() {
                return ifIndex_;
            }

            /**
             * <code>uint64 if_index = 2;</code>
             *
             * @param value The ifIndex to set.
             * @return This builder for chaining.
             */
            public Builder setIfIndex(long value) {

                ifIndex_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 if_index = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIfIndex() {

                ifIndex_ = 0L;
                onChanged();
                return this;
            }

            /**
             * <code>string if_name = 3;</code>
             *
             * @return The ifName.
             */
            public java.lang.String getIfName() {
                java.lang.Object ref = ifName_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    ifName_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string if_name = 3;</code>
             *
             * @param value The ifName to set.
             * @return This builder for chaining.
             */
            public Builder setIfName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                ifName_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string if_name = 3;</code>
             *
             * @return The bytes for ifName.
             */
            public com.google.protobuf.ByteString
            getIfNameBytes() {
                java.lang.Object ref = ifName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    ifName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string if_name = 3;</code>
             *
             * @param value The bytes for ifName to set.
             * @return This builder for chaining.
             */
            public Builder setIfNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                ifName_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string if_name = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIfName() {

                ifName_ = getDefaultInstance().getIfName();
                onChanged();
                return this;
            }

            /**
             * <code>string address = 4;</code>
             *
             * @return The address.
             */
            public java.lang.String getAddress() {
                java.lang.Object ref = address_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    address_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string address = 4;</code>
             *
             * @param value The address to set.
             * @return This builder for chaining.
             */
            public Builder setAddress(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                address_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string address = 4;</code>
             *
             * @return The bytes for address.
             */
            public com.google.protobuf.ByteString
            getAddressBytes() {
                java.lang.Object ref = address_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    address_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string address = 4;</code>
             *
             * @param value The bytes for address to set.
             * @return This builder for chaining.
             */
            public Builder setAddressBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                address_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string address = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAddress() {

                address_ = getDefaultInstance().getAddress();
                onChanged();
                return this;
            }

            /**
             * <code>.NodeCriteria node_criteria = 5;</code>
             *
             * @return Whether the nodeCriteria field is set.
             */
            public boolean hasNodeCriteria() {
                return nodeCriteriaBuilder_ != null || nodeCriteria_ != null;
            }

            /**
             * <code>.NodeCriteria node_criteria = 5;</code>
             *
             * @return The nodeCriteria.
             */
            public co.rira.kafka.model.OpennmsModelProtos.NodeCriteria getNodeCriteria() {
                if (nodeCriteriaBuilder_ == null) {
                    return nodeCriteria_ == null ? co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.getDefaultInstance() : nodeCriteria_;
                } else {
                    return nodeCriteriaBuilder_.getMessage();
                }
            }

            /**
             * <code>.NodeCriteria node_criteria = 5;</code>
             */
            public Builder setNodeCriteria(co.rira.kafka.model.OpennmsModelProtos.NodeCriteria value) {
                if (nodeCriteriaBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    nodeCriteria_ = value;
                    onChanged();
                } else {
                    nodeCriteriaBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.NodeCriteria node_criteria = 5;</code>
             */
            public Builder setNodeCriteria(
                    co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder builderForValue) {
                if (nodeCriteriaBuilder_ == null) {
                    nodeCriteria_ = builderForValue.build();
                    onChanged();
                } else {
                    nodeCriteriaBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.NodeCriteria node_criteria = 5;</code>
             */
            public Builder mergeNodeCriteria(co.rira.kafka.model.OpennmsModelProtos.NodeCriteria value) {
                if (nodeCriteriaBuilder_ == null) {
                    if (nodeCriteria_ != null) {
                        nodeCriteria_ =
                                co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.newBuilder(nodeCriteria_).mergeFrom(value).buildPartial();
                    } else {
                        nodeCriteria_ = value;
                    }
                    onChanged();
                } else {
                    nodeCriteriaBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.NodeCriteria node_criteria = 5;</code>
             */
            public Builder clearNodeCriteria() {
                if (nodeCriteriaBuilder_ == null) {
                    nodeCriteria_ = null;
                    onChanged();
                } else {
                    nodeCriteria_ = null;
                    nodeCriteriaBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.NodeCriteria node_criteria = 5;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder getNodeCriteriaBuilder() {

                onChanged();
                return getNodeCriteriaFieldBuilder().getBuilder();
            }

            /**
             * <code>.NodeCriteria node_criteria = 5;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.NodeCriteriaOrBuilder getNodeCriteriaOrBuilder() {
                if (nodeCriteriaBuilder_ != null) {
                    return nodeCriteriaBuilder_.getMessageOrBuilder();
                } else {
                    return nodeCriteria_ == null ?
                            co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.getDefaultInstance() : nodeCriteria_;
                }
            }

            /**
             * <code>.NodeCriteria node_criteria = 5;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.NodeCriteria, co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder, co.rira.kafka.model.OpennmsModelProtos.NodeCriteriaOrBuilder>
            getNodeCriteriaFieldBuilder() {
                if (nodeCriteriaBuilder_ == null) {
                    nodeCriteriaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            co.rira.kafka.model.OpennmsModelProtos.NodeCriteria, co.rira.kafka.model.OpennmsModelProtos.NodeCriteria.Builder, co.rira.kafka.model.OpennmsModelProtos.NodeCriteriaOrBuilder>(
                            getNodeCriteria(),
                            getParentForChildren(),
                            isClean());
                    nodeCriteria_ = null;
                }
                return nodeCriteriaBuilder_;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:TopologyPort)
        }

    }

    /**
     * Protobuf type {@code TopologyEdge}
     */
    public static final class TopologyEdge extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:TopologyEdge)
            TopologyEdgeOrBuilder {
        public static final int REF_FIELD_NUMBER = 1;
        public static final int SOURCEPORT_FIELD_NUMBER = 3;
        public static final int SOURCESEGMENT_FIELD_NUMBER = 4;
        public static final int SOURCENODE_FIELD_NUMBER = 5;
        public static final int TARGETPORT_FIELD_NUMBER = 6;
        public static final int TARGETSEGMENT_FIELD_NUMBER = 7;
        public static final int TARGETNODE_FIELD_NUMBER = 8;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:TopologyEdge)
        private static final co.rira.kafka.model.OpennmsModelProtos.TopologyEdge DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<TopologyEdge>
                PARSER = new com.google.protobuf.AbstractParser<TopologyEdge>() {
            @java.lang.Override
            public TopologyEdge parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new TopologyEdge(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new co.rira.kafka.model.OpennmsModelProtos.TopologyEdge();
        }

        private int sourceCase_ = 0;
        private java.lang.Object source_;
        private int targetCase_ = 0;
        private java.lang.Object target_;

        private co.rira.kafka.model.OpennmsModelProtos.TopologyRef ref_;
        private byte memoizedIsInitialized = -1;

        // Use TopologyEdge.newBuilder() to construct.
        private TopologyEdge(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private TopologyEdge() {
        }

        private TopologyEdge(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Builder subBuilder = null;
                            if (ref_ != null) {
                                subBuilder = ref_.toBuilder();
                            }
                            ref_ = input.readMessage(co.rira.kafka.model.OpennmsModelProtos.TopologyRef.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(ref_);
                                ref_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 26: {
                            co.rira.kafka.model.OpennmsModelProtos.TopologyPort.Builder subBuilder = null;
                            if (sourceCase_ == 3) {
                                subBuilder = ((co.rira.kafka.model.OpennmsModelProtos.TopologyPort) source_).toBuilder();
                            }
                            source_ =
                                    input.readMessage(co.rira.kafka.model.OpennmsModelProtos.TopologyPort.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((co.rira.kafka.model.OpennmsModelProtos.TopologyPort) source_);
                                source_ = subBuilder.buildPartial();
                            }
                            sourceCase_ = 3;
                            break;
                        }
                        case 34: {
                            co.rira.kafka.model.OpennmsModelProtos.TopologySegment.Builder subBuilder = null;
                            if (sourceCase_ == 4) {
                                subBuilder = ((co.rira.kafka.model.OpennmsModelProtos.TopologySegment) source_).toBuilder();
                            }
                            source_ =
                                    input.readMessage(co.rira.kafka.model.OpennmsModelProtos.TopologySegment.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((co.rira.kafka.model.OpennmsModelProtos.TopologySegment) source_);
                                source_ = subBuilder.buildPartial();
                            }
                            sourceCase_ = 4;
                            break;
                        }
                        case 42: {
                            co.rira.kafka.model.OpennmsModelProtos.Node.Builder subBuilder = null;
                            if (sourceCase_ == 5) {
                                subBuilder = ((co.rira.kafka.model.OpennmsModelProtos.Node) source_).toBuilder();
                            }
                            source_ =
                                    input.readMessage(co.rira.kafka.model.OpennmsModelProtos.Node.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((co.rira.kafka.model.OpennmsModelProtos.Node) source_);
                                source_ = subBuilder.buildPartial();
                            }
                            sourceCase_ = 5;
                            break;
                        }
                        case 50: {
                            co.rira.kafka.model.OpennmsModelProtos.TopologyPort.Builder subBuilder = null;
                            if (targetCase_ == 6) {
                                subBuilder = ((co.rira.kafka.model.OpennmsModelProtos.TopologyPort) target_).toBuilder();
                            }
                            target_ =
                                    input.readMessage(co.rira.kafka.model.OpennmsModelProtos.TopologyPort.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((co.rira.kafka.model.OpennmsModelProtos.TopologyPort) target_);
                                target_ = subBuilder.buildPartial();
                            }
                            targetCase_ = 6;
                            break;
                        }
                        case 58: {
                            co.rira.kafka.model.OpennmsModelProtos.TopologySegment.Builder subBuilder = null;
                            if (targetCase_ == 7) {
                                subBuilder = ((co.rira.kafka.model.OpennmsModelProtos.TopologySegment) target_).toBuilder();
                            }
                            target_ =
                                    input.readMessage(co.rira.kafka.model.OpennmsModelProtos.TopologySegment.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((co.rira.kafka.model.OpennmsModelProtos.TopologySegment) target_);
                                target_ = subBuilder.buildPartial();
                            }
                            targetCase_ = 7;
                            break;
                        }
                        case 66: {
                            co.rira.kafka.model.OpennmsModelProtos.Node.Builder subBuilder = null;
                            if (targetCase_ == 8) {
                                subBuilder = ((co.rira.kafka.model.OpennmsModelProtos.Node) target_).toBuilder();
                            }
                            target_ =
                                    input.readMessage(co.rira.kafka.model.OpennmsModelProtos.Node.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((co.rira.kafka.model.OpennmsModelProtos.Node) target_);
                                target_ = subBuilder.buildPartial();
                            }
                            targetCase_ = 8;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologyEdge_descriptor;
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyEdge parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyEdge parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyEdge parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyEdge parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyEdge parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyEdge parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyEdge parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyEdge parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyEdge parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyEdge parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyEdge parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyEdge parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(co.rira.kafka.model.OpennmsModelProtos.TopologyEdge prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static co.rira.kafka.model.OpennmsModelProtos.TopologyEdge getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<TopologyEdge> parser() {
            return PARSER;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new TopologyEdge();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologyEdge_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            co.rira.kafka.model.OpennmsModelProtos.TopologyEdge.class, co.rira.kafka.model.OpennmsModelProtos.TopologyEdge.Builder.class);
        }

        public SourceCase
        getSourceCase() {
            return SourceCase.forNumber(
                    sourceCase_);
        }

        public TargetCase
        getTargetCase() {
            return TargetCase.forNumber(
                    targetCase_);
        }

        /**
         * <code>.TopologyRef ref = 1;</code>
         *
         * @return Whether the ref field is set.
         */
        public boolean hasRef() {
            return ref_ != null;
        }

        /**
         * <code>.TopologyRef ref = 1;</code>
         *
         * @return The ref.
         */
        public co.rira.kafka.model.OpennmsModelProtos.TopologyRef getRef() {
            return ref_ == null ? co.rira.kafka.model.OpennmsModelProtos.TopologyRef.getDefaultInstance() : ref_;
        }

        /**
         * <code>.TopologyRef ref = 1;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.TopologyRefOrBuilder getRefOrBuilder() {
            return getRef();
        }

        /**
         * <code>.TopologyPort sourcePort = 3;</code>
         *
         * @return Whether the sourcePort field is set.
         */
        public boolean hasSourcePort() {
            return sourceCase_ == 3;
        }

        /**
         * <code>.TopologyPort sourcePort = 3;</code>
         *
         * @return The sourcePort.
         */
        public co.rira.kafka.model.OpennmsModelProtos.TopologyPort getSourcePort() {
            if (sourceCase_ == 3) {
                return (co.rira.kafka.model.OpennmsModelProtos.TopologyPort) source_;
            }
            return co.rira.kafka.model.OpennmsModelProtos.TopologyPort.getDefaultInstance();
        }

        /**
         * <code>.TopologyPort sourcePort = 3;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.TopologyPortOrBuilder getSourcePortOrBuilder() {
            if (sourceCase_ == 3) {
                return (co.rira.kafka.model.OpennmsModelProtos.TopologyPort) source_;
            }
            return co.rira.kafka.model.OpennmsModelProtos.TopologyPort.getDefaultInstance();
        }

        /**
         * <code>.TopologySegment sourceSegment = 4;</code>
         *
         * @return Whether the sourceSegment field is set.
         */
        public boolean hasSourceSegment() {
            return sourceCase_ == 4;
        }

        /**
         * <code>.TopologySegment sourceSegment = 4;</code>
         *
         * @return The sourceSegment.
         */
        public co.rira.kafka.model.OpennmsModelProtos.TopologySegment getSourceSegment() {
            if (sourceCase_ == 4) {
                return (co.rira.kafka.model.OpennmsModelProtos.TopologySegment) source_;
            }
            return co.rira.kafka.model.OpennmsModelProtos.TopologySegment.getDefaultInstance();
        }

        /**
         * <code>.TopologySegment sourceSegment = 4;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.TopologySegmentOrBuilder getSourceSegmentOrBuilder() {
            if (sourceCase_ == 4) {
                return (co.rira.kafka.model.OpennmsModelProtos.TopologySegment) source_;
            }
            return co.rira.kafka.model.OpennmsModelProtos.TopologySegment.getDefaultInstance();
        }

        /**
         * <code>.Node sourceNode = 5;</code>
         *
         * @return Whether the sourceNode field is set.
         */
        public boolean hasSourceNode() {
            return sourceCase_ == 5;
        }

        /**
         * <code>.Node sourceNode = 5;</code>
         *
         * @return The sourceNode.
         */
        public co.rira.kafka.model.OpennmsModelProtos.Node getSourceNode() {
            if (sourceCase_ == 5) {
                return (co.rira.kafka.model.OpennmsModelProtos.Node) source_;
            }
            return co.rira.kafka.model.OpennmsModelProtos.Node.getDefaultInstance();
        }

        /**
         * <code>.Node sourceNode = 5;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.NodeOrBuilder getSourceNodeOrBuilder() {
            if (sourceCase_ == 5) {
                return (co.rira.kafka.model.OpennmsModelProtos.Node) source_;
            }
            return co.rira.kafka.model.OpennmsModelProtos.Node.getDefaultInstance();
        }

        /**
         * <code>.TopologyPort targetPort = 6;</code>
         *
         * @return Whether the targetPort field is set.
         */
        public boolean hasTargetPort() {
            return targetCase_ == 6;
        }

        /**
         * <code>.TopologyPort targetPort = 6;</code>
         *
         * @return The targetPort.
         */
        public co.rira.kafka.model.OpennmsModelProtos.TopologyPort getTargetPort() {
            if (targetCase_ == 6) {
                return (co.rira.kafka.model.OpennmsModelProtos.TopologyPort) target_;
            }
            return co.rira.kafka.model.OpennmsModelProtos.TopologyPort.getDefaultInstance();
        }

        /**
         * <code>.TopologyPort targetPort = 6;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.TopologyPortOrBuilder getTargetPortOrBuilder() {
            if (targetCase_ == 6) {
                return (co.rira.kafka.model.OpennmsModelProtos.TopologyPort) target_;
            }
            return co.rira.kafka.model.OpennmsModelProtos.TopologyPort.getDefaultInstance();
        }

        /**
         * <code>.TopologySegment targetSegment = 7;</code>
         *
         * @return Whether the targetSegment field is set.
         */
        public boolean hasTargetSegment() {
            return targetCase_ == 7;
        }

        /**
         * <code>.TopologySegment targetSegment = 7;</code>
         *
         * @return The targetSegment.
         */
        public co.rira.kafka.model.OpennmsModelProtos.TopologySegment getTargetSegment() {
            if (targetCase_ == 7) {
                return (co.rira.kafka.model.OpennmsModelProtos.TopologySegment) target_;
            }
            return co.rira.kafka.model.OpennmsModelProtos.TopologySegment.getDefaultInstance();
        }

        /**
         * <code>.TopologySegment targetSegment = 7;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.TopologySegmentOrBuilder getTargetSegmentOrBuilder() {
            if (targetCase_ == 7) {
                return (co.rira.kafka.model.OpennmsModelProtos.TopologySegment) target_;
            }
            return co.rira.kafka.model.OpennmsModelProtos.TopologySegment.getDefaultInstance();
        }

        /**
         * <code>.Node targetNode = 8;</code>
         *
         * @return Whether the targetNode field is set.
         */
        public boolean hasTargetNode() {
            return targetCase_ == 8;
        }

        /**
         * <code>.Node targetNode = 8;</code>
         *
         * @return The targetNode.
         */
        public co.rira.kafka.model.OpennmsModelProtos.Node getTargetNode() {
            if (targetCase_ == 8) {
                return (co.rira.kafka.model.OpennmsModelProtos.Node) target_;
            }
            return co.rira.kafka.model.OpennmsModelProtos.Node.getDefaultInstance();
        }

        /**
         * <code>.Node targetNode = 8;</code>
         */
        public co.rira.kafka.model.OpennmsModelProtos.NodeOrBuilder getTargetNodeOrBuilder() {
            if (targetCase_ == 8) {
                return (co.rira.kafka.model.OpennmsModelProtos.Node) target_;
            }
            return co.rira.kafka.model.OpennmsModelProtos.Node.getDefaultInstance();
        }

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (ref_ != null) {
                output.writeMessage(1, getRef());
            }
            if (sourceCase_ == 3) {
                output.writeMessage(3, (co.rira.kafka.model.OpennmsModelProtos.TopologyPort) source_);
            }
            if (sourceCase_ == 4) {
                output.writeMessage(4, (co.rira.kafka.model.OpennmsModelProtos.TopologySegment) source_);
            }
            if (sourceCase_ == 5) {
                output.writeMessage(5, (co.rira.kafka.model.OpennmsModelProtos.Node) source_);
            }
            if (targetCase_ == 6) {
                output.writeMessage(6, (co.rira.kafka.model.OpennmsModelProtos.TopologyPort) target_);
            }
            if (targetCase_ == 7) {
                output.writeMessage(7, (co.rira.kafka.model.OpennmsModelProtos.TopologySegment) target_);
            }
            if (targetCase_ == 8) {
                output.writeMessage(8, (co.rira.kafka.model.OpennmsModelProtos.Node) target_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (ref_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, getRef());
            }
            if (sourceCase_ == 3) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, (co.rira.kafka.model.OpennmsModelProtos.TopologyPort) source_);
            }
            if (sourceCase_ == 4) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(4, (co.rira.kafka.model.OpennmsModelProtos.TopologySegment) source_);
            }
            if (sourceCase_ == 5) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(5, (co.rira.kafka.model.OpennmsModelProtos.Node) source_);
            }
            if (targetCase_ == 6) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(6, (co.rira.kafka.model.OpennmsModelProtos.TopologyPort) target_);
            }
            if (targetCase_ == 7) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(7, (co.rira.kafka.model.OpennmsModelProtos.TopologySegment) target_);
            }
            if (targetCase_ == 8) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(8, (co.rira.kafka.model.OpennmsModelProtos.Node) target_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof co.rira.kafka.model.OpennmsModelProtos.TopologyEdge)) {
                return super.equals(obj);
            }
            co.rira.kafka.model.OpennmsModelProtos.TopologyEdge other = (co.rira.kafka.model.OpennmsModelProtos.TopologyEdge) obj;

            if (hasRef() != other.hasRef()) return false;
            if (hasRef()) {
                if (!getRef()
                        .equals(other.getRef())) return false;
            }
            if (!getSourceCase().equals(other.getSourceCase())) return false;
            switch (sourceCase_) {
                case 3:
                    if (!getSourcePort()
                            .equals(other.getSourcePort())) return false;
                    break;
                case 4:
                    if (!getSourceSegment()
                            .equals(other.getSourceSegment())) return false;
                    break;
                case 5:
                    if (!getSourceNode()
                            .equals(other.getSourceNode())) return false;
                    break;
                case 0:
                default:
            }
            if (!getTargetCase().equals(other.getTargetCase())) return false;
            switch (targetCase_) {
                case 6:
                    if (!getTargetPort()
                            .equals(other.getTargetPort())) return false;
                    break;
                case 7:
                    if (!getTargetSegment()
                            .equals(other.getTargetSegment())) return false;
                    break;
                case 8:
                    if (!getTargetNode()
                            .equals(other.getTargetNode())) return false;
                    break;
                case 0:
                default:
            }
            return unknownFields.equals(other.unknownFields);
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasRef()) {
                hash = (37 * hash) + REF_FIELD_NUMBER;
                hash = (53 * hash) + getRef().hashCode();
            }
            switch (sourceCase_) {
                case 3:
                    hash = (37 * hash) + SOURCEPORT_FIELD_NUMBER;
                    hash = (53 * hash) + getSourcePort().hashCode();
                    break;
                case 4:
                    hash = (37 * hash) + SOURCESEGMENT_FIELD_NUMBER;
                    hash = (53 * hash) + getSourceSegment().hashCode();
                    break;
                case 5:
                    hash = (37 * hash) + SOURCENODE_FIELD_NUMBER;
                    hash = (53 * hash) + getSourceNode().hashCode();
                    break;
                case 0:
                default:
            }
            switch (targetCase_) {
                case 6:
                    hash = (37 * hash) + TARGETPORT_FIELD_NUMBER;
                    hash = (53 * hash) + getTargetPort().hashCode();
                    break;
                case 7:
                    hash = (37 * hash) + TARGETSEGMENT_FIELD_NUMBER;
                    hash = (53 * hash) + getTargetSegment().hashCode();
                    break;
                case 8:
                    hash = (37 * hash) + TARGETNODE_FIELD_NUMBER;
                    hash = (53 * hash) + getTargetNode().hashCode();
                    break;
                case 0:
                default:
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<TopologyEdge> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public co.rira.kafka.model.OpennmsModelProtos.TopologyEdge getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public enum SourceCase
                implements com.google.protobuf.Internal.EnumLite,
                com.google.protobuf.AbstractMessage.InternalOneOfEnum {
            SOURCEPORT(3),
            SOURCESEGMENT(4),
            SOURCENODE(5),
            SOURCE_NOT_SET(0);
            private final int value;

            SourceCase(int value) {
                this.value = value;
            }

            /**
             * @param value The number of the enum to look for.
             * @return The enum associated with the given number.
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @java.lang.Deprecated
            public static SourceCase valueOf(int value) {
                return forNumber(value);
            }

            public static SourceCase forNumber(int value) {
                switch (value) {
                    case 3:
                        return SOURCEPORT;
                    case 4:
                        return SOURCESEGMENT;
                    case 5:
                        return SOURCENODE;
                    case 0:
                        return SOURCE_NOT_SET;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }
        }

        public enum TargetCase
                implements com.google.protobuf.Internal.EnumLite,
                com.google.protobuf.AbstractMessage.InternalOneOfEnum {
            TARGETPORT(6),
            TARGETSEGMENT(7),
            TARGETNODE(8),
            TARGET_NOT_SET(0);
            private final int value;

            TargetCase(int value) {
                this.value = value;
            }

            /**
             * @param value The number of the enum to look for.
             * @return The enum associated with the given number.
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @java.lang.Deprecated
            public static TargetCase valueOf(int value) {
                return forNumber(value);
            }

            public static TargetCase forNumber(int value) {
                switch (value) {
                    case 6:
                        return TARGETPORT;
                    case 7:
                        return TARGETSEGMENT;
                    case 8:
                        return TARGETNODE;
                    case 0:
                        return TARGET_NOT_SET;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }
        }

        /**
         * Protobuf type {@code TopologyEdge}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:TopologyEdge)
                co.rira.kafka.model.OpennmsModelProtos.TopologyEdgeOrBuilder {
            private int sourceCase_ = 0;
            private java.lang.Object source_;
            private int targetCase_ = 0;
            private java.lang.Object target_;
            private co.rira.kafka.model.OpennmsModelProtos.TopologyRef ref_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.TopologyRef, co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Builder, co.rira.kafka.model.OpennmsModelProtos.TopologyRefOrBuilder> refBuilder_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.TopologyPort, co.rira.kafka.model.OpennmsModelProtos.TopologyPort.Builder, co.rira.kafka.model.OpennmsModelProtos.TopologyPortOrBuilder> sourcePortBuilder_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.TopologySegment, co.rira.kafka.model.OpennmsModelProtos.TopologySegment.Builder, co.rira.kafka.model.OpennmsModelProtos.TopologySegmentOrBuilder> sourceSegmentBuilder_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.Node, co.rira.kafka.model.OpennmsModelProtos.Node.Builder, co.rira.kafka.model.OpennmsModelProtos.NodeOrBuilder> sourceNodeBuilder_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.TopologyPort, co.rira.kafka.model.OpennmsModelProtos.TopologyPort.Builder, co.rira.kafka.model.OpennmsModelProtos.TopologyPortOrBuilder> targetPortBuilder_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.TopologySegment, co.rira.kafka.model.OpennmsModelProtos.TopologySegment.Builder, co.rira.kafka.model.OpennmsModelProtos.TopologySegmentOrBuilder> targetSegmentBuilder_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.Node, co.rira.kafka.model.OpennmsModelProtos.Node.Builder, co.rira.kafka.model.OpennmsModelProtos.NodeOrBuilder> targetNodeBuilder_;

            // Construct using co.rira.kafka.model.OpennmsModelProtos.TopologyEdge.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologyEdge_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologyEdge_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                co.rira.kafka.model.OpennmsModelProtos.TopologyEdge.class, co.rira.kafka.model.OpennmsModelProtos.TopologyEdge.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                if (refBuilder_ == null) {
                    ref_ = null;
                } else {
                    ref_ = null;
                    refBuilder_ = null;
                }
                sourceCase_ = 0;
                source_ = null;
                targetCase_ = 0;
                target_ = null;
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return co.rira.kafka.model.OpennmsModelProtos.internal_static_TopologyEdge_descriptor;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.TopologyEdge getDefaultInstanceForType() {
                return co.rira.kafka.model.OpennmsModelProtos.TopologyEdge.getDefaultInstance();
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.TopologyEdge build() {
                co.rira.kafka.model.OpennmsModelProtos.TopologyEdge result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public co.rira.kafka.model.OpennmsModelProtos.TopologyEdge buildPartial() {
                co.rira.kafka.model.OpennmsModelProtos.TopologyEdge result = new co.rira.kafka.model.OpennmsModelProtos.TopologyEdge(this);
                if (refBuilder_ == null) {
                    result.ref_ = ref_;
                } else {
                    result.ref_ = refBuilder_.build();
                }
                if (sourceCase_ == 3) {
                    if (sourcePortBuilder_ == null) {
                        result.source_ = source_;
                    } else {
                        result.source_ = sourcePortBuilder_.build();
                    }
                }
                if (sourceCase_ == 4) {
                    if (sourceSegmentBuilder_ == null) {
                        result.source_ = source_;
                    } else {
                        result.source_ = sourceSegmentBuilder_.build();
                    }
                }
                if (sourceCase_ == 5) {
                    if (sourceNodeBuilder_ == null) {
                        result.source_ = source_;
                    } else {
                        result.source_ = sourceNodeBuilder_.build();
                    }
                }
                if (targetCase_ == 6) {
                    if (targetPortBuilder_ == null) {
                        result.target_ = target_;
                    } else {
                        result.target_ = targetPortBuilder_.build();
                    }
                }
                if (targetCase_ == 7) {
                    if (targetSegmentBuilder_ == null) {
                        result.target_ = target_;
                    } else {
                        result.target_ = targetSegmentBuilder_.build();
                    }
                }
                if (targetCase_ == 8) {
                    if (targetNodeBuilder_ == null) {
                        result.target_ = target_;
                    } else {
                        result.target_ = targetNodeBuilder_.build();
                    }
                }
                result.sourceCase_ = sourceCase_;
                result.targetCase_ = targetCase_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof co.rira.kafka.model.OpennmsModelProtos.TopologyEdge) {
                    return mergeFrom((co.rira.kafka.model.OpennmsModelProtos.TopologyEdge) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(co.rira.kafka.model.OpennmsModelProtos.TopologyEdge other) {
                if (other == co.rira.kafka.model.OpennmsModelProtos.TopologyEdge.getDefaultInstance()) return this;
                if (other.hasRef()) {
                    mergeRef(other.getRef());
                }
                switch (other.getSourceCase()) {
                    case SOURCEPORT: {
                        mergeSourcePort(other.getSourcePort());
                        break;
                    }
                    case SOURCESEGMENT: {
                        mergeSourceSegment(other.getSourceSegment());
                        break;
                    }
                    case SOURCENODE: {
                        mergeSourceNode(other.getSourceNode());
                        break;
                    }
                    case SOURCE_NOT_SET: {
                        break;
                    }
                }
                switch (other.getTargetCase()) {
                    case TARGETPORT: {
                        mergeTargetPort(other.getTargetPort());
                        break;
                    }
                    case TARGETSEGMENT: {
                        mergeTargetSegment(other.getTargetSegment());
                        break;
                    }
                    case TARGETNODE: {
                        mergeTargetNode(other.getTargetNode());
                        break;
                    }
                    case TARGET_NOT_SET: {
                        break;
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                co.rira.kafka.model.OpennmsModelProtos.TopologyEdge parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (co.rira.kafka.model.OpennmsModelProtos.TopologyEdge) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            public SourceCase
            getSourceCase() {
                return SourceCase.forNumber(
                        sourceCase_);
            }

            public Builder clearSource() {
                sourceCase_ = 0;
                source_ = null;
                onChanged();
                return this;
            }

            public TargetCase
            getTargetCase() {
                return TargetCase.forNumber(
                        targetCase_);
            }

            public Builder clearTarget() {
                targetCase_ = 0;
                target_ = null;
                onChanged();
                return this;
            }

            /**
             * <code>.TopologyRef ref = 1;</code>
             *
             * @return Whether the ref field is set.
             */
            public boolean hasRef() {
                return refBuilder_ != null || ref_ != null;
            }

            /**
             * <code>.TopologyRef ref = 1;</code>
             *
             * @return The ref.
             */
            public co.rira.kafka.model.OpennmsModelProtos.TopologyRef getRef() {
                if (refBuilder_ == null) {
                    return ref_ == null ? co.rira.kafka.model.OpennmsModelProtos.TopologyRef.getDefaultInstance() : ref_;
                } else {
                    return refBuilder_.getMessage();
                }
            }

            /**
             * <code>.TopologyRef ref = 1;</code>
             */
            public Builder setRef(co.rira.kafka.model.OpennmsModelProtos.TopologyRef value) {
                if (refBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ref_ = value;
                    onChanged();
                } else {
                    refBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.TopologyRef ref = 1;</code>
             */
            public Builder setRef(
                    co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Builder builderForValue) {
                if (refBuilder_ == null) {
                    ref_ = builderForValue.build();
                    onChanged();
                } else {
                    refBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.TopologyRef ref = 1;</code>
             */
            public Builder mergeRef(co.rira.kafka.model.OpennmsModelProtos.TopologyRef value) {
                if (refBuilder_ == null) {
                    if (ref_ != null) {
                        ref_ =
                                co.rira.kafka.model.OpennmsModelProtos.TopologyRef.newBuilder(ref_).mergeFrom(value).buildPartial();
                    } else {
                        ref_ = value;
                    }
                    onChanged();
                } else {
                    refBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.TopologyRef ref = 1;</code>
             */
            public Builder clearRef() {
                if (refBuilder_ == null) {
                    ref_ = null;
                    onChanged();
                } else {
                    ref_ = null;
                    refBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.TopologyRef ref = 1;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Builder getRefBuilder() {

                onChanged();
                return getRefFieldBuilder().getBuilder();
            }

            /**
             * <code>.TopologyRef ref = 1;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.TopologyRefOrBuilder getRefOrBuilder() {
                if (refBuilder_ != null) {
                    return refBuilder_.getMessageOrBuilder();
                } else {
                    return ref_ == null ?
                            co.rira.kafka.model.OpennmsModelProtos.TopologyRef.getDefaultInstance() : ref_;
                }
            }

            /**
             * <code>.TopologyRef ref = 1;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.TopologyRef, co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Builder, co.rira.kafka.model.OpennmsModelProtos.TopologyRefOrBuilder>
            getRefFieldBuilder() {
                if (refBuilder_ == null) {
                    refBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            co.rira.kafka.model.OpennmsModelProtos.TopologyRef, co.rira.kafka.model.OpennmsModelProtos.TopologyRef.Builder, co.rira.kafka.model.OpennmsModelProtos.TopologyRefOrBuilder>(
                            getRef(),
                            getParentForChildren(),
                            isClean());
                    ref_ = null;
                }
                return refBuilder_;
            }

            /**
             * <code>.TopologyPort sourcePort = 3;</code>
             *
             * @return Whether the sourcePort field is set.
             */
            public boolean hasSourcePort() {
                return sourceCase_ == 3;
            }

            /**
             * <code>.TopologyPort sourcePort = 3;</code>
             *
             * @return The sourcePort.
             */
            public co.rira.kafka.model.OpennmsModelProtos.TopologyPort getSourcePort() {
                if (sourcePortBuilder_ == null) {
                    if (sourceCase_ == 3) {
                        return (co.rira.kafka.model.OpennmsModelProtos.TopologyPort) source_;
                    }
                    return co.rira.kafka.model.OpennmsModelProtos.TopologyPort.getDefaultInstance();
                } else {
                    if (sourceCase_ == 3) {
                        return sourcePortBuilder_.getMessage();
                    }
                    return co.rira.kafka.model.OpennmsModelProtos.TopologyPort.getDefaultInstance();
                }
            }

            /**
             * <code>.TopologyPort sourcePort = 3;</code>
             */
            public Builder setSourcePort(co.rira.kafka.model.OpennmsModelProtos.TopologyPort value) {
                if (sourcePortBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    source_ = value;
                    onChanged();
                } else {
                    sourcePortBuilder_.setMessage(value);
                }
                sourceCase_ = 3;
                return this;
            }

            /**
             * <code>.TopologyPort sourcePort = 3;</code>
             */
            public Builder setSourcePort(
                    co.rira.kafka.model.OpennmsModelProtos.TopologyPort.Builder builderForValue) {
                if (sourcePortBuilder_ == null) {
                    source_ = builderForValue.build();
                    onChanged();
                } else {
                    sourcePortBuilder_.setMessage(builderForValue.build());
                }
                sourceCase_ = 3;
                return this;
            }

            /**
             * <code>.TopologyPort sourcePort = 3;</code>
             */
            public Builder mergeSourcePort(co.rira.kafka.model.OpennmsModelProtos.TopologyPort value) {
                if (sourcePortBuilder_ == null) {
                    if (sourceCase_ == 3 &&
                            source_ != co.rira.kafka.model.OpennmsModelProtos.TopologyPort.getDefaultInstance()) {
                        source_ = co.rira.kafka.model.OpennmsModelProtos.TopologyPort.newBuilder((co.rira.kafka.model.OpennmsModelProtos.TopologyPort) source_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        source_ = value;
                    }
                    onChanged();
                } else {
                    if (sourceCase_ == 3) {
                        sourcePortBuilder_.mergeFrom(value);
                    }
                    sourcePortBuilder_.setMessage(value);
                }
                sourceCase_ = 3;
                return this;
            }

            /**
             * <code>.TopologyPort sourcePort = 3;</code>
             */
            public Builder clearSourcePort() {
                if (sourcePortBuilder_ == null) {
                    if (sourceCase_ == 3) {
                        sourceCase_ = 0;
                        source_ = null;
                        onChanged();
                    }
                } else {
                    if (sourceCase_ == 3) {
                        sourceCase_ = 0;
                        source_ = null;
                    }
                    sourcePortBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>.TopologyPort sourcePort = 3;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.TopologyPort.Builder getSourcePortBuilder() {
                return getSourcePortFieldBuilder().getBuilder();
            }

            /**
             * <code>.TopologyPort sourcePort = 3;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.TopologyPortOrBuilder getSourcePortOrBuilder() {
                if ((sourceCase_ == 3) && (sourcePortBuilder_ != null)) {
                    return sourcePortBuilder_.getMessageOrBuilder();
                } else {
                    if (sourceCase_ == 3) {
                        return (co.rira.kafka.model.OpennmsModelProtos.TopologyPort) source_;
                    }
                    return co.rira.kafka.model.OpennmsModelProtos.TopologyPort.getDefaultInstance();
                }
            }

            /**
             * <code>.TopologyPort sourcePort = 3;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.TopologyPort, co.rira.kafka.model.OpennmsModelProtos.TopologyPort.Builder, co.rira.kafka.model.OpennmsModelProtos.TopologyPortOrBuilder>
            getSourcePortFieldBuilder() {
                if (sourcePortBuilder_ == null) {
                    if (!(sourceCase_ == 3)) {
                        source_ = co.rira.kafka.model.OpennmsModelProtos.TopologyPort.getDefaultInstance();
                    }
                    sourcePortBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            co.rira.kafka.model.OpennmsModelProtos.TopologyPort, co.rira.kafka.model.OpennmsModelProtos.TopologyPort.Builder, co.rira.kafka.model.OpennmsModelProtos.TopologyPortOrBuilder>(
                            (co.rira.kafka.model.OpennmsModelProtos.TopologyPort) source_,
                            getParentForChildren(),
                            isClean());
                    source_ = null;
                }
                sourceCase_ = 3;
                onChanged();
                return sourcePortBuilder_;
            }

            /**
             * <code>.TopologySegment sourceSegment = 4;</code>
             *
             * @return Whether the sourceSegment field is set.
             */
            public boolean hasSourceSegment() {
                return sourceCase_ == 4;
            }

            /**
             * <code>.TopologySegment sourceSegment = 4;</code>
             *
             * @return The sourceSegment.
             */
            public co.rira.kafka.model.OpennmsModelProtos.TopologySegment getSourceSegment() {
                if (sourceSegmentBuilder_ == null) {
                    if (sourceCase_ == 4) {
                        return (co.rira.kafka.model.OpennmsModelProtos.TopologySegment) source_;
                    }
                    return co.rira.kafka.model.OpennmsModelProtos.TopologySegment.getDefaultInstance();
                } else {
                    if (sourceCase_ == 4) {
                        return sourceSegmentBuilder_.getMessage();
                    }
                    return co.rira.kafka.model.OpennmsModelProtos.TopologySegment.getDefaultInstance();
                }
            }

            /**
             * <code>.TopologySegment sourceSegment = 4;</code>
             */
            public Builder setSourceSegment(co.rira.kafka.model.OpennmsModelProtos.TopologySegment value) {
                if (sourceSegmentBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    source_ = value;
                    onChanged();
                } else {
                    sourceSegmentBuilder_.setMessage(value);
                }
                sourceCase_ = 4;
                return this;
            }

            /**
             * <code>.TopologySegment sourceSegment = 4;</code>
             */
            public Builder setSourceSegment(
                    co.rira.kafka.model.OpennmsModelProtos.TopologySegment.Builder builderForValue) {
                if (sourceSegmentBuilder_ == null) {
                    source_ = builderForValue.build();
                    onChanged();
                } else {
                    sourceSegmentBuilder_.setMessage(builderForValue.build());
                }
                sourceCase_ = 4;
                return this;
            }

            /**
             * <code>.TopologySegment sourceSegment = 4;</code>
             */
            public Builder mergeSourceSegment(co.rira.kafka.model.OpennmsModelProtos.TopologySegment value) {
                if (sourceSegmentBuilder_ == null) {
                    if (sourceCase_ == 4 &&
                            source_ != co.rira.kafka.model.OpennmsModelProtos.TopologySegment.getDefaultInstance()) {
                        source_ = co.rira.kafka.model.OpennmsModelProtos.TopologySegment.newBuilder((co.rira.kafka.model.OpennmsModelProtos.TopologySegment) source_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        source_ = value;
                    }
                    onChanged();
                } else {
                    if (sourceCase_ == 4) {
                        sourceSegmentBuilder_.mergeFrom(value);
                    }
                    sourceSegmentBuilder_.setMessage(value);
                }
                sourceCase_ = 4;
                return this;
            }

            /**
             * <code>.TopologySegment sourceSegment = 4;</code>
             */
            public Builder clearSourceSegment() {
                if (sourceSegmentBuilder_ == null) {
                    if (sourceCase_ == 4) {
                        sourceCase_ = 0;
                        source_ = null;
                        onChanged();
                    }
                } else {
                    if (sourceCase_ == 4) {
                        sourceCase_ = 0;
                        source_ = null;
                    }
                    sourceSegmentBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>.TopologySegment sourceSegment = 4;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.TopologySegment.Builder getSourceSegmentBuilder() {
                return getSourceSegmentFieldBuilder().getBuilder();
            }

            /**
             * <code>.TopologySegment sourceSegment = 4;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.TopologySegmentOrBuilder getSourceSegmentOrBuilder() {
                if ((sourceCase_ == 4) && (sourceSegmentBuilder_ != null)) {
                    return sourceSegmentBuilder_.getMessageOrBuilder();
                } else {
                    if (sourceCase_ == 4) {
                        return (co.rira.kafka.model.OpennmsModelProtos.TopologySegment) source_;
                    }
                    return co.rira.kafka.model.OpennmsModelProtos.TopologySegment.getDefaultInstance();
                }
            }

            /**
             * <code>.TopologySegment sourceSegment = 4;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.TopologySegment, co.rira.kafka.model.OpennmsModelProtos.TopologySegment.Builder, co.rira.kafka.model.OpennmsModelProtos.TopologySegmentOrBuilder>
            getSourceSegmentFieldBuilder() {
                if (sourceSegmentBuilder_ == null) {
                    if (!(sourceCase_ == 4)) {
                        source_ = co.rira.kafka.model.OpennmsModelProtos.TopologySegment.getDefaultInstance();
                    }
                    sourceSegmentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            co.rira.kafka.model.OpennmsModelProtos.TopologySegment, co.rira.kafka.model.OpennmsModelProtos.TopologySegment.Builder, co.rira.kafka.model.OpennmsModelProtos.TopologySegmentOrBuilder>(
                            (co.rira.kafka.model.OpennmsModelProtos.TopologySegment) source_,
                            getParentForChildren(),
                            isClean());
                    source_ = null;
                }
                sourceCase_ = 4;
                onChanged();
                return sourceSegmentBuilder_;
            }

            /**
             * <code>.Node sourceNode = 5;</code>
             *
             * @return Whether the sourceNode field is set.
             */
            public boolean hasSourceNode() {
                return sourceCase_ == 5;
            }

            /**
             * <code>.Node sourceNode = 5;</code>
             *
             * @return The sourceNode.
             */
            public co.rira.kafka.model.OpennmsModelProtos.Node getSourceNode() {
                if (sourceNodeBuilder_ == null) {
                    if (sourceCase_ == 5) {
                        return (co.rira.kafka.model.OpennmsModelProtos.Node) source_;
                    }
                    return co.rira.kafka.model.OpennmsModelProtos.Node.getDefaultInstance();
                } else {
                    if (sourceCase_ == 5) {
                        return sourceNodeBuilder_.getMessage();
                    }
                    return co.rira.kafka.model.OpennmsModelProtos.Node.getDefaultInstance();
                }
            }

            /**
             * <code>.Node sourceNode = 5;</code>
             */
            public Builder setSourceNode(co.rira.kafka.model.OpennmsModelProtos.Node value) {
                if (sourceNodeBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    source_ = value;
                    onChanged();
                } else {
                    sourceNodeBuilder_.setMessage(value);
                }
                sourceCase_ = 5;
                return this;
            }

            /**
             * <code>.Node sourceNode = 5;</code>
             */
            public Builder setSourceNode(
                    co.rira.kafka.model.OpennmsModelProtos.Node.Builder builderForValue) {
                if (sourceNodeBuilder_ == null) {
                    source_ = builderForValue.build();
                    onChanged();
                } else {
                    sourceNodeBuilder_.setMessage(builderForValue.build());
                }
                sourceCase_ = 5;
                return this;
            }

            /**
             * <code>.Node sourceNode = 5;</code>
             */
            public Builder mergeSourceNode(co.rira.kafka.model.OpennmsModelProtos.Node value) {
                if (sourceNodeBuilder_ == null) {
                    if (sourceCase_ == 5 &&
                            source_ != co.rira.kafka.model.OpennmsModelProtos.Node.getDefaultInstance()) {
                        source_ = co.rira.kafka.model.OpennmsModelProtos.Node.newBuilder((co.rira.kafka.model.OpennmsModelProtos.Node) source_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        source_ = value;
                    }
                    onChanged();
                } else {
                    if (sourceCase_ == 5) {
                        sourceNodeBuilder_.mergeFrom(value);
                    }
                    sourceNodeBuilder_.setMessage(value);
                }
                sourceCase_ = 5;
                return this;
            }

            /**
             * <code>.Node sourceNode = 5;</code>
             */
            public Builder clearSourceNode() {
                if (sourceNodeBuilder_ == null) {
                    if (sourceCase_ == 5) {
                        sourceCase_ = 0;
                        source_ = null;
                        onChanged();
                    }
                } else {
                    if (sourceCase_ == 5) {
                        sourceCase_ = 0;
                        source_ = null;
                    }
                    sourceNodeBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>.Node sourceNode = 5;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.Node.Builder getSourceNodeBuilder() {
                return getSourceNodeFieldBuilder().getBuilder();
            }

            /**
             * <code>.Node sourceNode = 5;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.NodeOrBuilder getSourceNodeOrBuilder() {
                if ((sourceCase_ == 5) && (sourceNodeBuilder_ != null)) {
                    return sourceNodeBuilder_.getMessageOrBuilder();
                } else {
                    if (sourceCase_ == 5) {
                        return (co.rira.kafka.model.OpennmsModelProtos.Node) source_;
                    }
                    return co.rira.kafka.model.OpennmsModelProtos.Node.getDefaultInstance();
                }
            }

            /**
             * <code>.Node sourceNode = 5;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.Node, co.rira.kafka.model.OpennmsModelProtos.Node.Builder, co.rira.kafka.model.OpennmsModelProtos.NodeOrBuilder>
            getSourceNodeFieldBuilder() {
                if (sourceNodeBuilder_ == null) {
                    if (!(sourceCase_ == 5)) {
                        source_ = co.rira.kafka.model.OpennmsModelProtos.Node.getDefaultInstance();
                    }
                    sourceNodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            co.rira.kafka.model.OpennmsModelProtos.Node, co.rira.kafka.model.OpennmsModelProtos.Node.Builder, co.rira.kafka.model.OpennmsModelProtos.NodeOrBuilder>(
                            (co.rira.kafka.model.OpennmsModelProtos.Node) source_,
                            getParentForChildren(),
                            isClean());
                    source_ = null;
                }
                sourceCase_ = 5;
                onChanged();
                return sourceNodeBuilder_;
            }

            /**
             * <code>.TopologyPort targetPort = 6;</code>
             *
             * @return Whether the targetPort field is set.
             */
            public boolean hasTargetPort() {
                return targetCase_ == 6;
            }

            /**
             * <code>.TopologyPort targetPort = 6;</code>
             *
             * @return The targetPort.
             */
            public co.rira.kafka.model.OpennmsModelProtos.TopologyPort getTargetPort() {
                if (targetPortBuilder_ == null) {
                    if (targetCase_ == 6) {
                        return (co.rira.kafka.model.OpennmsModelProtos.TopologyPort) target_;
                    }
                    return co.rira.kafka.model.OpennmsModelProtos.TopologyPort.getDefaultInstance();
                } else {
                    if (targetCase_ == 6) {
                        return targetPortBuilder_.getMessage();
                    }
                    return co.rira.kafka.model.OpennmsModelProtos.TopologyPort.getDefaultInstance();
                }
            }

            /**
             * <code>.TopologyPort targetPort = 6;</code>
             */
            public Builder setTargetPort(co.rira.kafka.model.OpennmsModelProtos.TopologyPort value) {
                if (targetPortBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    target_ = value;
                    onChanged();
                } else {
                    targetPortBuilder_.setMessage(value);
                }
                targetCase_ = 6;
                return this;
            }

            /**
             * <code>.TopologyPort targetPort = 6;</code>
             */
            public Builder setTargetPort(
                    co.rira.kafka.model.OpennmsModelProtos.TopologyPort.Builder builderForValue) {
                if (targetPortBuilder_ == null) {
                    target_ = builderForValue.build();
                    onChanged();
                } else {
                    targetPortBuilder_.setMessage(builderForValue.build());
                }
                targetCase_ = 6;
                return this;
            }

            /**
             * <code>.TopologyPort targetPort = 6;</code>
             */
            public Builder mergeTargetPort(co.rira.kafka.model.OpennmsModelProtos.TopologyPort value) {
                if (targetPortBuilder_ == null) {
                    if (targetCase_ == 6 &&
                            target_ != co.rira.kafka.model.OpennmsModelProtos.TopologyPort.getDefaultInstance()) {
                        target_ = co.rira.kafka.model.OpennmsModelProtos.TopologyPort.newBuilder((co.rira.kafka.model.OpennmsModelProtos.TopologyPort) target_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        target_ = value;
                    }
                    onChanged();
                } else {
                    if (targetCase_ == 6) {
                        targetPortBuilder_.mergeFrom(value);
                    }
                    targetPortBuilder_.setMessage(value);
                }
                targetCase_ = 6;
                return this;
            }

            /**
             * <code>.TopologyPort targetPort = 6;</code>
             */
            public Builder clearTargetPort() {
                if (targetPortBuilder_ == null) {
                    if (targetCase_ == 6) {
                        targetCase_ = 0;
                        target_ = null;
                        onChanged();
                    }
                } else {
                    if (targetCase_ == 6) {
                        targetCase_ = 0;
                        target_ = null;
                    }
                    targetPortBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>.TopologyPort targetPort = 6;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.TopologyPort.Builder getTargetPortBuilder() {
                return getTargetPortFieldBuilder().getBuilder();
            }

            /**
             * <code>.TopologyPort targetPort = 6;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.TopologyPortOrBuilder getTargetPortOrBuilder() {
                if ((targetCase_ == 6) && (targetPortBuilder_ != null)) {
                    return targetPortBuilder_.getMessageOrBuilder();
                } else {
                    if (targetCase_ == 6) {
                        return (co.rira.kafka.model.OpennmsModelProtos.TopologyPort) target_;
                    }
                    return co.rira.kafka.model.OpennmsModelProtos.TopologyPort.getDefaultInstance();
                }
            }

            /**
             * <code>.TopologyPort targetPort = 6;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.TopologyPort, co.rira.kafka.model.OpennmsModelProtos.TopologyPort.Builder, co.rira.kafka.model.OpennmsModelProtos.TopologyPortOrBuilder>
            getTargetPortFieldBuilder() {
                if (targetPortBuilder_ == null) {
                    if (!(targetCase_ == 6)) {
                        target_ = co.rira.kafka.model.OpennmsModelProtos.TopologyPort.getDefaultInstance();
                    }
                    targetPortBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            co.rira.kafka.model.OpennmsModelProtos.TopologyPort, co.rira.kafka.model.OpennmsModelProtos.TopologyPort.Builder, co.rira.kafka.model.OpennmsModelProtos.TopologyPortOrBuilder>(
                            (co.rira.kafka.model.OpennmsModelProtos.TopologyPort) target_,
                            getParentForChildren(),
                            isClean());
                    target_ = null;
                }
                targetCase_ = 6;
                onChanged();
                return targetPortBuilder_;
            }

            /**
             * <code>.TopologySegment targetSegment = 7;</code>
             *
             * @return Whether the targetSegment field is set.
             */
            public boolean hasTargetSegment() {
                return targetCase_ == 7;
            }

            /**
             * <code>.TopologySegment targetSegment = 7;</code>
             *
             * @return The targetSegment.
             */
            public co.rira.kafka.model.OpennmsModelProtos.TopologySegment getTargetSegment() {
                if (targetSegmentBuilder_ == null) {
                    if (targetCase_ == 7) {
                        return (co.rira.kafka.model.OpennmsModelProtos.TopologySegment) target_;
                    }
                    return co.rira.kafka.model.OpennmsModelProtos.TopologySegment.getDefaultInstance();
                } else {
                    if (targetCase_ == 7) {
                        return targetSegmentBuilder_.getMessage();
                    }
                    return co.rira.kafka.model.OpennmsModelProtos.TopologySegment.getDefaultInstance();
                }
            }

            /**
             * <code>.TopologySegment targetSegment = 7;</code>
             */
            public Builder setTargetSegment(co.rira.kafka.model.OpennmsModelProtos.TopologySegment value) {
                if (targetSegmentBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    target_ = value;
                    onChanged();
                } else {
                    targetSegmentBuilder_.setMessage(value);
                }
                targetCase_ = 7;
                return this;
            }

            /**
             * <code>.TopologySegment targetSegment = 7;</code>
             */
            public Builder setTargetSegment(
                    co.rira.kafka.model.OpennmsModelProtos.TopologySegment.Builder builderForValue) {
                if (targetSegmentBuilder_ == null) {
                    target_ = builderForValue.build();
                    onChanged();
                } else {
                    targetSegmentBuilder_.setMessage(builderForValue.build());
                }
                targetCase_ = 7;
                return this;
            }

            /**
             * <code>.TopologySegment targetSegment = 7;</code>
             */
            public Builder mergeTargetSegment(co.rira.kafka.model.OpennmsModelProtos.TopologySegment value) {
                if (targetSegmentBuilder_ == null) {
                    if (targetCase_ == 7 &&
                            target_ != co.rira.kafka.model.OpennmsModelProtos.TopologySegment.getDefaultInstance()) {
                        target_ = co.rira.kafka.model.OpennmsModelProtos.TopologySegment.newBuilder((co.rira.kafka.model.OpennmsModelProtos.TopologySegment) target_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        target_ = value;
                    }
                    onChanged();
                } else {
                    if (targetCase_ == 7) {
                        targetSegmentBuilder_.mergeFrom(value);
                    }
                    targetSegmentBuilder_.setMessage(value);
                }
                targetCase_ = 7;
                return this;
            }

            /**
             * <code>.TopologySegment targetSegment = 7;</code>
             */
            public Builder clearTargetSegment() {
                if (targetSegmentBuilder_ == null) {
                    if (targetCase_ == 7) {
                        targetCase_ = 0;
                        target_ = null;
                        onChanged();
                    }
                } else {
                    if (targetCase_ == 7) {
                        targetCase_ = 0;
                        target_ = null;
                    }
                    targetSegmentBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>.TopologySegment targetSegment = 7;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.TopologySegment.Builder getTargetSegmentBuilder() {
                return getTargetSegmentFieldBuilder().getBuilder();
            }

            /**
             * <code>.TopologySegment targetSegment = 7;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.TopologySegmentOrBuilder getTargetSegmentOrBuilder() {
                if ((targetCase_ == 7) && (targetSegmentBuilder_ != null)) {
                    return targetSegmentBuilder_.getMessageOrBuilder();
                } else {
                    if (targetCase_ == 7) {
                        return (co.rira.kafka.model.OpennmsModelProtos.TopologySegment) target_;
                    }
                    return co.rira.kafka.model.OpennmsModelProtos.TopologySegment.getDefaultInstance();
                }
            }

            /**
             * <code>.TopologySegment targetSegment = 7;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.TopologySegment, co.rira.kafka.model.OpennmsModelProtos.TopologySegment.Builder, co.rira.kafka.model.OpennmsModelProtos.TopologySegmentOrBuilder>
            getTargetSegmentFieldBuilder() {
                if (targetSegmentBuilder_ == null) {
                    if (!(targetCase_ == 7)) {
                        target_ = co.rira.kafka.model.OpennmsModelProtos.TopologySegment.getDefaultInstance();
                    }
                    targetSegmentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            co.rira.kafka.model.OpennmsModelProtos.TopologySegment, co.rira.kafka.model.OpennmsModelProtos.TopologySegment.Builder, co.rira.kafka.model.OpennmsModelProtos.TopologySegmentOrBuilder>(
                            (co.rira.kafka.model.OpennmsModelProtos.TopologySegment) target_,
                            getParentForChildren(),
                            isClean());
                    target_ = null;
                }
                targetCase_ = 7;
                onChanged();
                return targetSegmentBuilder_;
            }

            /**
             * <code>.Node targetNode = 8;</code>
             *
             * @return Whether the targetNode field is set.
             */
            public boolean hasTargetNode() {
                return targetCase_ == 8;
            }

            /**
             * <code>.Node targetNode = 8;</code>
             *
             * @return The targetNode.
             */
            public co.rira.kafka.model.OpennmsModelProtos.Node getTargetNode() {
                if (targetNodeBuilder_ == null) {
                    if (targetCase_ == 8) {
                        return (co.rira.kafka.model.OpennmsModelProtos.Node) target_;
                    }
                    return co.rira.kafka.model.OpennmsModelProtos.Node.getDefaultInstance();
                } else {
                    if (targetCase_ == 8) {
                        return targetNodeBuilder_.getMessage();
                    }
                    return co.rira.kafka.model.OpennmsModelProtos.Node.getDefaultInstance();
                }
            }

            /**
             * <code>.Node targetNode = 8;</code>
             */
            public Builder setTargetNode(co.rira.kafka.model.OpennmsModelProtos.Node value) {
                if (targetNodeBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    target_ = value;
                    onChanged();
                } else {
                    targetNodeBuilder_.setMessage(value);
                }
                targetCase_ = 8;
                return this;
            }

            /**
             * <code>.Node targetNode = 8;</code>
             */
            public Builder setTargetNode(
                    co.rira.kafka.model.OpennmsModelProtos.Node.Builder builderForValue) {
                if (targetNodeBuilder_ == null) {
                    target_ = builderForValue.build();
                    onChanged();
                } else {
                    targetNodeBuilder_.setMessage(builderForValue.build());
                }
                targetCase_ = 8;
                return this;
            }

            /**
             * <code>.Node targetNode = 8;</code>
             */
            public Builder mergeTargetNode(co.rira.kafka.model.OpennmsModelProtos.Node value) {
                if (targetNodeBuilder_ == null) {
                    if (targetCase_ == 8 &&
                            target_ != co.rira.kafka.model.OpennmsModelProtos.Node.getDefaultInstance()) {
                        target_ = co.rira.kafka.model.OpennmsModelProtos.Node.newBuilder((co.rira.kafka.model.OpennmsModelProtos.Node) target_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        target_ = value;
                    }
                    onChanged();
                } else {
                    if (targetCase_ == 8) {
                        targetNodeBuilder_.mergeFrom(value);
                    }
                    targetNodeBuilder_.setMessage(value);
                }
                targetCase_ = 8;
                return this;
            }

            /**
             * <code>.Node targetNode = 8;</code>
             */
            public Builder clearTargetNode() {
                if (targetNodeBuilder_ == null) {
                    if (targetCase_ == 8) {
                        targetCase_ = 0;
                        target_ = null;
                        onChanged();
                    }
                } else {
                    if (targetCase_ == 8) {
                        targetCase_ = 0;
                        target_ = null;
                    }
                    targetNodeBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>.Node targetNode = 8;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.Node.Builder getTargetNodeBuilder() {
                return getTargetNodeFieldBuilder().getBuilder();
            }

            /**
             * <code>.Node targetNode = 8;</code>
             */
            public co.rira.kafka.model.OpennmsModelProtos.NodeOrBuilder getTargetNodeOrBuilder() {
                if ((targetCase_ == 8) && (targetNodeBuilder_ != null)) {
                    return targetNodeBuilder_.getMessageOrBuilder();
                } else {
                    if (targetCase_ == 8) {
                        return (co.rira.kafka.model.OpennmsModelProtos.Node) target_;
                    }
                    return co.rira.kafka.model.OpennmsModelProtos.Node.getDefaultInstance();
                }
            }

            /**
             * <code>.Node targetNode = 8;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    co.rira.kafka.model.OpennmsModelProtos.Node, co.rira.kafka.model.OpennmsModelProtos.Node.Builder, co.rira.kafka.model.OpennmsModelProtos.NodeOrBuilder>
            getTargetNodeFieldBuilder() {
                if (targetNodeBuilder_ == null) {
                    if (!(targetCase_ == 8)) {
                        target_ = co.rira.kafka.model.OpennmsModelProtos.Node.getDefaultInstance();
                    }
                    targetNodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            co.rira.kafka.model.OpennmsModelProtos.Node, co.rira.kafka.model.OpennmsModelProtos.Node.Builder, co.rira.kafka.model.OpennmsModelProtos.NodeOrBuilder>(
                            (co.rira.kafka.model.OpennmsModelProtos.Node) target_,
                            getParentForChildren(),
                            isClean());
                    target_ = null;
                }
                targetCase_ = 8;
                onChanged();
                return targetNodeBuilder_;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:TopologyEdge)
        }

    }

    // @@protoc_insertion_point(outer_class_scope)
}
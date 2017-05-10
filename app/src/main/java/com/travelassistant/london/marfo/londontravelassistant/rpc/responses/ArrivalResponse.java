package com.travelassistant.london.marfo.londontravelassistant.rpc.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//        "id",
//        "operationType",
//        "vehicleId",
//        "naptanId",
//        "stationName",
//        "lineId",
//        "lineName",
//        "platformName",
//        "direction",
//        "bearing",
//        "destinationNaptanId",
//        "destinationName",
//        "timestamp",
//        "timeToStation",
//        "currentLocation",
//        "towards",
//        "expectedArrival",
//        "timeToLive",
//        "modeName",
//        "timing"
//})
public class ArrivalResponse {

    @JsonProperty("$type")
    private String $type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("operationType")
    private Integer operationType;
    @JsonProperty("vehicleId")
    private String vehicleId;
    @JsonProperty("naptanId")
    private String naptanId;
    @JsonProperty("stationName")
    private String stationName;
    @JsonProperty("lineId")
    private String lineId;
    @JsonProperty("lineName")
    private String lineName;
    @JsonProperty("platformName")
    private String platformName;
    @JsonProperty("direction")
    private String direction;
    @JsonProperty("bearing")
    private String bearing;
    @JsonProperty("destinationNaptanId")
    private String destinationNaptanId;
    @JsonProperty("destinationName")
    private String destinationName;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("timeToStation")
    private Integer timeToStation;
    @JsonProperty("currentLocation")
    private String currentLocation;
    @JsonProperty("towards")
    private String towards;
    @JsonProperty("expectedArrival")
    private String expectedArrival;
    @JsonProperty("timeToLive")
    private String timeToLive;
    @JsonProperty("modeName")
    private String modeName;
    @JsonProperty("timing")
    private Timing timing;

    /**
     * No args constructor for use in serialization
     *
     */
    public ArrivalResponse() {
    }

    /**
     *
     * @param vehicleId
     * @param direction
     * @param expectedArrival
     * @param modeName
     * @param towards
     * @param destinationName
     * @param timeToLive
     * @param currentLocation
     * @param timestamp
     * @param id
     * @param timeToStation
     * @param platformName
     * @param operationType
     * @param destinationNaptanId
     * @param lineName
     * @param bearing
     * @param timing
     * @param stationName
     * @param naptanId
     * @param lineId
     */
    public ArrivalResponse(String id, Integer operationType, String vehicleId, String naptanId, String stationName, String lineId, String lineName, String platformName, String direction, String bearing, String destinationNaptanId, String destinationName, String timestamp, Integer timeToStation, String currentLocation, String towards, String expectedArrival, String timeToLive, String modeName, Timing timing) {
        super();
        this.id = id;
        this.operationType = operationType;
        this.vehicleId = vehicleId;
        this.naptanId = naptanId;
        this.stationName = stationName;
        this.lineId = lineId;
        this.lineName = lineName;
        this.platformName = platformName;
        this.direction = direction;
        this.bearing = bearing;
        this.destinationNaptanId = destinationNaptanId;
        this.destinationName = destinationName;
        this.timestamp = timestamp;
        this.timeToStation = timeToStation;
        this.currentLocation = currentLocation;
        this.towards = towards;
        this.expectedArrival = expectedArrival;
        this.timeToLive = timeToLive;
        this.modeName = modeName;
        this.timing = timing;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("operationType")
    public Integer getOperationType() {
        return operationType;
    }

    @JsonProperty("operationType")
    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    @JsonProperty("vehicleId")
    public String getVehicleId() {
        return vehicleId;
    }

    @JsonProperty("vehicleId")
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    @JsonProperty("naptanId")
    public String getNaptanId() {
        return naptanId;
    }

    @JsonProperty("naptanId")
    public void setNaptanId(String naptanId) {
        this.naptanId = naptanId;
    }

    @JsonProperty("stationName")
    public String getStationName() {
        return stationName;
    }

    @JsonProperty("stationName")
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @JsonProperty("lineId")
    public String getLineId() {
        return lineId;
    }

    @JsonProperty("lineId")
    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    @JsonProperty("lineName")
    public String getLineName() {
        return lineName;
    }

    @JsonProperty("lineName")
    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    @JsonProperty("platformName")
    public String getPlatformName() {
        return platformName;
    }

    @JsonProperty("platformName")
    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    @JsonProperty("direction")
    public String getDirection() {
        return direction;
    }

    @JsonProperty("direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    @JsonProperty("bearing")
    public String getBearing() {
        return bearing;
    }

    @JsonProperty("bearing")
    public void setBearing(String bearing) {
        this.bearing = bearing;
    }

    @JsonProperty("destinationNaptanId")
    public String getDestinationNaptanId() {
        return destinationNaptanId;
    }

    @JsonProperty("destinationNaptanId")
    public void setDestinationNaptanId(String destinationNaptanId) {
        this.destinationNaptanId = destinationNaptanId;
    }

    @JsonProperty("destinationName")
    public String getDestinationName() {
        return destinationName;
    }

    @JsonProperty("destinationName")
    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("timeToStation")
    public Integer getTimeToStation() {
        return timeToStation;
    }

    @JsonProperty("timeToStation")
    public void setTimeToStation(Integer timeToStation) {
        this.timeToStation = timeToStation;
    }

    @JsonProperty("currentLocation")
    public String getCurrentLocation() {
        return currentLocation;
    }

    @JsonProperty("currentLocation")
    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    @JsonProperty("towards")
    public String getTowards() {
        return towards;
    }

    @JsonProperty("towards")
    public void setTowards(String towards) {
        this.towards = towards;
    }

    @JsonProperty("expectedArrival")
    public String getExpectedArrival() {
        return expectedArrival;
    }

    @JsonProperty("expectedArrival")
    public void setExpectedArrival(String expectedArrival) {
        this.expectedArrival = expectedArrival;
    }

    @JsonProperty("timeToLive")
    public String getTimeToLive() {
        return timeToLive;
    }

    @JsonProperty("timeToLive")
    public void setTimeToLive(String timeToLive) {
        this.timeToLive = timeToLive;
    }

    @JsonProperty("modeName")
    public String getModeName() {
        return modeName;
    }

    @JsonProperty("modeName")
    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    @JsonProperty("timing")
    public Timing getTiming() {
        return timing;
    }

    @JsonProperty("timing")
    public void setTiming(Timing timing) {
        this.timing = timing;
    }
}

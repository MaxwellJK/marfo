package com.travelassistant.london.marfo.londontravelassistant.rpc.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by martafoderaro on 01/05/2017.
 */

public class Station {
    @JsonProperty("$type")
    private String $type;

    @JsonProperty("stationId")
    private String stationId;

    @JsonProperty("icsId")
    private String icsId;

    @JsonProperty("topMostParentId")
    private String topMostParentId;

    @JsonProperty("modes")
    private List<String> modes = null;

    @JsonProperty("stopType")
    private String stopType;

    @JsonProperty("zone")
    private String zone;

    @JsonProperty("lines")
    private List<Line> lines = null;

    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("lat")
    private Float lat;

    @JsonProperty("lon")
    private Float lon;

    public Station() {
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getIcsId() {
        return icsId;
    }

    public void setIcsId(String icsId) {
        this.icsId = icsId;
    }

    public String getTopMostParentId() {
        return topMostParentId;
    }

    public void setTopMostParentId(String topMostParentId) {
        this.topMostParentId = topMostParentId;
    }

    public List<String> getModes() {
        return modes;
    }

    public void setModes(List<String> modes) {
        this.modes = modes;
    }

    public String getStopType() {
        return stopType;
    }

    public void setStopType(String stopType) {
        this.stopType = stopType;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public List<Line> getLines() {
        return lines;
    }

    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }
}

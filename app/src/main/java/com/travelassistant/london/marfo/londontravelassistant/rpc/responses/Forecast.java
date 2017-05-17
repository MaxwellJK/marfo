package com.travelassistant.london.marfo.londontravelassistant.rpc.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Forecast {

	@JsonProperty("$id")
	private String $id;
	@JsonProperty("$type")
	private String $type;
	@JsonProperty("forecastType")
	private String forecastType;
	@JsonProperty("forecastID")
	private String forecastID;
	@JsonProperty("forecastBand")
	private String forecastBand;
	@JsonProperty("forecastSummary")
	private String forecastSummary;
	@JsonProperty("nO2Band")
	private String nO2Band;
	@JsonProperty("o3Band")
	private String o3Band;
	@JsonProperty("pM10Band")
	private String pM10Band;
	@JsonProperty("pM25Band")
	private String pM25Band;
	@JsonProperty("sO2Band")
	private String sO2Band;
	@JsonProperty("forecastText")
	private String forecastText;

    public Forecast() {
    }

    public Forecast(String $id, String $type, String forecastType, String forecastID, String forecastBand, String forecastSummary, String nO2Band, String o3Band, String pM10Band, String pM25Band, String sO2Band, String forecastText) {
    	super();
    	this.$id = $id;
    	this.$type= $type;
    	this.forecastType = forecastType;
    	this.forecastID = forecastID;
    	this.forecastBand= forecastBand;
    	this.forecastSummary = forecastSummary;
    	this.nO2Band = nO2Band;
    	this.o3Band = o3Band;
    	this.pM10Band = pM10Band;
    	this.pM25Band = pM25Band;
    	this.sO2Band = sO2Band;
    	this.forecastText = forecastText;
    }
    
    @JsonProperty("$id")
    public String get$id() {
    return $id;
    }

    @JsonProperty("$id")
    public void set$id(String $id) {
    this.$id = $id;
    }

    @JsonProperty("$type")
    public String get$type() {
    return $type;
    }

    @JsonProperty("$type")
    public void set$type(String $type) {
    this.$type = $type;
    }

    @JsonProperty("forecastType")
    public String getForecastType() {
    return forecastType;
    }

    @JsonProperty("forecastType")
    public void setForecastType(String forecastType) {
    this.forecastType = forecastType;
    }

    @JsonProperty("forecastID")
    public String getForecastID() {
    return forecastID;
    }

    @JsonProperty("forecastID")
    public void setForecastID(String forecastID) {
    this.forecastID = forecastID;
    }

    @JsonProperty("forecastBand")
    public String getForecastBand() {
    return forecastBand;
    }

    @JsonProperty("forecastBand")
    public void setForecastBand(String forecastBand) {
    this.forecastBand = forecastBand;
    }

    @JsonProperty("forecastSummary")
    public String getForecastSummary() {
    return forecastSummary;
    }

    @JsonProperty("forecastSummary")
    public void setForecastSummary(String forecastSummary) {
    this.forecastSummary = forecastSummary;
    }

    @JsonProperty("nO2Band")
    public String getNO2Band() {
    return nO2Band;
    }

    @JsonProperty("nO2Band")
    public void setNO2Band(String nO2Band) {
    this.nO2Band = nO2Band;
    }

    @JsonProperty("o3Band")
    public String getO3Band() {
    return o3Band;
    }

    @JsonProperty("o3Band")
    public void setO3Band(String o3Band) {
    this.o3Band = o3Band;
    }

    @JsonProperty("pM10Band")
    public String getPM10Band() {
    return pM10Band;
    }

    @JsonProperty("pM10Band")
    public void setPM10Band(String pM10Band) {
    this.pM10Band = pM10Band;
    }

    @JsonProperty("pM25Band")
    public String getPM25Band() {
    return pM25Band;
    }

    @JsonProperty("pM25Band")
    public void setPM25Band(String pM25Band) {
    this.pM25Band = pM25Band;
    }

    @JsonProperty("sO2Band")
    public String getSO2Band() {
    return sO2Band;
    }

    @JsonProperty("sO2Band")
    public void setSO2Band(String sO2Band) {
    this.sO2Band = sO2Band;
    }

    @JsonProperty("forecastText")
    public String getForecastText() {
    return forecastText;
    }

    @JsonProperty("forecastText")
    public void setForecastText(String forecastText) {
    this.forecastText = forecastText;
    }
}

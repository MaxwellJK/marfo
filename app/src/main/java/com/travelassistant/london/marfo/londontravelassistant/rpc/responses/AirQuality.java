package com.travelassistant.london.marfo.londontravelassistant.rpc.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AirQuality {

	@JsonProperty("$id")
	private String $id;
	@JsonProperty("$type")
	private String $type;
	@JsonProperty("updatePeriod")
	private String updatePeriod;
	@JsonProperty("updateFrequency")
	private String updateFrequency;
	@JsonProperty("forecastURL")
	private String forecastURL;
	@JsonProperty("disclaimerText")
	private String disclaimerText;
	@JsonProperty("currentForecast")
	private List<Forecast> currentForecast = null;
	
	public AirQuality(){
	}
	
	public AirQuality(String $id, String $type, String updatePeriod, String updateFrequency, String forecastURL, String disclaimerText, List<Forecast> currentForecast){
		super();
		this.$id = $id;
		this.$type = $type;
		this.updatePeriod = updatePeriod;
		this.updateFrequency = updateFrequency;
		this.forecastURL = forecastURL;
		this.disclaimerText = disclaimerText;
		this.currentForecast = currentForecast;
	}

	public String get$id() {
		return $id;
	}

	public void set$id(String $id) {
		this.$id = $id;
	}

	public String get$type() {
		return $type;
	}

	public void set$type(String $type) {
		this.$type = $type;
	}

	public String getUpdatePeriod() {
		return updatePeriod;
	}

	public void setUpdatePeriod(String updatePeriod) {
		this.updatePeriod = updatePeriod;
	}

	public String getUpdateFrequency() {
		return updateFrequency;
	}

	public void setUpdateFrequency(String updateFrequency) {
		this.updateFrequency = updateFrequency;
	}

	public String getForecastURL() {
		return forecastURL;
	}

	public void setForecastURL(String forecastURL) {
		this.forecastURL = forecastURL;
	}

	public String getDisclaimerText() {
		return disclaimerText;
	}

	public void setDisclaimerText(String disclaimerText) {
		this.disclaimerText = disclaimerText;
	}

	public List<Forecast> getCurrentForecast() {
		return currentForecast;
	}

	public void setCurrentForecast(List<Forecast> currentForecast) {
		this.currentForecast = currentForecast;
	}
}
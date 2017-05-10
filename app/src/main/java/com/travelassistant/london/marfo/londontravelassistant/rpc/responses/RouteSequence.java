package com.travelassistant.london.marfo.londontravelassistant.rpc.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by martafoderaro on 01/05/2017.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RouteSequence {

    @JsonProperty("$type")
    private String $type;

    @JsonProperty("lineId")
    public String lineId;

    @JsonProperty("lineName")
    public String lineName;

    @JsonProperty("direction")
    public String direction;

    @JsonProperty("isOutboundOnly")
    public boolean isOutboundOnly;

    @JsonProperty("mode")
    public String mode;

    @JsonProperty("lineStrings")
    public List<String> lineStrings;

    @JsonProperty("stations")
    public List<Station> stations;

    @JsonProperty("orderedLineRoutes")
    private List<OrderedLineRoute> orderedLineRoutes = null;

    public RouteSequence() {
    }
}

package com.travelassistant.london.marfo.londontravelassistant.rpc.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by martafoderaro on 01/05/2017.
 */

public class Line {
    @JsonProperty("$type")
    private String $type;

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("uri")
    private String uri;

    @JsonProperty("type")
    private String type;

    @JsonProperty("crowding")
    private Crowding crowding;

    public Line() {
    }
}

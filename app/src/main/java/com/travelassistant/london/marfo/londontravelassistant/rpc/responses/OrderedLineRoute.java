package com.travelassistant.london.marfo.londontravelassistant.rpc.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by martafoderaro on 01/05/2017.
 */

public class OrderedLineRoute {

    @JsonProperty("$type")
    private String $type;

    @JsonProperty("name")
    private String name;

    @JsonProperty("naptanIds")
    private List<String> naptanIds = null;

    @JsonProperty("serviceType")
    private String serviceType;

    public OrderedLineRoute() {
    }
}

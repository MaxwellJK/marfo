package com.travelassistant.london.marfo.londontravelassistant.rpc.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by martafoderaro on 07/05/2017.
 */

//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//        "countdownServerAdjustment",
//        "source",
//        "insert",
//        "read",
//        "sent",
//        "received"
//})
public class Timing {

    @JsonProperty("$type")
    private String $type;
    @JsonProperty("countdownServerAdjustment")
    private String countdownServerAdjustment;
    @JsonProperty("source")
    private String source;
    @JsonProperty("insert")
    private String insert;
    @JsonProperty("read")
    private String read;
    @JsonProperty("sent")
    private String sent;
    @JsonProperty("received")
    private String received;

    /**
     * No args constructor for use in serialization
     *
     */
    public Timing() {
    }

    /**
     *
     * @param countdownServerAdjustment
     * @param sent
     * @param source
     * @param read
     * @param received
     * @param insert
     */
    public Timing(String countdownServerAdjustment, String source, String insert, String read, String sent, String received) {
        super();
        this.countdownServerAdjustment = countdownServerAdjustment;
        this.source = source;
        this.insert = insert;
        this.read = read;
        this.sent = sent;
        this.received = received;
    }

    @JsonProperty("countdownServerAdjustment")
    public String getCountdownServerAdjustment() {
        return countdownServerAdjustment;
    }

    @JsonProperty("countdownServerAdjustment")
    public void setCountdownServerAdjustment(String countdownServerAdjustment) {
        this.countdownServerAdjustment = countdownServerAdjustment;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("insert")
    public String getInsert() {
        return insert;
    }

    @JsonProperty("insert")
    public void setInsert(String insert) {
        this.insert = insert;
    }

    @JsonProperty("read")
    public String getRead() {
        return read;
    }

    @JsonProperty("read")
    public void setRead(String read) {
        this.read = read;
    }

    @JsonProperty("sent")
    public String getSent() {
        return sent;
    }

    @JsonProperty("sent")
    public void setSent(String sent) {
        this.sent = sent;
    }

    @JsonProperty("received")
    public String getReceived() {
        return received;
    }

    @JsonProperty("received")
    public void setReceived(String received) {
        this.received = received;
    }
}


package com.spider.gk.music.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Header implements Serializable
{

    @SerializedName("status_code")
    @Expose
    private long statusCode;
    @SerializedName("execute_time")
    @Expose
    private double executeTime;
    private final static long serialVersionUID = 4313466505469737274L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Header() {
    }

    /**
     * 
     * @param statusCode
     * @param executeTime
     */
    public Header(long statusCode, double executeTime) {
        super();
        this.statusCode = statusCode;
        this.executeTime = executeTime;
    }

    public long getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(long statusCode) {
        this.statusCode = statusCode;
    }

    public double getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(double executeTime) {
        this.executeTime = executeTime;
    }

}

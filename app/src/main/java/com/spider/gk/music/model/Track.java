
package com.spider.gk.music.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Track implements Serializable
{

    @SerializedName("message")
    @Expose
    private Message message;
    private final static long serialVersionUID = 8034603429005656470L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Track() {
    }

    /**
     * 
     * @param message
     */
    public Track(Message message) {
        super();
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

}

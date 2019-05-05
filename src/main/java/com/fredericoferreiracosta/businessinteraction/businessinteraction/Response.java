package com.fredericoferreiracosta.businessinteraction.businessinteraction;

/**
 * Response to be returned to external system.
 */
public class Response {

    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Well, I'm a response";
    }
}

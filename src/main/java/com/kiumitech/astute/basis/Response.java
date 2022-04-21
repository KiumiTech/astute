package com.kiumitech.astute.basis;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Response extends DTO {

    private static final long serialVersionUID = 1L;

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("message")
    private String message;

    @JsonProperty("status")
    private String getStatus() {
        return this.success ? "success" : "failed";
    }

    public static Response buildSuccess() {
        Response response = new Response();
        response.setSuccess(true);
        response.setMessage("");
        return response;
    }

    public static Response buildFail(String message) {
        Response response = new Response();
        response.setSuccess(false);
        response.setMessage(message);
        return response;
    }
}

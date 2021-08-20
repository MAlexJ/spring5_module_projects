package com.malex.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ErrorMessage {

    @JsonProperty("msg")
    private String error;
}

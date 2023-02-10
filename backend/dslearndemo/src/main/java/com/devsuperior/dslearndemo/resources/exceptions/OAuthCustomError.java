package com.devsuperior.dslearndemo.resources.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OAuthCustomError implements Serializable {
    private static final long serialVersionUID = 1L;
    private String error;
    @JsonProperty("error_description") // This annotation is used to map the property error_description to the JSON property error_description
    private String errorDescription;
}

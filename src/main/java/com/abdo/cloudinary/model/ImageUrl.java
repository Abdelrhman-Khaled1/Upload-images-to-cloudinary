package com.abdo.cloudinary.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ImageUrl {
    @JsonProperty("url")
    String url;
}

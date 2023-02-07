package com.example.customerrest.ds;

import com.fasterxml.jackson.annotation.JsonProperty;

public    record CustomerDto(Integer id,
                             String code,
                              @JsonProperty(value = "first_name") String firstName,
                              @JsonProperty(value = "last_name") String lastName,
                              String email){

}

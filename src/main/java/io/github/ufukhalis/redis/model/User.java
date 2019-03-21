package io.github.ufukhalis.redis.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
//@AllArgsConstructor
public class User implements Serializable {

    private int id;
    private String fullName;

}

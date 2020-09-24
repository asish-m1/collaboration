package com.qberaa.individualservice.model;

import lombok.*;

import java.math.BigInteger;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QListIndividualPlaceOfBirth {

    private BigInteger placeOfBirthQUID;
    private BigInteger individualQUID;
    private BigInteger uniqSrcSystemId;
    private String srcSystem;
    private String city;
    private String state_Province;
    private String country;
    private String remarks;
}

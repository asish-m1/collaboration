package com.qberaa.individualservice.model;

import lombok.*;

import java.math.BigInteger;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QIndividualAddress {

    private BigInteger addessQUID;
    private BigInteger individualQUID;
    private BigInteger uniqSrcSystemId;
    private String srcSystem;
    private String street;
    private String city;
    private String state_Province;
    private String zipCode;
    private String country;
    private String remarks;
}

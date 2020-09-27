package com.qberaa.individualservice.model;

import lombok.*;

import java.math.BigInteger;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QIndividualNationality {

    private BigInteger nationalityQUID;
    private BigInteger individualQUID;
    private BigInteger uniqSrcSystemId;
    private String srcSystem;
    private String nationality;
}

package com.qberaa.individualservice.model;

import lombok.*;

import java.math.BigInteger;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QIndividualTitle {

    private BigInteger titleQUID;
    private BigInteger individualQUID;
    private BigInteger uniqSrcSystemId;
    private String srcSystem;
    private String title;
}

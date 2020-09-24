package com.qberaa.individualservice.model;

import lombok.*;

import java.math.BigInteger;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QListIndividualDOB {

    private BigInteger dobQUID;
    private BigInteger individualQUID;
    private BigInteger uniqSrcSystemId;
    private String srcSystem;
    private String qualityOfData;
    private Date dateOfBirth;
    private String birthYear;
    private String birthFromYear;
    private String birthToYear;
    private String remarks;
}

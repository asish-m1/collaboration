package com.qberaa.individualservice.model;

import lombok.*;

import java.math.BigInteger;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QListIndividualAlias {

    private BigInteger aliasQUID;
    private BigInteger individualQUID;
    private BigInteger uniqSrcSystemId;
    private String srcSystem;
    private String qualityOfData;
    private String aliasName;
    private Date dateOfBirth;
    private String cityOfBirth;
    private String countryOfBirth;
    private String remarks;
}

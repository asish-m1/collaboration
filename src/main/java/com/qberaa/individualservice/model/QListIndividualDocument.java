package com.qberaa.individualservice.model;

import lombok.*;

import java.math.BigInteger;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QListIndividualDocument {

    private BigInteger documentQUID;
    private BigInteger individualQUID;
    private BigInteger uniqSrcSystemId;
    private String srcSystem;
    private String typeOfDoc;
    private String typeOfSubDoc;
    private String docNumber;
    private String issuingCountry;
    private Date dateOfIssue;
    private String cityOfIssue;
    private String countryOfIssue;
    private String remarks;
}

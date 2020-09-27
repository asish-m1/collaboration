package com.qberaa.individualservice.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class QIndividualPlaceOfBirth {
    @Id
    private BigInteger placeOfBirthQUID;
    private BigInteger individualQUID;
    private BigInteger uniqSrcSystemId;
    private String srcSystem;
    private String city;
    private String state_Province;
    private String country;
    private String remarks;
}

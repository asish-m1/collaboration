package com.qberaa.individualservice.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "QIndividualList")
public class QIndividualList implements QList{
    @Id
    private BigInteger individualQUID;
    private BigInteger uniqSrcSystemId;
    private String srcSystem;
    private String srcProgramList;
    private String name;
    private String nameOriginalLang;
    private String gender;
    private Date elfFromDate;
    private Date elfEndDate;
}

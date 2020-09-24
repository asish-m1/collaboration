package com.qberaa.individualservice.model;

import lombok.*;

import java.math.BigInteger;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QListIndividual implements QList{

    private BigInteger individualQUID;
    private BigInteger uniqSrcSystemId;
    private String srcSystem;
    private String srcProgramList;
    private String name;
    private String name_Original_Lang;
    private String gender;
    private Date elf_from_Date;
    private Date elf_End_Date;
}

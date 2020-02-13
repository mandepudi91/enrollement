package com.springframework.enrollement.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "be_prsn")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "prsn_id")
    private long id;

    @Column(name = "brth_dt")
    private Date brthDt;

    /** The delete in. */
    @Column(name = "delete_in")
    private Short deleteIn;

    /** The deth dt. */
    @Column(name = "deth_dt")
    private Date dethDt;


    /** The fst nm. */
    @Column(name = "fst_nm")
    private String fstNm;

    /** The last nm. */
    @Column(name = "last_nm")
    private String lastNm;


    /** The member id. */
    @Column(name = "member_id")
    private String memberId;

    /** The mid nm. */
    @Column(name = "mid_nm")
    private String midNm;

}

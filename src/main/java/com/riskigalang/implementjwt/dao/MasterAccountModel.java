package com.riskigalang.implementjwt.dao;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author galang
 */
@Entity
@Table(name = "master_account")
@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class MasterAccountModel {

    @Id
    @Column(name = "account_id", length = 20, columnDefinition = "serial", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "account_info")
    private String accountInfo;

    @Column(name = "account_name", length = 100)
    private String accountName;

    @Column(name = "username", length = 100)
    private String username;

    @Column(name = "password", length = 100)
    private String password;

    @Column(name = "role_id", length = 100)
    private Long roleId;

    @Column(name = "isaktif", length = 11)
    private Integer isactive;

    @Column(name = "email", length = 200)
    private String email;

    @Column(name = "verification_email", length = 11)
    private Integer verificationEmail;

    @Column(name = "disable_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date disableDate;
}

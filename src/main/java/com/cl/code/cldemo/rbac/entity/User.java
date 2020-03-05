package com.cl.code.cldemo.rbac.entity;

import com.cl.code.cldemo.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    String userName;

    @Column(unique = true)
    String userAccount;

    @Column(unique = true)
    String email;

    @Column(unique = true)
    String phone;
}

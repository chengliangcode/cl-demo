package com.cl.code.cldemo.rbac.entity;

import com.cl.code.cldemo.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class UserRoleRel extends BaseEntity {

    @Column(length = 32)
    String userId;

    @Column(length = 32)
    String roleId;

}

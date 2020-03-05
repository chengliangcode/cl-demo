package com.cl.code.cldemo.rbac.entity;

import com.cl.code.cldemo.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Role extends BaseEntity {

    @Column(unique = true)
    String roleName;

}

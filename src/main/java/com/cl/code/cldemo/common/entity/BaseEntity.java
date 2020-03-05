package com.cl.code.cldemo.common.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(length = 32, columnDefinition = "varchar(32) COMMENT '主键' ")
    String id;

    /**
     * 创建时间
     */
    @CreationTimestamp
    Date createTime;

    /**
     * 更新时间
     */
    @UpdateTimestamp
    Date updateTime;

    /**
     * 数据版本
     */
    @Version
    Integer version;


}

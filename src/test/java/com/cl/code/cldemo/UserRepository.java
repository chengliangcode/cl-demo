package com.cl.code.cldemo;

import com.cl.code.cldemo.rbac.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}

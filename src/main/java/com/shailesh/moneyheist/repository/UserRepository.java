package com.shailesh.moneyheist.repository;

import com.shailesh.moneyheist.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long > {

}

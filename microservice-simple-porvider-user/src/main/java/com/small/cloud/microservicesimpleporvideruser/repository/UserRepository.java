package com.small.cloud.microservicesimpleporvideruser.repository;
import com.small.cloud.microservicesimpleporvideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

package com.atakan.SpringMovieApp.repository;

import com.atakan.SpringMovieApp.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findAllByOrderByName();

    List<User> findAllByNameContainingIgnoreCase(String value);
    List<User> findAllByEmailContainingIgnoreCase(String value);
    List<User> findAllByEmailEndingWith(String value);

        Optional<User> findOptionalByEmailAndPassword(String email,String password);

        @Query(value = "SELECT * FROM tbl_user u WHERE length(u.password)>?1",nativeQuery = true)
        List<User> passwordLongerThan(int value);
//    List<User> findAllByNameContainsIgnoreCase(String value);
}

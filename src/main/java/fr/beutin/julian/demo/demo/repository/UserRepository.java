package fr.beutin.julian.demo.demo.repository;

import fr.beutin.julian.demo.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT mov from User mov")
    List<User> getMovies();

    @Query("SELECT user.email FROM User user WHERE user.email = :email")
    User getUserByEmail(@Param("email")String email);


}

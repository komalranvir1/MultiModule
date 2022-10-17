package komal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import komal.entity.User;

public interface  UserRepo extends JpaRepository<User, Long>{

}

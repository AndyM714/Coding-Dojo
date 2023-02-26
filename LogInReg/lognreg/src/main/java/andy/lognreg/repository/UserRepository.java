package andy.lognreg.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import andy.lognreg.models.User;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
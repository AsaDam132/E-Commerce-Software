package e_commerceFullStack.e_commerceFullStack.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepository extends JpaRepository<User,Long> {
}

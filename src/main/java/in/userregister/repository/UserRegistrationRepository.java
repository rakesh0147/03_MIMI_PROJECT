package in.userregister.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.userregister.binding.UserRegistration;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Serializable> {

	List<UserRegistration> findByUserEmail(String userEmail);
}

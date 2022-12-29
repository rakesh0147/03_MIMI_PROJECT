package in.userregister.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.userregister.binding.UserCountry;
@Repository
public interface UserCountryRepository extends JpaRepository<UserCountry,Serializable>{

}

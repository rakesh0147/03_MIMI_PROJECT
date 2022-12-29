package in.userregister.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.userregister.binding.UserState;
@Repository
public interface UserStateRepository extends JpaRepository<UserState,Serializable>{

	public List<UserState> findByCountryId(Integer countryId);
}

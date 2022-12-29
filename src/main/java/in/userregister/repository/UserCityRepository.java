package in.userregister.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.userregister.binding.UserCity;
@Repository
public interface UserCityRepository extends JpaRepository<UserCity,Serializable>{
	
	public List<UserCity> findByStateId(Integer stateId);

}

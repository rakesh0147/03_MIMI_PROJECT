package in.userregister.service;

import java.util.Map;

import in.userregister.binding.UserRegistration;

public interface UserMgmtService {
	
	public String checkEmail(String userEmail);
	
	public Map<Integer,String> getCountries();
	
	public Map<Integer,String> getStates(Integer countryId);
	
	public Map<Integer,String> getCities(Integer stateId);
	
	public String registerUser(UserRegistration userRegistration); 

}

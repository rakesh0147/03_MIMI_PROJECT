package in.userregister.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.userregister.binding.UserCity;
import in.userregister.binding.UserCountry;
import in.userregister.binding.UserRegistration;
import in.userregister.binding.UserState;
import in.userregister.repository.UserCityRepository;
import in.userregister.repository.UserCountryRepository;
import in.userregister.repository.UserRegistrationRepository;
import in.userregister.repository.UserStateRepository;
import in.userregister.service.UserMgmtService;

@Service
public class UserMgmtServiceImpl implements UserMgmtService {

	@Autowired
	private UserCountryRepository countryRepository;
	@Autowired
	private UserStateRepository stateRepository;
	@Autowired
	private UserCityRepository cityRepository;
	@Autowired
	private UserRegistrationRepository registrationRepository;

	@Override
	public String checkEmail(String userEmail) {
		String msg = "";
		for (UserRegistration userRegistration : registrationRepository.findByUserEmail(userEmail)) {
			if (userEmail == userRegistration.getUserEmail()) {
				msg = "Email Already Exist";
			}
		}
		return msg;

	}

	@Override
	public Map<Integer, String> getCountries() {
		Map<Integer, String> countryList = new HashMap<>();
		for (UserCountry userCountry : countryRepository.findAll()) {
			countryList.put(userCountry.getCountryId(), userCountry.getCountryName());
		}
		return countryList;
	}

	@Override
	public Map<Integer, String> getStates(Integer countryId) {
		Map<Integer, String> stateList = new HashMap<>();
		for (UserState userState : stateRepository.findByCountryId(countryId)) {
			stateList.put(userState.getStateId(), userState.getStateName());
		}
		return stateList;
	}

	@Override
	public Map<Integer, String> getCities(Integer stateId) {
		Map<Integer, String> cityList = new HashMap<>();
		for (UserCity userCity : cityRepository.findByStateId(stateId)) {
			cityList.put(userCity.getCityId(), userCity.getCityName());
		}
		return cityList;
	}

	@Override
	public String registerUser(UserRegistration userRegistration) {
		userRegistration = registrationRepository.save(userRegistration);
		if (userRegistration.getUserId() != null) {
			return "Registration Successfull";
		} else {
			return "Registration Failed";
		}
	}

}

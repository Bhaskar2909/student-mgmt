package com.Bhaskar.Service;

import java.util.Map;

import com.Bhaskar.Binding.LoginForm;
import com.Bhaskar.Binding.RegisterForm;
import com.Bhaskar.Binding.ResetPwdForm;
import com.Bhaskar.Entity.User;

public interface UserService {
	
	public Map<Integer,String> getCountries();
	
	public Map<Integer,String> getStates(Integer countryId);
	
	public Map<Integer,String> getCities(Integer stateId);
	
	public User getUser(String email);
	
	public boolean saveUser(RegisterForm formObj);
	
	public User loginCheck(LoginForm formObj);
	
	public boolean resetPwd(ResetPwdForm formobj);
	
	private String generatePwd() {
		return null;
	}

	User login(LoginForm formObj);
	

}

package oop.method.model.service;

import oop.method.model.vo.User;

public class UserService {

	public User signUp(String userId, String userPw, String userName,int userAge, char userGender) {
		User u = new User();
		
		u.setUserId(userId);
		u.setUserPw(userPw);
		u.setUserName(userName);
		u.setUserAge(userAge);
		u.setUserGender(userGender);
		
		return u;
	}
	
	public int login(String id, String pw, User user) {
		
		if(user == null) {
			return -1;
		} else {
			if(user.getUserId().equals(id) && user.getUserPw().equals(pw)) {
				return 1;
			} else {
				return 0;
			}
		}
	}
	
	public void updateUser(String name, int age, char gender, User loginUser) {
		
		loginUser.setUserName(name);
		loginUser.setUserGender(gender);
		loginUser.setUserGender(gender);
		
	}
	
}

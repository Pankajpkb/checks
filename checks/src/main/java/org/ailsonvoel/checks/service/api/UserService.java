package org.ailsonvoel.checks.service.api;

import java.net.URL;

import org.ailsonvoel.checks.domain.User;


/**
 * @author Pankaj Bhushan
 * */
public interface UserService {
	/**
	 * @description The method is used to find a user by passing the username.
	 * This method acts as a utility method for other methods to perform CRUD operations on user entity.
	 * 
	 * @param Method takes a String argument username to find a user in database.
	 * 
	 * @return Returns the User object if found else returns null
	 * 
	 * @since 1.0
	 * */
	User findByUserName(String username);
	
	/**
	 * @description This method is used to store a new user in application database.
	 * A new user is first validated and if succeeds then persisted in database.
	 * 
	 * @param Takes User as argument to be persisted.
	 * 
	 * @return Returns the User object if peristed successfully else returns null.
	 * 
	 * @since 1.0
	 * */
	boolean registerNewUser(String username, String password);
	
	
	/**
	 * 
	 * @description The method is used to create a reset token when user forgets password.
	 * 
	 * @param Method takes a String argument username to find a user in database.
	 * 
	 * @return Returns true if URL is successfully created as a password reset token
	 *  and sent to user's email id. Else returns false.
	 * 
	 * @since 1.0
	 * */
	String generateResetPasswordToken(String username);
	
	
	/**
	 * 
	 * @description The method is used to reset user's password.
	 * Called when user successfully verifies the reset link sent to user's registered email id.
	 * 
	 * @param Method takes a String argument username to find a user in database.
	 * 
	 * @return Returns true if password is successfully reset else returns false.
	 * 
	 * @since 1.0
	 * */
	boolean resetPassword(String username);
	
	/**
	 * 
	 * @description The method is used to update user's password.
	 * Called when user qualifies the pre-condition,i.e., giving old password as input.
	 * 
	 * @param Method takes User object as argument
	 * 
	 * @return Returns true if password updated successfully else returns false.
	 * 
	 * @since 1.0
	 * */
	boolean updatePassword(User user);
}

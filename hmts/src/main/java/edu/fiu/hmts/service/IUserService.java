/**
 * 
 */
package edu.fiu.hmts.service;

import edu.fiu.hmts.domain.User;

/**
 * @author Wenbo
 *
 */
public interface IUserService {

	public User register(String username, String password, String firstname, 
			String lastname, String phone, String role, int secid, String answer);
	
	public User login(String username, String password);
	
	public boolean logout(String userid);
}

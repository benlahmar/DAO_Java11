/**
 * 
 */
package com.dao.model;

import com.dao.IDao;
import com.model.User;



/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public interface IUser extends IDao<User, Integer>{

	public User autentificat(String log, String pass);
}

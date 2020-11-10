/**
 * 
 */
package com.model;

/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public class User {

	int idu;
	String log,pass;
	public int getIdu() {
		return idu;
	}
	public void setIdu(int idu) {
		this.idu = idu;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "User [idu=" + idu + ", log=" + log + ", pass=" + pass + "]";
	}
	
}

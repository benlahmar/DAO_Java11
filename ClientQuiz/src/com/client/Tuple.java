/**
 * 
 */
package com.client;

/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public class Tuple {

	boolean istrue;
	boolean isselected;
	public boolean isIstrue() {
		return istrue;
	}
	public void setIstrue(boolean istrue) {
		this.istrue = istrue;
	}
	public boolean isIsselected() {
		return isselected;
	}
	public void setIsselected(boolean isselected) {
		this.isselected = isselected;
	}
	public Tuple(boolean istrue, boolean isselected) {
		super();
		this.istrue = istrue;
		this.isselected = isselected;
	}
	
}

/**
 * 
 */
package com.woniu.ch14.homework;

/**
 * @author Administrator
 *
 */
public class ComparableCircle extends Circle implements CompareObject {
	

	/**
	 * 
	 */
	public ComparableCircle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param redius
	 */
	public ComparableCircle(int redius) {
		super(redius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Circle) {// 如果不进行预判出现ClassCastException
			return this.getRedius() - ((Circle)o).redius;		
		}
		return 0;

	}

}

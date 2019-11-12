package com.woniu.ch13.homework;

public class Car {
	private String color,strain;

	public Car() {
	
	}

	public Car(String color, String strain) {
		
		this.color = color;
		this.strain = strain;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //判断对象地址是否相等，如果是就不用判断，提高效率  
			return true;
		if (obj == null) //对象为空，则不往下走了  
			return false;
		if (getClass() != obj.getClass()) //判断两个对象是否一样:
			return false;
		Car other = (Car) obj; //向下转型  
		  /** 判断成员变量是否一样 */  
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (strain == null) {
			if (other.strain != null)
				return false;
		} else if (!strain.equals(other.strain))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "颜色是：" + color + ", 类型是：" + strain;
	}			
}

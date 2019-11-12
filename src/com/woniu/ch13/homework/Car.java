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
		if (this == obj) //�ж϶����ַ�Ƿ���ȣ�����ǾͲ����жϣ����Ч��  
			return true;
		if (obj == null) //����Ϊ�գ�����������  
			return false;
		if (getClass() != obj.getClass()) //�ж����������Ƿ�һ��:
			return false;
		Car other = (Car) obj; //����ת��  
		  /** �жϳ�Ա�����Ƿ�һ�� */  
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
		return "��ɫ�ǣ�" + color + ", �����ǣ�" + strain;
	}			
}

package day0323;

public class Author implements Cloneable{
	String name;
	char gender;
	String phone;
	public Author(String name, char gender, String phone) {
		super();
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", gender=" + gender + ", phone=" + phone + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}

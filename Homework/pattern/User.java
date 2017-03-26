package pattern;

import java.sql.SQLException;

public class User implements Cloneable {
	private String ClientName;
	private String age;
	
	public User() throws SQLException {
		DB db = new DB();
		String [] params = db.getValue();
		this.ClientName = params[0];
		this.age = params[1];
		
	}
	
	public String getClientname() {
		return ClientName;
	}
	public String getAge() {
		return age;
	}
	public void setClientname(String clientname) {
		ClientName = clientname;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public User clone() throws CloneNotSupportedException{
		return (User)super.clone();
		}
	

}

/**
 * Purpose:
 *
 * @author Peter Chow
 * @version 05/04/20
 *
 */
public class Contact{

	private String name, relation, bday, email;
	private int phone;

	public Contact(String name, String relation, String bday, int phone, String email){
		this.name = name;
		this.relation = relation;
		this.bday = bday;
		this.phone = phone;
		this.email = email;
	}

	public String getName(){
		return name;
	}

	public String getRelation(){
		return relation;
	}

	public String getBday(){
		return bday;
	}

	public int getPhone(){
		return phone;
	}

	public String getEmail(){
		return email;
	}

	public String toString(){
		String str = String.format("%-15s %-13s %-11s %-10d %-25s", name, 
									relation, bday, phone, email);
		return str;
	}
}
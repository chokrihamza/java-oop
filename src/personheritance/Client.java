package personheritance;

import java.util.Date;

public class Client extends Person {
	private int idClient;
	private Date registerDate;
	private boolean vip;
	private static int countClient;
	
	
	public Client(String name, char gendre, int age, String direction, Date registerDate, boolean vip) {
		super(name,gendre, age, direction);
		this.idClient = ++countClient;
		this.registerDate = registerDate;
		this.vip = vip;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [idClient=");
		builder.append(idClient);
		builder.append(", registerDate=");
		builder.append(registerDate);
		builder.append(", vip=");
		builder.append(vip);
		builder.append(", ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}





}

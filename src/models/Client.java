package models;

public class Client {
    private int id;
	private String name;
	private String codeCount;
	
	public Client(int id, String name, String codeCount) {
		this.id = id;
		this.name = name;
		this.codeCount = codeCount;
	}
	
	public String getCodeCount() {
		return codeCount;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Id del Cliente :" + id + ", Nombre del Cliente :" + name + ", Código de cuenta del Cliente :" + codeCount + " .";
	}
}

package cau2;

public class Categories extends Products {
	private String name;

	public Categories() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Categories(Long id, String name, Double price, Integer quantity, Categories category) {
		super(id, name, price, quantity, category);
		// TODO Auto-generated constructor stub
	}


}


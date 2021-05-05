package Entity;

public class Discount {
	private int id;
    private int discountPercent;
    private String description;

    public Discount(){

    }

	public Discount(int id, int discountPercent, String description) {
		super();
		this.id = id;
		this.discountPercent = discountPercent;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
    

}

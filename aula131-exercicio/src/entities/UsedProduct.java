package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	
	private Date manufactureDate;
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return super.getName()
				+ " $"
				+ String.format("%.2f", super.getPrice())
				+ " (Manufacture date: "
				+ sdf1.format(manufactureDate)
				+ ") \n";
	}
	
}

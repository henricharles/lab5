package lab5jfs;
import java.io.Serializable;
public class Product  implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private double price;
	private String name;
	private String category;
	private boolean canEdit=false;
	
	public Product(String id,double price,String name,String cate)
	{
		this.id=id;
		this.price=price;
		this.name=name;
		this.category=cate;
	}
	public Product()
	{
		
	}
	public boolean isCanEdit() {
		return canEdit;
	}
	public void setCanEdit(boolean canEdit) {
		this.canEdit = canEdit;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
	
}
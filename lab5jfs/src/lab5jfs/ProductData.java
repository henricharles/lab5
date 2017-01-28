package lab5jfs;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("productData")
@SessionScoped
public class ProductData implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private double price;
	private String name;
	private String category;
	private boolean canEdit=false;
	
	private  ArrayList<Product> products=new ArrayList<Product>(Arrays.asList(
			new Product("A1",400.3,"SAMSUNG","Phone"), 
			new Product("A1", 2330.0,"iphone","phone"),
			new Product("A3", 2000, "iphone","phone"),
			new Product("A4", 2000, "iphone","phone"),
			new Product("A5", 2000, "iphone","phone")
			));
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
	public boolean isCanEdit() {
		return canEdit;
	}
	public void setCanEdit(boolean canEdit) {
		this.canEdit = canEdit;
	}
	public  ArrayList<Product> getProducts() {
		return products;
	}
	String delete(Product product)
	{
		products.remove(product);
		return null;
	}
	public String editProduct(Product product){
	     product.setCanEdit(true);
	      return null;
	   }
	
	public String saveProduct(){
	      //set "canEdit"  of all to false 
	      for (Product product : products){
	         product.setCanEdit(false);
	  
	      }		
	      return null;
	   }
	public void  addProduct() {		 
	      Product product = new Product(id,price,name,category);
	      products.add(product);
	      System.out.println(products.size());
	   }
}

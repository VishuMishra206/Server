package Calculator;

public class CalcPoja 
{
	
	private String product_name;
	  private int quantity;
	  private double price;
	  
	  public CalcPoja(String product_name, int quantity, double price)
	  {
		  this.product_name=product_name;
		  this.quantity=quantity;
		  this.price=price;
		  
	  }
	  
  public String getProduct_name()
  {
		return product_name;
	}
	public void setProduct_name(String product_name) 
	{
		this.product_name = product_name;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
  


}
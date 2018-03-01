
public class Product {

	public static int skuCount=0;
	private String name;
	private String sku;
	private String description;
	private int qty;
	private double price;
	
	public Product(String name,String sku,double price, int qty) {
		this.name = name;
		this.sku=sku;
		this.price = price;
		this.qty = qty;
		skuCount++;
		//this.description="not provided";
	}

	public static void main(String[] args) {
		Product shoe = new Product("Shoe","S01",100,10);
		Product shirt = new Product("Shirt","S02",50,20);
		Product.printStockReport(shoe,shirt);
		shoe.addQty(5);
		int shipped = shirt.removeQty(50);
		System.out.println("Shipped "+ shipped +" of "+ 50 );
		Product.printStockReport(shoe, shirt);
}
	
	public static void printStockReport(Product p1, Product p2) {
		System.out.println("++++++++++++ Stock Report ++++++++++");
		if (p1.getQty()>0) {
			p1.printStockLineItem();
		}
		if(p2.getQty()>0) {
			p2.printStockLineItem();
		}
		System.out.println("Total Number of Unique SKU\t\t"+Product.skuCount);
		System.out.println("+++++++++++ End Stock Report +++++++");
	}
	
	public void printStockLineItem() {
		if(this.getDescription()==null) {
			System.out.println(this.name+"\t\tnot provided"
					+"\t\t"+this.getQty());
		}else {
			System.out.println(this.name+"\t\t"+this.getDescription().toLowerCase()
					+"\t\t"+this.getQty());
		}
	}
	
	/**
	 * Return the product description or null if none provided.
	 * @return
	 */
	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getQty() {
		return qty;
	}



	public void setQty(int qty) {
		if(!checkQty(qty)) {
			return;
		}
		this.qty = qty;
	}



	public double getPrice() {
		return price;
	}

	public int addQty(int qty) {
		if(!checkQty(qty)) {
			return this.qty;
		}		this.qty+=qty;
		return this.qty;
	}
	
	private boolean checkQty(int qty) {
		if (qty<0) {
			System.out.println("Invalid operation qty cannot be negative");
		    return false;
		}else {
			return true;
		}
	}

	/**
	 * Ship order to customer returning number of items shipped. May be 
	 * less than qty ordered if stock is low.
	 * 
	 * @param qty
	 * @return
	 */
	public int removeQty(int qty) {
		if(!checkQty(qty)) {
			return this.qty;
		}
		if (this.qty-qty<0) {
			System.out.println("Unable to completely fulfill order "
					+ "items on hand shipped - items on back order");
			int onhand = this.qty;
			this.qty=0;
			return onhand;
		}
		this.qty-=qty;
		return qty;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}



	public String getName() {
		return name;
	}



	public String getSku() {
		return sku;
	}




}

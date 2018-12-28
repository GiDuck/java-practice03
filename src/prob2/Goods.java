package prob2;

public class Goods {
	
	private String name;
	private int price;
	
	
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void show() {
		
		
		System.out.println( this.name+"(가격:" + this.price + ")" + "원 입고되었습니다." );

		
	}
	
	

}

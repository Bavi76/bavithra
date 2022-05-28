package MarkTcs;

public class UseBag {
	public static void main(String[] args) {
		Bag b1=new Bag("americantourister",1000,"paleblue");
		Bag b2=new Bag("americantourister",2000,"paleblue");
		Bag b3=new Bag("americantourister",3000,"paleblue");
		Bag b4=new Bag("americantourister",4000,"paleblue");
		Bag b5=new Bag("americantourister",5000,"paleblue");
		Bag b6=new Bag("americantourister",6000,"paleblue");
		Bag b7=new Bag("americantourister",7000,"paleblue");
		Bag b8=new Bag("americantourister",8000,"paleblue");
		Bag b9=new Bag("americantourister",9000,"paleblue");
		Bag b10=new Bag("americantourister",10000,"paleblue");
		Bag[] bags= {b1,b2,b3,b4,b5,b6,b7,b8,b9,b10};
		int max=6455;
		int min=max;
		for(int i=0; i<bags.length;i++) {
			if(bags[i].getPrice()<min) {
				min=bags[i].getPrice();
				
			}
		}
			System.out.println(min);
		}
		
		
		
		
	}



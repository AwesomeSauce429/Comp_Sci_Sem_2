import pkg.*;

class starter {
	public static void main(String args[]) {
		Shirts sh = new Shirts("Leather", 36);
		sh.Mats();
		sh.Price(45);
		sh.ClothingProd("Kaws");
		System.out.println(" ");
		Pants p = new Pants(56);
		p.Legs();
		p.Price(65);
		p.ClothingProd("Adidas");
		System.out.println(" ");
		DesignerShirts ds = new DesignerShirts("Supreme");
		ds.Hype();
		ds.Price(158);
		System.out.println(" "); 
		Socks nike = new Socks("Cloth", 9, "knee high");
		nike.Man();
		nike.Price(14);
		
	
	
}

}

package Concrete;

import Abstract.DiscountService;
import Entity.Discount;

public class DiscountManager implements DiscountService{

	@Override
	public void save(Discount discount) {
		System.out.println("indirim uyuglandı");
		
	}

	@Override
	public void update(Discount discount) {
		System.out.println("İndirim güncellendi.");
		
	}

	@Override
	public void delete(Discount discount) {
		System.out.println("İndirim silindi.");
		
	}

}

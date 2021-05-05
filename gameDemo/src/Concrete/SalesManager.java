package Concrete;

import Abstract.CustomerService;
import Abstract.SalesService;
import Entity.Customer;
import Entity.Discount;
import Entity.Game;

public class SalesManager implements SalesService{

    private CustomerService customerService;

    public SalesManager(CustomerService customerService) {
        this.customerService = customerService;
    }

	@Override
	public void sale(Game game, Customer customer) {
		customerService.addGames(customer,game);
	}

	@Override
	public void discountedSale(Game game, Customer customer, Discount discount) {
		
		game.setPrice(game.getPrice()-(game.getPrice() * discount.getDiscountPercent()));
		
		customerService.addGames(customer ,game);
		
	}

}

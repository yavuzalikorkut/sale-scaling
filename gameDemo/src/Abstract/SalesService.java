package Abstract;

import Entity.Customer;
import Entity.Discount;
import Entity.Game;

public interface SalesService {
	void sale(Game game, Customer customer);
	void discountedSale(Game game, Customer customer, Discount discount);
}

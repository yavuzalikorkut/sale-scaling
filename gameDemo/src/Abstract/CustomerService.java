package Abstract;

import Entity.Customer;
import Entity.Game;

public interface CustomerService {
    void save(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
    void getGames(Customer customer);
    void addGames(Customer customer, Game game);
}

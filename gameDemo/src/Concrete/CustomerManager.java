package Concrete;

import java.util.ArrayList;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entity.Customer;
import Entity.Game;

public class CustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	private ArrayList<Game>	games;
	
	
	
	 public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
		this.games = new ArrayList<Game>();
	}



	@Override
	 public void save(Customer customer) {
	        if(customerCheckService.checkIfRealPerson(customer)){
	            super.save(customer);
	        }else{
	            System.out.println("Hatalı kullanıcı.");
	        }

	    }	
	
	@Override
	public void update(Customer customer) {
	   super.update(customer);
	}

    @Override
    public void delete(Customer customer) {
	   super.delete(customer);
    }
	

	@Override
	public void getGames(Customer customer) {
		System.out.println("Oyunlar: ");
		for (Game game : games) {
			System.out.println("- "+game.getName());
		}
		
	}

	@Override
	public void addGames(Customer customer, Game game) {
	       this.games.add(game);
	       System.out.println(customer.getFirstname()+" tarafından "+game.getName()+" satın alındı.");
		
	}

}

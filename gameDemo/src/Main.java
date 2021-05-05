import Adapters.MernisService;
import Concrete.DiscountManager;
import Concrete.GameManager;
import Concrete.CustomerManager;
import Concrete.SalesManager;
import Entity.Discount;
import Entity.Game;
import Entity.Customer;


public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager(new MernisService());
		Customer player1=new Customer(1,"ali","ali", 1976,"11111111111", "ali@gmail.com");
		customerManager.save(player1);
        
        
        System.out.println("----Oyun----");
        GameManager gameManager=new GameManager();
        Game gameGta=new Game(1,"GTA",200);
        Game gameCSGO=new Game(2,"CS Go",300);
        gameManager.addMultiple(new Game[]{gameGta,gameCSGO});
        
        
        System.out.println("----İndirim----");
        DiscountManager discountManager=new DiscountManager();
        Discount discountSpring=new Discount(1, 30, "Bahar Fırsatları!!");
        discountManager.save(discountSpring);
        
        
        System.out.println("----Satış----");
        SalesManager salesManager=new SalesManager(customerManager);
        salesManager.sale(gameGta,player1);
        salesManager.discountedSale(gameCSGO,player1,discountSpring);
        customerManager.getGames(player1);
		
	}

}

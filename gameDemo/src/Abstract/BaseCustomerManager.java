package Abstract;

import Entity.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstname()+" sisteme eklendi.");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstname()+" bilgileri güncellendi.");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstname()+" sistemden silindi.");
		
	}


}

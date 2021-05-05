package Adapters;

import Abstract.CustomerCheckService;
import Entity.Customer;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

//import java.rmi.RemoteException;

public class MernisService implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		
        try{
            return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstname().toUpperCase(),customer.getLastname().toUpperCase(),customer.getDateofBirth());
        }
        catch (Exception e){
            e.printStackTrace();
        }

		
		return false;
	}

}

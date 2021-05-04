package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private ICustomerCheckService icustomercheckservice;
	
	public StarbucksCustomerManager(ICustomerCheckService icustomercheckservice) {
		this.icustomercheckservice = icustomercheckservice;
	}
	
	@Override
	public void Save(Customer customer) {
		
		if (icustomercheckservice.CheckIfRealPerson(customer)) {
			super.Save(customer);
			
		}
		else {
			try {
			throw new Exception("Ge�erli bir ki�i de�il.");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

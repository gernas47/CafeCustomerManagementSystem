package concrete;

import abstractFolder.BaseCustomerManager;
import abstractFolder.CustomerCheckService;
import entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager {

    CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService){
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if(customerCheckService.checkIfRealPerson(customer)) {
            super.save(customer);
        }else{
            System.out.println("Not a valid person");
        }

    }
}

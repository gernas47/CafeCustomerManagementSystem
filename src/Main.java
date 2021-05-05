import abstractFolder.BaseCustomerManager;
import concrete.CustomerCheckManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;
import mernisAdapter.MernisServiceAdapter;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(1, "gernas", "kilic", LocalDate.of(1996,3,21), "10000000000");
        BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        baseCustomerManager.save(customer);
    }
}

package abstractFolder;

import entities.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}

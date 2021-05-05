package mernisAdapter;

import abstractFolder.CustomerCheckService;
import entities.Customer;
import mernisService.ONBKPSPublicSoap12;


public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        ONBKPSPublicSoap12 onbkpsPublicSoap12 = new ONBKPSPublicSoap12();
        try {
            return onbkpsPublicSoap12.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(),customer.getLastName(), customer.getDateOfBirth().getYear());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

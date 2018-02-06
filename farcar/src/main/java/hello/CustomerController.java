package hello;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@RequestMapping("/customers")
	public List<Customer>getAllCustomers() {		
		List<Customer> copy = new ArrayList<>();
		Iterator<Customer> iter = customerRepository.findAll().iterator();		
		while (iter.hasNext())
		    copy.add(iter.next());
		Customer customer = new Customer("Anupam", "Kaushal");
		copy.add(customer);
		return copy;
	}
	
	

	@RequestMapping(method = RequestMethod.POST, value="/customer")
	public Customer createCustomer(@RequestBody Customer customer) {
		Customer savedCustomer = customerRepository.save(customer);		
		return savedCustomer;
	}
		
	
}

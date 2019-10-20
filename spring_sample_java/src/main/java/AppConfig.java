import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kush.spring.repository.CustomerRepository;
import com.kush.spring.repository.HibernateCustomerRepositoryImpl;
import com.kush.spring.service.CustomerService;
import com.kush.spring.service.CustomerServiceImpl;

@Configuration
public class AppConfig {

	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl service = new CustomerServiceImpl();
		service.setCustomerRepository(getCustomerRepository());
		return service;
	}
	
	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}
}

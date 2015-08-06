package my.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public class MyService {

	@Autowired
	private MyDAO myDAO;
	
	public void save(String s) {
		myDAO.save(s);
	}
}

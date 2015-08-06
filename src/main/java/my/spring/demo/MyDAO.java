package my.spring.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Component
public class MyDAO {

	public void save(String s) {
		System.out.println("dao save:" + s);
	}
}

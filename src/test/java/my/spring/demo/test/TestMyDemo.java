package my.spring.demo.test;

import static org.junit.Assert.*;

import my.spring.demo.MyService;

import org.junit.Test;

import com.imooc.test.base.UnitTestBase;

public class TestMyDemo extends UnitTestBase{

	public TestMyDemo() {
		super("my-demo.xml");
	}
	@Test
	public void test() {
		MyService service = super.getBean("myService");
		service.save("select * from tbl_mgm_user");
	}

}

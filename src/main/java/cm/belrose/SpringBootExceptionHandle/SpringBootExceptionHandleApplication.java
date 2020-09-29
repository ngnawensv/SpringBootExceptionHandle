package cm.belrose.SpringBootExceptionHandle;

import cm.belrose.SpringBootExceptionHandle.InitDB.InitEmployeServie;
import cm.belrose.SpringBootExceptionHandle.services.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExceptionHandleApplication implements CommandLineRunner {
	@Autowired
	private InitEmployeServie initEmployeServie;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExceptionHandleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		initEmployeServie.initEmploye();

	}
}

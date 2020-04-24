package amit.springframework.amitdempExternalPropertyWithSpring;

import amit.springframework.amitdempExternalPropertyWithSpring.examplebeans.FakeDataSource;
import amit.springframework.amitdempExternalPropertyWithSpring.examplebeans.FakeJMSBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AmitDempExternalPropertyWithSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AmitDempExternalPropertyWithSpringApplication.class, args);
		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getNameUser());

        FakeJMSBroker fakeJMSBroker = (FakeJMSBroker) ctx.getBean(FakeJMSBroker.class);
        System.out.println(fakeJMSBroker.getUser());
	}

}

package pixel.academy.bean_finder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"pixel.academy.bean_finder",
							"pixel.academy.util"}
)
public class BeanFinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanFinderApplication.class, args);
	}

}

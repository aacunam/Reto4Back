package mintic.reto1;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
//import java.util.Date;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

//import mintic.reto1.Model.Footwears;
//import mintic.reto1.Model.User;
import mintic.reto1.Repository.Crud.FootwearsCrudRepository;
import mintic.reto1.Repository.Crud.UserCrudRepository;
import mintic.reto1.Repository.Crud.OrderCrudRepository;

/**
 *
 * @author Armando Acuña
 */
@Component
@SpringBootApplication
@EnableConfigurationProperties
public class Reto1Application implements CommandLineRunner {
    

	@Autowired
    private FootwearsCrudRepository FootwearsCrudRepository;
    @Autowired
    private UserCrudRepository UserCrudRepository;
    @Autowired
    private OrderCrudRepository OrderCrudRepository;

	public static void main(String[] args) {
		SpringApplication.run(Reto1Application.class, args);
	}

	@Override
    public void run(String... args) throws Exception {
        // Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        FootwearsCrudRepository.deleteAll();
        UserCrudRepository.deleteAll();
        OrderCrudRepository.deleteAll();
    }

}

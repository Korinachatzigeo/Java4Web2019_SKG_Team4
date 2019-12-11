package regenaration.team4;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import regenaration.team4.entities.Citizen;
import regenaration.team4.entities.Doctor;
import regenaration.team4.entities.Specialty;
import regenaration.team4.entities.User;
import regenaration.team4.repositories.CitizenRepository;
import regenaration.team4.repositories.DoctorRepository;
import regenaration.team4.repositories.SpecialtyRepository;
import regenaration.team4.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication
public class Team4Application implements CommandLineRunner {

    @Autowired
    private CitizenRepository citizenRepository;

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {SpringApplication.run(Team4Application.class, args);}

    @Override
    public void run(String... args) throws Exception{

        List<User> users = new ArrayList<>();
        List<Citizen> citizens = new ArrayList<>();
        User user = new User(10,"userA", "passA", "C");
        Citizen citizen = new Citizen("01234567890","citizenAname","citizenAsurname","citizenAemail","xxxxxxxxxA",10);

        users.add(user);
        userRepository.saveAll(users);

        citizens.add(citizen);
        citizenRepository.saveAll(citizens);

    }

}

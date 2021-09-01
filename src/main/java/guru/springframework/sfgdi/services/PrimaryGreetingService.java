package guru.springframework.sfgdi.services;


/**
 * Created by jt on 12/27/19.
 */

public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Everyone - From the PRIMARY Bean";
    }
}

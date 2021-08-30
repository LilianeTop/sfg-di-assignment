package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */

@Profile({"dog", "default"})
//    @Profile("dog")
@Service
public class DogPetService implements PetService{

    public DogPetService() {
    }

    public String getPetType(){
        return "Dogs are the best!";
    }
}

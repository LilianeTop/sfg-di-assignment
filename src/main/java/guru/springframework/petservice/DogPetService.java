package guru.springframework.petservice;


/**
 * Created by jt on 12/28/19.
 */

public class DogPetService implements PetService{

    public DogPetService() {
    }

    public String getPetType(){
        return "Dogs are the best!";
    }
}

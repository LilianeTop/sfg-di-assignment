package guru.springframework.sfgdi.controllers;

import guru.springframework.petservice.PetService;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 12/28/19.
 */
@Controller
public class PetController {

    private final PetService petService;
//bean is always written with lowercase
    public PetController(PetService petService) {

        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}

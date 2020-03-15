package ruan.ramos.petclinicclone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pets")
@Controller
public class PetsController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listPets() {
        return "pets/index";
    }
}

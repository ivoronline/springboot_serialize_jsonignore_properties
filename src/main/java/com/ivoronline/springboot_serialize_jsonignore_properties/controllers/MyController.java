package com.ivoronline.springboot_serialize_jsonignore_properties.controllers;

import com.ivoronline.springboot_serialize_jsonignore_properties.DTO.PersonDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //================================================================
  // GET PERSON
  //================================================================
  @RequestMapping("GetPerson")
  PersonDTO getPerson() {

    //CREATE INSTANCE
    PersonDTO personDTO         = new PersonDTO();
              personDTO.id      = 1;
              personDTO.name    = "John";
              personDTO.age     = 20;
              personDTO.comment = "my comment";

    //RETURN INSTANCE AS JSON
    return personDTO;

  }

}

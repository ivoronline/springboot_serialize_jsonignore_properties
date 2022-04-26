package com.ivoronline.springboot_serialize_jsonignore_properties.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PersonDTO {

  //PROPERTIES
              public Integer id;
              public String  name;
              public Integer age;
  @JsonIgnore public String  comment;

}

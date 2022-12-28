package BuilderDesignPattern.Builder;

import BuilderDesignPattern.DTO.UserDTO;
import BuilderDesignPattern.Entity.Address;

import java.time.LocalDate;

public interface UserDTOBuilder {

    // All methods used to contruct a object

    UserDTOBuilder withFirstName(String fname);
    UserDTOBuilder withLastName(String lname);
    UserDTOBuilder withBirthDate(LocalDate date);
    UserDTOBuilder withAddress(Address address);

    //This the assemble method to build a object
    UserDTO build();

    //To get already built object
    UserDTO getUserDTO();




}

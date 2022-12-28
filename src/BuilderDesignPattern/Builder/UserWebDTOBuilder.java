package BuilderDesignPattern.Builder;

import BuilderDesignPattern.DTO.UserDTO;
import BuilderDesignPattern.DTO.UserWebDTO;
import BuilderDesignPattern.Entity.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder {


    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto;


    @Override
    public UserDTOBuilder withFirstName(String fname) {
        firstName=fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        lastName=lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthDate(LocalDate date) {
        Period AgeCalculate=Period.between(date,LocalDate.now());
        age=Integer.toString(AgeCalculate.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
       this.address= address.getHouseNumber()+""+address.getStreet()+""+address.getCity()+""+address.getState()+""+address.getZipCode();
        return this;
    }

    @Override
    public UserDTO build() {
        dto=new UserWebDTO(firstName+""+lastName,address,age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}

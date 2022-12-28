package BuilderDesignPattern.Client;

import BuilderDesignPattern.Builder.UserDTOBuilder;
import BuilderDesignPattern.Builder.UserWebDTOBuilder;
import BuilderDesignPattern.DTO.UserDTO;
import BuilderDesignPattern.Entity.Address;
import BuilderDesignPattern.Entity.User;

import java.time.LocalDate;

public class Client {


    public static void main(String[] args) {

        User myUser = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO DTOObject = BuildMyDToObject(builder, myUser);
        System.out.println(DTOObject);

    }


    private static UserDTO BuildMyDToObject(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName()).
                withLastName(user.getLastName()).
                withAddress(user.getAddress()).
                withBirthDate(user.getBirthDate()).build();

    }

    public static User createUser() {

        Address address = new Address();
        address.setHouseNumber("100");
        address.setState("State");
        address.setCity("City");
        address.setZipCode("12345");
        address.setStreet("1234567890");


        User user = new User();
        user.setFirstName("Binita");
        user.setLastName("Rathour");
        user.setBirthDate(LocalDate.of(1993, 9, 4));
        user.setAddress(address);


        return user;


    }
}

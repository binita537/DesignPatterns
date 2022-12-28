package BuilderDesignPatternWithInnerStaticClass;

import java.time.LocalDate;

public class Client {


    public static void main(String[] args) {

        User user=createUser();
        UserDTO dto=creteUserBuilder(UserDTO.getBuilder(),user);
        System.out.println(dto);

    }

    public static UserDTO creteUserBuilder(UserDTO.UserDToBuilder builder,User user)
    {
        return builder.withFirstName(user.getFirstName()).
                withLastName(user.getLastName()).
                withBirthDate(user.getBirthDate()).
                withAddress(user.getAddress()).build();


    }

    public static User createUser() {

        Address address = new Address();
        address.setCity("city");
        address.setHouseNumber("1234567890");
        address.setState("state");
        address.setStreet("Street");
        address.setZipCode("ZipCode");


        User user = new User();
        user.setFirstName("fname");
        user.setLastName("lname");
        user.setAddress(address);
        user.setBirthDate(LocalDate.of(1993, 9, 4));

        return user;


    }
}

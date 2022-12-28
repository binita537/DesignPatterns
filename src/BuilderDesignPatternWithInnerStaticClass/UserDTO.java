package BuilderDesignPatternWithInnerStaticClass;

import java.time.LocalDate;
import java.time.Period;

public class UserDTO {

    private String name;
    private String address;
    private String age;


    private void setName(String name) {
        this.name = name;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setAge(String age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserDTO{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", age='" + age + '\'' +
                '}';
    }


    public static UserDToBuilder getBuilder() {
        return new UserDToBuilder();
    }

    public static class UserDToBuilder {

        private String firstName;
        private String lastName;
        private String BirthDate;
        private String age;
        private String address;

        private UserDTO userDTO;


        public UserDToBuilder withFirstName(String fname) {
            this.firstName = fname;
            return this;
        }

        public UserDToBuilder withLastName(String lname) {
            this.lastName = lname;
            return this;
        }

        public UserDToBuilder withBirthDate(LocalDate date) {

            age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }

        public UserDToBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + "" + address.getStreet() + "" + address.getCity() + "" + address.getState() + "" + address.getZipCode();
            return this;
        }

        public UserDTO build() {
            this.userDTO = new UserDTO();
            userDTO.setName(firstName + "" + lastName);
            userDTO.setAddress(address);
            userDTO.setAge(age);
            return this.userDTO;
        }


        public UserDTO getUserDtoObject() {
            return this.userDTO;
        }

    }


}

package HomeWork_3;

public class Human {
    String surname;
    String name;
    String patronymic;
    String dateBirth;
    String phoneNumber;
    String gender;

    public Human(String surname, String name, String patronymic, String dateBirth, String phoneNumber, String gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "<" + surname + "><" + name + "><" + patronymic + "><" + dateBirth + "> <" + phoneNumber + "><" + gender + ">";
    }
}

package tas3;

import java.time.LocalDate;
import java.time.Month;
import java.util.Random;

public class Programmer extends Person implements PersonAble {

    public Programmer(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
    }



    @Override
    public String favoriteSport() {
        Random random = new Random();
        String[] program = {"Fudbol", "boleibol", "Tens"};
        return getFullName() + " " + program[random.nextInt(program.length)];
    }

    @Override
    public String favoriteLanguage() {
        Random random = new Random();
        String[] langrage = {"English", "Rossia", "Kyrgyz"};
        return getFullName() + " " + langrage[random.nextInt(langrage.length)];
    }

    @Override
    public Month favoriteMouth() {
        Random random = new Random();
        Month[] months = {Month.FEBRUARY,Month.DECEMBER,Month.JANUARY};
        return months[random.nextInt(months.length)];

    }
    @Override
    public String[] getLastName() {
        String [] s =  getFullName().split(" " );
        return new  String[]{s[0]};
    }

    @Override
    public LocalDate getDateOfBrith(LocalDate localDate) {
        return localDate;
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return "Phone number: "+getPhoneNumber()+"\nEmail: "+ getEmail();
    }

    @Override
    public byte[] getPeopleOfAllAges(Person[] people) {
        return new byte[]{people[0].getAge()};
    }
}

package tas3;

import java.time.LocalDate;
import java.time.Month;
import java.util.Random;
import java.util.Scanner;

public class Driver extends Person implements PersonAble{

    public Driver(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
    }

    @Override
    public String favoriteSport() {
        Random random = new Random();
        String[] driver = {"Fudbol","boleibol" ,"Tens"};
        return getFullName()+" "+driver[random.nextInt(driver.length)];
    }
    @Override
    public String favoriteLanguage() {
        Random random =  new Random();
        String[] driver = {"English","Rossia","Kyrgyz"};
        return getFullName()+" "+driver[random.nextInt(driver.length)];
    }

    @Override
    public Month favoriteMouth() {
        Random random = new Random();
        Month[] months = {Month.MARCH,Month.APRIL,Month.AUGUST};
        return months[random.nextInt(months.length)];
    }

    @Override
    public String[] getLastName() {
        String [] st =  getFullName().split(" " );
        return new  String[]{st[0]};
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

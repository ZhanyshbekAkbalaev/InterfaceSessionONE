package tas3;

import java.time.LocalDate;
import java.time.Month;
import java.util.Random;
import java.util.Scanner;

public class Doctor extends Person implements PersonAble{

    public Doctor(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
    }

    @Override
    public String favoriteSport() {
        Random random = new Random();
        String[] doctor= {"Fudbol","boleibol" ,"Tens"};
        return getFullName()+" "+doctor[random.nextInt(doctor.length)];
    }
    @Override
    public String favoriteLanguage() {
        Random random =  new Random();
        String[] doctor = {"English","Rossia","Kyrgyz"};
        return getFullName()+" "+doctor[random.nextInt(doctor.length)];
    }

    @Override
    public Month favoriteMouth() {
        Random random = new Random();
        Month[] months = {Month.JULY,Month.MAY,Month.NOVEMBER};
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

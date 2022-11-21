package tas3;

import java.time.LocalDate;
import java.time.Month;

public interface PersonAble {
    String favoriteSport();
    String favoriteLanguage();
    Month favoriteMouth();
    String[] getLastName();
    LocalDate getDateOfBrith(LocalDate localDate);
    String getPhoneNumberAndEmail();
    byte[] getPeopleOfAllAges(Person[] people);
}

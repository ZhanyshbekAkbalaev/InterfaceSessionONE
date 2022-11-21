package tas3;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programmers");
        Programmer programmerOne = new Programmer(1, "Akbalaev Janyshbek", (byte) 18, 'M', "akbalaev@gmail.com", "+996708281398", 40000);
        Programmer programmerTwo = new Programmer(2, "Kelsinbekov Kuban", (byte) 20, 'M', "kuban@gmail.com", "+996708281398", 40000);
        Programmer programmerThree = new Programmer(3, "Nurudinov Kairat", (byte) 17, 'M', "abdyrazak@.com", "+996708281398", 40000);
        Programmer[] programmers = {programmerOne, programmerTwo, programmerThree};
        System.out.println(programmerOne.toString());
        System.out.println("Favorite sport is "+programmerOne.favoriteSport());
        System.out.println("Favorite language "+programmerOne.favoriteLanguage());
        System.out.println("Favorite month "+programmerOne.favoriteMouth());
        System.out.println("Last name: "+Arrays.toString(programmerOne.getLastName()));
        System.out.println("Tuugan kunu"+programmerOne.getDateOfBrith(LocalDate.of(2004,2,27)));
        System.out.println(programmerOne.getPhoneNumberAndEmail());
        System.out.println(Arrays.toString(programmerOne.getPeopleOfAllAges(programmers)));

        System.out.println(programmerTwo.toString());
        System.out.println("Favorite sport is "+programmerTwo.favoriteSport());
        System.out.println("Favorite language "+programmerTwo.favoriteLanguage());
        System.out.println("Favorite month "+programmerTwo.favoriteMouth());
        System.out.println("Last name: "+Arrays.toString(programmerTwo.getLastName()));
        System.out.println("Tuugan kunu"+programmerTwo.getDateOfBrith(LocalDate.of(2004,2,27)));
        System.out.println(programmerTwo.getPhoneNumberAndEmail());
        System.out.println(Arrays.toString(programmerTwo.getPeopleOfAllAges(programmers)));

        System.out.println(programmerThree.toString());
        System.out.println("Favorite sport is "+programmerThree.favoriteSport());
        System.out.println("Favorite language "+programmerThree.favoriteLanguage());
        System.out.println("Favorite month "+programmerThree.favoriteMouth());
        System.out.println("Last name: "+Arrays.toString(programmerThree.getLastName()));
        System.out.println("Tuugan kunu"+programmerThree.getDateOfBrith(LocalDate.of(2004,2,27)));
        System.out.println(programmerThree.getPhoneNumberAndEmail());
        System.out.println(Arrays.toString(programmerThree.getPeopleOfAllAges(programmers)));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Drivers");
        Driver driverOne = new Driver(4, "Shakirov Altynbek", (byte) 18, 'M', "baatyrov@gmail.com", "+996505550574", 100000);
        Driver driverTwo = new Driver(5, "Orozaliev Baiysh", (byte) 18, 'M', "toichubaiuulu@gmail.com", "+996505550574", 100000);
        Driver driverThree = new Driver(6, "Alymbekov Yryskeldi", (byte) 18, 'M', "muhammed@gmail.com", "+996505550574", 100000);
        Driver[] drivers = {driverOne, driverTwo, driverThree};
        System.out.println(driverOne.toString());
        System.out.println("Favorite sport is: "+driverOne.favoriteSport());
        System.out.println("Favorite language: "+driverOne.favoriteLanguage());
        System.out.println("Favorite month: "+driverOne.favoriteMouth());
        System.out.println("Last name: "+Arrays.toString(driverOne.getLastName()));
        System.out.println("Tuulgan kunu: "+driverOne.getDateOfBrith(LocalDate.of(2000,3,4)));
        System.out.println(driverOne.getPhoneNumberAndEmail());
        System.out.println(Arrays.toString(driverOne.getPeopleOfAllAges(drivers)));

        System.out.println(driverTwo.toString());
        System.out.println("Favorite sport is: "+driverTwo.favoriteSport());
        System.out.println("Favorite language: "+driverTwo.favoriteLanguage());
        System.out.println("Favorite month: "+driverTwo.favoriteMouth());
        System.out.println("Last name: "+Arrays.toString(driverTwo.getLastName()));
        System.out.println("Tuulgan kunu: "+driverTwo.getDateOfBrith(LocalDate.of(2000,3,4)));
        System.out.println(driverTwo.getPhoneNumberAndEmail());
        System.out.println(Arrays.toString(driverTwo.getPeopleOfAllAges(drivers)));

        System.out.println(driverThree.toString());
        System.out.println("Favorite sport is: "+driverThree.favoriteSport());
        System.out.println("Favorite language: "+driverThree.favoriteLanguage());
        System.out.println("Favorite month: "+driverThree.favoriteMouth());
        System.out.println("Last name: "+Arrays.toString(driverThree.getLastName()));
        System.out.println("Tuulgan kunu: "+driverThree.getDateOfBrith(LocalDate.of(2000,3,4)));
        System.out.println(driverThree.getPhoneNumberAndEmail());
        System.out.println(Arrays.toString(driverThree.getPeopleOfAllAges(drivers)));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Doctors");
        Doctor doctorOne = new Doctor(6, "Aijamal", (byte) 18, 'J', "kairat@.com", "+996555714666", 20000);
        Doctor doctorTwo = new Doctor(7, "Eliza", (byte) 18, 'J', "eliza.com", "+996555714666", 20000);
        Doctor doctorThree = new Doctor(8, "Aiperi", (byte) 22, 'J', "aiperi@.com", "+996505055574", 30000);
        Doctor[] doctors = {doctorOne, doctorTwo, doctorThree};
        System.out.println(doctorOne.toString());
        System.out.println("Favorite sport is: "+doctorOne.favoriteSport());
        System.out.println("Favorite language: "+doctorOne.favoriteLanguage());
        System.out.println("Favorite month: "+doctorOne.favoriteMouth());
        System.out.println("Last name: "+ Arrays.toString(doctorOne.getLastName()));
        System.out.println("Tuulgan kunu: "+doctorOne.getDateOfBrith(LocalDate.of(2001,7,2)));
        System.out.println(doctorOne.getPhoneNumberAndEmail());
        System.out.println(Arrays.toString(doctorOne.getPeopleOfAllAges(doctors)));

        System.out.println(doctorTwo.toString());
        System.out.println("Favorite sport is: "+doctorTwo.favoriteSport());
        System.out.println("Favorite language: "+doctorTwo.favoriteLanguage());
        System.out.println("Favorite month: "+doctorTwo.favoriteMouth());
        System.out.println("Last name: "+ Arrays.toString(doctorTwo.getLastName()));
        System.out.println("Tuulgan kunu: "+doctorTwo.getDateOfBrith(LocalDate.of(2001,7,2)));
        System.out.println(doctorTwo.getPhoneNumberAndEmail());
        System.out.println(Arrays.toString(doctorTwo.getPeopleOfAllAges(doctors)));

        System.out.println(doctorThree.toString());
        System.out.println("Favorite sport is: "+doctorThree.favoriteSport());
        System.out.println("Favorite language: "+doctorThree.favoriteLanguage());
        System.out.println("Favorite month: "+doctorThree.favoriteMouth());
        System.out.println("Last name: "+ Arrays.toString(doctorThree.getLastName()));
        System.out.println("Tuulgan kunu: "+doctorThree.getDateOfBrith(LocalDate.of(2001,7,2)));
        System.out.println(doctorThree.getPhoneNumberAndEmail());
        System.out.println(Arrays.toString(doctorThree.getPeopleOfAllAges(doctors)));


    }
}
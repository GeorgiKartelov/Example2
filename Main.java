import java.lang.invoke.StringConcatException;
import java.util.Locale;
import java.util.SplittableRandom;

public class Main {
     public static void main(String[] args) {
          String example1 = "\r EXAMPLE 1";
          short myShort = -250;
          short myShort2 = 250;
          int myInt = 4_589_498;
          double myDouble = 10_000_000_000_000_000_000d;
          double myDouble2 = -9_000_000_000_000_000_000d;
          String newLine = "\nEXAMPLE 2 ";
          System.out.println(example1);
          System.out.println("1.:" + myShort);
          System.out.println("2.:" + myShort2);
          System.out.println("3.:" + myInt);
          System.out.println("4.:" + myDouble);
          System.out.println("5.:" + myDouble2);
          System.out.println(newLine);


          int myInt2 = 43112;
          int myInt3 = -1357674;
          int myInt4 = 1357674;
          int myInt5 = -1_357_674_000;
          long myInt6 = 3_657_895_000L;
          String newLine2 = "\nEXAMPLE 3";
          System.out.println("1.:" + myInt2);
          System.out.println("2.:" + myInt3);
          System.out.println("3.:" + myInt4);
          System.out.println("4.:" + myInt5);
          System.out.println("5.:" +myInt6);
          System.out.println(newLine2);

          float myFloat = 4.9876543f;
          float myFloat2 = 7.123456789012345678890f;
          float myFloat3 = 18398458438583853.28f;
          float myFloat4 = 18398458438583853.39875937284928422f;
          String tabulation = "\n EXAMPLE 4";
          System.out.println("1.:" + myFloat);
          System.out.println("2.:" + myFloat2);
          System.out.println("3.:" + myFloat3);
          System.out.println("4.:" + myFloat4);
          System.out.println(tabulation);

          String ex2 = "\n EXAMPLE 5";
          String myName = "Georgi";
          String firstName = "Гого";
          String secondName = "Ивко";

          System.out.println(myName);
          System.out.println("1.:" + firstName.equals(secondName));
          System.out.println("2.:" + firstName.equalsIgnoreCase(secondName));
          System.out.println("3.:" + firstName.compareTo(secondName));
          System.out.println(ex2);

          String exxx = "\n EXAMPLE 6/7";
          String myfirstName2 = "Georgi";
          String mylastName = "Kartelov";
          String fullName = String.join(" ",myfirstName2, mylastName);
          String fullaName3 = "\t Georgi ";
          String familia = "\r\t Kartelov";

          System.out.println("1.:" + fullName);
          System.out.println("2.:" + myfirstName2.concat(" ").concat(mylastName));
          System.out.println("3.:" + myfirstName2.concat(mylastName));
          System.out.println("4.:" + fullaName3);
          System.out.println(familia);
          System.out.println(exxx);

          String nAME = "Georgi";
          String familiaa = "Kartelov";
          String years = "21";
          String friendFIRSTNAME = "\n\tIvo";
          String friendLASTNAME = " \n\tKarapeev";
          String friendYEARSOLD = " \n\t21";
          String FriendsNameYearsold = String.join(" ", friendFIRSTNAME, friendLASTNAME, friendYEARSOLD);

          System.out.println("1.:" + nAME.concat(" ").concat(familiaa).concat(" ").concat(years));
          System.out.println("2.:" + FriendsNameYearsold);








     }
}
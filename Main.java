import java.util.Scanner;
public class Main {
public static void main(String[] args) {
  //Deklaration av variabler, konstanter m.m.
Scanner sc = new Scanner(System.in);
  // boolean loopRun = true;
  //Ber användare skriva in månad-dag
 System.out.println("Enter month and day (mm-dd):");
         String monthday = sc.nextLine();
  //Use the right delimiter
       String regex = "^(1[0-2]|0[1-9])-(3[01]|[12][0-9]|0[1-9])";
  // Verifiera resultatet av delimiter-testet
       boolean result = monthday.matches(regex);
 if (result) {
   //Om resultatet är sant (true)
         System.out.println("Date is valid"); 
   //      loopRun = true;
              } 
  else {
    //Om resultatet ät falskt (False)
         System.out.println("Date is not valid");
    //     loopRun = false;   
    }
  //Bekräftar att kontrollen är avslutad och nästa steg påbörjas
     System.out.println("Ready for next phase...");
  }
}
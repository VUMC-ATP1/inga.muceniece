package homeworkTwo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWorkTwo
{
    public static void main(String[] args)
    {
// 1. uzdevums Main metodē vajag uzrakstīt loģiskās izteiksmes un izvadīt true/false
        int x=7;
        System.out.println(x>0); // true
        System.out.println(x<0); // fales
        System.out.println(x>5 && x<=10); // true
        System.out.println(!(x<=5) && x<10); // true
        System.out.println(x==0 || x==10); //false
        System.out.println((x*x)>10); //true
        System.out.println("----------------------------------------------------------");
//2. uzdevums  uzrakstīt programmu, kas pieņem Mēneša numuru(vesels skaitlis) un izvada uz ekrāna mēneša nosaukumu ar vārdu. (izmantot switch)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi menesa kartas skaitli: ");
        String menesis = scanner.nextLine();
        switch (menesis)
        {
            case "1":
                System.out.println("Janvaris");
                break;
            case "2":
                System.out.println("Februaris");
                break;
            case "3":
                System.out.println("Marts");
                break;
            case "4":
                System.out.println("Aprilis");
                break;
            case "5":
                System.out.println("Maijs");
                break;
            case "6":
                System.out.println("Junijs");
                break;
            case "7":
                System.out.println("Julijs");
                break;
            case "8":
                System.out.println("Augusts");
                break;
            case "9":
                System.out.println("Septembris");
                break;
            case "10":
                System.out.println("Oktobris");
                break;
            case "11":
                System.out.println("Novembris");
                break;
            case "12":
                System.out.println("Decembris");
                break;

            default:
                System.out.println("Menesis netika atpazits!");
        }
        System.out.println("----------------------------------------------------------");
// 3. Uzdevums uzrakstīt programmu, kas pieņem trīs veselus skaitļus un izvada uz ekrāna kurš ir lielākais no šiem trīs skaitļiem.
        System.out.println("Ievadi 1. ciparu");
        int number1 = scanner.nextInt();
        System.out.println("Ievadi 2. ciparu");
        int number2 = scanner.nextInt();
        System.out.println("Ievadi 3. ciparu");
        int number3 = scanner.nextInt();
        System.out.println(Math.min(Math.min(number1, number2), number3));
        if (number1 < number2 && number1 < number3)
        {
            System.out.println(number1);
        }
        else if (number2 < number3)
        {
            System.out.println(number2);
        }
        else
        {
            System.out.println(number3);
        }
        System.out.println("----------------------------------------------------------");
// 4. uzdevums uzrakstīt programmu, kas nolasa krāsu(String) sarkans/dzeltens/zaļš un izvada uz ekrāna, gājēja darbības pie luksofora.
        String gaisma="Dzeltena";

        String gaisma1 = "Sarkana";
        String gaisma2 = "Dzeltena";
        String gaisma3 = "Zala";

        if (gaisma.equals(gaisma1))
        {
            System.out.println("Gaidi zaļo gaismu!");
        }
        else if (gaisma.equals(gaisma2))
        {
            System.out.println("Gaidi, driz iedegsies zala gaisma!");
        }
        else if(gaisma.equals(gaisma3))
        {
            System.out.println("Zala gaisma! Vari turpinat ceļu.");
        }
        else
        {
            System.out.println("Luksofora tadas krasas gaismas nav.");
        }
        System.out.println("----------------------------------------------------------");

        printBussinesCard("Janis", "Berzins", 12345678, 1990);
        printBussinesCard("Janis", "Berzins", 12345678, 1990);
        printBussinesCard("Janis", "Berzins", 12345678, 1990);
        System.out.println("----------------------------------------------------------");
        printBussinesCard("Liga", "Kalnina", 32165487, 1965);
        printBussinesCard("Juris", "Vitols", 78456123, 1930);
        System.out.println("----------------------------------------------------------");
        int summa = sum(4, 9);
        System.out.println("Summa: " + summa);
        System.out.println("----------------------------------------------------------");
        System.out.println("Videja vertiba: " + average(10, 2, 4));
    }
// 5. uzdevums Uzrakstīt metodi printBusinessCard, kura izvada ekrānā cilvēka vizītkarti ar  vārdu, uzvārdu, telefonu un dzimšanas gadu.
// main metodē trīs reizes izsaukt šo metodi un uz ekrāna parādīt vizītkarti 3 reizes.
    public static void printBussinesCard(String name, String surname, int number, int birth)
    {
        System.out.println("Vizitkarte");
        System.out.println("###########");
        System.out.println("Vārds: " + name);
        System.out.println("Uzvards: " + surname);
        System.out.println("Telefona numurs: +371 " + number);
        System.out.println("Dzimsanas gads " + birth);
        System.out.println("###########");
    }
// 6. uzdevums izvada vizītkarti uz ekrān. Metodi izsaukt 2 reizes ar dažādiem parametriem.
    public static void printBussinesCardTwo(String name, String surname, int number, int birth)
    {
        System.out.println("Vizitkarte");
        System.out.println("###########");
        System.out.println("Vārds: " + name);
        System.out.println("Uzvards: " + surname);
        System.out.println("Telefona numurs: +371 " + number);
        System.out.println("Dzimsanas gads " + birth);
        System.out.println("###########");
    }
// 7. uzdevums Uzrakstīt metodi sum, kas pieņem divus veselus skaitļus kā argumentus un atgriež šo skaitļu summu, kā veselu skaitli(bet neizprintē uz ekrāna). Pēc tam main() metodē nodefinēt mainīgo summa, piešķirt šim mainīgajam vērtību, ko atgriež šī metode. Tad izprintēt uz ekrāna mainīgo summa.
    public static int sum(int a, int b)
    {
        return a+b;
    }
// 8. uzdevums Uzrakstīt metodi average, kas pieņem 3 decimālskaitļus(double) un atgriež rezultātu kā decimālskaitli(double). Pēc tam izprintēt šīs metodes rezultātu main metodē.
    public static double average(double a, double b, double c)
    {
        return (a+b+c)/3;
    }
}

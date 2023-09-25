import java.util.Scanner;
import java.util.Random;

public class Lab2{
    public static void main(String[] args)
    {
       Random rand = new Random();
       int meniu=1;
       double s1;
       Scanner sc = new Scanner(System.in);
       ContBancar _contbancar = new ContBancar(500);
       System.out.println(_contbancar);
       while(meniu!=0)
       {
         System.out.println("0.Iesire");
         System.out.println("1.Depozitare numerar");
         System.out.println("2.Retragere numerar");
         System.out.println("3.Interogare sold");
         System.out.println("4.Operatii aleatoare");
         System.out.println("Introduceți o opțiune:");
         meniu = sc.nextInt();
         switch(meniu) {
            case 0:
              break;
            case 1:
              System.out.println("Introdu suma care doriți să o depuneți:");
              s1 = sc.nextInt();
              _contbancar.depozitareSuma(s1);
              break;
            case 2:
              System.out.println("Introdu suma care doriți să o retrageți:");
              s1 = sc.nextInt();
              if(_contbancar.retragereSuma(s1) == true)
              {
                System.out.println("A-ți retras suma de: " + s1 + " lei");
              }else{
                System.out.println("Fonduri insuficiente!");
              }
              break;
            case 3:
              System.out.println("Soldul dvs este de: " + _contbancar.interogareSold() + " lei");
            case 4:
              int N = rand.nextInt(100) + 1;
              for(int i=1; i<=N; i++)
              {
                int x = rand.nextInt(100) + 1;
                boolean rbool = rand.nextBoolean();
                if(rbool == true)
                {                 
                  _contbancar.depozitareSuma(x);
                  System.out.println("Ati depus suma de " + x + " lei");
                }else{
                     if(_contbancar.retragereSuma(x) == true)
                      {
                        System.out.println("A-ți retras suma de: " + x + " lei");
                      }else{
                        System.out.println("Fonduri insuficiente!");
                      }
                }
              }
            default:
              System.out.println("Opțiune greșită!");
              break;
         }
       }
       sc.close();
    }
}
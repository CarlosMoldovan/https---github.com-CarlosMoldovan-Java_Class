import java.util.Scanner;


public class masinamain {
    public static void main(String[] args)
    {
        String tip,culoare;
        double viteză;
        int n;
        Scanner sc = new Scanner(System.in);
        masinaclass mașină = new masinaclass();
        System.out.println("Introdu un nume:");
        tip = sc.nextLine();
        mașină.setTip(tip);
        System.out.println("Introdu o culoare:");
        culoare = sc.nextLine();
        mașină.setCuloare(culoare);
        System.out.println("Introdu o viteză:");
        viteză = sc.nextDouble();
        mașină.setViteză(viteză);
        System.out.println(mașină.getTip() + " " + mașină.getCuloare() + " " + mașină.getViteză());
        System.out.println(mașină);
        System.out.println("Introdu un număr:");
        n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            mașină.setTip(tip);
            mașină.setCuloare(culoare);
            mașină.setViteză(viteză);
        }
        sc.close();
    }
}

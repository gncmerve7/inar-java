package week_03.live_class;

public class ClosestGym {


    public static void main(String[] args) {
        int distA = -6;
        int distB = -3;
        int distC = 5;
        int distEv = 0;

        int distA_Ev = Math.abs(distA - distEv);
        int distB_Ev = Math.abs(distB - distEv);
        int distC_Ev = Math.abs(distC - distEv);

        int tempMinimumDist = Math.min(distA_Ev, distB_Ev);
        int minimumDist = Math.min(tempMinimumDist, distC_Ev);
        System.out.println("The closest gym is " + minimumDist);

        int gymPriceA = 5;
        int gymPriceB = 10;
        int gymPriceC = 3;

    }
}

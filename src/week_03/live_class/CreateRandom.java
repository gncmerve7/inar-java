package week_03.live_class;

public class CreateRandom {

    public static void main(String[] args) {
        System.out.println((int) (Math.random() * 10)); //0 ile 9 arasi
        System.out.println((int) (Math.random() * 100));//10 ile 99 arasi
        System.out.println((int) (Math.random() * 1000));
        System.out.println(10 + (int) (Math.random() * 10)); //10 ile 20 arasi <20 dahil degil
        System.out.println((int) (Math.random() * 20)); //0 ile 20 arasi < 20 dahil degil
        System.out.println((int) (Math.random() * 10));// 25 ile 30 arasi
    }
}

package miscellaneous;

import java.util.Scanner;

public class AFlower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Flower ancientFlower = new Flower();
        ancientFlower.start();
        System.out.println("Ads: click here to get a cookie for free.");
        try {
            ancientFlower.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Flower extends Thread{
    Scanner sc = new Scanner(System.in);
    private String flowerName;

    @Override
    public void run() {
        try {
            String name;
            System.out.print("Enter the flower's name you have found: ");
            name = sc.nextLine();
            Thread.sleep(1200);
            setFlowerName(name);
            Thread.sleep(1500);
            getFlowerName();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setFlowerName(String name) {
        this.flowerName = name;
        System.out.println("The flower has been identified...");
    }

    public void getFlowerName() {
        System.out.println(this.flowerName + " an ancient flower with divine powers");
        try{
          Thread.sleep(800);
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("This flower's power has been extracted and is ready to consume.");
    }

}
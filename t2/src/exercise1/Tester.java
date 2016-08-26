/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author Acer
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Avilable Processors: " + Runtime.getRuntime().availableProcessors());

        int total;

        String url1 = "https://fronter.com/cphbusiness/design_images/images.php/Classic/login/fronter_big-logo.png";
        String url2 = "https://fronter.com/cphbusiness/design_images/images.php/Classic/login/folder-image-transp.png";
        String url3 = "https://fronter.com/volY12-cache/cache/img/design_images/Classic/other_images/button_bg.png";

        long start = System.nanoTime();

        Load t1 = new Load(url1);
        Load t2 = new Load(url2);
        Load t3 = new Load(url3);

        t1.run();
        t2.run();
        t3.run();

        total = t1.getSum() + t2.getSum() + t3.getSum();
        System.out.println("Total: " + total);
        long end = System.nanoTime();
        System.out.println("Time Sequental: " + (end - start));
    }

}

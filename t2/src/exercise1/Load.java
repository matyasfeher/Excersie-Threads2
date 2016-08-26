/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class Load implements Runnable {

    String url;
    byte[] ba;
    byte sum;

    public Load(String url){
    this.url = url;
    }
    
    public byte getSum() {
        return sum;
    }

    private final String url1 = "https://fronter.com/cphbusiness/design_images/images.php/Classic/login/fronter_big-logo.png";
    private final String url2 = "https://fronter.com/cphbusiness/design_images/images.php/Classic/login/folder-image-transp.png";
    private final String url3 = "https://fronter.com/volY12-cache/cache/img/design_images/Classic/other_images/button_bg.png";

    @Override
    public void run() {

        try {
          ba = ByteArray.getBytesFromUrl(url);
            for(int i = 0; i < ba.length; i++){
            sum += ba[i];           
            }
            System.out.println(sum);
        } catch (IOException ex) {
            Logger.getLogger(Load.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

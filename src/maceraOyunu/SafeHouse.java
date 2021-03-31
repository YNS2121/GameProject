
package maceraOyunu;

public class SafeHouse extends NormalLocation {

    public SafeHouse(Player player) {
        super(player,"Güvenli Ev");
    }

   

    public boolean getLocation() {
        player.setHealthy(player.getrHealthy());
        System.out.println("İyileştiniz...");
        System.out.println("Şuan Güvenli ev adlı yerdesiniz");
        return true;
    }

  
}

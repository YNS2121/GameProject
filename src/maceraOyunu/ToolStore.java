package maceraOyunu;

public class ToolStore extends NormalLocation {

    ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean getLocation() {
        System.out.println("Para : " + getPlayer().getMoney());
        System.out.println("1.Silahlar");
        System.out.println("2.Zırhlar");
        System.out.println("3.Çıkış");
        System.out.println("Seçiniz : ");
        int selTool = scan.nextInt();
        int selItemID;
        switch (selTool) {
            case 1:
                selItemID = weaponMenu();
                buyWeapon(selItemID);
                break;
            case 2:
                selItemID = armorMenu();
                buyArmor(selItemID);
                break;
            default:
                break;
        }

        return true;
    }

    public int armorMenu() {
        System.out.println("1.Hafif\t <Para : 15 - Hasar : 1>");
        System.out.println("2.Orta\t <Para : 25 - Hasar : 3>");
        System.out.println("3.Ağır\t <Para : 40 - Hasar : 5>");
        System.out.println("4.Çıkış");
        System.out.println("Sliah Seçiniz : ");
        int selArmorID = scan.nextInt();
        return selArmorID;

    }

    public void buyArmor(int itemID) {
        int avoid = 0, price = 0;
        String aName = null;
        switch (itemID) {
            case 1:
                avoid = 1;
                aName = "Hafif Zırh";
                price = 15;
                break;
            case 2:
                avoid = 3;
                aName = "Orta Zırh";
                price = 15;
                break;
            case 3:
                avoid = 7;
                aName = "Ağır Zırh";
                price = 40;
                break;
            case 4:
                System.out.println("Çıkış yapılıyor...");
                break;
            default:
                System.out.println("Geçersin işlem!");
                break;

        }
        if (price >= 0) {
            if (player.getMoney() >= price) {
                player.getInv().setArmor(avoid);
                player.getInv().setaName(aName);
                player.setMoney(player.getMoney() - price);
                System.out.println(aName + " satın aldınız,Engellenen Hasar " + player.getInv().getArmor());
                System.out.println("Kalan Para : " + player.getMoney());

            } else {
                System.out.println("Bakiye Yetersiz!");
            }

        }

    }
    

    public int weaponMenu() {
        System.out.println("1.Tabanca\t <Para : 25 - Hasar : 2>");
        System.out.println("2.Kılıç\t <Para : 35 - Hasar : 3>");
        System.out.println("3.Tüfek\t <Para : 45 - Hasar : 7>");
        System.out.println("4.Çıkış");
        System.out.println("Sliah Seçiniz : ");
        int selWeaponID = scan.nextInt();
        return selWeaponID;

    }

    public void buyWeapon(int itemID) {
        int damage = 0, price = 0;
        String wName = null;
        switch (itemID) {
            case 1:
                damage = 2;
                wName = "Tabanca";
                price = 25;
                break;
            case 2:
                damage = 3;
                wName = "Kılıç";
                price = 35;
                break;
            case 3:
                damage = 7;
                wName = "Tüfek";
                price = 45;
                break;
            case 4:
                System.out.println("Çıkış yapılıyor...");
                break;
            default:
                System.out.println("Geçersin işlem!");
                break;

        }
        if (price > 0) {
            if (player.getMoney() >= price) {
                player.getInv().setDamage(damage);
                player.getInv().setwName(wName);
                player.setMoney(player.getMoney() - price);
                System.out.println(wName + "Silah satın aldınız,Önceki Hasar" + player.getDamage() + ",Yeni Hasar : "
                        + (player.getDamage() + player.getInv().getDamage()) + player.getTotalDamage());
                System.out.println("Kalan Para : " + player.getMoney());

            } else {
                System.out.println("Bakiye Yetersiz!");
            }

        }
    }

}

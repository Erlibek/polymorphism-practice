package task1;
import task1.weapon.RPG;
import task1.weapon.Rifle;
import task1.weapon.WaterGun;
import task1.weapon.Weapon;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Player player = new Player(new Weapon[]{
                new WaterGun(), new Rifle(), new RPG()
        });
        System.out.format(
                "У игрока %d слота с оружием, введите номер , чтобы выстрелить, -1 чтобы выйти\n ",
                player.getSloutsCount()
        );

        int slot;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            slot = scanner.nextInt();
            if (slot == -1) {
                break;
            }
            player.shotWithWeapon(slot - 1);
        }
    }
}
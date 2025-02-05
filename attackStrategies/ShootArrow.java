package attackStrategies;

import interfaces.Attack;

public class ShootArrow implements Attack {
    @Override
    public void attack() {
        try {
            System.out.println("Shooting an arrow!");
        } catch (Exception e) {
            System.out.println("Failed to shoot arrow: " + e.getMessage());
        }
    }
}
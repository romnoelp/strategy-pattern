package attackStrategies;

import interfaces.Attack;

public class SwingSword implements Attack {
    @Override
    public void attack() {
        try {
            System.out.println("Swinging the excalibur!!");
        } catch (Exception e) {
            System.out.println("Failed to swing sword: " + e.getMessage());
        }
    }
}
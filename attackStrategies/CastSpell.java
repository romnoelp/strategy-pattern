package attackStrategies;

import interfaces.Attack;

public class CastSpell implements Attack {
    @Override
    public void attack() {
        try {
            System.out.println("Casting a gravity magic!");
        } catch (Exception e) {
            System.out.println("Failed to cast spell: " + e.getMessage());
        }
    }
}
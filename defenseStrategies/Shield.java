package defenseStrategies;

import interfaces.Defend;

public class Shield implements Defend {
    @Override
    public void defend() {
        try {
            System.out.println("Calling forth the power of the holy shield!");
        } catch (Exception e) {
            System.out.println("Failed to use shield: " + e.getMessage());
        }
    }
}
package defenseStrategies;

import interfaces.Defend;

public class Shield implements Defend {
    @Override
    public void defend() {
        try {
            System.out.println("Using a shield to defend!");
        } catch (Exception e) {
            System.out.println("Failed to use shield: " + e.getMessage());
        }
    }
}
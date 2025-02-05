package defenseStrategies;

import interfaces.Defend;

public class Dodge implements Defend {
    @Override
    public void defend() {
        try {
            System.out.println("Dodging to avoid attack!");
        } catch (Exception e) {
            System.out.println("Failed to dodge: " + e.getMessage());
        }
    }
}
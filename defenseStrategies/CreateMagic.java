package defenseStrategies;

import interfaces.Defend;

public class CreateMagic implements Defend {
    @Override
    public void defend() {
        try {
            System.out.println("Creating a magic barrier for defense!");
        } catch (Exception e) {
            System.out.println("Failed to create magic barrier: " + e.getMessage());
        }
    }
}
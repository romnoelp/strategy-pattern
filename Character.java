import interfaces.Attack;
import interfaces.Defend;

import java.util.List;

public abstract class Character {
    protected Attack attackStrategy;
    protected List<Defend> defenseStrategies;

    public Character(Attack attackStrategy, List<Defend> defenseStrategies) {
        this.attackStrategy = attackStrategy;
        this.defenseStrategies = defenseStrategies;
    }   

    public void attack() {
        try {
            attackStrategy.attack();
        } catch (Exception e) {
            System.out.println("Error executing attack: " + e.getMessage());
        }
    }

    public void defend() {
        try {
            for (Defend strategy : defenseStrategies) {
                strategy.defend();
            }
        } catch (Exception e) {
            System.out.println("Error executing defense: " + e.getMessage());
        }
    }
}

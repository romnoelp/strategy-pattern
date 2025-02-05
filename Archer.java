import attackStrategies.ShootArrow;
import defenseStrategies.Dodge;

import java.util.List;

public class Archer extends Character {
    public Archer() {
        super(new ShootArrow(), List.of(new Dodge()));
    }
}
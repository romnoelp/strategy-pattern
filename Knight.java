import attackStrategies.SwingSword;
import defenseStrategies.CreateMagic;
import defenseStrategies.Dodge;
import defenseStrategies.Shield;

import java.util.List;

public class Knight extends Character {
    public Knight() {
        super(new SwingSword(), List.of(new Shield(), new Dodge(), new CreateMagic()));
    }
}
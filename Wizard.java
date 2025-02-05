import attackStrategies.CastSpell;
import defenseStrategies.CreateMagic;

import java.util.List;

public class Wizard extends Character {
    public Wizard() {
        super(new CastSpell(), List.of(new CreateMagic()));
    }
}
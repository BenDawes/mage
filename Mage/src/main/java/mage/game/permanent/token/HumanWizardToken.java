package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

public class HumanWizardToken extends Token {

    public HumanWizardToken() {
        super("Human Wizard", "1/1 blue Human Wizard creature token");
        cardType.add(CardType.CREATURE);
        subtype.add(SubType.HUMAN);
        subtype.add(SubType.WIZARD);
        color.setBlue(true);
        power = new MageInt(1);
        toughness = new MageInt(1);
    }
}

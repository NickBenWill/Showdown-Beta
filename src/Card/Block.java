package Card;

import Player.Player;

import java.awt.*;

/**
 * Created by 18nbenjung on 9/25/2017.
 */
public class Block extends Card {

    public Block(String name, String cardClass, CardTypeE cardTypeE, Image cardImage) {
        super(name, cardClass, cardTypeE, cardImage);
    }

    public void callAll(Player user, Player opponent){}
}

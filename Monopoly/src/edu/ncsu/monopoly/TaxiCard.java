package edu.ncsu.monopoly;

import java.util.Random;


public class TaxiCard extends Card {
    
    private int type;
    private int dice;

    public TaxiCard(int cardType) {
        this.type = cardType;
        this.dice = 0;
        
    }

    public void applyAction() {
        Player currentPlayer = GameMaster.instance().getCurrentPlayer();
        Random r = new Random();
        int diceValue = r.nextInt(6)+1;  // Entre 0 y 5, más 1.;
        this.dice=diceValue;
        
        System.out.println(diceValue);
        GameMaster.instance().movePlayer(currentPlayer, diceValue);
    }

    public int getCardType() {
        return type;
    }

    public String getLabel() {
        return "You move " + dice +" places";
    }

}
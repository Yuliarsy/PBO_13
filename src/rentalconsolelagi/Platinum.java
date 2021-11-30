/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolelagi;

/**
 *
 * @author Yulia Rakhmah
 */
public class Platinum extends Gold {
    
    private int bonus;
    
    Platinum() {
        setrentCost(45000);
        setPoint(10);
        setDisc(3);
        setCashback(10000);
    }
    
    protected int getBonus(int rentalDuration) {
        
        bonus = rentalDuration * 5000;
        return bonus;
    }
}
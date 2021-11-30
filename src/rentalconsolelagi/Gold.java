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
public class Gold extends Silver {
    
    private int cashback;
    
    Gold() {
        setrentCost (30000);
        setPoint(5);
        setDisc(2);
        setCashback(5000);
    }
    
    public void setCashback(int d){
        this.cashback=d;
    }
    
    public int getCashback(){
        return this.cashback;
    }
}

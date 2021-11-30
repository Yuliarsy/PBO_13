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
public class Silver extends Others {
    
    // atribut
    private int rentCost, point, disc, tempCost, discountAmount, totalCost;
    
    
    // constructor
    Silver() {
        setrentCost (25000);
        setPoint (1);
        setDisc(1);
    }
    
    protected int costAmount(int rentalDuration) {
        
        tempCost = rentalDuration * rentCost;
        discountAmount = (tempCost * disc) / 100;
        totalCost = tempCost - discountAmount;
        
        return totalCost;
    }
    
    protected int getPoint(int rentalDuration) {
        
        int totalPoint = rentalDuration * point;
        return totalPoint;
    }
    
    public void setrentCost(int a){
        this.rentCost=a;
    } 
    
    public void setPoint(int b){
        this.point=b;
    }
    
    public void setDisc(int c){
        this.disc=c;
    }
}

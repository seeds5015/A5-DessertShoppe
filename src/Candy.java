/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class Candy extends DessertItem {
    private double weight;
    private int pricePerLbs;
    
    
    public Candy(String name, double weight, int pricePerLbs)
    {
super(name);
this.weight=weight;
this.pricePerLbs = pricePerLbs;


    }
    public double getWeight(){
    return this.weight;
    
    }
    public int getPricePerLbs(){
     
    return this.pricePerLbs;
    
    
    }
 
    
    public String toString()
    {
         

        String output = ("Candy \n");
        output = output + super.toString();
        return output;
       
    }

    @Override
    public int getCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

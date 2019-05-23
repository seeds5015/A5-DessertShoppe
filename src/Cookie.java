/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class Cookie extends DessertItem {
    
    private int number;
    private int pricePer12;
    
    public Cookie(String name, int number, int pricePer12)
    {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
      
                
    }public int getNumber(){
        return this.number;
        
    }public int getPricePer12(){
        return this.pricePer12;
        
    }
  
    public String toString()
    {
         String output = ("Cookie \n");
        output = output + super.toString();
        return output;
    }

    @Override
    public int getCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

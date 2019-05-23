/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class IceCream extends DessertItem {

    private int cost;
    private String icName;
    private int icCost;
    
    
    
    public IceCream(String name, int cost)
    {
        super(name);
        this.cost = cost;
        this.icCost = cost;
        this.icName = name;
        
        
        
    }
   

  
    public String toString()
    {
      String output = ("IceCream \n");
        output = output + super.toString();
        return output;
       
    }

    @Override
    public int getCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

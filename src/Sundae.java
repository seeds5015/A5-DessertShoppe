/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class Sundae extends IceCream{
    

   private String icName;
   private int icCost;
   
    private String toppingName;
    private int toppingCost;
    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
    super(cost);
   
      this.icCost = icCost;
      this.icName = icName;
      
       this.toppingCost = toppingCost;
       this.toppingName = toppingName;
       
       
    }public String getToppingName(){
        return this.toppingName;
    }public int getToppingCost(){
        return this.toppingCost;
        
    }public String getIcName(){
        return this.icName;
        
    }public int getIceCost(){
        return this.icCost;
    }
    

    
    public String toString()
    {
       String output = ("Sundae \n");
        output = output + super.toString();
        return output;  
    }

    @Override
    public int getCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

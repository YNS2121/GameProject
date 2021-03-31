
package maceraOyunu;

public abstract class NormalLocation extends Location{
    
  
   public NormalLocation(Player player , String name){
        super(player);
        this.name=name;
        
    }
  
    
   @Override
    public abstract boolean getLocation();
  
    
}

package pkg;
import java.util.ArrayList;


public class OnlinePurchaseManager
{
   
   private ArrayList<Gizmo> purchases;
   
   public int countElectronicsByMaker(String maker)
   {
   int count = 0;
   for (Gizmo g : purchases)
   {
   if (g.isElectronic() && g.getMaker().equals(maker))
   count++;
   }
   return count;
   } 
   
   public boolean hasAdjacentEqualPair()
   {
   for (int i = 1; i < purchases.size(); i++)
   {
   if (purchases.get(i).equals(purchases.get(i-1)))
   return true;
    }
   return false;
   } 
   
   public String toString()
   {
   	return "" + purchases;
   }
   
   public Gizmo getCheapestGizmoByMaker( String mkr )
   {
   	private int price;
   	public getPrice(){
   	   System.outprintln(price);
   	}
   	
   }
}

package setA;
import java.util.*;

class Vehicle{
	
	String company_name;
	float prize;
	
	Vehicle(String company_name, float prize)
	{
		this.company_name =company_name;
		this.prize =prize;
	}
}

 
class LightwetVehicle extends  Vehicle{
	int milage;
	
	LightwetVehicle(int milage,String company_name, float prize)
	{
		super( company_name,  prize);
		this.milage=milage;
	}
	
	 void show()
	 {
		 System.out.println("company_name" +company_name);
		 System.out.println("prize" +prize);
		 System.out.println("milage" +milage);
		// System.out.println("capacity_in_ton" +capacity_in_ton);
		 System.out.println();
	 }
}


class HeavywetVehicle extends  Vehicle{
  
	 int capacity_in_ton;

	 HeavywetVehicle(int capacity_in_ton,String company_name, float prize)
		{
		 super( company_name,  prize);
			this.capacity_in_ton=capacity_in_ton;
		}
	 
	 void show()
	 {
		 System.out.println("company_name" +company_name);
		 System.out.println("prize" +prize);
		 //System.out.println("milage" +milage);
		 System.out.println("capacity_in_ton" +capacity_in_ton);
		 System.out.println();
	 }

}


public class InheritanceVehicleEx {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     
     float prize;
     
     String car_name;
     int capacity_in_ton,milage, i=0, j=0;
     
     
     LightwetVehicle[] l = new LightwetVehicle[5];
     
     HeavywetVehicle[] h = new HeavywetVehicle[5];
     
     
     
     
     System.out.println("choose your vehical");
     System.out.println("1 for LightwetVehicle");
     System.out.println("2 for LightwetVehicle");
     System.out.println("3 for fo");
     int ch = sc.nextInt();
     
     switch(ch)
     {
     
     case 1:
    	 System.out.println("first");
    	 for(i=1; i<=5; i++)
    	 {
    		 System.out.println("enter the company name, prise , milage");
    		 car_name = sc.next();
    		 prize =sc.nextInt();
    		 milage =sc.nextInt();
    		// capacity_in_ton= sc.nextInt();
    		 l[i] = new LightwetVehicle(milage,car_name,prize );
    	
    		 l[i].show();
    		 
    		 break;
    	 }
    	 l[i].show();
    	 
     case 2:
    	 for(j=1; j<=5; j++)
    	 {
    		 System.out.println("enter the company name, prise , milage");
    		 car_name = sc.next();
    		 prize =sc.nextInt();
    	 capacity_in_ton= sc.nextInt();
    		 h[j] = new HeavywetVehicle(capacity_in_ton,car_name,prize );
    		 j++;
    		 break;
    	 }
    	 l[i].show();
     }
		

	}

}

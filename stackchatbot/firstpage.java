package stackchatbot;

import java.util.Scanner;
import java.util.Stack;

import java.util.Iterator;

public class firstpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	      System.out.println("Hello!");
	      Stack<String> req=new Stack<String>();
    	  req.push("Check your data balance enter number 1 \n");
    	  req.push("Check your new data plan enter number 2 \n");
    	  req.push("Check your one month plan validity enter number 3 \n");
    	  req.push("Check your two month plan validity  enter number 4 \n");
    	  req.push("Check your three month plan validity  enter number 5 \n");
    	  req.push("Check your long time recharge plan validity  enter number 6 \n");
    	  req.push("Check your postpaid plan validity  enter number 7 \n");
	        System.out.println(req);
	        Stack<String> databalance=new Stack<String>();	        
	        databalance.push("Balance for your number 911111111: 1)239-1m-2GB/D \n Data: 1.00 GB out of 2.00 GB/day \n SMS: 100 out of 100/day \n Plan expiry: 25 Nov 2023,7.00PM \n For more details, check website ");
	        Stack<String> plan=new Stack<String>();	        
	          plan.push("Rs.180 \n Validity:24 days \n Data:1GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	    	  plan.push("Rs.260 \n Validity:1 month \n Data:1.5GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	    	  plan.push("Rs.200 \n Validity:23 days \n Data:1.5GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	    	  plan.push("Rs.270 \n Validity:28 days \n Data:1.5GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	    	  plan.push("Rs.300 \n Validity:28 days \n Data:2GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	    	  plan.push("Rs.450 \n Validity:60 days \n Data:1GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	    	  plan.push("Rs.750 \n Validity:90 days \n Data:2GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	    	  plan.push("Rs.870 \n Validity:84 month \n Data:2GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	    	  plan.push("Rs.1000 \n Validity:84 days \n Data:3GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	    	  plan.push("Rs.720 \n Validity:84 days \n Data:2GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	    	  plan.push("Rs.670 \n Validity:84 days \n Data:1.5GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	    	  plan.push("Rs.3000 \n Validity:365 days \n Data:2.5GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	        Stack<String> onemonth=new Stack<String>();
	        onemonth.push("Rs.180 \n Validity:24 days \n Data:1GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	        onemonth.push("Rs.260 \n Validity:1 month \n Data:1.5GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	        onemonth.push("Rs.200 \n Validity:23 days \n Data:1.5GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	        onemonth.push("Rs.270 \n Validity:28 days \n Data:1.5GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	        onemonth.push("Rs.300 \n Validity:28 days \n Data:2GB/D|Voice:Unlimited calls|SMS: 100SMS/day");  	    	 
	        Stack<String> twomonth=new Stack<String>();
	        twomonth.push("Rs.450 \n Validity:60 days \n Data:1GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	        Stack<String> threemonth=new Stack<String>();
	        threemonth.push("Rs.750 \n Validity:90 days \n Data:2GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	        threemonth.push("Rs.870 \n Validity:84 month \n Data:2GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	        threemonth.push("Rs.1000 \n Validity:84 days \n Data:3GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	        threemonth.push("Rs.720 \n Validity:84 days \n Data:2GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	        threemonth.push("Rs.670 \n Validity:84 days \n Data:1.5GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	        Stack<String> longtime=new Stack<String>();
	        longtime.push("Rs.3000 \n Validity:365 days \n Data:2.5GB/D|Voice:Unlimited calls|SMS: 100SMS/day");
	        Stack<String> postpaid=new Stack<String>();
	        postpaid.push("Rs.1500 \n Validity:Bill Cycle \n BENEFITS:300GB");
	        postpaid.push("Rs.700 \n Validity:Bill Cycle \n BENEFITS:100GB");
	        postpaid.push("Rs.600 \n Validity:Bill Cycle \n BENEFITS:Unlimited");
	        Scanner sc = new Scanner(System.in);
	      int choose=sc.nextInt();
	      switch(choose)
	      {
	      case 1:
	      {
	    	  Iterator iterator=databalance.iterator();
	    	  while(iterator.hasNext())
	    	  {
	    	  System.out.println(iterator.next());
	    	  }
	    	  break;	    	  
	      }
	      case 2:
	      {
	    	  Iterator iterator=plan.iterator();
	    	  while(iterator.hasNext())
	    	  {
	    	  System.out.println(iterator.next());
	    	  }	    	
	    	   break;
	      }
	      case 3:
	      {
	    	  Iterator iterator=onemonth.iterator();
	    	  while(iterator.hasNext())
	    	  {
	    	  System.out.println(iterator.next());
	    	  }	    	
	    	  break;
	      }
	      case 4:
	      {
	    	  Iterator iterator=twomonth.iterator();
	    	  while(iterator.hasNext())
	    	  {
	    	  System.out.println(iterator.next());
	    	  }    	  
	    	  break;
	      }
	      case 5:
	      {
	    	  Iterator iterator=threemonth.iterator();
	    	  while(iterator.hasNext())
	    	  {
	    	  System.out.println(iterator.next());
	    	  }	    	 
	    	  break;
	      }
	      case 6:
	      {
	    	  Iterator iterator=longtime.iterator();
	    	  while(iterator.hasNext())
	    	  {
	    	  System.out.println(iterator.next());
	    	  }	    	  
	    	  break;	    	 
	      }
	      case 7:
	      {
	    	  Iterator iterator=postpaid.iterator();
	    	  while(iterator.hasNext())
	    	  {	    		
	    	  System.out.println(iterator.next());
	    	  }    	  
	    	  break;
	      }
	     default:
	     {
	    	 System.out.println("Choose your plan"); 
	     }
	      }
	      System.out.println("Thanks for your message"); 
	 }

}

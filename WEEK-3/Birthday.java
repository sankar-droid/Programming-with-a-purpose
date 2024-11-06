

public class Birthday {
   public static void main(String args[])
   {
	   int n=Integer.parseInt(args[0]);
	   	double[] countarr=new double[n+2];
	   	int trials=Integer.parseInt(args[1]);
	   	double probability=0.0;
	   	for(int i=0;i<trials;i++)
	   	{
	   		boolean[] valid=new boolean[n];
	   		int people=0;
	   	 	while(true)
		   	{
		   		
		   	    int d=(int) (n*Math.random());
		   	    if(valid[d]) { countarr[people] +=1.0; break;}
		   	    valid[d]=true;
		   	    people++;
		   	}
	   	}
	  
	   	int i=0;
	   	double xtrials=(double) trials;
	   	while(probability<0.5)
	   	{
	   		
	   		probability+=countarr[i]/xtrials;
	   		System.out.print(i + 1 + "\t" + (int) countarr[i] + "\t" + probability);
	        System.out.println();
	        i++;
	   		
	   	}
   }
	
   
}



public class BandMatrix {
    public static void main(String args[])
    {
    	int n=Integer.parseInt(args[0]);
    	int width=Integer.parseInt(args[1]);
    	double ex;
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    			ex=(double)(i+j)/2;
    			double rx=(double) Math.pow(Math.abs(i-ex),2);
    			double ry=(double) Math.pow(Math.abs(j-ex),2);
    		    if(Math.sqrt(rx + ry)>width && i!=j)
    		    {
    		    	System.out.print("0  ");
    		    }
    		    else if( i!=j)
    		    {
    		    	System.out.print("*  ");
    		    }
    		    else if(i==j)
    		    {
    		    	System.out.print("*  ");
    		    }
    		   
    		    
    		}
    		
    		System.out.println();
    	}
    }
}

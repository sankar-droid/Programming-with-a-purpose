

public class ThueMorse {
	 public static void main(String[] args) {
	    	int n = Integer.parseInt(args[0]);
	        int[] thueseq = new int[n];
	        thueseq[0] = 0;
	        for (int i = 1; i < n; i++) {
	            if (i % 2 == 0) thueseq[i] = thueseq[i / 2];
	            else thueseq[i] = 1 - thueseq[i - 1];
	        }
	        for (int i = 0; i < n; i++) {
	        	
	        	for(int j=0;j<n;j++)
	        	{
	        		if(thueseq[i]==thueseq[j])
	        		{
	        			System.out.print("+ ");
	        		}
	        		else
	        		{
	        			System.out.print("- ");
	        		}
	        	}
	            System.out.println();
	          }
	        
	    }
}

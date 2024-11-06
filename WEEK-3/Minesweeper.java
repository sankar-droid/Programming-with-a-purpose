

public class Minesweeper {
	public static void main(String args[])
    {
   	 int m=Integer.parseInt(args[0]);
   	 int n=Integer.parseInt(args[1]);
   	 int k=Integer.parseInt(args[2]);
   	 int[][] Mine=new int[m+2][n+2];
   	 boolean[][] landmineplaced=new boolean[m+2][n+2];
   	 int landmine=0,x=0,y=0;
   	 
   	 while(landmine<k)
   	 {
   		 x=(int) (Math.random()*m);
   		 y=(int) (Math.random()*n);
   		 if(!landmineplaced[x][y])
   		 {
   			 Mine[x][y]=-1;
       		 landmineplaced[x][y]=true;
       		 landmine++;
   			 
   		 }
   		
   	 }
   	
   	 for(int i=0;i<m;i++)
   	 {
   		 for(int j=0;j<n;j++)
   		 { 
   			 if(landmineplaced[i][j]==false)
   			 {
   				 int count=0;
       			 for(int a=-1;a<=1;a++)
       			 {
       				 for(int b=-1;b<=1;b++)
       				 {
       					 int row=a+i;
       					 int column=b+j;
       					 if(row>=0 && row<=m && column>=0 && column<=n)
       					 {
       						 if(landmineplaced[row][column]==true && Mine[row][column]==-1)
       						 {
       							 count++;
       						 }
       					 }
       				 }
       			 }
       			 Mine[i][j]=count;
   			 }
   			 
   			 
   		 }
   	 }
   	 for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (Mine[i][j] == -1) {
                    System.out.print("*  ");
                } else {
                    System.out.print(Mine[i][j] + "  ");
                }
            }
            System.out.println();
        }
   	 
    }
}

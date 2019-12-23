
public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j; 
		int n= 4, m = 4;
        for (i = 1; i <= n; i++) 
        { 
            for (j = 1; j <= m; j++) 
            { 
                if (i == 1 || i == n ||  
                    j == 1 || j == m)             
                    System.out.print("$");             
                else
                    System.out.print(" ");             
            } 
            System.out.println(); 
        } 
	}
}

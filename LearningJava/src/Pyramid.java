
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		for(i = 1; i <= 6; i++) 
        { 
  
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop     
            for(j = 65; j <= i; j++) 
            { 
                // printing stars 
                System.out.print(j+" "); 
            } 
  
            // ending line after each row 
            System.out.println(); 
        } 
	}

}


public class AlphabetPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		char start = 'A' - 1;
		
		for(i = 1; i <= 6; i++) 
        { 
  
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop     
            for(j = 1 ; j <= i; j++) 
            { 
                // printing  
            	char ch = (char) (start +j);
                System.out.print(ch+" "); 
            } 
  
            // ending line after each row 
            System.out.println(); 
        } 
	}
	

}

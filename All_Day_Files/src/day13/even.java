package day13;

public class even {
	public static void main(String[] args) {
	
	int[]id= {10,15,20,25,30};
	int count=0;
	
     for(int i=0;i<id.length;i++) {
    	 
    	 if ( id[i] % 2==0)  {
    		 count++;
    	 }
     }
     
     System.out.println("No of Employee ID is even = "+count);
}

}
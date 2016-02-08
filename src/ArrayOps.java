
public class ArrayOps
{
	private int[] data;
	
    public static void main( String [] args )
    {  	
    	
    	int [] input = { 0, 1, -2, -3, 4, 5, -6, -7, 8, 9 };
    	ArrayOps testObj = new ArrayOps( input ); // constructor
    	
    	testObj.display();
    	System.out.println("\nObject's index for the smallest value is : " +testObj.findMin() + "\n" );
    	testObj.reverse();
    	testObj.display();
    	System.out.println("\nObject's index for the smallest value after reverse is : " +testObj.findMin() + "\n" );
   
    }
    
    public ArrayOps (int arg[]) // This is the deep copy using a constructor
    {
    	data = new int[arg.length];
    	for(int i=0; i < arg.length; i++ )
    	{
    		data [i] = arg [i];
    	}
    }
    
    public void display()
    {
    	for(int idx = 0; idx < data.length; idx++)
    	System.out.println(data[idx]);
    }
    
    public int findMin()
    {
    	int minIdx = 0;
    	for(int idx = 1; idx < data.length;idx++)
    	{
    		if(data[idx] <  data[minIdx])
    		{
    			minIdx = idx;
    		}
    	}
    	
    	return minIdx;
    }

    public void reverse()
    {
    	for(int idx =0; idx < data.length/2; idx++)
    	{
    		int tmp = data[idx];
    		data[idx] = data[data.length - 1 - idx];
    		data[data.length - 1 - idx] = tmp;
    		
    	}
    }
        
    
}

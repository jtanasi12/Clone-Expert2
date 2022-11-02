package insertionSort;

public class main 
{
	
	public static void insertionSort(int[] arrayList1)
	{
		
		int temp, key, previous = 0;
		
		for(int index = 1; index < arrayList1.length; ++index)
		{
			
			key = arrayList1[index];
			
			previous = index - 1;
			
			while (previous >= 0 && key < arrayList1[previous])
			{
				
				
				temp = arrayList1[previous];
				arrayList1[previous] = arrayList1[previous + 1];
				arrayList1[previous + 1] = temp;
				
				--previous;
			}
			
		}
		
		for(int v : arrayList1)
			System.out.print(v + " ");
		
		
	}
	
	public static void main(String[] args)
	{
		int [] arrayList1 = {4,2,6,5, 1, 7};
		
		insertionSort(arrayList1);
		
		
		
	}

}

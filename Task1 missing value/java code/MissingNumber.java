public class MissingNumber{
	 void getNumber(int a[],int length)
	 {

		for(int i=0;i<length;i++)
		{
			
			for(int j=i+1;j<length;j++)
			{
				if(a[i]>a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		
		
		}
					
	 }
	 //void getArray(int a[])
	// {
	//	 int length=a.length;
	//	 for(int i=0;i<length;i++)
	//	 {
	//		 System.out.println(a[i]);
	//	 }
	// }
	 
	 void getMissedNumber(int a[])
	 {
		 for(int i=0;i<a.length-1;i++)
		 {
			
				 if(a[i]+1!=a[i+1])
				 {
					 System.out.println( a[i]+1);
					break;
				 }
				 else if(a[i]+1==a[i+1]&&a[i]+1==a[a.length-1])
				 {
					 System.out.println( a[i]+2);
				 break;
				 }

				 
			 
			 
			 
			 
			 
		 }
	 }
	 

}
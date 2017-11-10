package sorting2;
 


public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,4,6,45,4,564,6,36,3,56,3,5}; //provided array
		 for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//lowest index  
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }  
		 for(int i:arr){
			 System.out.print(i+" ");
		 }
	}

}

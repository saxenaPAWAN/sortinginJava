
 


public class bubbleSort {
public static void main(String[] args){
	int[] arr={2,4,6,45,4,564,6,36,3,56,3,5}; //provided array
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<i;j++){
			if(arr[i]<arr[j]){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		
	}
	System.out.println("Sorted Array :");
	for(int k=0;k<arr.length;k++)
		
		System.out.print(arr[k]+" ");
}


}
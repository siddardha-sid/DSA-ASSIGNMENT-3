
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,3,4,6,7,8};
System.out.println(find(a,5));
	}
	public static int find(int[] arr,int target) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
		 int mid=(left+right)/2;
		 if(arr[mid]==target) {
			 return mid;
		 }
		 else if(arr[mid]>target) {
			 right=mid-1;
		 }else {
			 left=mid+1;
		 }
		}
		return left;
	}

}

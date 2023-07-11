import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,1};
int[] a=output(arr);
System.out.println(Arrays.toString(a));
	}
	public static int[] output(int[] arr) {
		int n=arr.length;
		if(arr[n-1]==9) {
			arr[n-2]++;
			arr[n-1]=0;
		}else {
			arr[n-1]++;
		}
		return arr;
	}

}

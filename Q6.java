
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,1};
find(a,a.length);
System.out.println('e'-'a');

	}
	public static void find(int[] arr,int n) {
		int i=1;
		int frequency =1;
		while(i<n) {
			if(arr[i]==arr[i-1]) {
				frequency++;
				i++;
			}
		}
		System.out.println(i-1+" "+frequency);
		}
	}



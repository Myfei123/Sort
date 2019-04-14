package sort;

import java.util.Arrays;

public class Sort {
	
	//—°‘Ò≈≈–Ú
	public int[] select(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			int min = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
				min=j;
				}
			}
		 if(min != i) {
			int temp =a[i];
			a[i] = a[min];
		 	a[min] = temp;
		 }	
	   }
		
		return a;
	}
	public int[] bubble(int[] a) {
		int count =0;
		for(int i=0;i<a.length;i++) {
			boolean tag = false;
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]>a[j]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
					tag = true;
					
				}
			}
			count++;
			System.out.println("≈≈–Ú¥Œ ˝£∫"+count);
			if(!tag) {
				return a;
			}
		}
		return a;
	}
	//÷±Ω”≤Â»Î≈≈–Ú
	public int[] insert(int[] a) {
		for(int i=1;i<a.length-1;i++) {
			for(int j=i;j>0;j--) {
				if(a[j]<a[j-1]) {
				  int temp = a[j];
				  a[j] = a[j+1];
				  a[j+1] = temp;
			    }
			}
			
		}
		return a;
	}
   //œ£∂˚≈≈–Ú
	public int[] shell(int[] a) {
		int d=1;
		while(d<a.length/3) {
			d = 3*d+1;
		}
		while(d>=1) {
			for(int i=d;i<a.length;i++) {
			  for(int j=i;j>=d;j-=d) {
				if(a[j]<a[j-d]) {
					 int temp = a[j];
					  a[j] = a[j-d];
					  a[j-d] = temp;
				 }
			   }	   
			}
			
			d = d/3;
		}	
		return a;
	}
	/*public String toString(int[] a) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		for(int k = 0;k<a.length;k++) {
			buffer.append(a[k]);
		}
		buffer.append("]");
		return buffer.toString();
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort s= new Sort();
		int[] a= new int[] {3,1,4,5,2,0};
		//System.out.println(Arrays.toString(s.select(a)));
		int[] b= new int[]{1,2,3,5,4};
		System.out.println(Arrays.toString(s.bubble(b)));
		int[] c= new int[]{5,11,7,9,2,3,12,8,6,1,4,10};
		System.out.println("œ£∂˚£∫"+Arrays.toString(s.shell(c)));
		
	}

}

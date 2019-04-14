package sort;

import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.awt.Adjustable;

public class HeapSort {
	
	public int[] bulidMax(int[] array) {
		for(int i=(array.length-1-1)/2;i>=0;i--) {
			adjust(array,i,array.length);
		}
		return array;
	}
	public void adjust(int[] array,int k,int length) {
		 int temp = array[k];
		 for(int i=2*k+1;i<length-1;i=2*i+1) {
			 
			 if(!"".equals(array[i+1])  && array[i]<array[i+1]) {
				 i++;
			 }
			 if(temp>=array[i]) {
				 break;
			 }else {
				 array[k] = array[i];
				 k = i;
			 }
		 }
		 array[k] = temp;
	}
	
	public int[] heapSort(int[] array) {
		array = bulidMax(array);
		for(int i=array.length-1;i>=1;i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			
			adjust(array, 0, i);
		}
		return array;
	}
	public void toString(int[] array){
		 for(int i:array){
		 System.out.print(i+" ");
	}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapSort hs = new HeapSort();
		//int[] array = {87,45,78,32,17,65,53,9,122};
		int[] array = {87,45,78,32,17,65,53,9,122,133};
		System.out.print("构建大根堆：");
		hs.toString(hs.bulidMax(array));
		//System.out.print("\n"+"删除堆顶元素：");
		//hs.toString(hs.deleteMax(array));
		//System.out.print("\n"+"插入元素63:");
		//hs.toString(hs.insertData(array, 63));
		System.out.print("\n"+"大根堆排序：");
		hs.toString(hs.heapSort(array));  

	}

}

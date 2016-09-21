package prob1;

public class Sort {
	public static void main(String[] arg) {
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count =  array.length;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		
		for(int j = 0 ; j < count - 1 ; j++){
			for(int i = 0 ; i < count - 1 - j; i++){
				if( array[i] < array[i+1] ){
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}

		
		System.out.println( "\nAfter Sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}
}

//Author Peter Adamson

public class Assn3Q1Sort{

	public static void sort(int[] toSort){
		
		Assn3Q1Stack myStack = new Assn3Q1Stack();
		int i, j, maxIndex, tmp;

		for(i = toSort.length - 1; i > 0; i--){
			maxIndex = i;
			for(j = i -1; j >= 0; j--){
				if(toSort[j] > toSort[maxIndex]){
					maxIndex = j;
				}
			}
			if(maxIndex != i){
				tmp = toSort[i];
				toSort[i] = toSort[maxIndex];
				toSort[maxIndex] = tmp;
				
			}
			myStack.push(toSort[i]);	
		}
		myStack.push(toSort[0]);

		while(!myStack.empty()){
			System.out.println(myStack.pop());
		}
	}
}

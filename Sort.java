public class Sort implements SortInterface 
{
	// constructor
	public Sort() {

	}
	/* This method sorts the array using bubble sort
	@param an array to be sorted
	@param an integer representing the lowest index
	@param an integer representing the highest index
	@param a boolean determining if the array should be sorted min to max or max to min
	*/
	public void bubbleSort(int[] array, int lowindex, int highindex, boolean reversed) 
	{

		// if reversed is false
		if (!reversed) {
				
			int length = array.length;
			// looks at range from low index to high index
       		for (int i = lowindex; i <= highindex; i++) 
            for (int j = lowindex; j < highindex; j++) 
                if (array[j] > array[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp; 
                }

		}
		else {
			// goes from max to min
			int length = array.length;
       		for (int i = lowindex; i <= highindex; i++) 
           	for (int j = lowindex; j < highindex; j++) 
		// if the second element is bigger, put it in the front
                if (array[j] < array[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp; 
                } 
		}

	}
	
	/* This method sorts the array using selection sort
	@param an array to be sorted
	@param an integer representing the lowest index
	@param an integer representing the highest index
	@param a boolean determining if the array should be sorted min to max or max to min
	*/
    public void selectionSort(int[] array, int lowindex, int highindex, boolean reversed)
    {

    	if (!reversed) {
    				
    		for (int i = lowindex; i <= highindex; i++) {
    			int minPos = i;
				for (int j = i + 1; j <= highindex; j++) {
					if (array[j] < array[minPos]) { 
						minPos = j; 
					} 
				}
				// swaps elements if the element is smaller than the current minimum position
				int temp = array[i];
				array[i] = array[minPos];
				array[minPos] = temp; 
			}
    	}
    	else {
    			
    		for (int i = lowindex; i <= highindex; i++) {
				int minPos = i;
				for (int j = i + 1; j <= highindex; j++) {
					if (array[j] > array[minPos]) { 
						minPos = j; 
					} 
				}
				// swaps elements if the element is bigger than the current minimum position
				int temp = array[i];
				array[i] = array[minPos];
				array[minPos] = temp; 
			}

    	}

    }
    
    /* This method sorts the array using merge sort
	@param an array to be sorted
	@param an integer representing the lowest index
	@param an integer representing the highest index
	@param a boolean determining if the array should be sorted min to max or max to min
	*/
    public void mergeSort(int[] array, int lowindex, int highindex, boolean reversed)
    {

    	if (!reversed) {
		// base case for recursive
    		if (array.length <= 1) 
    		{ 
    			
    		}
    		else {
    			int mid = lowindex + ((highindex - lowindex) / 2);
				// separates into two arrays only within the range
 				int[] first = new int[(highindex - lowindex) / 2];
 				int[] second = new int[highindex - first.length];
 			// Copy the first half of a into first, the second half into second
 			for (int i = 0; i < first.length; i++)
 			{
 				first[i] = array[i + lowindex];
 			}
 			for(int j = 0; j < second.length; j++)
 			{
 				second[j] = array[mid + j];
 			}
			// recursive until both arrays are sorted
 			mergeSort(first, 0, first.length, false);
 			mergeSort(second, 0, second.length, false);
 				int iFirst = 0; 
				int iSecond = 0;
				int j = lowindex;
				// merges both first and second arrays
		while (iFirst < first.length && iSecond < second.length)
		{
			// adds element if it is smaller than the other element
			 if (first[iFirst] < second[iSecond]) {
			 	array[j] = first[iFirst]; 
			 	iFirst++; 
				}
			else {
				array[j] = second[iSecond]; 
				iSecond++;
			}
				j++; 
		}
		// adds any remaining elements from the first and second arrays into the array
		while (iFirst < first.length)
			{
				array[j] = first[iFirst];
				iFirst++; 
				j++; 
			}
		while (iSecond < second.length) {
			array[j] = second[iSecond];
			iSecond++; 
			j++; 
		}

	}
		

		}
		
		else {
    		
			if (array.length <= 1) 
    		{ 
    			
    		}
    		else {
    			int mid = lowindex + ((highindex - lowindex) / 2);
 			int[] first = new int[(highindex - lowindex) / 2];
 			int[] second = new int[highindex - first.length];
 			// Copy the first half of a into first, the second half into second
 			for (int i = 0; i < first.length; i++)
 			{
 				first[i] = array[i + lowindex];
 			}
 			for(int j = 0; j < second.length; j++)
 			{
 				second[j] = array[mid + j];
 			}
			// recursive call which is true this time for reversed
 			mergeSort(first, 0, first.length, true);
 			mergeSort(second, 0, second.length, true);
 				int iFirst = 0; 
				int iSecond = 0;
				int j = lowindex;
		while (iFirst < first.length && iSecond < second.length)
		{
			 // adds element if it is bigger than the other element
			 if (first[iFirst] > second[iSecond]) {
			 	array[j] = first[iFirst]; 
			 	iFirst++; 
				}
			else {
				array[j] = second[iSecond]; 
				iSecond++;
			}
				j++; 
		}
		while (iFirst < first.length)
			{
				array[j] = first[iFirst];
				iFirst++; 
				j++; 
			}
		while (iSecond < second.length) {
			array[j] = second[iSecond];
			iSecond++; 
			j++; 
		}
		}	

    		}


    	}

    }

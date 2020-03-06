import java.util.Arrays;
public class SortTester {
	
	public static void main (String[] args) {

		// 100, 1000, 5000, 10000, 50000, 75000, 100000 and 500000
		// BubbleSort time
		long startTime, endTime; 
		double duration; 
		int num = 5;
		int[] a = new int[100];
		startTime = System.currentTimeMillis(); 
		for(int i = 0; i < num; i++) {
			for (int j = 0; j < a.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a[j] = k;
			}
			Sort s = new Sort();
			s.bubbleSort(a, 2, 99, false);
			System.out.println(Arrays.toString(a));
		}

		endTime = System.currentTimeMillis();
		duration = ((double) (endTime - startTime)) / num;
		long start, end;
		double setupTime;
		start = System.currentTimeMillis(); 
		for(int h = 0; h < num; h++) 
			{ 
				for (int j=0; j < a.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a[j] = k;
				}

			} 
		end = System.currentTimeMillis(); 
		setupTime = ((double) (end - start)) / num;
		System.out.println("[100] Bubble Sort Time is " + (duration - setupTime));

		long startTime2, endTime2; 
		double duration2; 
		int[] a2 = new int[1000];
		startTime2 = System.currentTimeMillis(); 
		for(int i = 0; i < num; i++) {
			for (int j = 0; j < a2.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a2[j] = k;
			}
			Sort s = new Sort();
			s.bubbleSort(a2, 0, 999, false);
			//System.out.println(Arrays.toString(a));
		}

		endTime2 = System.currentTimeMillis();
		duration2 = ((double) (endTime2 - startTime2)) / num;
		long start2, end2;
		double setupTime2;
		start2 = System.currentTimeMillis(); 
		for(int h = 0; h < num; h++) 
			{ 
				for (int j=0; j < a2.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a2[j] = k;
				}

			} 
		end2 = System.currentTimeMillis(); 
		setupTime2 = ((double) (end2 - start2)) / num;
		System.out.println("[1000] Bubble Sort Time is " + (duration2 - setupTime2));

		long startTime3, endTime3; 
		double duration3; 
		int[] a3 = new int[5000];
		startTime3 = System.currentTimeMillis(); 
		for(int i = 0; i < num; i++) {
			for (int j = 0; j < a3.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a3[j] = k;
			}
			Sort s = new Sort();
			s.bubbleSort(a3, 0, 4999, false);
			//System.out.println(Arrays.toString(a));
		}

		endTime3 = System.currentTimeMillis();
		duration3 = ((double) (endTime3 - startTime3)) / num;
		long start3, end3;
		double setupTime3;
		start3 = System.currentTimeMillis(); 
		for(int h = 0; h < num; h++) 
			{ 
				for (int j=0; j < a3.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a3[j] = k;
				}

			} 
		end3 = System.currentTimeMillis(); 
		setupTime3 = ((double) (end3 - start3)) / num;
		System.out.println("[5000] Bubble Sort Time is " + (duration3 - setupTime3));

		long startTime4, endTime4; 
		double duration4; 
		num = 1;
		int[] a4 = new int[10000];
		startTime4 = System.currentTimeMillis(); 
		for(int i = 0; i < num; i++) {
			for (int j = 0; j < a4.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a4[j] = k;
			}
			Sort s = new Sort();
			s.bubbleSort(a4, 0, 9999, false);
			//System.out.println(Arrays.toString(a));
		}

		endTime4 = System.currentTimeMillis();
		duration4 = ((double) (endTime4 - startTime4)) / num;
		long start4, end4;
		double setupTime4;
		start4 = System.currentTimeMillis(); 
		for(int h = 0; h < num; h++) 
			{ 
				for (int j=0; j < a4.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a4[j] = k;
				}

			} 
		end4 = System.currentTimeMillis(); 
		setupTime4 = ((double) (end4 - start4)) / num;
		System.out.println("[10000] Bubble Sort Time is " + (duration4 - setupTime4));

		long startTime5, endTime5; 
		double duration5; 
		num = 1;
		int[] a5 = new int[50000];
		startTime5 = System.currentTimeMillis(); 
		for(int i = 0; i < num; i++) {
			for (int j = 0; j < a5.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a5[j] = k;
			}
			Sort s = new Sort();
			s.bubbleSort(a5, 0, 49999, false);
			//System.out.println(Arrays.toString(a));
		}

		endTime5 = System.currentTimeMillis();
		duration5 = ((double) (endTime5 - startTime5)) / num;
		long start5, end5;
		double setupTime5;
		start5 = System.currentTimeMillis(); 
		for(int h = 0; h < num; h++) 
			{ 
				for (int j=0; j < a5.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a5[j] = k;
				}

			} 
		end5 = System.currentTimeMillis(); 
		setupTime5 = ((double) (end5 - start5)) / num;
		System.out.println("[50000] Bubble Sort Time is " + (duration5 - setupTime5));

		long startTime6, endTime6; 
		double duration6; 
		num = 1;
		int[] a6 = new int[75000];
		startTime6 = System.currentTimeMillis(); 
		for(int i = 0; i < num; i++) {
			for (int j = 0; j < a6.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a6[j] = k;
			}
			Sort s = new Sort();
			s.bubbleSort(a6, 0, 74999, false);
			//System.out.println(Arrays.toString(a));
		}

		endTime6 = System.currentTimeMillis();
		duration6 = ((double) (endTime6 - startTime6)) / num;
		long start6, end6;
		double setupTime6;
		start6 = System.currentTimeMillis(); 
		for(int h = 0; h < num; h++) 
			{ 
				for (int j=0; j < a6.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a6[j] = k;
				}

			} 
		end6 = System.currentTimeMillis(); 
		setupTime6 = ((double) (end6 - start6)) / num;
		System.out.println("[75000] Bubble Sort Time is " + (duration6 - setupTime6));

		long startTime7, endTime7; 
		double duration7; 
		num = 1;
		int[] a7 = new int[100000];
		startTime7 = System.currentTimeMillis(); 
		for(int i = 0; i < num; i++) {
			for (int j = 0; j < a7.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a7[j] = k;
			}
			Sort s = new Sort();
			s.bubbleSort(a7, 0, 99999, false);
			//System.out.println(Arrays.toString(a));
		}

		endTime7 = System.currentTimeMillis();
		duration7 = ((double) (endTime7 - startTime7)) / num;
		long start7, end7;
		double setupTime7;
		start7 = System.currentTimeMillis(); 
		for(int h = 0; h < num; h++) 
			{ 
				for (int j=0; j < a7.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a7[j] = k;
				}

			} 
		end7 = System.currentTimeMillis(); 
		setupTime7 = ((double) (end7 - start7)) / num;
		System.out.println("[100000] Bubble Sort Time is " + (duration7 - setupTime7));

		long startTime8, endTime8; 
		double duration8; 
		num = 1;
		int[] a8 = new int[500000];
		startTime8 = System.currentTimeMillis(); 
		for(int i = 0; i < num; i++) {
			for (int j = 0; j < a8.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a8[j] = k;
			}
			Sort s = new Sort();
			s.bubbleSort(a8, 0, 499999, false);
			//System.out.println(Arrays.toString(a));
		}

		endTime8 = System.currentTimeMillis();
		duration8 = ((double) (endTime8 - startTime8)) / num;
		long start8, end8;
		double setupTime8;
		start8 = System.currentTimeMillis(); 
		for(int h = 0; h < num; h++) 
			{ 
				for (int j=0; j < a8.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a8[j] = k;
				}

			} 
		end8 = System.currentTimeMillis(); 
		setupTime8 = ((double) (end8 - start8)) / num;
		System.out.println("[500000] Bubble Sort Time is " + (duration8 - setupTime8));
		

		// SelectionSort time
		long startTime9, endTime9;
		double duration9;
		int num2 = 5;
		int[] a9 = new int[100];
		startTime9 = System.currentTimeMillis(); 
		for(int i = 0; i < num2; i++) {
			for (int j = 0; j < a9.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a9[j] = k;
			}
			Sort s2 = new Sort();
				s2.selectionSort(a9, 0, 99, false);
		}
		System.out.println(Arrays.toString(a9));

		endTime9 = System.currentTimeMillis();
		duration9 = ((double) (endTime9 - startTime9)) / num2;
		long start9, end9;
		double setupTime9;
		start9 = System.currentTimeMillis(); 
		for(int h = 0; h < num2; h++) 
			{ 
				for (int j=0; j < a9.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a9[j] = k;
				}

			} 
		end9 = System.currentTimeMillis(); 
		setupTime9 = ((double) (end9 - start9)) / num2;
		System.out.println("[100] Selection Sort Time is " + (duration9 - setupTime9));


		int[] a10 = new int[1000];
		startTime9 = System.currentTimeMillis(); 
		for(int i = 0; i < num2; i++) {
			for (int j = 0; j < a10.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a10[j] = k;
			}
			Sort s2 = new Sort();
				s2.selectionSort(a10, 0, 999, false);
				//System.out.println(Arrays.toString(a2));
		}

		endTime9 = System.currentTimeMillis();
		duration9 = ((double) (endTime9 - startTime9)) / num2;
		start9 = System.currentTimeMillis(); 
		for(int h = 0; h < num2; h++) 
			{ 
				for (int j=0; j < a10.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a10[j] = k;
				}

			} 
		end9 = System.currentTimeMillis(); 
		setupTime9 = ((double) (end9 - start9)) / num2;
		System.out.println("[1000] Selection Sort Time is " + (duration9 - setupTime9));


		int[] a11 = new int[5000];
		startTime9 = System.currentTimeMillis(); 
		for(int i = 0; i < num2; i++) {
			for (int j = 0; j < a11.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a11[j] = k;
			}
			Sort s2 = new Sort();
				s2.selectionSort(a11, 0, 4999, false);
				//System.out.println(Arrays.toString(a2));
		}

		endTime9 = System.currentTimeMillis();
		duration9 = ((double) (endTime9 - startTime9)) / num2;
		start9 = System.currentTimeMillis(); 
		for(int h = 0; h < num2; h++) 
			{ 
				for (int j=0; j < a11.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a11[j] = k;
				}

			} 
		end9 = System.currentTimeMillis(); 
		setupTime9 = ((double) (end9 - start9)) / num2;
		System.out.println("[5000] Selection Sort Time is " + (duration9 - setupTime9));

		int[] a12 = new int[10000];
		startTime9 = System.currentTimeMillis(); 
		for(int i = 0; i < num2; i++) {
			for (int j = 0; j < a12.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a12[j] = k;
			}
			Sort s2 = new Sort();
				s2.selectionSort(a12, 0, 9999, false);
				//System.out.println(Arrays.toString(a2));
		}

		endTime9 = System.currentTimeMillis();
		duration9 = ((double) (endTime9 - startTime9)) / num2;
		start9 = System.currentTimeMillis(); 
		for(int h = 0; h < num2; h++) 
			{ 
				for (int j=0; j < a12.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a12[j] = k;
				}

			} 
		end9 = System.currentTimeMillis(); 
		setupTime9 = ((double) (end9 - start9)) / num2;
		System.out.println("[10000] Selection Sort Time is " + (duration9 - setupTime9));
		

		num = 1;
		int[] a13 = new int[50000];
		startTime9 = System.currentTimeMillis(); 
		for(int i = 0; i < num2; i++) {
			for (int j = 0; j < a13.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a13[j] = k;
			}
			Sort s2 = new Sort();
				s2.selectionSort(a13, 0, 49999, false);
				//System.out.println(Arrays.toString(a2));
		}

		endTime9 = System.currentTimeMillis();
		duration9 = ((double) (endTime9 - startTime9)) / num2;
		start9 = System.currentTimeMillis(); 
		for(int h = 0; h < num2; h++) 
			{ 
				for (int j=0; j < a13.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a13[j] = k;
				}

			} 
		end9 = System.currentTimeMillis(); 
		setupTime9 = ((double) (end9 - start9)) / num2;
		System.out.println("[50000] Selection Sort Time is " + (duration9 - setupTime9));

		int[] a14 = new int[75000];
		startTime9 = System.currentTimeMillis(); 
		for(int i = 0; i < num2; i++) {
			for (int j = 0; j < a14.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a14[j] = k;
			}
			Sort s2 = new Sort();
				s2.selectionSort(a14, 0, 74999, false);
				//System.out.println(Arrays.toString(a2));
		}

		endTime9 = System.currentTimeMillis();
		duration9 = ((double) (endTime9 - startTime9)) / num2;
		start9 = System.currentTimeMillis(); 
		for(int h = 0; h < num2; h++) 
			{ 
				for (int j=0; j < a14.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a14[j] = k;
				}

			} 
		end9 = System.currentTimeMillis(); 
		setupTime9 = ((double) (end9 - start9)) / num2;
		System.out.println("[75000] Selection Sort Time is " + (duration9 - setupTime9));

		
		int[] a15 = new int[100000];
		startTime9 = System.currentTimeMillis(); 
		for(int i = 0; i < num2; i++) {
			for (int j = 0; j < a15.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a15[j] = k;
			}
			Sort s2 = new Sort();
				s2.selectionSort(a15, 0, 99999, false);
				//System.out.println(Arrays.toString(a2));
		}

		endTime9 = System.currentTimeMillis();
		duration9 = ((double) (endTime9 - startTime9)) / num2;
		start9 = System.currentTimeMillis(); 
		for(int h = 0; h < num2; h++) 
			{ 
				for (int j=0; j < a15.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a15[j] = k;
				}

			} 
		end9 = System.currentTimeMillis(); 
		setupTime9 = ((double) (end9 - start9)) / num2;
		System.out.println("[100000] Selection Sort Time is " + (duration9 - setupTime9));

		int[] a16 = new int[500000];
		startTime9 = System.currentTimeMillis(); 
		for(int i = 0; i < num2; i++) {
			for (int j = 0; j < a16.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a16[j] = k;
			}
			Sort s2 = new Sort();
				s2.selectionSort(a16, 0, 499999, false);
				//System.out.println(Arrays.toString(a2));
		}

		endTime9 = System.currentTimeMillis();
		duration9 = ((double) (endTime9 - startTime9)) / num2;
		start9 = System.currentTimeMillis(); 
		for(int h = 0; h < num2; h++) 
			{ 
				for (int j=0; j < a16.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a16[j] = k;
				}

			} 
		end9 = System.currentTimeMillis(); 
		setupTime9 = ((double) (end9 - start9)) / num2;
		System.out.println("[500000] Selection Sort Time is " + (duration9 - setupTime9));
		

		// mergeSort time
		int num3 = 10;
		long startTime10, endTime10; 
		double duration10;
		int[] a17 = new int[100];
		startTime10 = System.currentTimeMillis(); 
		for(int i = 0; i < num3; i++) {
			for (int j = 0; j < a17.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a17[j] = k;
			}
			Sort s = new Sort();
			s.mergeSort(a17, 0, 100, false);
		}
		System.out.println(Arrays.toString(a17));

		endTime10 = System.currentTimeMillis();
		duration10 = ((double) (endTime10 - startTime10)) / num3;
		long start10, end10;
		double setupTime10;
		start10 = System.currentTimeMillis(); 
		for(int h = 0; h < num3; h++) 
			{ 
				for (int j=0; j < a17.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a17[j] = k;
				}

			} 
		end10 = System.currentTimeMillis(); 
		setupTime10 = ((double) (end10 - start10)) / num3;
		System.out.println("[100] Merge Sort Time is " + (duration10 - setupTime10));


		int[] a18 = new int[1000];
		startTime10 = System.currentTimeMillis(); 
		for(int i = 0; i < num3; i++) {
			for (int j = 0; j < a18.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a18[j] = k;
			}
			Sort s = new Sort();
			s.mergeSort(a18, 0, 1000, false);
		}

		endTime10 = System.currentTimeMillis();
		duration10 = ((double) (endTime10 - startTime10)) / num3;
		start10 = System.currentTimeMillis(); 
		for(int h = 0; h < num3; h++) 
			{ 
				for (int j=0; j < a18.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a18[j] = k;
				}

			} 
		end10 = System.currentTimeMillis(); 
		setupTime10 = ((double) (end10 - start10)) / num3;
		System.out.println("[1000] Merge Sort Time is " + (duration10 - setupTime10));

		int[] a19 = new int[5000];
		startTime10 = System.currentTimeMillis(); 
		for(int i = 0; i < num3; i++) {
			for (int j = 0; j < a19.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a19[j] = k;
			}
			Sort s = new Sort();
			s.mergeSort(a19, 0, 5000, false);
		}

		endTime10 = System.currentTimeMillis();
		duration10 = ((double) (endTime10 - startTime10)) / num3;
		start10 = System.currentTimeMillis(); 
		for(int h = 0; h < num3; h++) 
			{ 
				for (int j=0; j < a19.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a19[j] = k;
				}

			} 
		end10 = System.currentTimeMillis(); 
		setupTime10 = ((double) (end10 - start10)) / num3;
		System.out.println("[5000] Merge Sort Time is " + (duration10 - setupTime10));

		int[] a20 = new int[10000];
		startTime10 = System.currentTimeMillis(); 
		for(int i = 0; i < num3; i++) {
			for (int j = 0; j < a20.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a20[j] = k;
			}
			Sort s = new Sort();
			s.mergeSort(a20, 0, 10000, false);
		}

		endTime10 = System.currentTimeMillis();
		duration10 = ((double) (endTime10 - startTime10)) / num3;
		start10 = System.currentTimeMillis(); 
		for(int h = 0; h < num3; h++) 
			{ 
				for (int j=0; j < a20.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a20[j] = k;
				}

			} 
		end10 = System.currentTimeMillis(); 
		setupTime10 = ((double) (end10 - start10)) / num3;
		System.out.println("[10000] Merge Sort Time is " + (duration10 - setupTime10));


		int[] a21 = new int[50000];
		startTime10 = System.currentTimeMillis(); 
		for(int i = 0; i < num3; i++) {
			for (int j = 0; j < a21.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a21[j] = k;
			}
			Sort s = new Sort();
			s.mergeSort(a21, 0, 50000, false);
		}

		endTime10 = System.currentTimeMillis();
		duration10 = ((double) (endTime10 - startTime10)) / num3;
		start10 = System.currentTimeMillis(); 
		for(int h = 0; h < num3; h++) 
			{ 
				for (int j=0; j < a21.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a21[j] = k;
				}

			} 
		end10 = System.currentTimeMillis(); 
		setupTime10 = ((double) (end10 - start10)) / num3;
		System.out.println("[50000] Merge Sort Time is " + (duration10 - setupTime10));


		int[] a22 = new int[75000];
		startTime10 = System.currentTimeMillis(); 
		for(int i = 0; i < num3; i++) {
			for (int j = 0; j < a22.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a22[j] = k;
			}
			Sort s = new Sort();
			s.mergeSort(a22, 0, 75000, false);
		}

		endTime10 = System.currentTimeMillis();
		duration10 = ((double) (endTime10 - startTime10)) / num3;
		start10 = System.currentTimeMillis(); 
		for(int h = 0; h < num3; h++) 
			{ 
				for (int j=0; j < a22.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a22[j] = k;
				}

			} 
		end10 = System.currentTimeMillis(); 
		setupTime10 = ((double) (end10 - start10)) / num3;
		System.out.println("[75000] Merge Sort Time is " + (duration10 - setupTime10));


		int[] a23 = new int[100000];
		startTime10 = System.currentTimeMillis(); 
		for(int i = 0; i < num3; i++) {
			for (int j = 0; j < a23.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a23[j] = k;
			}
			Sort s = new Sort();
			s.mergeSort(a23, 0, 100000, false);
		}

		endTime10 = System.currentTimeMillis();
		duration10 = ((double) (endTime10 - startTime10)) / num3;
		start10 = System.currentTimeMillis(); 
		for(int h = 0; h < num3; h++) 
			{ 
				for (int j=0; j < a23.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a23[j] = k;
				}

			} 
		end10 = System.currentTimeMillis(); 
		setupTime10 = ((double) (end10 - start10)) / num3;
		System.out.println("[100000] Merge Sort Time is " + (duration10 - setupTime10));

		int[] a24 = new int[500000];
		startTime10 = System.currentTimeMillis(); 
		for(int i = 0; i < num3; i++) {
			for (int j = 0; j < a24.length; j++) {
				int k = (int) (Math.random() * 100) + 1;
				a24[j] = k;
			}
			Sort s = new Sort();
			s.mergeSort(a24, 0, 500000, false);
		}

		endTime10 = System.currentTimeMillis();
		duration10 = ((double) (endTime10 - startTime10)) / num3;
		start10 = System.currentTimeMillis(); 
		for(int h = 0; h < num3; h++) 
			{ 
				for (int j=0; j < a24.length; j++) {
					int k = (int) (Math.random() * 100) + 1;
					a24[j] = k;
				}

			} 
		end10 = System.currentTimeMillis(); 
		setupTime10 = ((double) (end10 - start10)) / num3;
		System.out.println("[500000] Merge Sort Time is " + (duration10 - setupTime10));
		

	}

	}

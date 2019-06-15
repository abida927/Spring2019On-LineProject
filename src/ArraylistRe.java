

import java.util.ArrayList;
		import java.util.Arrays;

public class ArraylistRe {


		

			
			public static void main(String[] args) {
				
				/*
				 Array: size is fixed.  supports primitives, wrapper class and objects  (immutable)
				 */
				
				
				int[] arr= {1,2,34,5};
				Integer[] arr2 = {1,2,3, null};
				
				int[] arr3=new int[4];
				
				/*
				 ArrayList: does not support primitives,  size is not fixed.     (mutable version of array).
				 */
				
				ArrayList<Integer> list1 = new ArrayList<>();
				
				
				// add( ) ,   remove(). get(), set(), sort(), clear()
				
				
				// add(value));  any value u give in arraylist is not primitive
				ArrayList<Integer> list2= new ArrayList<>();
						list2.add( new Integer(1) );   // 1 is converted to Integer    (Autoboxing)
						list2.add(2);
				
				
					// add(index position, value)
				
					//	list2.add(3, 8);   // 
						System.out.println(list2);
				
						
							// get(index number) : gets the index from the lisdt
								// print 2: 
						System.out.println(list2.get(1));
						
			
				// remove(): 	 removes index , or delets value.	
						
						ArrayList<Integer> list3 =new ArrayList<Integer>();
									list3.add(10);
									list3.add(2);
									list3.add(4);
						
									// remove 2 from the list:  remove(index num)
										//   list3.remove(  1  );
											// primitives in remove method it will remove the index of the arrayliist
									
										Integer a=2;
									list3.remove(a);  // wrapepr class in remove method  will remove the value
										System.out.println(list3);
				
									
										Integer b=10;								
									boolean b1 =	list3.remove(b);
										System.out.println(b1);
										
										System.out.println(list3);
										
										Integer b2=20;								
										boolean b3 =	list3.remove(b2);
										System.out.println(b3);
										
										
							
			ArrayList<String> arrlist=new ArrayList<String>(Arrays.asList("A","B","C", "D","E","F","J"));		
										
										
								arrlist.remove("B");		
								System.out.println(arrlist);
										
							if( arrlist.remove("1") ) {
								arrlist.remove("J");
							}
							
							
							
							System.out.println(arrlist);
							
							
					
										
			}
			
			

		}

import org.junit.Test;

public class SortingTest extends Sorting {
	@Test
	public void test() {  
			    class ArrayBubble{
				    private long[] a;   
				    private int elems;  

				    public ArrayBubble(int max){   
				        a = new long[max];          
				        elems = 0;                 
				    }

				    public void into(long value){  
				        a[elems] = value;          
				        elems++;                  
				    }

				    String mas1 = "";
				    
				    public void setter(){         
				        for (int i = 0; i < elems; i++){
				        	mas1 = mas1 + a[i] + " ";
				        }
				    }
				    
				    String mas = "";

				    int counter = 0;
				    
				    
				    public void printer(){          
				        for (int i = 0; i < elems; i++){
				        	mas = mas + a[i] + " ";
				        	while (i > 0 && i < 6) {
				        	if (a[i] > a[i-1]) {
				        		counter++;
					        	break;
				        	}
				        	}
				        }  
			        	if (a[0] < a[1]) {
			        		counter++;
			        	}
					    int actual = counter; int expected = 5;
					    if (actual == expected) {
					    	System.out.println(mas1);
					    	System.out.println(mas);
					    	System.out.println("Пузырьковая сортировка рабоатет верно");
					    }
					    
					    
				    }
				    
				    private void toSwap(int first, int second){ 
				        long dummy = a[first];     
				        a[first] = a[second];       
				        a[second] = dummy;         
				    }

				    public void bubbleSorter(){   
				        for (int out = elems - 1; out >= 1; out--){  
				            for (int in = 0; in < out; in++){       
				                if(a[in] > a[in + 1])               
				                    toSwap(in, in + 1);          
				            }
				        }
				    }
				    
				}
			    ArrayBubble array = new ArrayBubble(5); 
		        array.into(163);      
		        array.into(2);
		        array.into(184);
		        array.into(191);
		        array.into(174);
		        array.setter(); 
		        array.bubbleSorter();       
		        array.printer(); 
		        //array.print();
			}
	
		}
				



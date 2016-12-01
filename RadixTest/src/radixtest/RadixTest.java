package radixtest;

// IMPORT ARRAYLIST
import java.util.ArrayList;

public class RadixTest {

    public static void main(String[] args) {
        int[] ia = {420, 1, 23, 44, 84, 100, 69, 777, 34, 8945, 3456, 45, 234 ,656}; // ia = integer array for input
     
        ia=radix(ia);
     
    }
    
    /**
     * Radix method used to sort integer arrays
     * @param rsa
     * @param maxDigit
     * @return 
     */
    public static int[] radix(int[] ia) {
        // DECLARATIONS
        int maxDigit=0; // set max Digit to zero. Max Digit is used for determining the max number of digits
        String[] sa = new String[ia.length]; // sa = string array for input
        String[] rsa = new String[ia.length]; // rsa = string array for the reversed input
        char[] ca = "0123456789".toCharArray(); // make a character array of characters ranging from 0 to 9
        
        
        // FOR LOOP FOR MAX DIGIT DETERMINATION AND TO MAKE STRING ARRAY
        for(int i=0; i<ia.length; i++){
            sa[i]=Integer.toString(ia[i]);// make a string array
            if(maxDigit<sa[i].length()){  // if max digit is less than the number of digits in the element
                maxDigit=sa[i].length();  // change the maxDigit value to that higher amount
            }
        }
         
        // MAKE A STRING ARRAY OF REVERSED INPUT
        for(int i=0; i<sa.length; i++){
            rsa[i]=reverseOrder(sa[i]);
            System.out.print(rsa[i]+", ");
        }

        // MAKE ALL THE BUCKET ARRAY LISTS
        ArrayList<String> list0 = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();
        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<String>();
        ArrayList<String> list6 = new ArrayList<String>();
        ArrayList<String> list7 = new ArrayList<String>();
        ArrayList<String> list8 = new ArrayList<String>();
        ArrayList<String> list9 = new ArrayList<String>();

        // MAKE THE MEGA LIST THAT ALL THE BUCKETS WILL POUR INTO
        ArrayList<String> megaList = new ArrayList<String>();

        for (int j = 0; j < maxDigit; j++) {
            // SORT THE j COLOUMN
            for (int i = 0;  i < rsa.length; i++) {
              
                if (rsa[i].length() < j + 1) {
                    list0.add(rsa[i]);
                    
                } else {
                   switch(rsa[i].charAt(j)){
                       case '0': 
                           list0.add(rsa[i]);
                           break;
                           
                       case '1':
                           list1.add(rsa[i]);
                           break;
                         
                        case '2':
                           list2.add(rsa[i]);
                           break;
                        
                        case '3':
                           list3.add(rsa[i]);
                           break;
                            
                        case '4':
                           list4.add(rsa[i]);
                           break;
                            
                        case '5':
                           list5.add(rsa[i]);
                           break;
                            
                        case '6':
                           list6.add(rsa[i]);
                           break;
                            
                        case '7':
                           list7.add(rsa[i]);
                           break;
                            
                        case '8':
                           list8.add(rsa[i]);
                           break;
                            
                        case '9':
                           list9.add(rsa[i]);
                           break;    
                        default: 
                        System.out.println("WWWWWHAT!?> THIS WASN'T SUUPOSED TO PRINT EVER! " + rsa[i]);
                           break; 
                }
            }
            }
            // ADD ALL BUCKET LISTS TO MEGA LIST
            megaList.addAll(list0);
            megaList.addAll(list1);
            megaList.addAll(list2);
            megaList.addAll(list3);
            megaList.addAll(list4);
            megaList.addAll(list5);
            megaList.addAll(list6);
            megaList.addAll(list7);
            megaList.addAll(list8);
            megaList.addAll(list9);

            // TRANSFER THE DATA FROM THE MEGALIST INTO THE REVERSED STRING ARRAY
            for (int q = 0; q < rsa.length; q++) {
                rsa[q] = megaList.get(q);
            }

            // CLEAR THE ARRAYLISTS FOR THE NEXT LOOP
            megaList.clear();
            list0.clear();
            list1.clear();
            list2.clear();
            list3.clear();
            list4.clear();
            list5.clear();
            list6.clear();
            list7.clear();
            list8.clear();
            list9.clear();
        }

        // RETURN STRING ARRAY BACK IN ORDER AND CONVERT TO INTEGER
        for (int i = 0; i < rsa.length; i++) {
            rsa[i] = reverseOrder(rsa[i]);
            System.out.println(rsa[i]);
            ia[i] = Integer.parseInt(rsa[i]);
        }

        // RETURN THE INT ARRAY
        
        return ia;
    }
    
    /**
     * Reverses the order of any string
     * @param order
     * @return reverseOrder
     */
    public static String reverseOrder(String order){
        // DECLARATION
        String reverseOrder;
        // CHAR ARRAY 
        char[] hi = new char[order.length()]; // make a char array as long as the length of the original string
        int c = 0;                            // use c to count foreward
        // FOR LOOP
        for (int i = order.length(); i > 0; i--){ // for loop used for reversing the order
            hi[c++] = order.charAt(i - 1);
        }
        // PUT THE REVERSED CHARACTER ARRAY INTO A STRING TO SEND BACK
        reverseOrder = String.copyValueOf(hi);
        return reverseOrder; // return
    }
}
public class Main {

    public static void main(String[] args) {

        char[] arr = "chocolate bundt cake is yummy".toCharArray();;
        reverseWords(arr);
        System.out.println(arr);
    }

    public static void reverseWords(char[] message) {

        for(int i =0 ; i < message.length/2;i++) {

            char temp =  message[i];
            message[i] = message[message.length-1-i];
            message[message.length-1-i] = temp;
        }

        int i=0;
        int j=0;

        while( i < message.length ) {

            j=i;
            while( j<message.length && message[j] != ' ' ){
                j++;
            }

            System.out.println("before for loop j is: " + j + " i is: " + i);

            int len=j-i;
            for(int k=i ; k < i+len/2 ; k++) {

                int swap_idx = i+len-1-k < 0 ? 0 : i+len-1-k;

                System.out.println("swap_idx is: " + swap_idx);

                //please note i+swap_ids should be used
                char temp =  message[k];
                message[k] = message[i+swap_idx];
                message[i+swap_idx] = temp;
            }

            i=j+1;
        }
        
    }

}

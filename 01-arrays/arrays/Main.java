public class Main {
    public static void main(String[] args) {
        int a = 19;

        // Q: store a person's name
        String name = "Shubham Yadav";

        // Q: store 5 roll numbers
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 18;

        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers:
//        int[] rnos = new int[5];
//        // or directly
//        int[] rnos2 = {23, 12, 45, 32, 15};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here object is being created in the memory (heap)

//        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

//        for (String element : arr) {
//            System.out.println(element);
//        }

    }
    }


//------    int[] rnos = new int[5];  -------
//left hand side of equal happens at compile time
// right hand  of = happens at runtime

// dynamic memory allocation- at runtime memory is allocated

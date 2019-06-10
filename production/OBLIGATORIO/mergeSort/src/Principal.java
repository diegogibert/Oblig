public class Principal {

    public static void main (String [] args){
        int vec[]={23,15,2,0,18,100,56, 15};
        for(int i=0;i<vec.length;i++) {
            System.out.print(vec[i] + " ");
        }
        System.out.println(" ");
    int vecOrd[] = MergeSort.mergeSortImpl(vec);
        for(int i=0;i<vecOrd.length;i++) {
            System.out.print(vecOrd[i] + " ");
        }
    }
}

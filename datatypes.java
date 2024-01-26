public class datatypes {
    public static void main(String a[])
    {
        //int nums[] = {1,2,3};
        int nums2[][] = new int[3][4];

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                nums2[i][j] = (int)(Math.random() *100);
            }
        }

        for(int i=0; i<nums2.length; i++){
            for(int j=0; j<4; j++){
                System.out.print(nums2[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("This is tht other way to print");
        
        for(int n[]: nums2){
            for(int m:n){
                System.out.print(m+ " ");
            }
            System.out.println(" ");
        }
    }   
}

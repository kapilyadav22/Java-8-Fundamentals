class Multidimensional_array {
     public static void main(String[] args) {
        int nums[][] = new int[4][3];

        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                nums[i][j]=i+j;
            }
        }
        

        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
     }
}

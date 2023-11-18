class Enhanced_for_loop {
    public static void main(String[] args) {
        int nums[] = new int[4];
        int count = 0;
         for(int i=0;i<nums.length;i++){
            nums[i] = count;
            count++;
         }

        for(int n: nums){
            System.out.println(n);
        }
    }    
}

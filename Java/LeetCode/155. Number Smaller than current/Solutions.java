class Solutions {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int l= nums.length;
        int[] arr = new int[l];
        for(int i=0;i<l;i++)
        {
            int f=0;
            for(int j=0;j<l;j++)
            {
                if(i!=j){
                    if(nums[j]<nums[i])
                    {
                        f++;
                    }
                }



            }
            arr[i]=f;
        }
        return arr;

    }
}
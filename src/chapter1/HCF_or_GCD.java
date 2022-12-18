package chapter1;

class HCF_or_GCD {
    public int findGCD(int[] nums) {

        int min =nums[0];
        int max=nums[0] ;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){ min=nums[i]; }
            if(max<nums[i]){ max = nums[i];}
        }
        // Euclidean Algorithm
        while(min!=max){
            if(min>max){
                min -=max;
            }
            else{
                max-=min;
            }
        }

        return min;
    }
}

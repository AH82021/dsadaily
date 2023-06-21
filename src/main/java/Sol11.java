public class Sol11 {
    /**
     Find the duplicate element in a limited range array


     Given a limited range array of size n containing elements between 1 and n-1 with one element repeating, find the duplicate number in it without using any extra space.

     For example,

     Input:  { 1, 2, 3, 4, 4 }
     Output: The duplicate element is 4


     Input:  { 1, 2, 3, 4, 2 }
     Output: The duplicate element is 2
     */
    public static int findDuplictate(int[] nums){
        int duplicate = -1;
        for(int i = 0; i < nums.length; i++) {
            int value = (nums[i] < 0) ? -nums[i] : nums[i];
            if (nums[value] >= 0) {
                nums[value] = -nums[value];
            } else {
                duplicate = value;
                break;
            }
        }
            for (int j = 0; j <nums.length ; j++) {
                if (nums[j] == 0) {
                    nums[j] = -nums[j];
                }
            }

        return duplicate;
    }
    public static void main(String[] args) {
      int[] array = {1, 2, 3, 4, 4};
        System.out.println("The duplicate element is : "+findDuplictate(array));
    }
}

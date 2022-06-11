class Solution {
    public boolean containsDuplicate(int[] nums) {

        List<Integer> numList = new ArrayList<>();

        for(int n: nums){
            numList.add(n);
        }

        //set은 중복 허용 x
        Set<Integer> numSet = new HashSet<>(numList);

        //set과 list 크기 달라졌으면 중복포함o, 아니면 중복포함x
        if(numList.size() != numSet.size()){
            return true;
        }
        else return false;
    }
}

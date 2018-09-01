public class BinaryRecursiveSearch implements Practice2Search {
    @Override
    public String searchName()
    {
        return "Binary recursive search";
    }
    @Override
    public int search(int [] arr, int target)
    {

        return binSearch(arr,target,0,arr.length-1);
    }

    private int binSearch(int[] arr, int target, int low, int upper) {
        if (low > upper) return -1;
        int mid = (low+upper)/2;
        if (arr[mid] == target) return mid;
        else if (target < arr[mid])
        {
            //upper = mid-1
            return binSearch(arr,target,low,mid-1);
        }
        else
        {
            //low = mid+1
            return binSearch(arr,target,mid+1,upper);
        }
    }//binSearch
}

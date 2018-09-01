public class BinaryIterativeSearch implements Practice2Search{
    @Override
    public String searchName()
    {
        return "Binary iterative search";
    }
    @Override
    public int search(int [] arr, int target)
    {
        int low = 0, upper = arr.length-1;
        while (low <= upper)
        {
            int mid=(low+upper)/2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target)
            {
                upper = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return -1;
    }
}

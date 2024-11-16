public class MountainArray {
    public static void main(String[] args) {
        int[] list= {0,1,1,2,2,2,3,3,4,1,0};
        System.out.println(BinarySearch(list,0,list.length));
    }
    static int BinarySearch(int[] arr,int start,int end){
        int mid=0;

        while(end>=start){
            mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end=mid-1;
            } else if (arr[mid]<arr[mid+1]) {
                start=mid+1;
            }else{
                int count=1;
                while(arr[mid]==arr[mid+count]){
                    if(arr[mid]<arr[mid+count]){
                        start=mid+count;
                        break;
                    }
                }
            }
        }
        return mid;
    }
}

package array;
import java.util.Arrays;
//冒泡排序：
//1.比较数组中，两个相邻的元素，如果第一个数比第二个数大，我们就交换他们的位置；
//2.每一次比较，都会产生出一个最大，或者最小的数字；
//3.下一轮则可以少一次排序！
//4.依次循环，直到结束！
public class ArrayDemo07 {
    public static void main(String[] args) {
        int[] a = {1,4,5,6,73,2,2,2,25,6,7};

        int[] sort = sort(a);//调用完我们自己写的排序方法以后，返回一个排序后的数组
        System.out.println(Arrays.toString(sort));
    }
public static int[] sort(int[] array){
        //临时变量
    int temp = 0;
    //外层循环，判断我们这个要走多少次；
    for(int i = 0; i < array.length-1; i++){

        boolean flag = false;//通过flag标识位减少没有意义的比较

    //内层循环，比较判断两个数：如果第一个数比第二个大，则交换位置。
    for(int j = 0; j< array.length-1-i; j++){
        if (array[j+1] < array[j]){
            temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
            flag = true;
        }
    }
if(flag ==false){
    break;
}
    }
return array;
    }
}

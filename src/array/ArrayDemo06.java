package array;
import java.util.Arrays;
public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,9090,31231,543,21,3,23};
        System.out.println(a);//[I@1540e19d 输出哈希值

    //打印数组元素Arrays.toString(系统自带可调用）
        System.out.println(Arrays.toString(a));
        printArray(a);//自己写的用法，和上面系统自带的功能一样

        Arrays.sort(a);//数组进行排序：升序
        System.out.println(Arrays.toString(a));

    Arrays.fill(a,2,4,0);//数组填充：从2至4以0来填充！
        System.out.println(Arrays.toString(a));
    }

public static void printArray(int[] a){
        for(int i = 0; i < a.length ; i++){
           if(i==0){
               System.out.print("[");//是第一个数，则在其前面加[;
           }
           if(i==a.length-1){
               System.out.print(a[i]+"]");
           }else{
               System.out.print(a[i]+", ");//判断是否是最后一个数，是的话在它后面加上];
           }
        }
}
}

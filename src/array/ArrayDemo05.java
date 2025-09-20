package array;

public class ArrayDemo05 {
    public static void main(String[] args) {
        //[4][2]
        /*
        1,2  ---array[0]
        2,3  ---array[1]
        3,4  ---array[2]
        4,5  ---array[3]
        */
       int[][] array = {{1,2},{2,3},{3,4},{4,5}};
       printArray(array[0]);
        System.out.println("===========");//print不换行，println换行！！！
        System.out.println(array[0][0]);//输出数组{1,2}中的{1}
        System.out.println(array[2][1]);//输出数组{3,4}中的{4}
        System.out.println("===========");
        System.out.println(array.length);//输出数组长度（外面空间）
        System.out.println(array[0].length);//输出数组长度（内部空间）
    }
//另一种写法：
    /*
     int[][] array = {{1,2},{2,3},{3,4},{4,5}};
    for(int i = 0; i < array.length ; i++){
      for(int j = 0; j < array[i].length ; j++){
      System.out.println(array[i][j]);
      }
      }
    */
    //打印数组元素
    public static void printArray(int[]arrays){
        for(int i = 0; i< arrays.length; i++){
            System.out.print(arrays[i]+" ");
        }
    }
}

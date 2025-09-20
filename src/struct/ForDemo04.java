package struct;

public class ForDemo04 {
    public static void main(String[] args) {

        for(int j = 1; j <= 9; j++){
            for(int i = 1; i <= j; i++){
                System.out.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }
    }
}
//step1：打印第一列
//step2：把固定的1再用循环包起来
//step3：去掉重复项 i<=j;
//step4：调整样式
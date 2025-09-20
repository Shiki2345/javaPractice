package operator;

public class demo02 {
    public static void main(String[] args) {
        long a = 123123123123L;
        int b = 123;
        short c = 10;
        byte d = 8;
        System.out.println(a+b+c+d);//long
        System.out.println(b+c+d);//int
        System.out.println(c+d);//int(不强制转换的话就是默认int)
    }
}

package operator;

public class demo04 {
    public static void main(String[] args) {
        //++  --  自增，自减  一元运算符
        int a = 3;

        int b = a++;//执行完这行代码后，先给b赋值，再自增
        //a = a+1;
        System.out.println(a);
        //a++  a = a+1;
        int c = ++a;//执行完这行代码前，先自增，再给b赋值

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //幂运算 2^3  2*2*2=8  很多运算，我们会使用一些工具类来操作！
        double pow = Math.pow(3,2);
        System.out.println(pow);
    }
}

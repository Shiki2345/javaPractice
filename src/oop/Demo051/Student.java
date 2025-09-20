package oop.Demo051;

public class Student extends Person{
    private String name = "qinjiang";

    public void print(){
        System.out.println("Student");}

        public void test(String name){
        System.out.println(name);//秦疆
        System.out.println(this.name);//qinjiang
        System.out.println(super.name);//kuangshen
    }


}

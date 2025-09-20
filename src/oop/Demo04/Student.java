package oop.Demo04;

public class Student {
    //类    private:私有


    //属性私有
        private String name;//名字
        private int id;//学号
        private char sex;//性别

        private int age;//年龄
        //提供一些可以操作这个属性的方法！
        //提供一些public的 get,set方法

        //get 获得这个数据
        public String getName() {
            return this.name;
        }
        //set 给这个数据设置值
        public void setName(String name){
            this.name = name;
        }

        public int getAge() {//alt+insert
            return age;
        }

        public int setAge(int age) {
            if(age>120 || age<0){
                this.age=3;
            }else{
                this.age=age;
            }
        return age;
        }
    }

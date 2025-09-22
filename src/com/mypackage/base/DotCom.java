package com.mypackage.base;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class DotCom {
    //DotCom的实例变量
    private ArrayList<String> locationCells;
    //保存位置的ArrayList
    private String name;
    //DotCom的名称

    //setter
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String n){
        name = n;
    }

    public String checkYourself(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput);//indexOf方法，猜中位置返回位置
        if(index >= 0)
        {
            locationCells.remove(index);//删除被猜中的元素

            if(locationCells.isEmpty())//判断是否击沉
            {
                result = "kill";
                System.out.println("哦！你击沉了" + name +" :( ");
            }else{
                result = "hit";
            }
        }
        return result;
    }
}

class DotComBust{

    //声明并初始化变量
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame(){
        //first make some dot coms and give them locations

        DotCom one = new DotCom();
        one.setName("Pets.com");

        DotCom two = new DotCom();
        two.setName("eToys.com");

        DotCom three = new DotCom();
        three.setName("Go2.com");

        //创建三个DotCom对象，为它们指派名称并放入ArrayList
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("你的目标是击沉三个dot coms!");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("尝试用最少的次数猜到并击沉它们！！！");

        for(DotCom dotComToSet: dotComsList){//对list种所有的DotCom重复
            ArrayList<String> newLocation = helper.placeDotCom(3);//要求DotCom的位置
            dotComToSet.setLocationCells(newLocation);//调用这个DotCom的setter方法来指派刚刚取得的位置
        }

    }

    private void startPlaying(){
        while(!dotComsList.isEmpty()){  //判断DotCom的list是否为空
            String userGuess = helper.getUserInput("输入一个猜想：");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess){
        numOfGuesses++;//递增玩家猜测次数的计数
        String result = "miss";

        for(DotCom dotComToTest: dotComsList){
            result = dotComToTest.checkYourself(userGuess);//要求DotCom检查是否命中or击沉
            if(result .equals("hit"))
            {
                break;
            }
            if(result.equals("kill"))
            {
                dotComsList.remove(dotComToTest);//它被挂掉了
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        //列出玩家成绩
        System.out.println("所有的Dot Com都挂了！你持有的股票全打水漂了！！");
        if(numOfGuesses <= 18)
        {
            System.out.println("你只花了" + numOfGuesses +"次猜到！");
            System.out.println("在你的选择消失之前你就退出了");
        }else{
            System.out.println("花了你足够长时间呢:( " + numOfGuesses + "次猜到");
            System.out.println("鱼儿随着你的选择而舞动");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }



}
//class GameHelper{
//    public String getUserInput(String prompt){
//        String inputLine = null;
//        System.out.print(prompt + " ");
//        try{
//            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
//            inputLine = is.readLine();
//            if(inputLine.length() == 0){
//                return null;
//            }
//
//        }
//        catch(IOException e){
//            System.out.println("IOException: " + e);
//        }
//        return inputLine;
//    }
//}


package com.mypackage.base;
import java.io.*;


public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    //setter
    public void setLocationCells(int[] locs){
        locationCells = locs;
    }
    public String checkYOurself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for(int cell: locationCells)
        {
            if(guess == cell)
            {
                result = "hit";
                numOfHits++;
                break;
            }
        }//退出循环

        if(numOfHits == locationCells.length)
        {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }//关闭方法


}//关闭类
/*这段代码展示了一个简单的“打击目标”游戏实现。目标是猜中目标位置来获得“hit”或“kill”反馈。以下是对代码的逐步解释：

        1. SimpleDotCom 类
        该类实现了一个简单的“Dot Com”游戏，主要通过猜测目标位置来得到反馈。

        成员变量：
        locationCells: 一个整型数组，用来存储目标所在的单元格位置。
        numOfHits: 用来记录用户击中的次数。初始化为 0。
        setLocationCells(int[] locs) 方法：
        这是一个 Setter 方法，用于设置目标的位置。locs 参数是一个整数数组，表示目标的各个位置。
        将传入的 locs 数组赋值给 locationCells。
        checkYOurself(String stringGuess) 方法：
        功能：根据用户的猜测，判断猜测是“miss”（未击中）、“hit”（击中）还是“kill”（击中并且消灭目标）。

        stringGuess：用户的猜测，字符串类型。

        int guess = Integer.parseInt(stringGuess);：将用户输入的字符串猜测转换为整数类型。
        String result = "miss";：初始化结果为“miss”，假设一开始用户没有击中。
        for (int cell : locationCells)：遍历 locationCells 数组中的每个位置，检查用户猜测的值是否与目标位置匹配。
        如果 guess == cell，则说明用户击中了目标，结果设置为“hit”，并将 numOfHits 增加 1。
        if (numOfHits == locationCells.length)：如果 numOfHits 达到目标位置数组的长度，说明目标全部被击中，结果设置为“kill”。
        System.out.println(result);：输出猜测结果：“miss”/“hit”/“kill”。
        return result;：返回猜测结果。
        总结：
        这个类实现了一个简单的逻辑：用户输入猜测后，系统判断是命中、未命中还是击毁目标
/*这个类用于测试 SimpleDotCom 类的功能，模拟了一个用户输入的简单场景。*/
/*************************************************************************************************/
class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYOurself(userGuess);
    }
}
/*main 方法：
    SimpleDotCom dot = new SimpleDotCom();：创建一个 SimpleDotCom 类的对象 dot。
    int[] locations = {2, 3, 4};：定义目标位置为 2, 3, 4 这三个单元格。
    dot.setLocationCells(locations);：调用 setLocationCells 方法，将目标位置传递给 SimpleDotCom 对象。
    String userGuess = "2";：模拟用户的猜测为 2。
    String result = dot.checkYOurself(userGuess);：调用 checkYOurself 方法，将用户猜测的值（"2"）传入，获得猜测结果。
运行流程和结果：
    在 SimpleDotComTestDrive 类中，用户的猜测为 "2"。
    SimpleDotCom 类会将目标位置 [2, 3, 4] 与用户的猜测进行比较。
    因为 2 是目标位置之一，输出结果为 "hit"。
    numOfHits 会增加 1，但目标还没有完全击中，所以不会输出 "kill"*/
/*********************************************************************************************************/
class SDC{
    public static void main(String[] args) {
        int numOfGuesses = 0;//记录玩家猜测次数的变量
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int)(Math.random() * 5);//产生随机数以此制作数组

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);//赋值位置
        boolean isAlive = true;

        while(isAlive){
            String guess = helper.getUserInput("请输入一个数字：");
            String result = theDotCom.checkYOurself(guess);//检查玩家的猜测并将结果存储在String中
            numOfGuesses++;
            if(result.equals("kill"))
            {
                isAlive = false;
                System.out.println("你猜了" + numOfGuesses + "次！！");
            }
        }
    }
}
/**************************************************************************************/
class sdcGameHelper{
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.print(prompt + " ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0){
                return null;
            }

        }
        catch(IOException e){
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}
/*类和方法概述：
        GameHelper 类包含一个方法：getUserInput，用于提示用户输入并读取用户的输入。
        方法接收一个 String prompt 作为参数，这是一个提示信息，目的是在请求输入时向用户显示一些提示文本。
        方法分析：
        1. public String getUserInput(String prompt)
        这是一个公共方法，它返回用户输入的字符串。
        它接收一个 String prompt 参数，这个参数是要显示给用户的提示信息。
        2. String inputLine = null;
        声明一个 inputLine 变量，用于存储用户的输入。
        初始值为 null，表示尚未读取任何输入。
        3. System.out.print(prompt + " ");
        在控制台上输出提示信息，prompt 是从方法调用传入的字符串。它会在用户输入之前显示出来，以告诉用户需要输入什么内容。
        + " " 使得提示信息后面有一个空格，以便用户可以直接输入。
        4. BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        InputStreamReader(System.in)：这是一个字节流与字符流的转换器，System.in 表示标准输入流（通常是键盘输入）。
        BufferedReader：是用于缓冲读取字符流的类。它可以提高读取效率，尤其是读取大数据时。此处用它来逐行读取用户输入。
        5. inputLine = is.readLine();
        使用 BufferedReader 的 readLine() 方法读取用户输入的一行内容。它会等待用户输入并按回车键后读取一整行。
        读取的内容会被存储在 inputLine 变量中。
        6. if(inputLine.length() == 0){ return null; }
        这行代码检查用户是否输入了空字符串（即仅按下了回车键，没有输入任何内容）。
        如果用户没有输入任何内容（inputLine.length() == 0），方法返回 null，表示没有有效的输入。
        7. catch(IOException e)
        这是一个异常捕获块，捕捉 IOException 异常，这种异常通常发生在输入/输出操作中（例如读取输入流时发生错误）。
        如果发生异常，程序会输出 "IOException: " + e，打印出具体的错误信息。
        8. return inputLine;
        如果一切正常，方法返回用户输入的内容 inputLine。
        总结：
        GameHelper 类提供了一个获取用户输入的工具方法。具体来说，它会：

        显示传入的提示信息（prompt）。
        等待并读取用户的输入。
        如果用户没有输入内容（直接按回车），返回 null。
        如果发生输入输出异常（如读取失败），则会捕获异常并输出错误信息。
        最终，返回用户输入的内容。
        应用场景：
        这种方法常用于控制台应用程序中，需要从用户获取输入时。例如，在游戏中，玩家可能需要输入猜测、选择等内容，getUserInput 就可以提供这样一个简单的方式来获取输入。*/
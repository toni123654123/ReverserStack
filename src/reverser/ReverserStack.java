package reverser;

import java.util.Stack;

public class ReverserStack {
    private String input;
    private String output;
    public ReverserStack(String in){
        input = in;
    }
    public String doRev(){
//        int stackSize = input.length();
        Stack theStack = new Stack();
        for (int i = 0;i<input.length();i++){
            char ch = input.charAt(i);
            theStack.push(ch);

        }output ="";
        while (!theStack.isEmpty()){
            char ch = (char) theStack.pop();
            output = output + ch;
        }
        return output;
    }
}

/**
 * Created by Администратор on 31.03.2017.
 */
public class Stack {
    String[] stock = new String[10];
    int stackPosition = -1;

    boolean push(String str){
        if(stackPosition< (stock.length -1 )){
            stock[++stackPosition] = str;
            return true;
        }
        return false;
    }


    String pop(){
        if(stackPosition > -1){
            return stock[--stackPosition];
        }

        return null;
    }


    int size(){
        return stackPosition;
    }
}

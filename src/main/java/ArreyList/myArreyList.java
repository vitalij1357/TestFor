package ArreyList;

import java.util.StringJoiner;

public class myArreyList {
    private final  int ARREY_LENGHT=8;

    public int[] data;
    private int index;
    public myArreyList()
    {
        data= new int[ARREY_LENGHT];
    }
    public void add(int value){
        if (index == data.length -1){
            int newSize = data.length *2;
            int[]newData = new int[newSize];
            System.arraycopy(data,0,newData,0,data.length);
            data=newData;
        }
        data[index]=value;
        index ++;
    }
    public int get(int i){
        return data[i];
    }
    public int size(){
        return index;
    }
    public void remove(int in) {

        System.arraycopy(data, in + 1, data, in, index - in - 1);
        data[--index] = 0;
    }
    public void clear(){
        for (int i = 0; i < data.length; i++) {
            data[i] = 0;
            index = 0;
        }
    }
    @Override
    public String toString(){
        StringJoiner result = new StringJoiner(",");
        for (int i = 0; i < index; i++) {
            result.add(Integer.toString(data[i]));
        }
        return "[" + result +"]";
    }
}

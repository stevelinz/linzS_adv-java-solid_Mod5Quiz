package com.stevelinz.independentcopy.reader;



import java.util.ArrayList;

public class ListReader implements com.stevelinz.independentcopy.reader.Reader {


    @Override
    public String readln() {
        ArrayList<String> dataList = new ArrayList<>();

        dataList.add("data item 1 ");
        dataList.add("data item 2 ");
        dataList.add("data item 3 ");

       return String.valueOf(dataList);

    }
}

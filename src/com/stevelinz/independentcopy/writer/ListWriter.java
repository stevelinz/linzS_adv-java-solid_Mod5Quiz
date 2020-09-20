package com.stevelinz.independentcopy.writer;

public class ListWriter implements com.stevelinz.independentcopy.writer.Writer {



    @Override
    public void writeln(String line) {

        System.out.println(line);

    }
}

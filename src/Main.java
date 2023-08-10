import java.util.*;

import test2.*;



public class Main {
    public static void main(String[] args) {
    Directory dir = new Directory("hello");

    dir.createFile("home/baby");
        dir.createFile("home/baby2");
        dir.createFile("home/baby3");
        dir.createFile("home/babyahayan/babyy");



    dir.appendFile("home/baby","podaaa");
//    dir.printFileContent("home/baby");
    }
}
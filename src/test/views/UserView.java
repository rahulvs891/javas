package test.views;

import test.models.FileModel;

import java.util.Scanner;

public class UserView {
    public void mainwindow(){
        System.out.println("home");
        System.out.println("1 to create file");
        System.out.println("2 to read file");
        System.out.println("3 to update file");
        System.out.println("4 to delete file");

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        switch (s){
            case 1:
                System.out.println("Enter path");
                String path = sc.nextLine();
                System.out.println("Enter file name");
                String name =sc.nextLine();
                System.out.println("Enter file content");
                String content = sc.nextLine();

                FileModel fm =new FileModel(name,path,content);

                break;
            case 2 :
                System.out.println("");
                break;
            default:

        }
    }
}

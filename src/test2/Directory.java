package test2;

import java.util.*;

public class Directory{
    private String name;
    Map<String , File> files;
    Set<Directory> subs;

    public Directory(String name) {
        this.name = name;
        this.files = new HashMap<>();
        this.subs = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createFile(String path){
        String parts[] = path.split("/");
        Directory curr = getPath(parts);
        String filename=parts[parts.length-1];
       curr.files.put(filename,new File(filename,""));

        System.out.println("subdir " + curr.getName().toString());
        System.out.print("files present " + curr.files.size() + " ");
       for(Map.Entry<String,File> file : curr.files.entrySet()){
           System.out.print(file.getKey().toString() + " ");
       }
        System.out.println("");
        System.out.println("-".repeat(20));
    }

    public void renameFile(String path,String newName){

    }

    public void appendFile(String path,String data){
        String parts[] = path.split("/");
        String filename = parts[parts.length-1];
        Directory reqdDir = getPath(parts);

        System.out.println("before appending"); printFileContent(path);
        if(reqdDir.files.containsKey(filename)){
            System.out.println("before appending " + reqdDir.files.get(filename).getContent());
           reqdDir.files.get(filename).addContent(data);
        }
        printFileContent(path);

    }

    public Directory getOrCreateSubDir(String name){
        for(Directory sub : subs){
            if(sub.getName().equals(name)){
                return sub;
            }

        }
        Directory subdir = new Directory(name);
        subs.add(subdir);
        return subdir;
    }

    public Directory getPath(String[] parts){


        Directory curr = this;
        for(int i=0;i< parts.length-1;i++) {
            String dirname = parts[i];
            Directory subdir = getOrCreateSubDir(dirname);
            curr = subdir;
        }
        return curr;
    }
    public void printFileContent(String path){
        String parts[] = path.split("/");
        String filename = parts[parts.length-1];
        Directory reqdDir = getPath(parts);
        if(reqdDir.files.containsKey(filename)){
            System.out.println( reqdDir.files.get(filename).getContent().toString());
        }
    }
}
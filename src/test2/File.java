package test2;
import java.util.*;
class File{
    private String name;
    private StringBuilder content;

    public File(String name, String content) {
        this.name = name;
        this.content = new StringBuilder(content);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StringBuilder getContent() {
        return content;
    }

    public void setContent(StringBuilder content) {
        this.content = content;
    }
    public void addContent(String content2){
        content.append(content2);
    }
}


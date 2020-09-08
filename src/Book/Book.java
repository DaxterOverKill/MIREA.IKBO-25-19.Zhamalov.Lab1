package Book;
import java.lang.*;
public class Book {
    private String name;
    private int page;
    public Book(String n, int a){
        name = n;
        page = a;
    }
    public Book(String n){
        name = n;
        page = 0;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getPage() {
        return page;
    }
    public String toString(){
        return this.name+", Page "+this.page;
    }
    public void UnreadPages(){
        System.out.println(name+" left to read "+(600-page));
    }
}

package library;

import java.util.ArrayList;
import java.util.Date;

public class Book {
    String callNo,name,author,publisher;
    int quantity,issued=0,iD;
    Date addedDate,issueDate,returnDate;
    public static ArrayList<Book> books=new ArrayList<Book>();
}


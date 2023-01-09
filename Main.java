package library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//admin name is:amged password is:123
public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        File f1 = new File("Librarians.txt");
        BufferedReader br = new BufferedReader(new FileReader(f1));
        String s;
        while ((s = br.readLine()) != null) {
            String[] tokens = s.split("/", 7);
            Librarian x = new Librarian();
            x.iD = Integer.parseInt(tokens[0]);
            x.name = tokens[1];
            x.password = tokens[2];
            x.email = tokens[3];
            x.address = tokens[4];
            x.city = tokens[5];
            x.contactNumber = tokens[6];
            Librarian.librarians.add(x);
        }
        File f2 = new File("Books.txt");
        br = new BufferedReader(new FileReader(f2));
        while ((s = br.readLine()) != null) {
            String[] tokens = s.split("/", 8);
            Book x = new Book();
            x.iD = Integer.parseInt(tokens[0]);
            x.callNo = tokens[1];
            x.name = tokens[2];
            x.author = tokens[3];
            x.publisher = tokens[4];
            x.quantity = Integer.parseInt(tokens[5]);
            x.issued = Integer.parseInt(tokens[6]);
            DateFormat format = new SimpleDateFormat("yyyy-MM-d");
            x.addedDate = format.parse(tokens[7]);
            Book.books.add(x);
        }
        File f3 = new File("Students.txt");
        br = new BufferedReader(new FileReader(f3));
        while ((s = br.readLine()) != null) {
            String[] tokens = s.split("/");
            switch (tokens.length) {
                case (7) -> {
                    Student x = new Student();
                    x.iD = Integer.parseInt(tokens[0]);
                    x.name = tokens[1];
                    x.password = tokens[2];
                    x.email = tokens[3];
                    x.address = tokens[4];
                    x.city = tokens[5];
                    x.contactNumber = tokens[6];
                    Student.students.add(x);
                }
                case (11) -> {
                    Student x = new Student();
                    x.iD = Integer.parseInt(tokens[0]);
                    x.name = tokens[1];
                    x.password = tokens[2];
                    x.email = tokens[3];
                    x.address = tokens[4];
                    x.city = tokens[5];
                    x.contactNumber = tokens[6];
                    for (int i = 0; i < Book.books.size(); i++) {
                        if (Book.books.get(i).iD == Integer.parseInt(tokens[7]) && Book.books.get(i).callNo.equals(tokens[8])) {
                            Book y = Book.books.get(i);
                            DateFormat format = new SimpleDateFormat("yyyy-MM-d");
                            y.issueDate = format.parse(tokens[9]);
                            y.returnDate = format.parse(tokens[10]);
                            x.issuedbooks.add(y);
                            break;
                        }
                    }
                    Student.students.add(x);
                }
                case (15) -> {
                    Student x = new Student();
                    x.iD = Integer.parseInt(tokens[0]);
                    x.name = tokens[1];
                    x.password = tokens[2];
                    x.email = tokens[3];
                    x.address = tokens[4];
                    x.city = tokens[5];
                    x.contactNumber = tokens[6];
                    for (int i = 0; i < Book.books.size(); i++) {
                        if (Book.books.get(i).iD == Integer.parseInt(tokens[7]) && Book.books.get(i).callNo.equals(tokens[8])) {
                            Book y = Book.books.get(i);
                            DateFormat format = new SimpleDateFormat("yyyy-MM-d");
                            y.issueDate = format.parse(tokens[9]);
                            y.returnDate = format.parse(tokens[10]);
                            x.issuedbooks.add(y);
                            break;
                        }
                    }
                    for (int i = 0; i < Book.books.size(); i++) {
                        if (Book.books.get(i).iD == Integer.parseInt(tokens[11]) && Book.books.get(i).callNo.equals(tokens[12])) {
                            Book y = Book.books.get(i);
                            DateFormat format = new SimpleDateFormat("yyyy-MM-d");
                            y.issueDate = format.parse(tokens[13]);
                            y.returnDate = format.parse(tokens[14]);
                            x.issuedbooks.add(y);
                            break;
                        }
                    }
                    Student.students.add(x);
                }
                case (19) -> {
                    Student x = new Student();
                    x.iD = Integer.parseInt(tokens[0]);
                    x.name = tokens[1];
                    x.password = tokens[2];
                    x.email = tokens[3];
                    x.address = tokens[4];
                    x.city = tokens[5];
                    x.contactNumber = tokens[6];
                    for (int i = 0; i < Book.books.size(); i++) {
                        if (Book.books.get(i).iD == Integer.parseInt(tokens[7]) && Book.books.get(i).callNo.equals(tokens[8])) {
                            Book y = Book.books.get(i);
                            DateFormat format = new SimpleDateFormat("yyyy-MM-d");
                            y.issueDate = format.parse(tokens[9]);
                            y.returnDate = format.parse(tokens[10]);
                            x.issuedbooks.add(y);
                            break;
                        }
                    }
                    for (int i = 0; i < Book.books.size(); i++) {
                        if (Book.books.get(i).iD == Integer.parseInt(tokens[11]) && Book.books.get(i).callNo.equals(tokens[12])) {
                            Book y = Book.books.get(i);
                            DateFormat format = new SimpleDateFormat("yyyy-MM-d");
                            y.issueDate = format.parse(tokens[13]);
                            y.returnDate = format.parse(tokens[14]);
                            x.issuedbooks.add(y);
                            break;
                        }
                    }
                    for (int i = 0; i < Book.books.size(); i++) {
                        if (Book.books.get(i).iD == Integer.parseInt(tokens[15]) && Book.books.get(i).callNo.equals(tokens[16])) {
                            Book y = Book.books.get(i);
                            DateFormat format = new SimpleDateFormat("yyyy-MM-d");
                            y.issueDate = format.parse(tokens[17]);
                            y.returnDate = format.parse(tokens[18]);
                            x.issuedbooks.add(y);
                            break;
                        }
                    }
                    Student.students.add(x);
                }
            }
        }
        new FirstFrame().setVisible(true);
    }
}

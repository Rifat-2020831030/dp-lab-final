import features.*;
import main_component.*; 

public class Client {
    public static void main(String[] args) throws Exception {
        Document doc = new PlainDoc("Plain text");

        System.out.println(doc.getText());

        Document boldDoc = new Bold(doc);

        System.out.println(boldDoc.getText());

        Document highlighted = new Highligting(boldDoc);

        System.out.println(highlighted.getText());
    }
} 

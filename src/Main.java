import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Generic<Integer> g=new Generic<>();
        Scanner s=new Scanner(System.in);
        for (int i=0;i<15;i++)
        {
            g.add((int)(Math.random()*20));
        }
        System.out.println("Element at index 10: "+g.getByIndex(10));

        Generic<String> str=new Generic<>();

        String[] text=new String[5];

        for (int i=0;i<5;i++)
        {
            text[i]=s.next();
        }

        str.ArrayGeneric(text,str);

        System.out.println("Text as Generic: "+str);
        System.out.println("Element at index 20: "+g.getByIndex(20));

    }
}

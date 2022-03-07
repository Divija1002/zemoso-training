import java.io.*;
import java.util.*;
class Fr
{
public static void main(String args[])throws IOException
{
File f=new File("D:\\first_git_repo\\hello_world.txt");
BufferedReader br=new BufferedReader(new FileReader(f));
Scanner input=new Scanner(System.in);
String s;
StringBuffer sb=new StringBuffer();
while((s=br.readLine())!=null)
{
sb.append(s+System.lineSeparator());
}
String fc=sb.toString();
//System.out.println(fc);
System.out.print("old word: ");
String oldword=input.next();
System.out.print("new word: ");
String newword=input.next();
fc=fc.replaceAll(oldword,newword);
//System.out.println(fc);
FileWriter w=new FileWriter("D:\\first_git_repo\\hello_world.txt");
w.append(fc);
w.flush();
}
}

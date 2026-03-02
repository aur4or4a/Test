import java.io.*;
import java.util.*;
import java.net.*;

public class test{
    public static void main(String[] Zerif) throws Exception{
        //This is the server.
        ServerSocket ss=new ServerSocket(4444);
        Socket s= ss.accept();
        Scanner Mavis=new Scanner(System.in);
        DataInputStream Natsu=new DataInputStream(s.getInputStream());
        DataOutputStream Erza=new DataOutputStream(s.getOutputStream());
        while(true){
        String Grey=(String)Natsu.readUTF();
        System.out.println("They said: "+Grey);
        System.out.print("What is ur response?:");
        Grey=Mavis.nextLine();
        Erza.writeUTF(Grey);
        }
    }
}


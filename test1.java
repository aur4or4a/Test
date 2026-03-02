import java.io.*;
import java.util.*;
import java.net.*;

public class test1{
    public static void main(String[] Zerif) throws Exception{
        Socket s=new Socket("127.0.0.1",4444);
        DataInputStream Natsu=new DataInputStream(s.getInputStream());
        DataOutputStream Erza=new DataOutputStream(s.getOutputStream());
        while(true){
            System.out.print("What do u want to say?:");
        String Grey;
        InputStream Lucy=System.in;
        byte[] Data=new byte[50];
        int Tail=Lucy.read(Data);
        Grey=new String(Data,0,Tail);
        Erza.writeUTF(Grey);
        Grey=Natsu.readUTF();
        System.out.println("They said: "+Grey);
        }

    }
}
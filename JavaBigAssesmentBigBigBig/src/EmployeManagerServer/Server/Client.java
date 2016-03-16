package EmployeManagerServer.Server;



import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {

        static Socket socket = null;
        static ObjectInputStream objectInputStream;
        static ObjectOutputStream objectOutputStream;

        public Client(String host, int port){
            try {
                if (socket == null) socket = new Socket(host, port);
                objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                objectInputStream = new ObjectInputStream(socket.getInputStream());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void exit() {
            try {
                objectOutputStream.close();
                objectInputStream.close();
                socket.close(); }
            catch (Exception e) {e.printStackTrace();} }





    }



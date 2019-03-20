package Server;

import Commands.Command;
import Commands.JoinCommand;
import GameStates.JoinedState;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import mypoker.Player;
import mypoker.Table;

public class ConnectionThread extends Thread {

    private boolean go;
    private String name;
    private int id;

    // -- the main server (port listener) will supply the socket
    //    the thread (this class) will provide the I/O streams
    //    BufferedReader is used because it handles String objects
    //    whereas DataInputStream does not (primitive types only)
    private BufferedReader datain;
    private DataOutputStream dataout;
    private ObjectOutputStream objectOut;
    private ObjectInputStream objectIn;
    private Table t;

    // -- this is a reference to the "parent" Server object
    //    it will be set at time of construction
    private Server server;

    public ConnectionThread(int id, Socket socket, Server server) {
        this.server = server;
        this.id = id;
        this.name = Integer.toString(id);
        go = true;
        t = server.getMainTable();
        // -- create the stream I/O objects on top of the socket
        try
        {
            objectOut = new ObjectOutputStream(socket.getOutputStream());
            objectIn = new ObjectInputStream(socket.getInputStream());
//            datain = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            dataout = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e)
        {
            e.printStackTrace();
            System.exit(1);
        }

    }

    public String toString() {
        return name;
    }

    public String getname() {
        return name;
    }

    public void run() {
        // -- server thread runs until the client terminates the connection
        while (go)
        {

            Command m = null;
            try
            {
                try
                {
                    m = (Command) objectIn.readObject();
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(ConnectionThread.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (m instanceof JoinCommand)
                {
                    JoinCommand c  = (JoinCommand)m;
                    Player p = new Player(c.getUsername(), 1, 5000);
                    t.addPlayer(p);
                    t.dealFlop();
                    t.setPot(100);
                    JoinedState state = new JoinedState(t);
                    objectOut.writeObject(state);
                    objectOut.flush();

                }

            } catch (IOException ex)
            {
                Logger.getLogger(ConnectionThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void joinGame(JoinCommand c) {
//        Player p = new Player(c.getUsername(), 1, 5000);
//        t.addPlayer(p);
//        t.dealFlop();
//        t.setPot(100);
//        JoinedState state = new JoinedState(t);
//        objectOut.writeObject(state);
//        objectOut.flush();
    }

}

//    public void run() {
//        // -- server thread runs until the client terminates the connection
//        while (go)
//        {
//            try
//            {
//                // -- always receives a String object with a newline (\n)
//                //    on the end due to how BufferedReader readLine() works.
//                //    The client adds it to the user's string but the BufferedReader
//                //    readLine() call strips it off
//                String txt = datain.readLine();
//                String[] txtElements = txt.split(",");
//
//                // -- if it is not the termination message, send it back adding the
//                //    required (by readLine) "\n"
//                // -- if the disconnect string is received then 
//                //    close the socket, remove this thread object from the
//                //    server's active client thread list, and terminate the thread
//                String resp = "fail";
//                //CONNECT
//                Table t = this.server.getMainTable();
//                if (txtElements[0].equals("0")) //JOIN TABLE
//                {
//                    Player p = new Player(txtElements[1],t.getPlayers().size());
//                    t.addPlayer(p);
//                    resp = "none";
//                } //LOGIN
//                else if (txtElements[0].equals("1"))
//                {
//
//                    if (this.server.getDatabase().checkUserExist(txtElements[1]))
//                    {
//                        if (this.server.getDatabase().checkLocked(txtElements[1]))
//                        {
//                            if (this.server.getDatabase().loginUser(txtElements[1], txtElements[2]))
//                            {
//                                resp = "success";
//                            }
//                        } else
//                        {
//                            resp = "locked";
//                        }
//                    }
//                    dataout.writeBytes(resp + "\n");
//                    dataout.flush();
//                } //REGISTER
//                else if (txtElements[0].equals("2"))
//                {
//                    if (!(this.server.getDatabase().checkUserExist(txtElements[1])))
//                    {
//                        this.server.getDatabase().addUser(txtElements[1], txtElements[2], txtElements[3]);
//                        resp = "success";
//                    }
//
//                    dataout.writeBytes(resp + "\n");
//                    dataout.flush();
//                } else if (txtElements[0].equals("3"))
//                {
//                    if (this.server.getDatabase().recoverPassword(txtElements[1]))
//                    {
//                        resp = "success";
//                    }
//                    dataout.writeBytes(resp + "\n");
//                    dataout.flush();
//                } else if (txtElements[0].equals("4"))
//                {
//                    this.server.getDatabase().changePassword(txtElements[1],txtElements[2]);
//                    resp = "success";
//                    dataout.writeBytes(resp + "\n");
//                    dataout.flush();
//                } else
//                {
//                    System.out.println("unrecognized command >>" + txt + "<<");
//                    dataout.writeBytes(txt + "\n");
//                }
//
////				if (txt.equals("disconnect")) {
////					datain.close();
////					server.removeID(id);
////					go = false;
////				}
////				else if (txt.equals("hello")) {
////						
////					dataout.writeBytes("world!" + "\n");
////					dataout.flush();
////					
////				}
////				else {
////					System.out.println("unrecognized command >>" + txt + "<<");
////					dataout.writeBytes(txt + "\n");
////				}
//            } catch (IOException e)
//            {
//                e.printStackTrace();
//                go = false;
//            }
//
//        }
//    }


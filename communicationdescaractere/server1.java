package communicationdescaractere;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server1 {
  public static void main (String[] args) {
	  try {
	 ServerSocket ss = new ServerSocket(600);
	 //permet de reserver un port a client qui vas connecter à server 
	 Socket s = ss.accept();
	 //permet d'accepter le client 
	   int op1 , op2 ; String operation;
	   int res;
	   //declaration des variable 
	 InputStream is = s.getInputStream();
	// permet de lire un caractere envoyer par le client
	 OutputStream os = s.getOutputStream();
	 //permet d'ecrire un caracter et envoyer à client
	 InputStreamReader isr = new InputStreamReader(is);
	 //permet de lire une caractere par caractere
	 BufferedReader bf = new BufferedReader(isr);
	 //permet d'ensembler les chaines des caractere
	 op1=Integer.parseInt(bf.readLine()); 
	    op2=Integer.parseInt(bf.readLine());
	    //permet de lire un caracter par ligne apres avoir faire casting
	    operation=bf.readLine();
	    //permet de lire une chaine caractére
	    switch (operation) {
	    //operateur de switch
	    case "+":
	    	res=op1+op2;
	    	break;
	    	case "-":
	    		res=op1-op2;
	    		break;
	    	case "*":
	    		res=op1-op2;
	    		break;
	    	case "/":
	    		res=op1-op2;
	    		break;
	     }
	   PrintWriter pw = new PrintWriter(os,true);
	   //instance permet d'envoyer le caracter à client caractere par caractere
  }catch (Exception e) {
	e.printStackTrace();
}
}
}

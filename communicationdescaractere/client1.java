package communicationdescaractere;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class client1 {
	public static void main(String[] args) {
		try {	
            Socket s = new Socket("localhost",600);
            //permet de connecter à port reserver par le server ------
           System.out.println("je suis conecté au server");
           int op1 , op2;String operation;
           //declaration des variable
           Scanner sc = new Scanner(System.in);
           op1=sc.nextInt();
           op2=sc.nextInt();
           //permet l'utilisateur de saisir les entres
           do {
        	   System.out.println("entrer un operateur");
        	    operation=sc.nextLine();
        	     }while(!operation.equals("+") && !operation.equals("-") && !operation.equals("*") &&!operation.equals("/") );
           /*l'utilisateur vas saisir les operateur une fois l'utilisteur à saisir une fausse operateur il vas le repeter*/
                OutputStream os = s.getOutputStream();
                //permet d'ecrire le caractere et envoyer à server
               PrintWriter pw = new PrintWriter(os,true);
               //permet d'envoyer le caractere par caractere à server
               pw.println(op1);
               pw.println(op2);
               pw.println(operation);
               //vas envoyer op1 op2 operation
               System.out.println(op1+"operation +"+op2+"="+operation);
               //permet d'affichage le resultats
		}catch (Exception e) {
			e.printStackTrace();
		}
}
}

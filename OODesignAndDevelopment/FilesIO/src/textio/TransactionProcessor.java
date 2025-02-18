package textio;

/* lz,la
 * Program to read and interpret a transaction file.
 * - Transactions are for a Counter.
 * - They have the form plus|minus n, were n is an integer
 * - "end" signals the end of the transaction data
 */

import java.io.*;
import java.util.*;


public class TransactionProcessor {

	public static void main(String[] arg) throws FileNotFoundException {

		var c = new Counter();

		var sc = new Scanner(new File("trans.txt"));

		String transaction = sc.next();

		while (!transaction.equals("end"))
		{
			if (transaction.equals("plus"))
				c.incrementBy(sc.nextInt());
			else if(transaction.equals("reset"))
				c.reset();
			else if (transaction.equals("minus"))
				c.decrementBy(sc.nextInt());

			System.out.println(" c=" + c.toString());

			transaction = sc.next();
		}

		sc.close();
	}
}

package atm.physical;

import java.util.Enumeration;

import banking.Balances;
import banking.Receipt;
import simulation.Simulation;

/** Manager for the ATM's receipt printer.  In a real ATM, this would 
 *  manage a physical device; in this simulation,  it uses classes 
 *  in package simulation to simulate the device.
 */
 
public class ReceiptPrinter
{
    /** Constructor
     */
    public ReceiptPrinter()
    { 
    }
    
    /** Print a receipt
     *
     *  @param receipt object containing the information to be printed
     */
    public void printReceipt(Receipt receipt)
    {
        Enumeration receiptLines = receipt.getLines();
        
        // Animate the printing of the receipt

        while (receiptLines.hasMoreElements())
        {
            Simulation.getInstance().printReceiptLine(
                ((String) receiptLines.nextElement()));
        }
    }
}
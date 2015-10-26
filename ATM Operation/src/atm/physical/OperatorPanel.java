package atm.physical;
import atm.ATM;
import banking.Money;
import simulation.Simulation;

/** Manager for the ATM's operator panel.  In a real ATM, this would 
 *  manage a physical device; in this simulation,  it uses classes 
 *  in package simulation to simulate the device.
 */
 
public class OperatorPanel
{
    /** Constructor
     *
     *  @param atm the ATM this panel is part of
     */
    public OperatorPanel(ATM atm)
    {
        this.atm = atm;
    }
    
    // In a real ATM, code would be needed to sense a change in the state of the
    // switch and notify the ATM - simulated in this case by a button in the GUI
    
    /** Get the amount of cash in the cash dispenser from the operator at start up
     *
     *  @return dollar value of the bills in the cash dispenser (# of bills x $20)
     */
    
    public Money getInitialCash()
    {
        return Simulation.getInstance().getInitialCash();
    }
    
    /** ATM this panel is part of.  The ATM object will be notified when
     * the switch on the panel is turned on or off
     */
    private ATM atm;    
}
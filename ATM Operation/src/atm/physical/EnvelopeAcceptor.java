package atm.physical;

import simulation.Simulation;

/** Manager for the ATM's envelope acceptor.  In a real ATM, this would 
 *  manage a physical device; in this simulation,  it uses classes 
 *  in package simulation to simulate the device.
 */
 
public class EnvelopeAcceptor
{

    /** Constructor
     *
     *  @param log the log in which to record receiving an envelope
     */
    public EnvelopeAcceptor(Log log)
    {
        this.log = log;
    }
    
    /** Accept an envelope from customer.
     *
     *  @exception CustomerConsole.Cancelled if operation timed out or the
     *             customer cancelled it
     */
    public void acceptEnvelope() throws CustomerConsole.Cancelled
    {
        boolean inserted = Simulation.getInstance().acceptEnvelope();
        if (inserted)
            log.logEnvelopeAccepted();
        else
            throw new CustomerConsole.Cancelled();
    }
    
    /** Log in which to record receiving an envelope
     */
    private Log log;
}
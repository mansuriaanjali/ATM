package banking;

/** Abstract base class for representation of various status codes returned
 *  by bank for a transaction.  The bank will create appropriate subclasses.
 */
public abstract class Status
{
    /** Create a printable string representing this status
     *
     *  @return string representation
     */
    public String toString()
    {
        if (isSuccess())
            return "SUCCESS";
        else if (isInvalidPIN())
            return "INVALID PIN";
        else
            return "FAILURE " + getMessage();
    }
    
    /** See if this status represents success
     *
     *  @return true if this status represents success
     */
    public abstract boolean isSuccess();
    
    /** See if this status represents an invalid PIN
     *
     *  @return true if this status represents an invalid PIN
     */
    public abstract boolean isInvalidPIN();
    
    /** Accessor for message describing this status (used if status is
     *  not success)
     *
     *  @return description of the problem
     */
    public abstract String getMessage();
}
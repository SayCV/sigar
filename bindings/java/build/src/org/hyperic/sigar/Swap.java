/*****************************************************
 * WARNING: this file was generated by -e
 * on Mon Jan 13 23:21:07 2014.
 * Any changes made here will be LOST.
 *****************************************************/
package org.hyperic.sigar;

import java.util.HashMap;
import java.util.Map;

/**
 * Swap sigar class.
 */
public class Swap implements java.io.Serializable {

    private static final long serialVersionUID = 4974L;

    public Swap() { }

    public native void gather(Sigar sigar) throws SigarException;

    /**
     * This method is not intended to be called directly.
     * use Sigar.getSwap() instead.
     * @exception SigarException on failure.
     * @see org.hyperic.sigar.Sigar#getSwap
     */
    static Swap fetch(Sigar sigar) throws SigarException {
        Swap swap = new Swap();
        swap.gather(sigar);
        return swap;
    }

    long total = 0;

    /**
     * Get the Total system swap.<p>
     * Supported Platforms: All.
     * <p>
     * System equivalent commands:<ul>
     * <li> AIX: <code>lsps -s</code><br>
     * <li> Darwin: <code>sysctl vm.swapusage</code><br>
     * <li> FreeBSD: <code></code><br>
     * <li> HPUX: <code></code><br>
     * <li> Linux: <code>free</code><br>
     * <li> Solaris: <code>swap -s</code><br>
     * <li> Win32: <code></code><br>
     * </ul>
     * @return Total system swap
     */
    public long getTotal() { return total; }
    long used = 0;

    /**
     * Get the Total used system swap.<p>
     * Supported Platforms: All.
     * <p>
     * System equivalent commands:<ul>
     * <li> AIX: <code>lsps -s</code><br>
     * <li> Darwin: <code></code><br>
     * <li> FreeBSD: <code></code><br>
     * <li> HPUX: <code></code><br>
     * <li> Linux: <code>free</code><br>
     * <li> Solaris: <code>swap -s</code><br>
     * <li> Win32: <code></code><br>
     * </ul>
     * @return Total used system swap
     */
    public long getUsed() { return used; }
    long free = 0;

    /**
     * Get the Total free system swap.<p>
     * Supported Platforms: All.
     * <p>
     * System equivalent commands:<ul>
     * <li> AIX: <code></code><br>
     * <li> Darwin: <code></code><br>
     * <li> FreeBSD: <code></code><br>
     * <li> HPUX: <code></code><br>
     * <li> Linux: <code>free</code><br>
     * <li> Solaris: <code>swap -s</code><br>
     * <li> Win32: <code></code><br>
     * </ul>
     * @return Total free system swap
     */
    public long getFree() { return free; }
    long pageIn = 0;

    /**
     * Get the Pages in.<p>
     * Supported Platforms: All.
     * <p>
     * System equivalent commands:<ul>
     * <li> AIX: <code></code><br>
     * <li> Darwin: <code></code><br>
     * <li> FreeBSD: <code></code><br>
     * <li> HPUX: <code></code><br>
     * <li> Linux: <code>vmstat</code><br>
     * <li> Solaris: <code>vmstat</code><br>
     * <li> Win32: <code></code><br>
     * </ul>
     * @return Pages in
     */
    public long getPageIn() { return pageIn; }
    long pageOut = 0;

    /**
     * Get the Pages out.<p>
     * Supported Platforms: All.
     * <p>
     * System equivalent commands:<ul>
     * <li> AIX: <code></code><br>
     * <li> Darwin: <code></code><br>
     * <li> FreeBSD: <code></code><br>
     * <li> HPUX: <code></code><br>
     * <li> Linux: <code>vmstat</code><br>
     * <li> Solaris: <code>vmstat</code><br>
     * <li> Win32: <code></code><br>
     * </ul>
     * @return Pages out
     */
    public long getPageOut() { return pageOut; }

    void copyTo(Swap copy) {
        copy.total = this.total;
        copy.used = this.used;
        copy.free = this.free;
        copy.pageIn = this.pageIn;
        copy.pageOut = this.pageOut;
    }
    public String toString() {
        return
            "Swap: " +
            (this.total / 1024) + "K av, " +
            (this.used / 1024) + "K used, " +
            (this.free / 1024) + "K free";
    }

    public Map toMap() {
        Map map = new HashMap();
        String strtotal = 
            String.valueOf(this.total);
        if (!"-1".equals(strtotal))
            map.put("Total", strtotal);
        String strused = 
            String.valueOf(this.used);
        if (!"-1".equals(strused))
            map.put("Used", strused);
        String strfree = 
            String.valueOf(this.free);
        if (!"-1".equals(strfree))
            map.put("Free", strfree);
        String strpageIn = 
            String.valueOf(this.pageIn);
        if (!"-1".equals(strpageIn))
            map.put("PageIn", strpageIn);
        String strpageOut = 
            String.valueOf(this.pageOut);
        if (!"-1".equals(strpageOut))
            map.put("PageOut", strpageOut);
        return map;
    }

}

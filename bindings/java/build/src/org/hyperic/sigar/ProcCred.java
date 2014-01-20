/*****************************************************
 * WARNING: this file was generated by -e
 * on Mon Jan 13 23:21:07 2014.
 * Any changes made here will be LOST.
 *****************************************************/
package org.hyperic.sigar;

import java.util.HashMap;
import java.util.Map;

/**
 * ProcCred sigar class.
 */
public class ProcCred implements java.io.Serializable {

    private static final long serialVersionUID = 3062L;

    public ProcCred() { }

    public native void gather(Sigar sigar, long pid) throws SigarException;

    /**
     * This method is not intended to be called directly.
     * use Sigar.getProcCred() instead.
     * @exception SigarException on failure.
     * @see org.hyperic.sigar.Sigar#getProcCred
     */
    static ProcCred fetch(Sigar sigar, long pid) throws SigarException {
        ProcCred procCred = new ProcCred();
        procCred.gather(sigar, pid);
        return procCred;
    }

    long uid = 0;

    /**
     * Get the Process user id.<p>
     * Supported Platforms: AIX, Darwin, FreeBSD, HPUX, Linux, Solaris.
     * <p>
     * System equivalent commands:<ul>
     * <li> AIX: <code>top, ps</code><br>
     * <li> Darwin: <code>top, ps</code><br>
     * <li> FreeBSD: <code>top, ps</code><br>
     * <li> HPUX: <code>top, ps</code><br>
     * <li> Linux: <code>top, ps</code><br>
     * <li> Solaris: <code>top, ps</code><br>
     * <li> Win32: <code>taskman</code><br>
     * </ul>
     * @return Process user id
     */
    public long getUid() { return uid; }
    long gid = 0;

    /**
     * Get the Process group id.<p>
     * Supported Platforms: AIX, Darwin, FreeBSD, HPUX, Linux, Solaris.
     * <p>
     * System equivalent commands:<ul>
     * <li> AIX: <code>top, ps</code><br>
     * <li> Darwin: <code>top, ps</code><br>
     * <li> FreeBSD: <code>top, ps</code><br>
     * <li> HPUX: <code>top, ps</code><br>
     * <li> Linux: <code>top, ps</code><br>
     * <li> Solaris: <code>top, ps</code><br>
     * <li> Win32: <code>taskman</code><br>
     * </ul>
     * @return Process group id
     */
    public long getGid() { return gid; }
    long euid = 0;

    /**
     * Get the Process effective user id.<p>
     * Supported Platforms: AIX, Darwin, FreeBSD, HPUX, Linux, Solaris.
     * <p>
     * System equivalent commands:<ul>
     * <li> AIX: <code>top, ps</code><br>
     * <li> Darwin: <code>top, ps</code><br>
     * <li> FreeBSD: <code>top, ps</code><br>
     * <li> HPUX: <code>top, ps</code><br>
     * <li> Linux: <code>top, ps</code><br>
     * <li> Solaris: <code>top, ps</code><br>
     * <li> Win32: <code>taskman</code><br>
     * </ul>
     * @return Process effective user id
     */
    public long getEuid() { return euid; }
    long egid = 0;

    /**
     * Get the Process effective group id.<p>
     * Supported Platforms: AIX, Darwin, FreeBSD, HPUX, Linux, Solaris.
     * <p>
     * System equivalent commands:<ul>
     * <li> AIX: <code>top, ps</code><br>
     * <li> Darwin: <code>top, ps</code><br>
     * <li> FreeBSD: <code>top, ps</code><br>
     * <li> HPUX: <code>top, ps</code><br>
     * <li> Linux: <code>top, ps</code><br>
     * <li> Solaris: <code>top, ps</code><br>
     * <li> Win32: <code>taskman</code><br>
     * </ul>
     * @return Process effective group id
     */
    public long getEgid() { return egid; }

    void copyTo(ProcCred copy) {
        copy.uid = this.uid;
        copy.gid = this.gid;
        copy.euid = this.euid;
        copy.egid = this.egid;
    }

    public Map toMap() {
        Map map = new HashMap();
        String struid = 
            String.valueOf(this.uid);
        if (!"-1".equals(struid))
            map.put("Uid", struid);
        String strgid = 
            String.valueOf(this.gid);
        if (!"-1".equals(strgid))
            map.put("Gid", strgid);
        String streuid = 
            String.valueOf(this.euid);
        if (!"-1".equals(streuid))
            map.put("Euid", streuid);
        String stregid = 
            String.valueOf(this.egid);
        if (!"-1".equals(stregid))
            map.put("Egid", stregid);
        return map;
    }

    public String toString() {
        return toMap().toString();
    }

}

package diemhp;
import static java.awt.PageAttributes.MediaType.D;
	
	abstract class DiemHP {
	    protected String tenHP;
	    protected int soTinChi;
	    
	    public DiemHP(String thp, int stc) {
	        tenHP= thp;
	        soTinChi= stc;
	    }
	    
	    public String layTenHP() {
	        return tenHP;
	    }
	    
	    public int laySoTinChi() {
	        return soTinChi;
	    }
	    
	    public abstract double tinhDiem();
	}

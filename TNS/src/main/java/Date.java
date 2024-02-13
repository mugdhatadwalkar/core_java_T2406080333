
public class Date {
private int dd,mm,yy;

public Date(int dd, int mm, int yy) {
	
	this.dd = dd;
	this.mm = mm;
	this.yy = yy;
}

public String toString() {
	return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
}


public static void main(String[] args) {
	Date d= new Date(13,2,2024);
	d=new Date(14,2,2024);
	System.out.println(d);
}


}

package exercise4;

import org.w3c.dom.css.Rect;

public class Rectangle {
	private int x, y;                        // linke untere Ecke
	private int width;                       // Ausdehnung in x-Richtung
	private int height;                      // Ausdehnung in y-Richtung
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a = new Rectangle(0, 0, 5, 5);
		Rectangle b = new Rectangle(2, 2, 4, 4);
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(a.intersect(b));
		System.out.println(a.intersect2(b));
		System.out.println((a.union(b)).toString());
		System.out.println((a.union2(b)).toString());
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + ", width=" + width
				+ ", height=" + height + "]";
	}
	public boolean intersect(Rectangle r2) {
		int x2 = x+width;
		int y2 = y+height;
		int r2x2 = r2.x+r2.width;
		int r2y2 = r2.y+r2.height;
		int resx = 0, resy = 0;
		if(pointIn(r2.x, x, x2) || pointIn(r2.x, x, x2))resx+=1;
		if(pointIn(r2x2, x, x2) || pointIn(r2x2, x, x2))resx+=1;
		if(pointIn(r2.y, y, y2) || pointIn(r2.y, y, y2))resy+=1;
		if(pointIn(r2y2, y, y2) || pointIn(r2y2, y, y2))resy+=1;
		if(resx>0&&resy>0) return true;
		else if((resx>1) && (y>r2.y) && (y2<r2y2)) return true;
		else if((resy>1) && (x>r2.x) && (x2<r2x2)) return true;
		else if(x>r2.x && x2<r2x2 && y>r2.y && y2<r2y2) return true;
		return false;
	}
	
	private boolean pointIn(int point, int a, int b){
		if( (point >= a) && (point <= b) ) return true;
		else return false;
	}
	
	public Rectangle union(Rectangle r2) {
		int newx = min(x, r2.x);
		int newy = min(y, r2.y);
		return new Rectangle(newx, newy, max(x+width, r2.x+r2.width) - newx, max(r2.y+r2.height, y+height) - newy);
	}

	private int max(int a, int b){
		return (a>b) ? a : b;
	}

	private int min(int a, int b){
		return (a>b) ? b : a;
	}

	public boolean intersect2(Rectangle r2) {
		if(x+width<r2.getX()||x>r2.getX()+r2.getWidth()||y+height<r2.getY()||y>getY()+r2.getHeight())
		return false;
		else return true;
		}
	
	public Rectangle union2(Rectangle r2) {
		Rectangle r3=new Rectangle(0,0,0,0);
		int x0, y0, w, hoe;

		if(r2.getX()<x){
		x0=r2.getX();
		}
		else {
		x0=x;
		}
		if(r2.getY()<y){
		y0=r2.getY();
		}
		else{
		y0=y;
		}
		if(x+width>r2.getX()+r2.getWidth())
		w=x+width-x0;
		else
		w=r2.getX()+r2.getWidth()-x0;

		if(y+height>r2.getY()+r2.getHeight())
		hoe=y+height-y0;
		else
		hoe=r2.getY()+r2.getHeight()-y0;

		r3.set(x0, y0, w, hoe);
		return r3;

	}
	public void set(int a, int b, int breite, int hoehe){
		x=a;
		y=b;
		width=breite;
		height=hoehe;
	}
	
}

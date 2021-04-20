package geometry;

import java.awt.Graphics;

public abstract class Shape implements Moveable, Comparable{
		//private boolean selected;
		protected boolean selected; 
		
		//Konstruktori: 
		public Shape() {
			
		}
		public Shape(boolean selected) {
			this.selected = selected;
		}
		
		//Apstraktne metode (ne sadrže implementaciju):
		public abstract boolean contains(int x, int y); 
		public abstract void draw(Graphics g);
		
		//Metode pristupa:
		public boolean isSelected() {
			return selected;
		}
		public void setSelected(boolean selected) {
			this.selected = selected;
		}
}

package oop.test05;

public class Philtong {
	
	   Pencil pn1;
	   Pencil pn2;
	   Eraser e;
	   Pen p1;
	   Pen p2;
	   
	   boolean checkColorPencil() {
	      if(pn1 != null && pn2 != null) {
	         return false;
	      }
	      else {
	         return true;
	      }
	   }
	   
	   boolean checkEraser() {
		   if(e != null) {
			   return false;
		   }
		   else {
			   return true;
		   }
	   }
	   
	   boolean checkPen() {
	      if(p1 != null && p2 != null) {
	         return false;
	      }
	      else {
	         return true;
	      }
	   }
	   
	   
}

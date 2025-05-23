package keshCode;
import javax.swing.JOptionPane;
public class Main {

	
		private String me;
		private String one;
		private String two;
		private int oneW;
		private int twoW;
		private int threeW;
		private String totalW;
		public Main(String meM, String w1, String w2, int pOne, int Ptwo, int pThree) {
			me = meM;
			one = w1;
			two = w2;
			oneW = pOne;
			twoW = Ptwo;
			threeW = pThree;
			
			
			
		}
	
		public void printW(String total, int p1, int p2, int p3) {
			totalW = total;
			JOptionPane.showMessageDialog(null, totalW);
			oneW = p1;
			twoW = p2;
			threeW = p3;
			if(oneW > twoW) {
				JOptionPane.showMessageDialog(null, me + " weights more than " + one);
				if(twoW > threeW) {
					JOptionPane.showMessageDialog(null, one + " weights more than " + two);
					
				}
				if(threeW > twoW) {
					JOptionPane.showMessageDialog(null, two + " weights more than " + one);
					if(oneW > threeW) {
						JOptionPane.showMessageDialog(null, me + " weights more than " + two);
						JOptionPane.showMessageDialog(null, me + " weights the most ");
					}
					if(threeW > oneW) {
						JOptionPane.showMessageDialog(null, two + " weights more than " + me);
						JOptionPane.showMessageDialog(null, two + " weights the most ");

					}
				}
				
			}
			if(twoW > threeW && twoW > oneW) {
				JOptionPane.showMessageDialog(null, one + " weights the most ");
			}
		}

}

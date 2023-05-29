package swingpack;
import javax.swing.*;

public class AdditionUsingJavaSwing {

	public static void main(String[] args) 
	{
		int n1,n2;
		String a =JOptionPane.showInputDialog(null, "Enter Number");
		String b =JOptionPane.showInputDialog(null, "Enter Another Number");
		try
		{
			n1=Integer.parseInt(a);
			n2=Integer.parseInt(b);
			int n3=n1+n2;
			JOptionPane.showMessageDialog(null, "Result is : "+n3);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		//OptionPane.showMessageDialog(null, a);
	}

}

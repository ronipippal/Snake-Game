import javax.swing.JFrame;


public class Snake extends JFrame {

	
	Snake() 
	{
	   Board b =new Board();
	   
	   add(b);
	   pack(); //pack() ka use hum log frame ka size set krne ke liye krte hai
	   
	 //  setLocation(500,250);
	   setLocationRelativeTo(null); // frame ko center pr lane ke liye use kiya hai
	   setTitle("Snake game"); // esh ko hum super("Sanke game") method se bhi kr skte hai super() hum ko sb se pehle use krna hoga
	   setResizable(false);
	  	
	}




	public static void main(String[] args)
	{
		Snake sk=new Snake();
		sk.setVisible(true);
	}
}

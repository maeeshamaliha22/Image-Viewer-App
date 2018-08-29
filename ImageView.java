import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class ImageView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new ImageViewer();
		frame.setTitle("Image Viewer App");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
	
	}

}

class ImageViewer extends JFrame
{
	JLabel label;
	JFileChooser chooser;
	
	public ImageViewer()
	{
		setSize(500,500);
		
		label=new JLabel();
		add(label);
		
		final JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("."));
		
		JMenuBar menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		JMenu menu=new JMenu("File");
		menubar.add(menu);
		
		JMenuItem menuitem = new JMenuItem("Open");
		menu.add(menuitem);
		
		menuitem.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
				int result=chooser.showOpenDialog(null);
				
				if(result==JFileChooser.APPROVE_OPTION)
				{
					String name=chooser.getSelectedFile().getPath();
					label.setIcon(new ImageIcon(name));
				}
			}
			
		});
		
		
		
		
	}
}
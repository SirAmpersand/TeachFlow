import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;

public class Frame1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//set up a new class room file
		JButton btnNewClassroom = new JButton("New Classroom");
		btnNewClassroom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = JOptionPane.showInputDialog("Enter the Name of Your New Classroom:");
				NewRoom obj = new NewRoom();
				obj.setName(name);
				String grade = JOptionPane.showInputDialog("Enter the grade number for your class:");
				int roomGrade;
				//TODO HANDLE ANY POSSIBLE ERRORS FOR THE PARSE, OR FORCE USER TO ENTER INT
				roomGrade = Integer.parseInt(grade);
				obj.setGradeNum(roomGrade);
				obj.setGradeFin();
				//take this out later, test line
				obj.printGradeFin();
				String studentnum = JOptionPane.showInputDialog("How many students are in your class?");
				int numstu;
				//TODO: HANDLE ANY POSSIBLE ERRORS FOR THE PARSE, OR FORCE USER TO ENTER INT
				numstu = Integer.parseInt(studentnum);
				
				int neg = 0;
				
				String names[] = new String[numstu];
				do {
					names[neg]=JOptionPane.showInputDialog("Enter the name of one of your students:");
					neg ++;
				}while(neg < numstu);
				obj.setStuNames(names);
				obj.saveRoom();
				
			
			}
		});
		
		btnNewClassroom.setBounds(107, 55, 225, 35);
		frame.getContentPane().add(btnNewClassroom);
		
		
		
		JButton btnExistingClassroom = new JButton("Existing Classroom");
		btnExistingClassroom.setBounds(107, 139, 225, 35);
		frame.getContentPane().add(btnExistingClassroom);
		
		JLabel lblClassroomTool = new JLabel("Classroom Tool");
		lblClassroomTool.setBounds(175, 0, 70, 15);
		frame.getContentPane().add(lblClassroomTool);
	}
}

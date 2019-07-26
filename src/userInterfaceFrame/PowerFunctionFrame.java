package userInterfaceFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import com.scep.error.ErrorService;
import com.scep.error.ErrorServiceImpl;
import com.scep.service.PowerService;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PowerFunctionFrame {

	private JFrame frame;
	private JTextArea outputText;
	private JTextArea yValue;
	private JTextArea xValue;
	private PowerService powerService = new PowerService();
	private ErrorService errorService = new ErrorServiceImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PowerFunctionFrame window = new PowerFunctionFrame();
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
	public PowerFunctionFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 744, 608);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = xValue.getText();
				String y = yValue.getText();
				
				if(!errorService.checkFormat(x, y)) {
					outputText.setText("Please provide Numbers");
				}else {
					Double xDouble = Double.parseDouble(x);
					Double yDouble = Double.parseDouble(y);
								
					Double output = powerService.power(xDouble, yDouble);
					outputText.setText(output + "");
				}
									
			}
		});
		btnNewButton.setBounds(247, 276, 232, 57);
		frame.getContentPane().add(btnNewButton);

		JLabel frameName = new JLabel();
		frameName.setText("EXPONENTIAL FUNCTION CALCULATOR");
		frameName.setBounds(270, 120, 240, 57);
		frame.getContentPane().add(frameName);
		
		JLabel xLabel = new JLabel();
		xLabel.setText("X Value");
		xLabel.setBounds(140, 208, 173, 22);
		frame.getContentPane().add(xLabel);
		
		xValue = new JTextArea();
		xValue.setText("");
		xValue.setBounds(190, 208, 132, 22);
		frame.getContentPane().add(xValue);

		JLabel yLabel = new JLabel();
		yLabel.setText("Y Value");
		yLabel.setBounds(400, 208, 173, 22);
		frame.getContentPane().add(yLabel);
		
		yValue = new JTextArea();
		yValue.setText("");
		yValue.setBounds(450, 208, 132, 22);
		frame.getContentPane().add(yValue);
		
		JLabel resultLable = new JLabel();
		resultLable.setText("RESULT");
		resultLable.setBounds(173, 420, 407, 22);
		frame.getContentPane().add(resultLable);
		
		outputText = new JTextArea();
		outputText.setBounds(173, 441, 407, 22);
		frame.getContentPane().add(outputText);
	}
}

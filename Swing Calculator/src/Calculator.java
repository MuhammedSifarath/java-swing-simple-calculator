import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.AttributeSet.FontAttribute;


public class Calculator implements ActionListener{
	JFrame jf;
	boolean plusOperatorClicked=false;
	boolean minusOperatorClicked=false;
	boolean divisionOperatorClicked=false;
	boolean multiplyOperatorClicked=false;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton,nineButton,fourButton,fiveButton;
	JButton sixButton, oneButton,twoButton,threeButton;
	JButton zeroButton,dotButton;
	JButton clearButton,divisionButton,multiplyButton,minusButton;
	JButton plusButton,equalButton;
	String oldValue,newValue;
	float result;
	char operator;
	
	
	
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(305, 405);
		jf.setLocation(50, 50);
		jf.getContentPane().setBackground(Color.DARK_GRAY);
		
	
		
		displayLabel=new JLabel();
		displayLabel.setBounds(10, 10, 270, 50);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setBackground(Color.black);
		displayLabel.setForeground(Color.WHITE);
		displayLabel.setFont(new Font("Ariel",Font.BOLD,20));
		displayLabel.setOpaque(true);
		jf.add(displayLabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(10, 130, 61, 50);
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Ariel",Font.BOLD,20));
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(80, 130, 61, 50);
		eightButton.addActionListener(this);
		eightButton.setFont(new Font("Ariel",Font.BOLD,20));
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(150, 130, 61, 50);
		nineButton.addActionListener(this);
		nineButton.setFont(new Font("Ariel",Font.BOLD,20));
		jf.add(nineButton);
		
		
		fourButton=new JButton("4");
		fourButton.setBounds(10, 190, 61, 50);
		fourButton.addActionListener(this);
		fourButton.setFont(new Font("Ariel",Font.BOLD,20));
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(80, 190, 61, 50);
		fiveButton.addActionListener(this);
		fiveButton.setFont(new Font("Ariel",Font.BOLD,20));
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(150, 190, 61, 50);
		sixButton.addActionListener(this);
		sixButton.setFont(new Font("Ariel",Font.BOLD,20));
		jf.add(sixButton);		
		
		oneButton=new JButton("1");
		oneButton.setBounds(10, 250, 61, 50);
		oneButton.addActionListener(this);
		oneButton.setFont(new Font("Ariel",Font.BOLD,20));
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(80, 250, 61, 50);
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("Ariel",Font.BOLD,20));
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(150, 250, 61, 50);
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Ariel",Font.BOLD,20));
		jf.add(threeButton);
		
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(10, 310, 132, 50);
		zeroButton.addActionListener(this);
		zeroButton.setFont(new Font("Ariel",Font.BOLD,20));
		jf.add(zeroButton);
		 
		
		dotButton=new JButton(".");
		dotButton.setBounds(150, 310, 61, 50);
		dotButton.addActionListener(this);
		dotButton.setFont(new Font("Ariel",Font.BOLD,20));
		jf.add(dotButton);
		
		
		
		
		
		clearButton=new JButton("C");
		clearButton.setBounds(10, 70, 61, 50);
		clearButton.addActionListener(this);
		clearButton.setFont(new Font("Ariel",Font.BOLD,20));
		jf.add(clearButton);
		
		
		divisionButton=new JButton("/");
		divisionButton.setBounds(80, 70, 61, 50);
		divisionButton.addActionListener(this);
		divisionButton.setFont(new Font("Ariel",Font.BOLD,20));
		jf.add(divisionButton);
		
		multiplyButton=new JButton("x");
		multiplyButton.setBounds(150, 70, 61, 50);
		multiplyButton.addActionListener(this);
		multiplyButton.setFont(new Font("Ariel",Font.BOLD,20 ));
		jf.add(multiplyButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(220, 70, 61, 50);
		minusButton.addActionListener(this);
		minusButton.setFont(new Font("Ariel",Font.BOLD,20));
		jf.add(minusButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(220, 130, 61, 110);
		plusButton.addActionListener(this);
		plusButton.setFont(new Font("Ariel",Font.BOLD,20));
		jf.add(plusButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(220, 250, 61, 110);
		equalButton.addActionListener(this);
		equalButton.setFont(new Font("Ariel",Font.BOLD,20));
		jf.add(equalButton);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}

	
	public static void main(String[] args) {
		new Calculator();
		
	}


	@Override 
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			if(plusOperatorClicked) {
				displayLabel.setText("7");
				plusOperatorClicked=false;
			}else if(minusOperatorClicked) {
				displayLabel.setText("7");
				minusOperatorClicked=false;
			}else if(divisionOperatorClicked) {
				displayLabel.setText("7");
				divisionOperatorClicked=false;
			}else if(multiplyOperatorClicked) {
				displayLabel.setText("7");
				multiplyOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
			
		}else if(e.getSource()==eightButton) {
			if(plusOperatorClicked) {
				displayLabel.setText("8");
				plusOperatorClicked=false;
			}else if(minusOperatorClicked) {
				displayLabel.setText("8");
				minusOperatorClicked=false;
			}else if(divisionOperatorClicked) {
				displayLabel.setText("8");
				divisionOperatorClicked=false;
			}else if(multiplyOperatorClicked) {
				displayLabel.setText("8");
				multiplyOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"8");
			}
		}else if(e.getSource()==nineButton) {
			if(plusOperatorClicked) {
				displayLabel.setText("9");
				plusOperatorClicked=false;
			}else if(minusOperatorClicked) {
				displayLabel.setText("9");
				minusOperatorClicked=false;
			}else if(divisionOperatorClicked) {
				displayLabel.setText("9");
				divisionOperatorClicked=false;
			}else if(multiplyOperatorClicked) {
				displayLabel.setText("9");
				multiplyOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"9");
			}
		}else if(e.getSource()==fourButton) {
			if(plusOperatorClicked) {
				displayLabel.setText("4");
				plusOperatorClicked=false;
			}else if(minusOperatorClicked) {
				displayLabel.setText("4");
				minusOperatorClicked=false;
			}else if(divisionOperatorClicked) {
				displayLabel.setText("4");
				divisionOperatorClicked=false;
			}else if(multiplyOperatorClicked) {
				displayLabel.setText("4");
				multiplyOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"4");
			}
		}else if(e.getSource()==fiveButton) {
			if(plusOperatorClicked) {
				displayLabel.setText("5");
				plusOperatorClicked=false;
			}else if(minusOperatorClicked) {
				displayLabel.setText("5");
				minusOperatorClicked=false;
			}else if(divisionOperatorClicked) {
				displayLabel.setText("5");
				divisionOperatorClicked=false;
			}else if(multiplyOperatorClicked) {
				displayLabel.setText("5");
				multiplyOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"5");
			}
		}else if(e.getSource()==sixButton) {
			if(plusOperatorClicked) {
				displayLabel.setText("6");
				plusOperatorClicked=false;
			}else if(minusOperatorClicked) {
				displayLabel.setText("6");
				minusOperatorClicked=false;
			}else if(divisionOperatorClicked) {
				displayLabel.setText("6");
				divisionOperatorClicked=false;
			}else if(multiplyOperatorClicked) {
				displayLabel.setText("6");
				multiplyOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"6");
			}
		}else if(e.getSource()==oneButton) {
			if(plusOperatorClicked) {
				displayLabel.setText("1");
				plusOperatorClicked=false;
			}else if(minusOperatorClicked) {
				displayLabel.setText("1");
				minusOperatorClicked=false;
			}else if(divisionOperatorClicked) {
				displayLabel.setText("1");
				divisionOperatorClicked=false;
			}else if(multiplyOperatorClicked) {
				displayLabel.setText("1");
				multiplyOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"1");
			}
		}else if(e.getSource()==twoButton) {
			if(plusOperatorClicked) {
				displayLabel.setText("2");
				plusOperatorClicked=false;
			}else if(minusOperatorClicked) {
				displayLabel.setText("2");
				minusOperatorClicked=false;
			}else if(divisionOperatorClicked) {
				displayLabel.setText("2");
				divisionOperatorClicked=false;
			}else if(multiplyOperatorClicked) {
				displayLabel.setText("2");
				multiplyOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"2");
			}
		}else if(e.getSource()==threeButton) {
			if(plusOperatorClicked) {
				displayLabel.setText("3");
				plusOperatorClicked=false;
			}else if(minusOperatorClicked) {
				displayLabel.setText("3");
				minusOperatorClicked=false;
			}else if(divisionOperatorClicked) {
				displayLabel.setText("3");
				divisionOperatorClicked=false;
			}else if(multiplyOperatorClicked) {
				displayLabel.setText("3");
				multiplyOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"3");
			}
		}else if(e.getSource()==zeroButton) {
			if(plusOperatorClicked) {
				displayLabel.setText("0");
				plusOperatorClicked=false;
			}else if(minusOperatorClicked) {
				displayLabel.setText("0");
				minusOperatorClicked=false;
			}else if(divisionOperatorClicked) {
				displayLabel.setText("0");
				divisionOperatorClicked=false;
			}else if(multiplyOperatorClicked) {
				displayLabel.setText("0");
				multiplyOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"0");
			}
		}else if(e.getSource()==dotButton) {
			if(plusOperatorClicked) {
				displayLabel.setText(".");
				plusOperatorClicked=false;
			}else if(minusOperatorClicked) {
				displayLabel.setText(".");
				minusOperatorClicked=false;
			}else if(divisionOperatorClicked) {
				displayLabel.setText(".");
				divisionOperatorClicked=false;
			}else if(multiplyOperatorClicked) {
				displayLabel.setText(".");
				multiplyOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+".");
			}
		
		}else if(e.getSource()==divisionButton) {
			divisionOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator='/';
			
		}else if(e.getSource()==multiplyButton) {
			multiplyOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator='*';
			
		}else if(e.getSource()==minusButton) {
			minusOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator='-';
			
		}else if(e.getSource()==plusButton) {
			plusOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator='+';
					
		}else if(e.getSource()==clearButton) {
			displayLabel.setText("");
			
		}else if(e.getSource()==equalButton) {
			newValue=displayLabel.getText();
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			
			switch(operator) {
			case'+':
				result=oldValueF+newValueF;
				break;
			case'-':
				result=oldValueF-newValueF;
				break;
			case'*':
				result=oldValueF*newValueF;
				break;
			case'/':
				result=oldValueF/newValueF;
				break;
			}
			displayLabel.setText(result+"");
			oldValueF=result;
			
			
			
		}
		 
		
	}
}

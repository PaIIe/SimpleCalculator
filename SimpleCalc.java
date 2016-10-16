import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleCalc {

private JFrame frame;
private JTextField numOne;
private JTextField numTwo;
private JTextField answer;

/**
 * Launch the application.
 */
public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
  public void run() {
    try {
      SimpleCalc window = new SimpleCalc();
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
public SimpleCalc() {
  initialize();
}

/**
 * Initialize the contents of the frame.
 */
private void initialize() {
  frame = new JFrame();
  frame.setBounds(100, 100, 450, 300);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  numOne = new JTextField();
  numOne.setColumns(10);
  
  numTwo = new JTextField();
  numTwo.setColumns(10);
  
  JRadioButton rdbtnAdd = new JRadioButton("Add");
  
  JRadioButton rdbtnSup = new JRadioButton("Sup");
  
  JRadioButton rdbtnMul = new JRadioButton("Mul");
  
  JRadioButton rdbtnDiv = new JRadioButton("Div");
  
  JButton btnCalculate = new JButton("Calculate!");
  btnCalculate.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) 
    {
      int num1, num2, answer;
      try
      {
        if(rdbtnAdd.action(null, rdbtnAdd) == true)//TODO IF
        {
          num1 = Interger.parseInt()
        }
        
      }
        
      }
      catch(Exception e)
      {
        JOptionPane.showMessageDialog(null,"Please Enter Valid Number!!");
        
      }
      
      
    }
  });
  
  answer = new JTextField();
  answer.setColumns(10);
  GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
  groupLayout.setHorizontalGroup(
    groupLayout.createParallelGroup(Alignment.LEADING)
      .addGroup(groupLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
          .addComponent(numOne, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
          .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
            .addGroup(groupLayout.createSequentialGroup()
              .addGap(2)
              .addComponent(rdbtnSup)
              .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(rdbtnMul))
            .addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
              .addComponent(rdbtnAdd)
              .addGap(10)
              .addComponent(rdbtnDiv))))
        .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
          .addGroup(groupLayout.createSequentialGroup()
            .addGap(65)
            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
              .addComponent(numTwo, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
              .addComponent(answer, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
          .addGroup(groupLayout.createSequentialGroup()
            .addPreferredGap(ComponentPlacement.RELATED)
            .addComponent(btnCalculate, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
            .addGap(56))))
  );
  groupLayout.setVerticalGroup(
    groupLayout.createParallelGroup(Alignment.TRAILING)
      .addGroup(groupLayout.createSequentialGroup()
        .addGap(27)
        .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
          .addComponent(numOne, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
          .addComponent(numTwo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        .addGap(18)
        .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
          .addGroup(groupLayout.createSequentialGroup()
            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
              .addComponent(rdbtnAdd)
              .addComponent(rdbtnDiv))
            .addGap(8)
            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
              .addComponent(rdbtnSup)
              .addComponent(rdbtnMul))
            .addGap(15))
          .addComponent(btnCalculate, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(ComponentPlacement.UNRELATED)
        .addComponent(answer, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
        .addGap(60))
  );
  frame.getContentPane().setLayout(groupLayout);
}
}

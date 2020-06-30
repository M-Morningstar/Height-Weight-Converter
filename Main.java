//Mert Salih Osoydan 
//2019-10-30
//The goal is to reach batman signal.

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
    	String[] leftSide = {"Feet", "Inches", "Pounds", "Cm", "Kg"};
        JFrame jf = new JFrame();
        JLabel jl = new JLabel();
        JComboBox jb1 = new JComboBox(leftSide);
        JComboBox jb2 = new JComboBox(leftSide);
        JButton b = new JButton("Convert");
        JTextField jt = new JTextField("Input");
        
        jl.setSize(400,500);
        
        jb1.setBounds(20,50,75,20);
        jb2.setBounds(105,50,75,20);
        
        jt.setBounds(62, 100, 75, 20);
        
        b.setBounds(62, 150, 75, 20);
        
        jf.add(jb1); jf.add(jb2);
        jf.add(b);
        jf.add(jt);
        jf.add(jl);
        jf.setSize(400,400);
        jf.setVisible(true);
        
       	b.addActionListener(new ActionListener(){
       		public void actionPerformed(ActionEvent e) {
       			if(jb1.getItemAt(jb1.getSelectedIndex()).equals(jb2.getItemAt(jb2.getSelectedIndex()))) {
       				jl.setText("         Please choose different units.");
       			}
       			else {
       					if(jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[0]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[1])) {
       						String s = jt.getText();
       						Double num1 = Double.parseDouble(s);
       						Double answer = num1*12;
       						if(answer == 1) {
       							jl.setText("      Your answer is " + Double.toString(answer) + " inch.");
       						}
       						else {
       							jl.setText("      Your answer is " + Double.toString(answer) + " inches.");
       						}
       					}
       					else if(jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[0]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[2]) || jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[0]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[4])) {
       						jl.setText("      Unrelated Units!");
       					}
       					else if(jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[0]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[3])) {
       						String s = jt.getText();
       						Double num1 = Double.parseDouble(s);
       						Double answer = num1*30.48;
       						jl.setText("      Your answer is " + Double.toString(answer) + " cm.");
       					}
       					else if(jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[1]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[0])){
       						String s = jt.getText();
       						Double num1 = Double.parseDouble(s);
       						Double answer = num1/12;
       						if(answer == 1) {
       							jl.setText("      Your answer is " + Double.toString(answer) + " foot.");
       						}
       						else {
       							jl.setText("      Your answer is " + Double.toString(answer) + " feet.");
       						}
       					}
       					else if(jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[1]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[2]) || jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[1]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[4])) {
       						jl.setText("      Unrelated Units!");
       					}
       					else if(jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[1]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[3])) {
       						String s = jt.getText();
       						Double num1 = Double.parseDouble(s);
       						Double answer = num1*2.54;
       						jl.setText("      Your answer is " + Double.toString(answer) + " cm.");
       					}
       					else if(jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[2]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[0]) || jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[2]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[1]) || jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[2]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[3])) {
       						jl.setText("      Unrelated Units!");
       					}
       					else if(jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[2]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[4])) {
       						String s = jt.getText();
       						Double num1 = Double.parseDouble(s);
       						Double answer = num1/2.205;
       						jl.setText("      Your answer is " + Double.toString(answer) + " kg.");
       					}
       					else if(jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[3]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[0])) {
       						String s = jt.getText();
       						Double num1 = Double.parseDouble(s);
       						Double answer = num1/30.48;
       						if(answer == 1) {
       							jl.setText("      Your answer is " + Double.toString(answer) + " foot.");
       						}
       						else {
       							jl.setText("      Your answer is " + Double.toString(answer) + " feet.");
       						}
       					}
       					else if(jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[3]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[1])) {
       						String s = jt.getText();
       						Double num1 = Double.parseDouble(s);
       						Double answer = num1/2.54;
       						if(answer == 1) {
       							jl.setText("      Your answer is " + Double.toString(answer) + " inch.");
       						}
       						else {
       							jl.setText("      Your answer is " + Double.toString(answer) + " inches.");
       						}
       					}
       					else if(jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[3]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[2]) || jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[3]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[4])) {
       						jl.setText("      Unrelated Units!");
       					}
       					else if(jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[4]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[0]) || jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[4]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[1]) || jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[4]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[3])) {
       						jl.setText("      Unrelated Units!");
       					}
       					else if(jb1.getItemAt(jb1.getSelectedIndex()).equals(leftSide[4]) && jb2.getItemAt(jb2.getSelectedIndex()).equals(leftSide[2])) {
       						String s = jt.getText();
       						Double num1 = Double.parseDouble(s);
       						Double answer = num1*2.205;
       						if(answer == 1) {
       							jl.setText("      Your answer is " + Double.toString(answer) + " pound.");
       						}
       						else {
       							jl.setText("      Your answer is " + Double.toString(answer) + " pounds.");
       						}
       					}
       			}
       			
       		}
       		
       	});
    }
}













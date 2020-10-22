import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame{
    //private Container cp;
    private JButton jbtn11 = new JButton();
    private JButton jbtn12 = new JButton();
    private JButton jbtn13 = new JButton();
    private JButton jbtn21 = new JButton();
    private JButton jbtn22 = new JButton();
    private JButton jbtn23 = new JButton();
    private JButton jbtn31 = new JButton();
    private JButton jbtn32 = new JButton();
    private JButton jbtn33 = new JButton();
    private JButton exit = new JButton("Exit");
    private JButton clear = new JButton("Clear");
    private JButton go = new JButton("Go!");
    private boolean flag = true;
    public MainFrame(){
        init();
    }
    private void init(){
        this.setLayout(new GridLayout(4,3,3,3));
        this.setBounds(100,100,400,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //cp = this.getContentPane();
        this.add(jbtn11);
        this.add(jbtn12);
        this.add(jbtn13);
        this.add(jbtn21);
        this.add(jbtn22);
        this.add(jbtn23);
        this.add(jbtn31);
        this.add(jbtn32);
        this.add(jbtn33);
        this.add(exit);
        this.add(clear);
        this.add(go);
        jbtn11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                JButton tmpBtn = (JButton)ae.getSource();
                if(flag){tmpBtn.setText("O");
                }else{tmpBtn.setText("X");}
                flag=!flag;
                tmpBtn.setFont(new Font(null,0,64));
                test();
            }
        });
        jbtn12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                JButton tmpBtn = (JButton)ae.getSource();
                if(flag){tmpBtn.setText("O");
            }else{tmpBtn.setText("X");}
            flag=!flag;
                tmpBtn.setFont(new Font(null,0,64));
                test();
            }
        });
        jbtn13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                JButton tmpBtn = (JButton)ae.getSource();
                if(flag){tmpBtn.setText("O");
                }else{tmpBtn.setText("X");}
                flag=!flag;
                tmpBtn.setFont(new Font(null,0,64));
                test();
            }
        });
        jbtn21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                JButton tmpBtn = (JButton)ae.getSource();
                if(flag){tmpBtn.setText("O");
                }else{tmpBtn.setText("X");}
                flag=!flag;
                tmpBtn.setFont(new Font(null,0,64));
                test();
            }
        });
        jbtn22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                JButton tmpBtn = (JButton)ae.getSource();
                if(flag){tmpBtn.setText("O");
                }else{tmpBtn.setText("X");}
                flag=!flag;
                tmpBtn.setFont(new Font(null,0,64));
                test();
            }
        });
        jbtn23.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                JButton tmpBtn = (JButton)ae.getSource();
                if(flag){tmpBtn.setText("O");
                }else{tmpBtn.setText("X");}
                flag=!flag;
                tmpBtn.setFont(new Font(null,0,64));
                test();
            }
        });
        jbtn31.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                JButton tmpBtn = (JButton)ae.getSource();
                if(flag){tmpBtn.setText("O");
            }else{tmpBtn.setText("X");}
            flag=!flag;
                tmpBtn.setFont(new Font(null,0,64));
                test();
            }
        });
        jbtn32.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                JButton tmpBtn = (JButton)ae.getSource();
                if(flag){tmpBtn.setText("O");
            }else{tmpBtn.setText("X");}
            flag=!flag;
                tmpBtn.setFont(new Font(null,0,64));
                test();
            }
        });
        jbtn33.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                JButton tmpBtn = (JButton)ae.getSource();
                if(flag){tmpBtn.setText("O");
            }else{tmpBtn.setText("X");}
            flag=!flag;
                tmpBtn.setFont(new Font(null,0,64));
                test();
            }
        });
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });
        clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
               jbtn11.setText(null);
               jbtn12.setText(null);
               jbtn13.setText(null);
               jbtn21.setText(null);
               jbtn22.setText(null);
               jbtn23.setText(null);
               jbtn31.setText(null);
               jbtn32.setText(null);
               jbtn33.setText(null);
               test();
            }
        });
        // go.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent ae){
                
        //     }
        // });
    }
    public void test(){
        if(jbtn11.getText().equals(jbtn12.getText()) && jbtn11.getText().equals(jbtn13.getText())){
            if(jbtn11.getText().equals("O")){
                JOptionPane.showMessageDialog(this,"Player1,Win!");
            }else if(jbtn11.getText().equals("X")){
                JOptionPane.showMessageDialog(this,"Player2,Win!");
            }
        }
        if(jbtn21.getText().equals(jbtn22.getText()) && jbtn21.getText().equals(jbtn23.getText())){
            if(jbtn21.getText().equals("O")){
                JOptionPane.showMessageDialog(this,"Player1,Win!");
            }else if(jbtn21.getText().equals("X")){
                JOptionPane.showMessageDialog(this,"Player2,Win!");
            }
        }
        if(jbtn31.getText().equals(jbtn32.getText()) && jbtn31.getText().equals(jbtn33.getText())){
            if(jbtn31.getText().equals("O")){
                JOptionPane.showMessageDialog(this,"Player1,Win!");
            }else if(jbtn31.getText().equals("X")){
                JOptionPane.showMessageDialog(this,"Player2,Win!");
            }
        }
        if(jbtn11.getText().equals(jbtn21.getText()) && jbtn11.getText().equals(jbtn31.getText())){
            if(jbtn11.getText().equals("O")){
                JOptionPane.showMessageDialog(this,"Player1,Win!");
            }else if(jbtn11.getText().equals("X")){
                JOptionPane.showMessageDialog(this,"Player2,Win!");
            }
        }
        if(jbtn12.getText().equals(jbtn22.getText()) && jbtn12.getText().equals(jbtn32.getText())){
            if(jbtn12.getText().equals("O")){
                JOptionPane.showMessageDialog(this,"Player1,Win!");
            }else if(jbtn12.getText().equals("X")){
                JOptionPane.showMessageDialog(this,"Player2,Win!");
            }
        }
        if(jbtn13.getText().equals(jbtn23.getText()) && jbtn13.getText().equals(jbtn33.getText())){
            if(jbtn13.getText().equals("O")){
                JOptionPane.showMessageDialog(this,"Player1,Win!");
            }else if(jbtn13.getText().equals("X")){
                JOptionPane.showMessageDialog(this,"Player2,Win!");
            }
        }
        if(jbtn11.getText().equals(jbtn22.getText()) && jbtn11.getText().equals(jbtn33.getText())){
            if(jbtn11.getText().equals("O")){
                JOptionPane.showMessageDialog(this,"Player1,Win!");
            }else if(jbtn11.getText().equals("X")){
                JOptionPane.showMessageDialog(this,"Player2,Win!");
            }
        }
        if(jbtn13.getText().equals(jbtn22.getText()) && jbtn13.getText().equals(jbtn31.getText())){
            if(jbtn13.getText().equals("O")){
                JOptionPane.showMessageDialog(this,"Player1,Win!");
            }else if(jbtn13.getText().equals("X")){
                JOptionPane.showMessageDialog(this,"Player2,Win!");
            }
        }
    }
}
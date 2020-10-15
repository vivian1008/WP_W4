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
            }
        });
        jbtn22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                JButton tmpBtn = (JButton)ae.getSource();
                if(flag){tmpBtn.setText("O");
                }else{tmpBtn.setText("X");}
                flag=!flag;
                tmpBtn.setFont(new Font(null,0,64));
            }
        });
        jbtn23.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                JButton tmpBtn = (JButton)ae.getSource();
                if(flag){tmpBtn.setText("O");
                }else{tmpBtn.setText("X");}
                flag=!flag;
                tmpBtn.setFont(new Font(null,0,64));
            }
        });
        jbtn31.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                JButton tmpBtn = (JButton)ae.getSource();
                if(flag){tmpBtn.setText("O");
            }else{tmpBtn.setText("X");}
            flag=!flag;
                tmpBtn.setFont(new Font(null,0,64));
            }
        });
        jbtn32.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                JButton tmpBtn = (JButton)ae.getSource();
                if(flag){tmpBtn.setText("O");
            }else{tmpBtn.setText("X");}
            flag=!flag;
                tmpBtn.setFont(new Font(null,0,64));
            }
        });
        jbtn33.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                JButton tmpBtn = (JButton)ae.getSource();
                if(flag){tmpBtn.setText("O");
            }else{tmpBtn.setText("X");}
            flag=!flag;
                tmpBtn.setFont(new Font(null,0,64));
            }
        });
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });
    }
    public void test(){
        if(jbtn11.getText().equals(jbtn12.getText()) && jbtn11.getText().equals(jbtn13.getText())){
            if(jbtn11.getText().equals("O")){
                JOptionPane.showMessageDialog(this,"Player1,Win!");
            }
        }
    }
}
package java.app.world;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Mynotepad extends JFrame implements ActionListener
{   JTextArea area;
JMenuBar menubar;
JMenuItem  new1,open,save,cut,copy,paste;
JMenu file, edit;
//FileChooser fc;
Mynotepad()
{
   // setDefaultCloseOperaton(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    area=new JTextArea();
    menubar=new JMenuBar();
    menubar.setBounds(0,0,1,2);
     area.setBounds(0,20,800,800);
    file=new JMenu("File");
    edit=new JMenu("Edit");
    new1=new JMenuItem("new");
    open=new JMenuItem("open");
    save=new JMenuItem("save");
  paste=new JMenuItem("paste");
    copy=new JMenuItem("copy");
    cut=new JMenuItem();
    add(area);
    add(menubar);
    menubar.add(file);
    menubar.add(edit);
    file. add(new1);
   file. add(open);
  file.  add(save);
    edit.add(paste);
    edit.add(copy);
   edit. add(cut);
   
   cut.addActionListener(this);
   copy.addActionListener(this);
   paste.addActionListener(this);
   
   new1.addActionListener(this);
   open.addActionListener(this);
   save.addActionListener(this);
}
 
    @Override
    public void actionPerformed(ActionEvent Tarea) {
       if(Tarea.getSource()== new1)
{
      area.setText("");
}
    };
    public static void main(String []args)
    {
        Mynotepad ob=new Mynotepad();
        ob.setSize(700,700);
        ob.setVisible(true);
        ob.setTitle("notepad");
        
    }

   

}
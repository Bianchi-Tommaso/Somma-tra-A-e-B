import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Grafica extends JFrame implements ActionListener
{
    private Container c = new Container();
    private JPanel p1 = new JPanel();
    private JTextField inizioConteggio = new JTextField(12);
    private JTextField fineConteggio = new JTextField(12);
    private JLabel iC = new JLabel("Inserire Inizio Conteggio:");
    private JLabel fC = new JLabel("Inserire Fine Conteggio:");
    private JButton calcolo = new JButton("Somma");
    private JButton stampa = new JButton("Stampa Su File");
     Calcolo ca = new Calcolo();
    
    
    public Grafica()
    {
        c = this.getContentPane();
        p1.setLayout(null);
        this.setTitle("Somma dei numeri tra A e B");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(340, 200);
        this.setResizable(false); 
        p1.setBackground(Color.orange);
        
        int X = 90;
        
        iC.setBounds(X, 10, 150, 20);
        inizioConteggio.setBounds(X, 30, 150, 20);
        fC.setBounds(X, 60, 150, 20);
        fineConteggio.setBounds(X, 90, 150, 20);
        calcolo.setBounds(50, 120, 100, 20);
        stampa.setBounds(160, 120, 120, 20);
        
        
        
        p1.add(iC);
        p1.add(inizioConteggio);
        p1.add(fC);
        p1.add(fineConteggio);
        p1.add(calcolo);
        p1.add(stampa);
        c.add(p1);
        calcolo.addActionListener(this);
        stampa.addActionListener(this);
    }
    
     public String Stampa()
    {
        int i = 0;
        String s = "";
        
        for(i = 0; i < ca.getSize(); i++)
            s += ca.getElemento(i).toString();
        
        System.out.println(s);
        return s;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        int x = 0;
        int y = 0;
        String evento = e.getActionCommand();
        String letturaInizio = "";
        String letturaFine = "";
        
        switch(evento)
        {
            case "Somma":
                letturaInizio = inizioConteggio.getText();
                letturaFine = fineConteggio.getText();
                x = Integer.valueOf(letturaInizio);
                y = Integer.valueOf(letturaFine);
                
                SommaNumeri input = new SommaNumeri(x, y);
                
                ca.SommaNumeri(input);
                inizioConteggio.setText("");
                fineConteggio.setText("");
                break;
                
            case "Stampa Su File":
            {
                Calcolo p = new Calcolo();
                try 
                {
                    p.Scrivi(Stampa());
                } catch (IOException ex) 
                {
                    Logger.getLogger(Grafica.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
        }
    }
}

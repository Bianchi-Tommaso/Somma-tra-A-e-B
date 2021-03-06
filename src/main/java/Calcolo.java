import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Calcolo 
{
    ArrayList<SommaNumeri> contenitore = new ArrayList<SommaNumeri>();
    
    public void SommaNumeri(SommaNumeri x)
    {
        int i = 0;
        double a = x.getInizioConteggio();
        double b = x.getFineConteggio();
        double somma = 0;
        
        somma = ((a + b) / 2) * (b - a + 1);
        
        x.setValore((int) somma);
        contenitore.add(x);
        
        System.out.println(contenitore.get(i).toString());
    }
    
    public SommaNumeri getElemento(int i)
    {
        return contenitore.get(i);
    }
    
    public int getSize()
    {
        return contenitore.size();
    }
    
    public void Scrivi(String s) throws IOException
    {
        FileWriter w;
        BufferedWriter b;
        
        w = new FileWriter("scrittura.txt");
        b = new BufferedWriter(w);

        b.write(s);
        b.flush();
        b.close();
        
        try  
        {  

        File file = new File("C:\\Users\\HP\\Desktop\\Nuovo PC\\Chiavetta\\Scuola\\Informatica\\Java\\ProgCalcoli\\scrittura.txt"); 
        
        if(!Desktop.isDesktopSupported())
        {  
            System.out.println("not supported");  
            return;  
        }  
        
        Desktop desktop = Desktop.getDesktop();  
            if(file.exists())          
                desktop.open(file);             
        }  
        catch(Exception e)  
        {  
            e.printStackTrace();  
        }  
    }  
}

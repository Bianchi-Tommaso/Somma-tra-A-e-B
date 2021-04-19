public class SommaNumeri 
{
    private int inizioConteggio;
    private int fineConteggio;
    private int valore;

    public SommaNumeri(int inizioConteggio, int fineConteggio) 
    {
        this.inizioConteggio = inizioConteggio;
        this.fineConteggio = fineConteggio;
    }

     public String toString()
    {
        String s = "Dati:\n " + " Inizio Conteggio: " + inizioConteggio + "\n" + " Fine Conteggio: " + fineConteggio + "\n" + "Valore Calcolato: " + valore + "\n" 
                   + "\n";
        return s;
    }
    
    public int getInizioConteggio() 
    {
        return inizioConteggio;
    }

    public void setInizioConteggio(int inizioConteggio) 
    {
        this.inizioConteggio = inizioConteggio;
    }

    public int getFineConteggio() 
    {
        return fineConteggio;
    }

    public void setFineConteggio(int fineConteggio)
    {
        this.fineConteggio = fineConteggio;
    }

    public int getValore()
    {
        return valore;
    }

    public void setValore(int valore)
    {
        this.valore = valore;
    }  
}

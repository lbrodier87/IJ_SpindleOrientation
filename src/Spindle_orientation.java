import ij.plugin.PlugIn;
        
public class Spindle_orientation implements PlugIn{
    public static void main(String arg[]){
        //<editor-fold defaultstate="collapsed" desc=" System look and feel setting code (active) ">   
        try{
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        }catch (java.lang.Exception e) {
            System.err.println(e.getMessage());
        }               
    //</editor-fold> //set system look and feel
        ij.ImageJ myIJ = new ij.ImageJ();
        myIJ.run();        
        myIJ.setVisible(true); 
        SpindleFrame SF = new SpindleFrame();
        SF.setVisible(true);    
    }
    public void run(String arg){
        //<editor-fold defaultstate="collapsed" desc=" System look and feel setting code (active) ">   
        try{
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        }catch (java.lang.Exception e) {
            System.err.println(e.getMessage());
        }               
    //</editor-fold> //set system look and feel
        SpindleFrame SF = new SpindleFrame();
        SF.setVisible(true);    
    }
}

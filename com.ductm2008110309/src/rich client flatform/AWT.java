// importing Java AWT class  
import java.awt.*;    
  
  
public class AWT extends Frame {    
  
 
   AWT() {  
  
        
      Button b = new Button("Click Me!!");  
  
   
      b.setBounds(50,100,80,30);  
  
          
      add(b);  
  
         
      setSize(200,300);  
  
      
      setTitle("This is our basic AWT example");   
          
        
      setLayout(null);   
  
      setVisible(true);  
     
}    
  
// main method  
public static void main(String args[]) {   
  
   
AWT f = new AWT();    
  
}  
  
}    
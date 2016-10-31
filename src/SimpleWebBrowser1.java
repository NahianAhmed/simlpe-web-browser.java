import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.net.URL;
import java.util.Locale;


public class SimpleWebBrowser1 extends JPanel {
    
     static String xy ;
     public SimpleWebBrowser1(String x){
     xy = x;
     }
    
    

   
   public void main() {
      JFrame window = new JFrame("Incognito mode");
      SimpleWebBrowser content = new SimpleWebBrowser();
      window.setContentPane(content);
      window.setSize(600,500);
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      window.setLocation( (screenSize.width - window.getWidth())/2,
            (screenSize.height - window.getHeight())/2 );
      //window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      window.setVisible(true);
   }
   
   
  
   
   /**
    * The pane in which documents are displayed.
    */
   public JEditorPane editPane;
   
   
   /**
    * An input box where the user enters the URL of a document
    * to be loaded into the edit pane.  A value URL string has
    * to contain the substring "://".  If the string in the box
    * does not contain this substring, then "http://" is 
    * prepended to the string.
    */
   public JTextField locationInput;
   
   
   
   public class LinkListener implements HyperlinkListener {
      @Override
      public void hyperlinkUpdate(HyperlinkEvent evt) {
         if (evt.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            loadURL(evt.getURL());
         }
      }
   }
   
   
   /**
    * Defines a listener that loads a new page when the user
    * clicks the "Go" button or presses return in the location
    * input box.
    */
   public class GoListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent evt) {
         URL url;
         try {
            String location = locationInput.getText().trim();
             
            if (location.length() == 0)
               throw new Exception();
            if (! location.contains("://"))
               location = "http://" + location;
            url = new URL(location);
             
         }
         catch (Exception e) {
            //JOptionPane.showMessageDialog (SimpleWebBrowser.this,"The Location input box does not\nccontain a legal URL.");
            return;
         }
         loadURL(url);
         locationInput.selectAll();
         locationInput.requestFocus();
      }
   }

   
   /**
    * Construct a panel that contains a JEditorPane in a JScrollPane,
    * with a tool bar that has a Location input box and a Go button.
    */
   public SimpleWebBrowser1() {
       
	
        
      
      setBackground(Color.WHITE);
      setLayout(new BorderLayout(1,1));
      setBorder(BorderFactory.createLineBorder(Color.BLACK,1));

      editPane = new JEditorPane();
      editPane.setEditable(false);
      editPane.addHyperlinkListener(new LinkListener());
      add(new JScrollPane(editPane),BorderLayout.CENTER);
      
      JToolBar toolbar = new JToolBar();
      toolbar.setFloatable(false);
      add(toolbar,BorderLayout.NORTH);
      ActionListener goListener = new GoListener();
      
      locationInput = new JTextField(("www."+xy), 40);
      
      locationInput.addActionListener(goListener);
      JButton goButton = new JButton(" Go ");
      goButton.addActionListener(goListener);
      toolbar.add( new JLabel(" Address: "));
      toolbar.add(locationInput);
      toolbar.addSeparator(new Dimension(5,0));
      toolbar.add(goButton);

   }
   
   
   /**
    * Loads the document at the specified URL into the edit pane.
     * @param url
    */
   public void loadURL(URL url) {
       
       
      try {
         editPane.setPage(url);
      }
      catch (Exception e) {
         editPane.setContentType("text/plain");
         editPane.setText( "Sorry, the requested document was not found\n"
               +"or cannot be displayed.\n\nError:" + e);
      }
   }
   
   
}

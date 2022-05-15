package SofjaApp;


import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.text.DecimalFormat;


public class MainControllerNumberSystemsSofjaApp implements Initializable {

	
	@FXML private Button 	BtnConvertNS;
	@FXML private Button 	BtnSortOutNS;
	@FXML private Button	BtnRandomExampleNS;
	@FXML private Button 	BtnSwitch;
	@FXML private TextField TFInputNS;
	@FXML private TextField TFOutputNS;
	@FXML private TextField TFNSCount;
	@FXML private TextField TFNSCount1;
	@FXML private TextField between;
	@FXML private TextArea  TAOutputSPNU;
	@FXML private Button    BtnClearAllNS;
	@FXML private Button 	L0NS;
	@FXML private Button 	L1NS;
	@FXML private Button 	L2NS;
	@FXML private Button 	L3NS;
	@FXML private Button 	L4NS;
	@FXML private Button 	L5NS;
	@FXML private Button 	L6NS;
	@FXML private Button 	L7NS;
	@FXML private Button 	L8NS;
	@FXML private Button 	L9NS;
	@FXML private Button    LANS;
	@FXML private Button    LBNS;
	@FXML private Button    LCNS1;
	@FXML private Button    LDNS;
	@FXML private Button    LENS;
	@FXML private Button    LFNS;
	
	
	
	@FXML private Button    LCNS;
	
	
	@FXML private ComboBox<String> 		comboBox1;
	@FXML private ComboBox<String> 		comboBox2;
	
	ObservableList<String> list1 = FXCollections.observableArrayList("Binary",       "Ternary",      "Quaternary",
																	 "Quinary",      "Senary",       "Septenary",
																	 "Octal",        "Nonary",       "Decimal",
																	 "Undecimal",    "Duodecimal",   "Tridecimal",
																	 "Tetradecimal", "Pentadecimal", "Hexadecimal");
	
	
	ObservableList<String> list2 = FXCollections.observableArrayList("Binary",       "Ternary",      "Quaternary",
																	 "Quinary",      "Senary",       "Septenary",
																	 "Octal",        "Nonary",       "Decimal",
																	 "Undecimal",    "Duodecimal",   "Tridecimal",
																	 "Tetradecimal", "Pentadecimal", "Hexadecimal");
	
	
	final String[] list_controll_1 = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"};
	
	final String[] list_controll_2 = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" };
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		DropShadow shadow = new DropShadow();
		//Adding the shadow when the mouse cursor is on
		BtnConvertNS.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	BtnConvertNS.setEffect(shadow);
		        }
		});
		
		//Removing the shadow when the mouse cursor is off
		BtnConvertNS.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	BtnConvertNS.setEffect(null);
		        }
		});
		
		
		
		comboBox1.setItems(list1);
		comboBox2.setItems(list2);
		comboBox1.getSelectionModel().select(0);
		comboBox2.getSelectionModel().select(8);
		
		comboBox1.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>(){

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				
				String a = list_controll_1[newValue.intValue()];
		
				
				if(a == "2"){
					
					
					L0NS.setDisable(false);  L5NS.setDisable(true); 
    	  			L1NS.setDisable(false);  L6NS.setDisable(true);
    	  			L2NS.setDisable(true);   L7NS.setDisable(true);
    	  			L3NS.setDisable(true);	 L8NS.setDisable(true);
    	  			L4NS.setDisable(true);	 L9NS.setDisable(true);
    	  										
    	  			
    	  			LANS.setDisable(true);   LDNS.setDisable(true);
    	  			LBNS.setDisable(true);   LENS.setDisable(true);
    	  			LCNS1.setDisable(true);  LFNS.setDisable(true);
    	  			
    	  	
				}
			
				if(a == "3"){
					
					L0NS.setDisable(false);   L5NS.setDisable(true); 
    	  			L1NS.setDisable(false);   L6NS.setDisable(true);
    	  			L2NS.setDisable(false);   L7NS.setDisable(true);
    	  			L3NS.setDisable(true);	  L8NS.setDisable(true);
    	  			L4NS.setDisable(true);	  L9NS.setDisable(true);
    	  										
    	  			
    	  			LANS.setDisable(true);   LDNS.setDisable(true);
    	  			LBNS.setDisable(true);   LENS.setDisable(true);
    	  			LCNS1.setDisable(true);  LFNS.setDisable(true);
					
				}
				
				if(a == "4"){
					
					L0NS.setDisable(false);   L5NS.setDisable(true); 
    	  			L1NS.setDisable(false);   L6NS.setDisable(true);
    	  			L2NS.setDisable(false);   L7NS.setDisable(true);
    	  			L3NS.setDisable(false);	  L8NS.setDisable(true);
    	  			L4NS.setDisable(true);	  L9NS.setDisable(true);
    	  										
    	  			
    	  			LANS.setDisable(true);   LDNS.setDisable(true);
    	  			LBNS.setDisable(true);   LENS.setDisable(true);
    	  			LCNS1.setDisable(true);  LFNS.setDisable(true);
					
				}
				
				if(a == "5"){
					
					L0NS.setDisable(false);   L5NS.setDisable(true); 
    	  			L1NS.setDisable(false);   L6NS.setDisable(true);
    	  			L2NS.setDisable(false);   L7NS.setDisable(true);
    	  			L3NS.setDisable(false);	  L8NS.setDisable(true);
    	  			L4NS.setDisable(false);	  L9NS.setDisable(true);
    	  										
    	  			
    	  			LANS.setDisable(true);   LDNS.setDisable(true);
    	  			LBNS.setDisable(true);   LENS.setDisable(true);
    	  			LCNS1.setDisable(true);  LFNS.setDisable(true);
					
				}
				
				if(a == "6"){
					
					L0NS.setDisable(false);   L5NS.setDisable(false); 
    	  			L1NS.setDisable(false);   L6NS.setDisable(true);
    	  			L2NS.setDisable(false);   L7NS.setDisable(true);
    	  			L3NS.setDisable(false);	  L8NS.setDisable(true);
    	  			L4NS.setDisable(false);	  L9NS.setDisable(true);
    	  										
    	  			
    	  			LANS.setDisable(true);   LDNS.setDisable(true);
    	  			LBNS.setDisable(true);   LENS.setDisable(true);
    	  			LCNS1.setDisable(true);  LFNS.setDisable(true);
					
				}
				
				if(a == "7"){
					
					L0NS.setDisable(false);   L5NS.setDisable(false); 
    	  			L1NS.setDisable(false);   L6NS.setDisable(false);
    	  			L2NS.setDisable(false);   L7NS.setDisable(true);
    	  			L3NS.setDisable(false);	  L8NS.setDisable(true);
    	  			L4NS.setDisable(false);	  L9NS.setDisable(true);
    	  										
    	  			
    	  			LANS.setDisable(true);   LDNS.setDisable(true);
    	  			LBNS.setDisable(true);   LENS.setDisable(true);
    	  			LCNS1.setDisable(true);  LFNS.setDisable(true);
					
				}
				
				if(a == "8"){
					
					L0NS.setDisable(false);   L5NS.setDisable(false); 
    	  			L1NS.setDisable(false);   L6NS.setDisable(false);
    	  			L2NS.setDisable(false);   L7NS.setDisable(false);
    	  			L3NS.setDisable(false);	  L8NS.setDisable(true);
    	  			L4NS.setDisable(false);	  L9NS.setDisable(true);
    	  										
    	  			
    	  			LANS.setDisable(true);   LDNS.setDisable(true);
    	  			LBNS.setDisable(true);   LENS.setDisable(true);
    	  			LCNS1.setDisable(true);  LFNS.setDisable(true);
					
				}
				
				if(a == "9"){
					
					L0NS.setDisable(false);   L5NS.setDisable(false); 
    	  			L1NS.setDisable(false);   L6NS.setDisable(false);
    	  			L2NS.setDisable(false);   L7NS.setDisable(false);
    	  			L3NS.setDisable(false);	  L8NS.setDisable(false);
    	  			L4NS.setDisable(false);	  L9NS.setDisable(true);
    	  										
    	  			
    	  			LANS.setDisable(true);   LDNS.setDisable(true);
    	  			LBNS.setDisable(true);   LENS.setDisable(true);
    	  			LCNS1.setDisable(true);  LFNS.setDisable(true);
					
				}
				
				if(a == "10"){
					
					L0NS.setDisable(false);   L5NS.setDisable(false); 
    	  			L1NS.setDisable(false);   L6NS.setDisable(false);
    	  			L2NS.setDisable(false);   L7NS.setDisable(false);
    	  			L3NS.setDisable(false);	  L8NS.setDisable(false);
    	  			L4NS.setDisable(false);	  L9NS.setDisable(false);
    	  										
    	  			
    	  			LANS.setDisable(true);   LDNS.setDisable(true);
    	  			LBNS.setDisable(true);   LENS.setDisable(true);
    	  			LCNS1.setDisable(true);  LFNS.setDisable(true);
					
				}
				
				if(a == "11"){
					
					L0NS.setDisable(false);   L5NS.setDisable(false); 
    	  			L1NS.setDisable(false);   L6NS.setDisable(false);
    	  			L2NS.setDisable(false);   L7NS.setDisable(false);
    	  			L3NS.setDisable(false);	  L8NS.setDisable(false);
    	  			L4NS.setDisable(false);	  L9NS.setDisable(false);
    	  										
    	  			
    	  			LANS.setDisable(false);   LDNS.setDisable(true);
    	  			LBNS.setDisable(true);   LENS.setDisable(true);
    	  			LCNS1.setDisable(true);  LFNS.setDisable(true);
					
				}
				
				if(a == "12"){
					
					L0NS.setDisable(false);   L5NS.setDisable(false); 
    	  			L1NS.setDisable(false);   L6NS.setDisable(false);
    	  			L2NS.setDisable(false);   L7NS.setDisable(false);
    	  			L3NS.setDisable(false);	  L8NS.setDisable(false);
    	  			L4NS.setDisable(false);	  L9NS.setDisable(false);
    	  										
    	  			
    	  			LANS.setDisable(false);   LDNS.setDisable(true);
    	  			LBNS.setDisable(false);   LENS.setDisable(true);
    	  			LCNS1.setDisable(true);   LFNS.setDisable(true);
					
				}
				
				if(a == "13"){
					
					L0NS.setDisable(false);   L5NS.setDisable(false); 
    	  			L1NS.setDisable(false);   L6NS.setDisable(false);
    	  			L2NS.setDisable(false);   L7NS.setDisable(false);
    	  			L3NS.setDisable(false);	  L8NS.setDisable(false);
    	  			L4NS.setDisable(false);	  L9NS.setDisable(false);
    	  										
    	  			
    	  			LANS.setDisable(false);   LDNS.setDisable(true);
    	  			LBNS.setDisable(false);   LENS.setDisable(true);
    	  			LCNS1.setDisable(false);  LFNS.setDisable(true);
					
				}
				
				if(a == "14"){
					
					L0NS.setDisable(false);   L5NS.setDisable(false); 
    	  			L1NS.setDisable(false);   L6NS.setDisable(false);
    	  			L2NS.setDisable(false);   L7NS.setDisable(false);
    	  			L3NS.setDisable(false);	  L8NS.setDisable(false);
    	  			L4NS.setDisable(false);	  L9NS.setDisable(false);
    	  										
    	  			
    	  			LANS.setDisable(false);   LDNS.setDisable(false);
    	  			LBNS.setDisable(false);   LENS.setDisable(true);
    	  			LCNS1.setDisable(false);  LFNS.setDisable(true);
					
				}
				
				if(a == "15"){
					
					L0NS.setDisable(false);   L5NS.setDisable(false); 
    	  			L1NS.setDisable(false);   L6NS.setDisable(false);
    	  			L2NS.setDisable(false);   L7NS.setDisable(false);
    	  			L3NS.setDisable(false);	  L8NS.setDisable(false);
    	  			L4NS.setDisable(false);	  L9NS.setDisable(false);
    	  										
    	  			
    	  			LANS.setDisable(false);   LDNS.setDisable(false);
    	  			LBNS.setDisable(false);   LENS.setDisable(false);
    	  			LCNS1.setDisable(false);  LFNS.setDisable(true);
					
				}
				
				if(a == "16"){
					
					L0NS.setDisable(false);   L5NS.setDisable(false); 
    	  			L1NS.setDisable(false);   L6NS.setDisable(false);
    	  			L2NS.setDisable(false);   L7NS.setDisable(false);
    	  			L3NS.setDisable(false);	  L8NS.setDisable(false);
    	  			L4NS.setDisable(false);	  L9NS.setDisable(false);
    	  										
    	  			
    	  			LANS.setDisable(false);   LDNS.setDisable(false);
    	  			LBNS.setDisable(false);   LENS.setDisable(false);
    	  			LCNS1.setDisable(false);  LFNS.setDisable(false);
					
				}
				
			  }     
        });
		
	}
		

	public void BtnSwitch(ActionEvent event){
		
		     if( (comboBox1.getValue() == "Binary")       && comboBox2.getValue() == "Decimal")     { comboBox1.getSelectionModel().select(8);   comboBox2.getSelectionModel().select(0);  }
		
		else if( (comboBox1.getValue() == "Decimal")      && comboBox2.getValue() == "Binary")      { comboBox1.getSelectionModel().select(0);   comboBox2.getSelectionModel().select(8);  }
		     	
		     if( (comboBox1.getValue() == "Ternary")      && comboBox2.getValue() == "Decimal")     { comboBox1.getSelectionModel().select(8);   comboBox2.getSelectionModel().select(1);  }
				
		else if( (comboBox1.getValue() == "Decimal")      && comboBox2.getValue() == "Ternary")     { comboBox1.getSelectionModel().select(1);   comboBox2.getSelectionModel().select(8);  }
		     	     
		     if( (comboBox1.getValue() == "Quaternary")   && comboBox2.getValue() == "Decimal")     { comboBox1.getSelectionModel().select(8);   comboBox2.getSelectionModel().select(2);  }
				
		else if( (comboBox1.getValue() == "Decimal")      && comboBox2.getValue() == "Quaternary")  { comboBox1.getSelectionModel().select(2);   comboBox2.getSelectionModel().select(8);  }
		     	     
		     if( (comboBox1.getValue() == "Quinary")      && comboBox2.getValue() == "Decimal")     { comboBox1.getSelectionModel().select(8);   comboBox2.getSelectionModel().select(3);  }
				
		else if( (comboBox1.getValue() == "Decimal")      && comboBox2.getValue() == "Quinary")     { comboBox1.getSelectionModel().select(3);   comboBox2.getSelectionModel().select(8);  }
		     
		     if( (comboBox1.getValue() == "Senary")       && comboBox2.getValue() == "Decimal")     { comboBox1.getSelectionModel().select(8);   comboBox2.getSelectionModel().select(4);  }
				
		else if( (comboBox1.getValue() == "Decimal")      && comboBox2.getValue() == "Senary")      { comboBox1.getSelectionModel().select(4);   comboBox2.getSelectionModel().select(8);  }
		    
		     if( (comboBox1.getValue() == "Septenary")    && comboBox2.getValue() == "Decimal")     { comboBox1.getSelectionModel().select(8);   comboBox2.getSelectionModel().select(5);  }
				
		else if( (comboBox1.getValue() == "Decimal")      && comboBox2.getValue() == "Septenary")   { comboBox1.getSelectionModel().select(5);   comboBox2.getSelectionModel().select(8);  }
		     	     
		     if( (comboBox1.getValue() == "Octal")        && comboBox2.getValue() == "Decimal")     { comboBox1.getSelectionModel().select(8);   comboBox2.getSelectionModel().select(6);  }
				
		else if( (comboBox1.getValue() == "Decimal")      && comboBox2.getValue() == "Octal")       { comboBox1.getSelectionModel().select(6);   comboBox2.getSelectionModel().select(8);  }
		     	     
		     if( (comboBox1.getValue() == "Nonary")       && comboBox2.getValue() == "Decimal")     { comboBox1.getSelectionModel().select(8);   comboBox2.getSelectionModel().select(7);  }
				
		else if( (comboBox1.getValue() == "Decimal")      && comboBox2.getValue() == "Nonary")      { comboBox1.getSelectionModel().select(7);   comboBox2.getSelectionModel().select(8);  }
		     
		     if( (comboBox1.getValue() == "Undecimal")    && comboBox2.getValue() == "Decimal")     { comboBox1.getSelectionModel().select(8);   comboBox2.getSelectionModel().select(9);  }
				
		else if( (comboBox1.getValue() == "Decimal")      && comboBox2.getValue() == "Undecimal")   { comboBox1.getSelectionModel().select(9);   comboBox2.getSelectionModel().select(8);  }
		     	     
		     if( (comboBox1.getValue() == "Duodecimal")   && comboBox2.getValue() == "Decimal")     { comboBox1.getSelectionModel().select(8);   comboBox2.getSelectionModel().select(10); }
				
		else if( (comboBox1.getValue() == "Decimal")      && comboBox2.getValue() == "Duodecimal")  { comboBox1.getSelectionModel().select(10);  comboBox2.getSelectionModel().select(8);  }
		     
		     if( (comboBox1.getValue() == "Tridecimal")   && comboBox2.getValue() == "Decimal")     { comboBox1.getSelectionModel().select(8);   comboBox2.getSelectionModel().select(11); }
				
		else if( (comboBox1.getValue() == "Decimal")      && comboBox2.getValue() == "Tridecimal")  { comboBox1.getSelectionModel().select(11);  comboBox2.getSelectionModel().select(8);  }
		          
		     if( (comboBox1.getValue() == "Tetradecimal") && comboBox2.getValue() == "Decimal")     { comboBox1.getSelectionModel().select(8);   comboBox2.getSelectionModel().select(12); }
				
		else if( (comboBox1.getValue() == "Decimal")      && comboBox2.getValue() == "Tetradecimal"){ comboBox1.getSelectionModel().select(12);  comboBox2.getSelectionModel().select(8);  }  
		     
		     if( (comboBox1.getValue() == "Pentadecimal") && comboBox2.getValue() == "Decimal")     { comboBox1.getSelectionModel().select(8);   comboBox2.getSelectionModel().select(13); }
				
		else if( (comboBox1.getValue() == "Decimal")      && comboBox2.getValue() == "Pentadecimal"){ comboBox1.getSelectionModel().select(13);  comboBox2.getSelectionModel().select(8);  }		     
		
		     if( (comboBox1.getValue() == "Hexadecimal")  && comboBox2.getValue() == "Decimal")     { comboBox1.getSelectionModel().select(8);   comboBox2.getSelectionModel().select(14); }
				
		else if( (comboBox1.getValue() == "Decimal")      && comboBox2.getValue() == "Hexadecimal") { comboBox1.getSelectionModel().select(14);  comboBox2.getSelectionModel().select(8);  }
		     
		     

		     if( (comboBox1.getValue() == "Binary")       && comboBox2.getValue() == "Ternary")       { comboBox1.getSelectionModel().select(1);   comboBox2.getSelectionModel().select(0);  }
				
		else if( (comboBox1.getValue() == "Ternary")      && comboBox2.getValue() == "Binary")        { comboBox1.getSelectionModel().select(0);   comboBox2.getSelectionModel().select(1);  }
				     	
		     if( (comboBox1.getValue() == "Binary")       && comboBox2.getValue() == "Quaternary")    { comboBox1.getSelectionModel().select(2);   comboBox2.getSelectionModel().select(0);  }
				
		else if( (comboBox1.getValue() == "Quaternary")   && comboBox2.getValue() == "Binary")        { comboBox1.getSelectionModel().select(0);   comboBox2.getSelectionModel().select(2);  }
						    	   
		     if( (comboBox1.getValue() == "Binary")       && comboBox2.getValue() == "Quinary")       { comboBox1.getSelectionModel().select(3);   comboBox2.getSelectionModel().select(0);  }
				
		else if( (comboBox1.getValue() == "Quinary")      && comboBox2.getValue() == "Binary")        { comboBox1.getSelectionModel().select(0);   comboBox2.getSelectionModel().select(3);  }
							     
		     if( (comboBox1.getValue() == "Binary")       && comboBox2.getValue() == "Senary")        { comboBox1.getSelectionModel().select(4);   comboBox2.getSelectionModel().select(0);  }
				
		else if( (comboBox1.getValue() == "Senary")       && comboBox2.getValue() == "Binary")        { comboBox1.getSelectionModel().select(0);   comboBox2.getSelectionModel().select(4);  }
					
		     if( (comboBox1.getValue() == "Binary")       && comboBox2.getValue() == "Septenary")     { comboBox1.getSelectionModel().select(5);   comboBox2.getSelectionModel().select(0);  }
				
		else if( (comboBox1.getValue() == "Septenary")    && comboBox2.getValue() == "Binary")        { comboBox1.getSelectionModel().select(0);   comboBox2.getSelectionModel().select(5);  }
							
		     if( (comboBox1.getValue() == "Binary")       && comboBox2.getValue() == "Octal")         { comboBox1.getSelectionModel().select(6);   comboBox2.getSelectionModel().select(0);  }
				
		else if( (comboBox1.getValue() == "Octal")        && comboBox2.getValue() == "Binary")        { comboBox1.getSelectionModel().select(0);   comboBox2.getSelectionModel().select(6);  }
					
		     if( (comboBox1.getValue() == "Binary")       && comboBox2.getValue() == "Nonary")        { comboBox1.getSelectionModel().select(7);   comboBox2.getSelectionModel().select(0);  }
				
		else if( (comboBox1.getValue() == "Nonary")       && comboBox2.getValue() == "Binary")        { comboBox1.getSelectionModel().select(0);   comboBox2.getSelectionModel().select(7);  }
						
		     if( (comboBox1.getValue() == "Binary")       && comboBox2.getValue() == "Undecimal")     { comboBox1.getSelectionModel().select(9);   comboBox2.getSelectionModel().select(0);  }
				
		else if( (comboBox1.getValue() == "Undecimal")    && comboBox2.getValue() == "Binary")        { comboBox1.getSelectionModel().select(0);   comboBox2.getSelectionModel().select(9);  }
								
		     if( (comboBox1.getValue() == "Binary")       && comboBox2.getValue() == "Duodecimal")    { comboBox1.getSelectionModel().select(10);  comboBox2.getSelectionModel().select(0);  }
				
		else if( (comboBox1.getValue() == "Duodecimal")   && comboBox2.getValue() == "Binary")        { comboBox1.getSelectionModel().select(0);   comboBox2.getSelectionModel().select(10); }
				
		     if( (comboBox1.getValue() == "Binary")       && comboBox2.getValue() == "Tridecimal")    { comboBox1.getSelectionModel().select(11);  comboBox2.getSelectionModel().select(0);  }
				
		else if( (comboBox1.getValue() == "Tridecimal")   && comboBox2.getValue() == "Binary")        { comboBox1.getSelectionModel().select(0);   comboBox2.getSelectionModel().select(11); }
				
		     if( (comboBox1.getValue() == "Binary")       && comboBox2.getValue() == "Tetradecimal")  { comboBox1.getSelectionModel().select(12);  comboBox2.getSelectionModel().select(0);  }
				
		else if( (comboBox1.getValue() == "Tetradecimal") && comboBox2.getValue() == "Binary")        { comboBox1.getSelectionModel().select(0);   comboBox2.getSelectionModel().select(12); }
						
		     if( (comboBox1.getValue() == "Binary")       && comboBox2.getValue() == "Pentadecimal")  { comboBox1.getSelectionModel().select(13);  comboBox2.getSelectionModel().select(0);  }
				
		else if( (comboBox1.getValue() == "Pentadecimal") && comboBox2.getValue() == "Binary")        { comboBox1.getSelectionModel().select(0);   comboBox2.getSelectionModel().select(13); }
				
		     if( (comboBox1.getValue() == "Binary")       && comboBox2.getValue() == "Hexadecimal")   { comboBox1.getSelectionModel().select(14);  comboBox2.getSelectionModel().select(0);  }
				
		else if( (comboBox1.getValue() == "Hexadecimal")  && comboBox2.getValue() == "Binary")        { comboBox1.getSelectionModel().select(0);   comboBox2.getSelectionModel().select(14); }
			
		     
		     
		     
						     	
		     if( (comboBox1.getValue() == "Ternary")       && comboBox2.getValue() == "Quaternary")   { comboBox1.getSelectionModel().select(2);   comboBox2.getSelectionModel().select(1);  }
				
		else if( (comboBox1.getValue() == "Quaternary")      && comboBox2.getValue() == "Ternary")    { comboBox1.getSelectionModel().select(1);   comboBox2.getSelectionModel().select(2);  }
		
		     if( (comboBox1.getValue() == "Ternary")       && comboBox2.getValue() == "Quinary")   { comboBox1.getSelectionModel().select(3);   comboBox2.getSelectionModel().select(1);  }
				
		else if( (comboBox1.getValue() == "Quinary")      && comboBox2.getValue() == "Ternary")    { comboBox1.getSelectionModel().select(1);   comboBox2.getSelectionModel().select(3);  }
		     
		     if( (comboBox1.getValue() == "Ternary")       && comboBox2.getValue() == "Senary")   { comboBox1.getSelectionModel().select(4);   comboBox2.getSelectionModel().select(1);  }
				
		else if( (comboBox1.getValue() == "Senary")      && comboBox2.getValue() == "Ternary")    { comboBox1.getSelectionModel().select(1);   comboBox2.getSelectionModel().select(4);  }
			
		     if( (comboBox1.getValue() == "Ternary")       && comboBox2.getValue() == "Septenary")   { comboBox1.getSelectionModel().select(5);   comboBox2.getSelectionModel().select(1);  }
				
		else if( (comboBox1.getValue() == "Septenary")      && comboBox2.getValue() == "Ternary")    { comboBox1.getSelectionModel().select(1);   comboBox2.getSelectionModel().select(5);  }
		
		     if( (comboBox1.getValue() == "Ternary")       && comboBox2.getValue() == "Octal")   { comboBox1.getSelectionModel().select(6);   comboBox2.getSelectionModel().select(1);  }
				
		else if( (comboBox1.getValue() == "Octal")      && comboBox2.getValue() == "Ternary")    { comboBox1.getSelectionModel().select(1);   comboBox2.getSelectionModel().select(6);  }
		    
		     if( (comboBox1.getValue() == "Ternary")       && comboBox2.getValue() == "Nonary")   { comboBox1.getSelectionModel().select(7);   comboBox2.getSelectionModel().select(1);  }
				
		else if( (comboBox1.getValue() == "Nonary")      && comboBox2.getValue() == "Ternary")    { comboBox1.getSelectionModel().select(1);   comboBox2.getSelectionModel().select(7);  }
				
		     if( (comboBox1.getValue() == "Ternary")       && comboBox2.getValue() == "Undecimal")   { comboBox1.getSelectionModel().select(9);   comboBox2.getSelectionModel().select(1);  }
				
		else if( (comboBox1.getValue() == "Undecimal")      && comboBox2.getValue() == "Ternary")    { comboBox1.getSelectionModel().select(1);   comboBox2.getSelectionModel().select(9);  }
			
		     if( (comboBox1.getValue() == "Ternary")       && comboBox2.getValue() == "Duodecimal")   { comboBox1.getSelectionModel().select(10);   comboBox2.getSelectionModel().select(1);  }
				
		else if( (comboBox1.getValue() == "Duodecimal")      && comboBox2.getValue() == "Ternary")    { comboBox1.getSelectionModel().select(1);   comboBox2.getSelectionModel().select(10);  }
				
		     if( (comboBox1.getValue() == "Ternary")       && comboBox2.getValue() == "Tridecimal")   { comboBox1.getSelectionModel().select(11);   comboBox2.getSelectionModel().select(1);  }
				
		else if( (comboBox1.getValue() == "Tridecimal")      && comboBox2.getValue() == "Ternary")    { comboBox1.getSelectionModel().select(1);   comboBox2.getSelectionModel().select(11);  }
				
		     if( (comboBox1.getValue() == "Ternary")       && comboBox2.getValue() == "Tetradecimal")   { comboBox1.getSelectionModel().select(12);   comboBox2.getSelectionModel().select(1);  }
				
		else if( (comboBox1.getValue() == "Tetradecimal")      && comboBox2.getValue() == "Ternary")    { comboBox1.getSelectionModel().select(1);   comboBox2.getSelectionModel().select(12);  }

		     if( (comboBox1.getValue() == "Ternary")       && comboBox2.getValue() == "Pentadecimal")   { comboBox1.getSelectionModel().select(13);   comboBox2.getSelectionModel().select(1);  }
				
		else if( (comboBox1.getValue() == "Pentadecimal")      && comboBox2.getValue() == "Ternary")    { comboBox1.getSelectionModel().select(1);   comboBox2.getSelectionModel().select(13);  }
		
		     if( (comboBox1.getValue() == "Ternary")       && comboBox2.getValue() == "Hexadecimal")   { comboBox1.getSelectionModel().select(14);   comboBox2.getSelectionModel().select(1);  }
				
		else if( (comboBox1.getValue() == "Hexadecimal")      && comboBox2.getValue() == "Ternary")    { comboBox1.getSelectionModel().select(1);   comboBox2.getSelectionModel().select(14);  }
							
		     	
		     
		     if( (comboBox1.getValue() == "Quaternary")   && comboBox2.getValue() == "Quinary")       { comboBox1.getSelectionModel().select(3);   comboBox2.getSelectionModel().select(2);  }
				
		else if( (comboBox1.getValue() == "Quinary")      && comboBox2.getValue() == "Quaternary")    { comboBox1.getSelectionModel().select(2);   comboBox2.getSelectionModel().select(3);  }
				    
		     if( (comboBox1.getValue() == "Quaternary")   && comboBox2.getValue() == "Senary")        { comboBox1.getSelectionModel().select(4);   comboBox2.getSelectionModel().select(2);  }
				
		else if( (comboBox1.getValue() == "Senary")       && comboBox2.getValue() == "Quaternary")    { comboBox1.getSelectionModel().select(2);   comboBox2.getSelectionModel().select(4);  }
			
		     if( (comboBox1.getValue() == "Quaternary")   && comboBox2.getValue() == "Septenary")     { comboBox1.getSelectionModel().select(5);   comboBox2.getSelectionModel().select(2);  }
				
		else if( (comboBox1.getValue() == "Septenary")    && comboBox2.getValue() == "Quaternary")    { comboBox1.getSelectionModel().select(2);   comboBox2.getSelectionModel().select(5);  }
		
		     if( (comboBox1.getValue() == "Quaternary")   && comboBox2.getValue() == "Octal")         { comboBox1.getSelectionModel().select(6);   comboBox2.getSelectionModel().select(2);  }
				
		else if( (comboBox1.getValue() == "Octal")        && comboBox2.getValue() == "Quaternary")    { comboBox1.getSelectionModel().select(2);   comboBox2.getSelectionModel().select(6);  }
				
		     if( (comboBox1.getValue() == "Quaternary")   && comboBox2.getValue() == "Nonary")        { comboBox1.getSelectionModel().select(7);   comboBox2.getSelectionModel().select(2);  }
				
		else if( (comboBox1.getValue() == "Nonary")       && comboBox2.getValue() == "Quaternary")    { comboBox1.getSelectionModel().select(2);   comboBox2.getSelectionModel().select(7);  }
						
		     if( (comboBox1.getValue() == "Quaternary")   && comboBox2.getValue() == "Undecimal")     { comboBox1.getSelectionModel().select(9);   comboBox2.getSelectionModel().select(2);  }
				
		else if( (comboBox1.getValue() == "Undecimal")    && comboBox2.getValue() == "Quaternary")    { comboBox1.getSelectionModel().select(2);   comboBox2.getSelectionModel().select(9);  }
				
		     if( (comboBox1.getValue() == "Quaternary")   && comboBox2.getValue() == "Duodecimal")    { comboBox1.getSelectionModel().select(10);  comboBox2.getSelectionModel().select(2);  }
				
		else if( (comboBox1.getValue() == "Duodecimal")   && comboBox2.getValue() == "Quaternary")    { comboBox1.getSelectionModel().select(2);   comboBox2.getSelectionModel().select(10); }
		
		     if( (comboBox1.getValue() == "Quaternary")   && comboBox2.getValue() == "Tridecimal")    { comboBox1.getSelectionModel().select(11);  comboBox2.getSelectionModel().select(2);  }
				
		else if( (comboBox1.getValue() == "Tridecimal")   && comboBox2.getValue() == "Quaternary")    { comboBox1.getSelectionModel().select(2);   comboBox2.getSelectionModel().select(11); }
		
		     if( (comboBox1.getValue() == "Quaternary")   && comboBox2.getValue() == "Tetradecimal")  { comboBox1.getSelectionModel().select(12);  comboBox2.getSelectionModel().select(2);  }
				
		else if( (comboBox1.getValue() == "Tetradecimal") && comboBox2.getValue() == "Quaternary")    { comboBox1.getSelectionModel().select(2);   comboBox2.getSelectionModel().select(12); }
		
		     if( (comboBox1.getValue() == "Quaternary")   && comboBox2.getValue() == "Pentadecimal")  { comboBox1.getSelectionModel().select(13);  comboBox2.getSelectionModel().select(2);  }
				
	    else if( (comboBox1.getValue() == "Pentadecimal") && comboBox2.getValue() == "Quaternary")    { comboBox1.getSelectionModel().select(2);   comboBox2.getSelectionModel().select(13); }
		
		     if( (comboBox1.getValue() == "Quaternary")   && comboBox2.getValue() == "Hexadecimal")   { comboBox1.getSelectionModel().select(14);  comboBox2.getSelectionModel().select(2);  }
				
	    else if( (comboBox1.getValue() == "Hexadecimal")  && comboBox2.getValue() == "Quaternary")    { comboBox1.getSelectionModel().select(2);   comboBox2.getSelectionModel().select(14); }
				 
		     
		     
		     if( (comboBox1.getValue() == "Quinary")     && comboBox2.getValue() == "Quinary")       { comboBox1.getSelectionModel().select(3);   comboBox2.getSelectionModel().select(3);  }
				
		else if( (comboBox1.getValue() == "Quinary")      && comboBox2.getValue() == "Quinary")      { comboBox1.getSelectionModel().select(3);   comboBox2.getSelectionModel().select(3);  }
						    
			 if( (comboBox1.getValue() == "Quinary")      && comboBox2.getValue() == "Senary")       { comboBox1.getSelectionModel().select(4);   comboBox2.getSelectionModel().select(3);  }
						
		else if( (comboBox1.getValue() == "Senary")       && comboBox2.getValue() == "Quinary")      { comboBox1.getSelectionModel().select(3);   comboBox2.getSelectionModel().select(4);  }
					
		     if( (comboBox1.getValue() == "Quinary")      && comboBox2.getValue() == "Septenary")    { comboBox1.getSelectionModel().select(5);   comboBox2.getSelectionModel().select(3);  }
						
		else if( (comboBox1.getValue() == "Septenary")    && comboBox2.getValue() == "Quinary")      { comboBox1.getSelectionModel().select(3);   comboBox2.getSelectionModel().select(5);  }
				
			 if( (comboBox1.getValue() == "Quinary")      && comboBox2.getValue() == "Octal")        { comboBox1.getSelectionModel().select(6);   comboBox2.getSelectionModel().select(3);  }
						
		else if( (comboBox1.getValue() == "Octal")        && comboBox2.getValue() == "Quinary")      { comboBox1.getSelectionModel().select(3);   comboBox2.getSelectionModel().select(6);  }
						
			 if( (comboBox1.getValue() == "Quinary")      && comboBox2.getValue() == "Nonary")       { comboBox1.getSelectionModel().select(7);   comboBox2.getSelectionModel().select(3);  }
						
		else if( (comboBox1.getValue() == "Nonary")       && comboBox2.getValue() == "Quinary")      { comboBox1.getSelectionModel().select(3);   comboBox2.getSelectionModel().select(7);  }
								
			 if( (comboBox1.getValue() == "Quinary")      && comboBox2.getValue() == "Undecimal")    { comboBox1.getSelectionModel().select(9);   comboBox2.getSelectionModel().select(3);  }
						
		else if( (comboBox1.getValue() == "Undecimal")    && comboBox2.getValue() == "Quinary")      { comboBox1.getSelectionModel().select(3);   comboBox2.getSelectionModel().select(9);  }
						
			 if( (comboBox1.getValue() == "Quinary")      && comboBox2.getValue() == "Duodecimal")   { comboBox1.getSelectionModel().select(10);  comboBox2.getSelectionModel().select(3);  }
						
		else if( (comboBox1.getValue() == "Duodecimal")   && comboBox2.getValue() == "Quinary")      { comboBox1.getSelectionModel().select(3);   comboBox2.getSelectionModel().select(10); }
				
			 if( (comboBox1.getValue() == "Quinary")      && comboBox2.getValue() == "Tridecimal")   { comboBox1.getSelectionModel().select(11);  comboBox2.getSelectionModel().select(3);  }
						
		else if( (comboBox1.getValue() == "Tridecimal")   && comboBox2.getValue() == "Quinary")      { comboBox1.getSelectionModel().select(3);   comboBox2.getSelectionModel().select(11); }
				
			 if( (comboBox1.getValue() == "Quinary")      && comboBox2.getValue() == "Tetradecimal") { comboBox1.getSelectionModel().select(12);  comboBox2.getSelectionModel().select(3);  }
						
		else if( (comboBox1.getValue() == "Tetradecimal") && comboBox2.getValue() == "Quinary")      { comboBox1.getSelectionModel().select(3);   comboBox2.getSelectionModel().select(12); }
				
			 if( (comboBox1.getValue() == "Quinary")      && comboBox2.getValue() == "Pentadecimal") { comboBox1.getSelectionModel().select(13);  comboBox2.getSelectionModel().select(3);  }
						
	    else if( (comboBox1.getValue() == "Pentadecimal") && comboBox2.getValue() == "Quinary")      { comboBox1.getSelectionModel().select(3);   comboBox2.getSelectionModel().select(13); }
				
			 if( (comboBox1.getValue() == "Quinary")      && comboBox2.getValue() == "Hexadecimal")  { comboBox1.getSelectionModel().select(14);  comboBox2.getSelectionModel().select(3);  }
						
	    else if( (comboBox1.getValue() == "Hexadecimal")  && comboBox2.getValue() == "Quinary")      { comboBox1.getSelectionModel().select(3);   comboBox2.getSelectionModel().select(14); }
				
			 
			 
			 			    
			 if( (comboBox1.getValue() == "Senary")      && comboBox2.getValue() == "Senary")       { comboBox1.getSelectionModel().select(4);   comboBox2.getSelectionModel().select(4);  }
								
		else if( (comboBox1.getValue() == "Senary")       && comboBox2.getValue() == "Senary")      { comboBox1.getSelectionModel().select(4);   comboBox2.getSelectionModel().select(4);  }
							
			 if( (comboBox1.getValue() == "Senary")      && comboBox2.getValue() == "Septenary")    { comboBox1.getSelectionModel().select(5);   comboBox2.getSelectionModel().select(4);  }
								
		else if( (comboBox1.getValue() == "Septenary")    && comboBox2.getValue() == "Senary")      { comboBox1.getSelectionModel().select(4);   comboBox2.getSelectionModel().select(5);  }
						
			 if( (comboBox1.getValue() == "Senary")      && comboBox2.getValue() == "Octal")        { comboBox1.getSelectionModel().select(6);   comboBox2.getSelectionModel().select(4);  }
								
		else if( (comboBox1.getValue() == "Octal")        && comboBox2.getValue() == "Senary")      { comboBox1.getSelectionModel().select(4);   comboBox2.getSelectionModel().select(6);  }
								
			 if( (comboBox1.getValue() == "Senary")      && comboBox2.getValue() == "Nonary")       { comboBox1.getSelectionModel().select(7);   comboBox2.getSelectionModel().select(4);  }
								
		else if( (comboBox1.getValue() == "Nonary")       && comboBox2.getValue() == "Senary")      { comboBox1.getSelectionModel().select(4);   comboBox2.getSelectionModel().select(7);  }
										
			 if( (comboBox1.getValue() == "Senary")      && comboBox2.getValue() == "Undecimal")    { comboBox1.getSelectionModel().select(9);   comboBox2.getSelectionModel().select(4);  }
								
		else if( (comboBox1.getValue() == "Undecimal")    && comboBox2.getValue() == "Senary")      { comboBox1.getSelectionModel().select(4);   comboBox2.getSelectionModel().select(9);  }
								
			 if( (comboBox1.getValue() == "Senary")      && comboBox2.getValue() == "Duodecimal")   { comboBox1.getSelectionModel().select(10);  comboBox2.getSelectionModel().select(4);  }
								
		else if( (comboBox1.getValue() == "Duodecimal")   && comboBox2.getValue() == "Senary")      { comboBox1.getSelectionModel().select(4);   comboBox2.getSelectionModel().select(10); }
						
			 if( (comboBox1.getValue() == "Senary")      && comboBox2.getValue() == "Tridecimal")   { comboBox1.getSelectionModel().select(11);  comboBox2.getSelectionModel().select(4);  }
								
		else if( (comboBox1.getValue() == "Tridecimal")   && comboBox2.getValue() == "Senary")      { comboBox1.getSelectionModel().select(4);   comboBox2.getSelectionModel().select(11); }
						
			 if( (comboBox1.getValue() == "Senary")      && comboBox2.getValue() == "Tetradecimal") { comboBox1.getSelectionModel().select(12);  comboBox2.getSelectionModel().select(4);  }
								
		else if( (comboBox1.getValue() == "Tetradecimal") && comboBox2.getValue() == "Senary")      { comboBox1.getSelectionModel().select(4);   comboBox2.getSelectionModel().select(12); }
						
			 if( (comboBox1.getValue() == "Senary")      && comboBox2.getValue() == "Pentadecimal") { comboBox1.getSelectionModel().select(13);  comboBox2.getSelectionModel().select(4);  }
								
		else if( (comboBox1.getValue() == "Pentadecimal") && comboBox2.getValue() == "Senary")      { comboBox1.getSelectionModel().select(4);   comboBox2.getSelectionModel().select(13); }
						
			 if( (comboBox1.getValue() == "Senary")      && comboBox2.getValue() == "Hexadecimal")  { comboBox1.getSelectionModel().select(14);  comboBox2.getSelectionModel().select(4);  }
								
	    else if( (comboBox1.getValue() == "Hexadecimal")  && comboBox2.getValue() == "Senary")      { comboBox1.getSelectionModel().select(4);   comboBox2.getSelectionModel().select(14); }
			
			 
					
			 if( (comboBox1.getValue() == "Septenary")      && comboBox2.getValue() == "Septenary")    { comboBox1.getSelectionModel().select(5);   comboBox2.getSelectionModel().select(5);  }
										
		else if( (comboBox1.getValue() == "Septenary")    && comboBox2.getValue() == "Septenary")      { comboBox1.getSelectionModel().select(5);   comboBox2.getSelectionModel().select(5);  }
								
			 if( (comboBox1.getValue() == "Septenary")      && comboBox2.getValue() == "Octal")        { comboBox1.getSelectionModel().select(6);   comboBox2.getSelectionModel().select(5);  }
										
		else if( (comboBox1.getValue() == "Octal")        && comboBox2.getValue() == "Septenary")      { comboBox1.getSelectionModel().select(5);   comboBox2.getSelectionModel().select(6);  }
										
			 if( (comboBox1.getValue() == "Septenary")      && comboBox2.getValue() == "Nonary")       { comboBox1.getSelectionModel().select(7);   comboBox2.getSelectionModel().select(5);  }
										
		else if( (comboBox1.getValue() == "Nonary")       && comboBox2.getValue() == "Septenary")      { comboBox1.getSelectionModel().select(5);   comboBox2.getSelectionModel().select(7);  }
												
			 if( (comboBox1.getValue() == "Septenary")      && comboBox2.getValue() == "Undecimal")    { comboBox1.getSelectionModel().select(9);   comboBox2.getSelectionModel().select(5);  }
										
		else if( (comboBox1.getValue() == "Undecimal")    && comboBox2.getValue() == "Septenary")      { comboBox1.getSelectionModel().select(5);   comboBox2.getSelectionModel().select(9);  }
										
			 if( (comboBox1.getValue() == "Septenary")      && comboBox2.getValue() == "Duodecimal")   { comboBox1.getSelectionModel().select(10);  comboBox2.getSelectionModel().select(5);  }
										
		else if( (comboBox1.getValue() == "Duodecimal")   && comboBox2.getValue() == "Septenary")      { comboBox1.getSelectionModel().select(5);   comboBox2.getSelectionModel().select(10); }
								
			 if( (comboBox1.getValue() == "Septenary")      && comboBox2.getValue() == "Tridecimal")   { comboBox1.getSelectionModel().select(11);  comboBox2.getSelectionModel().select(5);  }
										
		else if( (comboBox1.getValue() == "Tridecimal")   && comboBox2.getValue() == "Septenary")      { comboBox1.getSelectionModel().select(5);   comboBox2.getSelectionModel().select(11); }
								
			 if( (comboBox1.getValue() == "Septenary")      && comboBox2.getValue() == "Tetradecimal") { comboBox1.getSelectionModel().select(12);  comboBox2.getSelectionModel().select(5);  }
										
		else if( (comboBox1.getValue() == "Tetradecimal") && comboBox2.getValue() == "Septenary")      { comboBox1.getSelectionModel().select(5);   comboBox2.getSelectionModel().select(12); }
								
			 if( (comboBox1.getValue() == "Septenary")      && comboBox2.getValue() == "Pentadecimal") { comboBox1.getSelectionModel().select(13);  comboBox2.getSelectionModel().select(5);  }
										
		else if( (comboBox1.getValue() == "Pentadecimal") && comboBox2.getValue() == "Septenary")      { comboBox1.getSelectionModel().select(5);   comboBox2.getSelectionModel().select(13); }
								
			 if( (comboBox1.getValue() == "Septenary")      && comboBox2.getValue() == "Hexadecimal")  { comboBox1.getSelectionModel().select(14);  comboBox2.getSelectionModel().select(5);  }
										
	    else if( (comboBox1.getValue() == "Hexadecimal")  && comboBox2.getValue() == "Septenary")      { comboBox1.getSelectionModel().select(5);   comboBox2.getSelectionModel().select(14); }
					
			 
								
			 if( (comboBox1.getValue() == "Octal")      && comboBox2.getValue() == "Octal")        { comboBox1.getSelectionModel().select(6);   comboBox2.getSelectionModel().select(6);  }
												
		else if( (comboBox1.getValue() == "Octal")        && comboBox2.getValue() == "Octal")      { comboBox1.getSelectionModel().select(6);   comboBox2.getSelectionModel().select(6);  }
												
			 if( (comboBox1.getValue() == "Octal")      && comboBox2.getValue() == "Nonary")       { comboBox1.getSelectionModel().select(7);   comboBox2.getSelectionModel().select(6);  }
												
		else if( (comboBox1.getValue() == "Nonary")       && comboBox2.getValue() == "Octal")      { comboBox1.getSelectionModel().select(6);   comboBox2.getSelectionModel().select(7);  }
														
			 if( (comboBox1.getValue() == "Octal")      && comboBox2.getValue() == "Undecimal")    { comboBox1.getSelectionModel().select(9);   comboBox2.getSelectionModel().select(6);  }
												
		else if( (comboBox1.getValue() == "Undecimal")    && comboBox2.getValue() == "Octal")      { comboBox1.getSelectionModel().select(6);   comboBox2.getSelectionModel().select(9);  }
												
			 if( (comboBox1.getValue() == "Octal")      && comboBox2.getValue() == "Duodecimal")   { comboBox1.getSelectionModel().select(10);  comboBox2.getSelectionModel().select(6);  }
												
		else if( (comboBox1.getValue() == "Duodecimal")   && comboBox2.getValue() == "Octal")      { comboBox1.getSelectionModel().select(6);   comboBox2.getSelectionModel().select(10); }
										
			 if( (comboBox1.getValue() == "Octal")      && comboBox2.getValue() == "Tridecimal")   { comboBox1.getSelectionModel().select(11);  comboBox2.getSelectionModel().select(5);  }
												
		else if( (comboBox1.getValue() == "Tridecimal")   && comboBox2.getValue() == "Octal")      { comboBox1.getSelectionModel().select(6);   comboBox2.getSelectionModel().select(11); }
										
			 if( (comboBox1.getValue() == "Octal")      && comboBox2.getValue() == "Tetradecimal") { comboBox1.getSelectionModel().select(12);  comboBox2.getSelectionModel().select(6);  }
												
		else if( (comboBox1.getValue() == "Tetradecimal") && comboBox2.getValue() == "Octal")      { comboBox1.getSelectionModel().select(6);   comboBox2.getSelectionModel().select(12); }
										
			 if( (comboBox1.getValue() == "Octal")      && comboBox2.getValue() == "Pentadecimal") { comboBox1.getSelectionModel().select(13);  comboBox2.getSelectionModel().select(6);  }
												
		else if( (comboBox1.getValue() == "Pentadecimal") && comboBox2.getValue() == "Octal")      { comboBox1.getSelectionModel().select(6);   comboBox2.getSelectionModel().select(13); }
										
			 if( (comboBox1.getValue() == "Octal")      && comboBox2.getValue() == "Hexadecimal")  { comboBox1.getSelectionModel().select(14);  comboBox2.getSelectionModel().select(6);  }
												
	    else if( (comboBox1.getValue() == "Hexadecimal")  && comboBox2.getValue() == "Octal")      { comboBox1.getSelectionModel().select(6);   comboBox2.getSelectionModel().select(14); }
		
			 
													
			 if( (comboBox1.getValue() == "Nonary")      && comboBox2.getValue() == "Nonary")       { comboBox1.getSelectionModel().select(7);   comboBox2.getSelectionModel().select(7);  }
														
		else if( (comboBox1.getValue() == "Nonary")       && comboBox2.getValue() == "Nonary")      { comboBox1.getSelectionModel().select(7);   comboBox2.getSelectionModel().select(7);  }
																
			 if( (comboBox1.getValue() == "Nonary")      && comboBox2.getValue() == "Undecimal")    { comboBox1.getSelectionModel().select(9);   comboBox2.getSelectionModel().select(7);  }
														
		else if( (comboBox1.getValue() == "Undecimal")    && comboBox2.getValue() == "Nonary")      { comboBox1.getSelectionModel().select(7);   comboBox2.getSelectionModel().select(9);  }
														
			 if( (comboBox1.getValue() == "Nonary")      && comboBox2.getValue() == "Duodecimal")   { comboBox1.getSelectionModel().select(10);  comboBox2.getSelectionModel().select(7);  }
														
		else if( (comboBox1.getValue() == "Duodecimal")   && comboBox2.getValue() == "Nonary")      { comboBox1.getSelectionModel().select(7);   comboBox2.getSelectionModel().select(10); }
												
			 if( (comboBox1.getValue() == "Nonary")      && comboBox2.getValue() == "Tridecimal")   { comboBox1.getSelectionModel().select(11);  comboBox2.getSelectionModel().select(7);  }
														
		else if( (comboBox1.getValue() == "Tridecimal")   && comboBox2.getValue() == "Nonary")      { comboBox1.getSelectionModel().select(7);   comboBox2.getSelectionModel().select(11); }
												
			 if( (comboBox1.getValue() == "Nonary")      && comboBox2.getValue() == "Tetradecimal") { comboBox1.getSelectionModel().select(12);  comboBox2.getSelectionModel().select(7);  }
														
		else if( (comboBox1.getValue() == "Tetradecimal") && comboBox2.getValue() == "Nonary")      { comboBox1.getSelectionModel().select(7);   comboBox2.getSelectionModel().select(12); }
												
			 if( (comboBox1.getValue() == "Nonary")      && comboBox2.getValue() == "Pentadecimal") { comboBox1.getSelectionModel().select(13);  comboBox2.getSelectionModel().select(7);  }
														
		else if( (comboBox1.getValue() == "Pentadecimal") && comboBox2.getValue() == "Nonary")      { comboBox1.getSelectionModel().select(7);   comboBox2.getSelectionModel().select(13); }
												
			 if( (comboBox1.getValue() == "Nonary")      && comboBox2.getValue() == "Hexadecimal")  { comboBox1.getSelectionModel().select(14);  comboBox2.getSelectionModel().select(7);  }
														
	    else if( (comboBox1.getValue() == "Hexadecimal")  && comboBox2.getValue() == "Nonary")      { comboBox1.getSelectionModel().select(7);   comboBox2.getSelectionModel().select(14); }
									
			
			 													
			if( (comboBox1.getValue() == "Undecimal")      && comboBox2.getValue() == "Undecimal")    { comboBox1.getSelectionModel().select(9);   comboBox2.getSelectionModel().select(9);  }
																
	   else if( (comboBox1.getValue() == "Undecimal")    && comboBox2.getValue() == "Undecimal")      { comboBox1.getSelectionModel().select(9);   comboBox2.getSelectionModel().select(9);  }
																
			if( (comboBox1.getValue() == "Undecimal")      && comboBox2.getValue() == "Duodecimal")   { comboBox1.getSelectionModel().select(10);  comboBox2.getSelectionModel().select(9);  }
																
	   else if( (comboBox1.getValue() == "Duodecimal")   && comboBox2.getValue() == "Undecimal")      { comboBox1.getSelectionModel().select(9);   comboBox2.getSelectionModel().select(10); }
														
			if( (comboBox1.getValue() == "Undecimal")      && comboBox2.getValue() == "Tridecimal")   { comboBox1.getSelectionModel().select(11);  comboBox2.getSelectionModel().select(9);  }
																
	   else if( (comboBox1.getValue() == "Tridecimal")   && comboBox2.getValue() == "Undecimal")      { comboBox1.getSelectionModel().select(9);   comboBox2.getSelectionModel().select(11); }
														
		    if( (comboBox1.getValue() == "Undecimal")      && comboBox2.getValue() == "Tetradecimal") { comboBox1.getSelectionModel().select(12);  comboBox2.getSelectionModel().select(9);  }
																
	   else if( (comboBox1.getValue() == "Tetradecimal") && comboBox2.getValue() == "Undecimal")      { comboBox1.getSelectionModel().select(9);   comboBox2.getSelectionModel().select(12); }
														
		    if( (comboBox1.getValue() == "Undecimal")      && comboBox2.getValue() == "Pentadecimal") { comboBox1.getSelectionModel().select(13);  comboBox2.getSelectionModel().select(9);  }
																
	   else if( (comboBox1.getValue() == "Pentadecimal") && comboBox2.getValue() == "Undecimal")      { comboBox1.getSelectionModel().select(9);   comboBox2.getSelectionModel().select(13); }
														
			if( (comboBox1.getValue() == "Undecimal")      && comboBox2.getValue() == "Hexadecimal")  { comboBox1.getSelectionModel().select(14);  comboBox2.getSelectionModel().select(9);  }
																
	   else if( (comboBox1.getValue() == "Hexadecimal")  && comboBox2.getValue() == "Undecimal")      { comboBox1.getSelectionModel().select(9);   comboBox2.getSelectionModel().select(14); }
				
			
			
			if( (comboBox1.getValue() == "Duodecimal")      && comboBox2.getValue() == "Duodecimal")   { comboBox1.getSelectionModel().select(10);  comboBox2.getSelectionModel().select(10);  }
			
	   else if( (comboBox1.getValue() == "Duodecimal")   && comboBox2.getValue() == "Duodecimal")      { comboBox1.getSelectionModel().select(10);   comboBox2.getSelectionModel().select(10); }
																
			if( (comboBox1.getValue() == "Duodecimal")      && comboBox2.getValue() == "Tridecimal")   { comboBox1.getSelectionModel().select(11);  comboBox2.getSelectionModel().select(10);  }
																		
	   else if( (comboBox1.getValue() == "Tridecimal")   && comboBox2.getValue() == "Duodecimal")      { comboBox1.getSelectionModel().select(10);   comboBox2.getSelectionModel().select(11); }
																
		    if( (comboBox1.getValue() == "Duodecimal")      && comboBox2.getValue() == "Tetradecimal") { comboBox1.getSelectionModel().select(12);  comboBox2.getSelectionModel().select(10);  }
																		
	   else if( (comboBox1.getValue() == "Tetradecimal") && comboBox2.getValue() == "Duodecimal")      { comboBox1.getSelectionModel().select(10);   comboBox2.getSelectionModel().select(12); }
																
			if( (comboBox1.getValue() == "Duodecimal")      && comboBox2.getValue() == "Pentadecimal") { comboBox1.getSelectionModel().select(13);  comboBox2.getSelectionModel().select(10);  }
																		
	   else if( (comboBox1.getValue() == "Pentadecimal") && comboBox2.getValue() == "Duodecimal")      { comboBox1.getSelectionModel().select(10);   comboBox2.getSelectionModel().select(13); }
																
			if( (comboBox1.getValue() == "Duodecimal")      && comboBox2.getValue() == "Hexadecimal")  { comboBox1.getSelectionModel().select(14);  comboBox2.getSelectionModel().select(10);  }
																		
	   else if( (comboBox1.getValue() == "Hexadecimal")  && comboBox2.getValue() == "Duodecimal")      { comboBox1.getSelectionModel().select(10);   comboBox2.getSelectionModel().select(14); }
			
			
																
			if( (comboBox1.getValue() == "Tridecimal")      && comboBox2.getValue() == "Tridecimal")   { comboBox1.getSelectionModel().select(11);  comboBox2.getSelectionModel().select(11);  }
			
	   else if( (comboBox1.getValue() == "Tridecimal")   && comboBox2.getValue() == "Tridecimal")      { comboBox1.getSelectionModel().select(11);   comboBox2.getSelectionModel().select(11); }
																		
			if( (comboBox1.getValue() == "Tridecimal")      && comboBox2.getValue() == "Tetradecimal") { comboBox1.getSelectionModel().select(12);  comboBox2.getSelectionModel().select(11);  }
																				
	   else if( (comboBox1.getValue() == "Tetradecimal") && comboBox2.getValue() == "Tridecimal")      { comboBox1.getSelectionModel().select(11);   comboBox2.getSelectionModel().select(12); }
																		
			if( (comboBox1.getValue() == "Tridecimal")      && comboBox2.getValue() == "Pentadecimal") { comboBox1.getSelectionModel().select(13);  comboBox2.getSelectionModel().select(11);  }
																				
	   else if( (comboBox1.getValue() == "Pentadecimal") && comboBox2.getValue() == "Tridecimal")      { comboBox1.getSelectionModel().select(11);   comboBox2.getSelectionModel().select(13); }
																		
			if( (comboBox1.getValue() == "Tridecimal")      && comboBox2.getValue() == "Hexadecimal")  { comboBox1.getSelectionModel().select(14);  comboBox2.getSelectionModel().select(11);  }
																				
	   else if( (comboBox1.getValue() == "Hexadecimal")  && comboBox2.getValue() == "Tridecimal")      { comboBox1.getSelectionModel().select(11);   comboBox2.getSelectionModel().select(14); }
		
			
			if( (comboBox1.getValue() == "Tetradecimal")      && comboBox2.getValue() == "Tetradecimal") { comboBox1.getSelectionModel().select(12);  comboBox2.getSelectionModel().select(12);  }
			
	   else if( (comboBox1.getValue() == "Tetradecimal") && comboBox2.getValue() == "Tetradecimal")      { comboBox1.getSelectionModel().select(12);   comboBox2.getSelectionModel().select(12); }
																				
			if( (comboBox1.getValue() == "Tetradecimal")      && comboBox2.getValue() == "Pentadecimal") { comboBox1.getSelectionModel().select(13);  comboBox2.getSelectionModel().select(12);  }
																						
	   else if( (comboBox1.getValue() == "Pentadecimal") && comboBox2.getValue() == "Tetradecimal")      { comboBox1.getSelectionModel().select(12);   comboBox2.getSelectionModel().select(13); }
																				
			if( (comboBox1.getValue() == "Tetradecimal")      && comboBox2.getValue() == "Hexadecimal")  { comboBox1.getSelectionModel().select(14);  comboBox2.getSelectionModel().select(12);  }
																						
	   else if( (comboBox1.getValue() == "Hexadecimal")  && comboBox2.getValue() == "Tetradecimal")      { comboBox1.getSelectionModel().select(12);   comboBox2.getSelectionModel().select(14); }
				
			
			if( (comboBox1.getValue() == "Pentadecimal")      && comboBox2.getValue() == "Pentadecimal") { comboBox1.getSelectionModel().select(13);  comboBox2.getSelectionModel().select(13);  }
			
	   else if( (comboBox1.getValue() == "Pentadecimal") && comboBox2.getValue() == "Pentadecimal")      { comboBox1.getSelectionModel().select(13);   comboBox2.getSelectionModel().select(13); }
																						
		    if( (comboBox1.getValue() == "Pentadecimal")      && comboBox2.getValue() == "Hexadecimal")  { comboBox1.getSelectionModel().select(14);  comboBox2.getSelectionModel().select(13);  }
																								
	   else if( (comboBox1.getValue() == "Hexadecimal")  && comboBox2.getValue() == "Pentadecimal")      { comboBox1.getSelectionModel().select(13);   comboBox2.getSelectionModel().select(14); }
									
	}
	
	//Numbers Pad actions start
	
	public void L0NS(ActionEvent event){
		
		String PreVal = TFInputNS.getText()+0;
		
		TFInputNS.setText(PreVal);
		
		String counter = PreVal;
		
		TFNSCount1.setText(String.valueOf(counter.length()));
		
	}

	public void L1NS(ActionEvent event){
		
		String PreVal = TFInputNS.getText()+1;
		
		TFInputNS.setText(PreVal);
		
        String counter = PreVal;
		
		TFNSCount1.setText(String.valueOf(counter.length()));
	}
	
	public void L2NS(ActionEvent event){
		
		String PreVal = TFInputNS.getText()+2;
		
		TFInputNS.setText(PreVal);
		
		String counter = PreVal;
		
		TFNSCount1.setText(String.valueOf(counter.length()));
		
	}
	
	public void L3NS(ActionEvent event){
		
		String PreVal = TFInputNS.getText()+3;
		
		TFInputNS.setText(PreVal);
		
		String counter = PreVal;
		
		TFNSCount1.setText(String.valueOf(counter.length()));
		
	}
	
	public void L4NS(ActionEvent event){
		
		String PreVal = TFInputNS.getText()+4;
		
		TFInputNS.setText(PreVal);
		
		String counter = PreVal;
		
		TFNSCount1.setText(String.valueOf(counter.length()));
		
	}
	
	public void L5NS(ActionEvent event){
		
		String PreVal = TFInputNS.getText()+5;
		
		TFInputNS.setText(PreVal);
		
		String counter = PreVal;
		
		TFNSCount1.setText(String.valueOf(counter.length()));
		
	}

	public void L6NS(ActionEvent event){
		
		String PreVal = TFInputNS.getText()+6;
		
		TFInputNS.setText(PreVal);
		
		String counter = PreVal;
		
		TFNSCount1.setText(String.valueOf(counter.length()));
		
	}

	public void L7NS(ActionEvent event){
		
		String PreVal = TFInputNS.getText()+7;
		
		TFInputNS.setText(PreVal);
		
		String counter = PreVal;
		
		TFNSCount1.setText(String.valueOf(counter.length()));
		
	}
	
	public void L8NS(ActionEvent event){
		
		String PreVal = TFInputNS.getText()+8;
		
		TFInputNS.setText(PreVal);
		
		String counter = PreVal;
		
		TFNSCount1.setText(String.valueOf(counter.length()));
		
	}
	
	public void L9NS(ActionEvent event){
		
		String PreVal = TFInputNS.getText()+9;
		
		TFInputNS.setText(PreVal);
		
		String counter = PreVal;
		
		TFNSCount1.setText(String.valueOf(counter.length()));
		
	}
	
	public void LANS(ActionEvent event){
		
		String PreVal = TFInputNS.getText()+"A";
		TFInputNS.setText(PreVal);
		
		String counter = PreVal;
		
		TFNSCount1.setText(String.valueOf(counter.length()));
		
	}
	
	public void LBNS(ActionEvent event){
		
		String PreVal = TFInputNS.getText()+"B";
		TFInputNS.setText(PreVal);
		
		String counter = PreVal;
		
		TFNSCount1.setText(String.valueOf(counter.length()));
		
	}
	
	public void LCNS1(ActionEvent event){
		
		String PreVal = TFInputNS.getText()+"C";
		TFInputNS.setText(PreVal);
		
		String counter = PreVal;
		
		TFNSCount1.setText(String.valueOf(counter.length()));
		
	}
	
	public void LDNS(ActionEvent event){
		
		String PreVal = TFInputNS.getText()+"D";
		TFInputNS.setText(PreVal);
		
		String counter = PreVal;
		
		TFNSCount1.setText(String.valueOf(counter.length()));
		
	}
	
	public void LENS(ActionEvent event){
		
		String PreVal = TFInputNS.getText()+"E";
		TFInputNS.setText(PreVal);
		
		String counter = PreVal;
		
		TFNSCount1.setText(String.valueOf(counter.length()));
		
	}
	
	public void LFNS(ActionEvent event){
		
		String PreVal = TFInputNS.getText()+"F";
		TFInputNS.setText(PreVal);
		
		String counter = PreVal;
		
		TFNSCount1.setText(String.valueOf(counter.length()));
		
	}
	
	public void LCNS(ActionEvent event){
		
		try{
	        
	        String a = TFInputNS.getText();
	        
	        TFInputNS.setText(a.substring(0, a.length()-1));
	        
	        String c2 = a;
			
			TFNSCount1.setText(String.valueOf(c2.length()-1));
			
	        } catch (Exception e){
	            
	        }
	        
			TFInputNS.requestFocus();
	}
	
	//Numbers pad actions end
	
	
	//ClearAll actions start
	public void BtnClearAllNS(ActionEvent event){
		
		TFInputNS.setText("");
		TFOutputNS.setText("");
		TFNSCount.setText("");
		TAOutputSPNU.setText("");
	}
	//ClearAll actions ends
	
	
	//Sort out actions starts
	public void BtnSortOutNS(ActionEvent event){
		
		String a = TFInputNS.getText();
	    
		TFInputNS.setText(a.replaceAll("[^0-9]", ""));
		
	}
	//Sort out actions ends
	
	
	
	//Convert actions start
	
	public void BtnConvertNS(ActionEvent event){
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Binary"){
			
			try {decimal_to_binary_calc();
			
			} catch(NumberFormatException e){
	            
	            JOptionPane.showMessageDialog(null, "Sort Out");
	            
	            String a = TFInputNS.getText();
	    
	            TFInputNS.setText(a.replaceAll("[^0-9]", ""));
	            
	        }
				
		}
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Ternary")      { decimal_to_ternary_calc();      }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Quaternary")   { decimal_to_quaterrnary_calc();  }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Quinary")      { decimal_to_quinary_calc();      }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Senary")       { decimal_to_senary_calc();       }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Septenary")    { decimal_to_septenary_calc();    }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Octal")        { decimal_to_octal_calc();        }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Nonary")       { decimal_to_nonary_calc();       }		
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Undecimal")    { decimal_to_undecimal_calc();    }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Duodecimal")   { decimal_to_duodecimal_calc();   }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Tridecimal")   { decimal_to_tridecimal_calc();   }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Tetradecimal") { decimal_to_tetradecimal_calc(); }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Pentadecimal") { decimal_to_pentadecimal_calc(); }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Hexadecimal")  { decimal_to_hexadecimal_calc();  }
		
		
		
		if(comboBox1.getValue() == "Binary"       && comboBox2.getValue() == "Decimal") { binary_to_decimal_calc();       }
		
		if(comboBox1.getValue() == "Ternary"      && comboBox2.getValue() == "Decimal") { ternary_to_decimal_calc();      }
		
		if(comboBox1.getValue() == "Quaternary"   && comboBox2.getValue() == "Decimal") { quaternary_to_decimal_calc();   }
		
		if(comboBox1.getValue() == "Quinary"      && comboBox2.getValue() == "Decimal") { quinary_to_decimal_calc();      }
		
		if(comboBox1.getValue() == "Senary"       && comboBox2.getValue() == "Decimal") { senary_to_decimal_calc();       }
		
		if(comboBox1.getValue() == "Septenary"    && comboBox2.getValue() == "Decimal") { septenary_to_decimal_calc();    }
		
		if(comboBox1.getValue() == "Octal"        && comboBox2.getValue() == "Decimal") { octal_to_decimal_calc();        }
		
		if(comboBox1.getValue() == "Nonary"       && comboBox2.getValue() == "Decimal") { nonary_to_decimal_calc();       }	
		
		if(comboBox1.getValue() == "Undecimal"    && comboBox2.getValue() == "Decimal") { undecimal_to_decimal_calc();    }
		
		if(comboBox1.getValue() == "Duodecimal"   && comboBox2.getValue() == "Decimal") { duodecimal_to_decimal_calc();   }
		
		if(comboBox1.getValue() == "Tridecimal"   && comboBox2.getValue() == "Decimal") { tridecimal_to_decimal_calc();   }
		
		if(comboBox1.getValue() == "Tetradecimal" && comboBox2.getValue() == "Decimal") { tetradecimal_to_decimal_calc(); }
		
		if(comboBox1.getValue() == "Pentadecimal" && comboBox2.getValue() == "Decimal") { pentadecimal_to_decimal_calc(); }
		
		if(comboBox1.getValue() == "Hexadecimal"  && comboBox2.getValue() == "Decimal") { hexadecimal_to_decimal_calc();  }
		
		
		if(comboBox1.getValue() == "Binary"  && comboBox2.getValue() == "Ternary")       { binary_to_ternary();         }
		
		if(comboBox1.getValue() == "Binary"  && comboBox2.getValue() == "Quaternary")    { binary_to_quaternary();     }
		
		if(comboBox1.getValue() == "Binary"  && comboBox2.getValue() == "Quinary")       { binary_to_quinary();        }
		
		if(comboBox1.getValue() == "Binary"  && comboBox2.getValue() == "Senary")        { binary_to_senary();         }
		
		if(comboBox1.getValue() == "Binary"  && comboBox2.getValue() == "Septenary")     { binary_to_septenary();      }
		
		if(comboBox1.getValue() == "Binary"  && comboBox2.getValue() == "Octal")         { binary_to_octal();          }
		
		if(comboBox1.getValue() == "Binary"  && comboBox2.getValue() == "Nonary")        { binary_to_nonary();         }
		
		if(comboBox1.getValue() == "Binary"  && comboBox2.getValue() == "Undecimal")     { binary_to_undecimal();      }
		
		if(comboBox1.getValue() == "Binary"  && comboBox2.getValue() == "Duodecimal")    { binary_to_duodecimal();     }
		
		if(comboBox1.getValue() == "Binary"  && comboBox2.getValue() == "Tridecimal")    { binary_to_tridecimal();     }
		
		if(comboBox1.getValue() == "Binary"  && comboBox2.getValue() == "Tetradecimal")  { binary_to_tetradecimal();   }
		
		if(comboBox1.getValue() == "Binary"  && comboBox2.getValue() == "Pentadecimal")  { binary_to_pentadecimal();   }
		
		if(comboBox1.getValue() == "Binary"  && comboBox2.getValue() == "Hexadecimal")   { binary_to_hexadecimal();    }
		
		
		if(comboBox1.getValue() == "Ternary"  && comboBox2.getValue() == "Binary")        { ternary_to_binary();        }        
		
		if(comboBox1.getValue() == "Ternary"  && comboBox2.getValue() == "Quaternary")    { ternary_to_quaternary();     }
		
		if(comboBox1.getValue() == "Ternary"  && comboBox2.getValue() == "Quinary")       { ternary_to_quinary();        }
		
		if(comboBox1.getValue() == "Ternary"  && comboBox2.getValue() == "Senary")        { ternary_to_senary();         }
		
		if(comboBox1.getValue() == "Ternary"  && comboBox2.getValue() == "Septenary")     { ternary_to_septenary();      }
		
		if(comboBox1.getValue() == "Ternary"  && comboBox2.getValue() == "Octal")         { ternary_to_octal();          }
		
		if(comboBox1.getValue() == "Ternary"  && comboBox2.getValue() == "Nonary")        { ternary_to_nonary();         }
		
		if(comboBox1.getValue() == "Ternary"  && comboBox2.getValue() == "Undecimal")     { ternary_to_undecimal();      }
		
		if(comboBox1.getValue() == "Ternary"  && comboBox2.getValue() == "Duodecimal")    { ternary_to_duodecimal();     }
		
		if(comboBox1.getValue() == "Ternary"  && comboBox2.getValue() == "Tridecimal")    { ternary_to_tridecimal();     }
		
		if(comboBox1.getValue() == "Ternary"  && comboBox2.getValue() == "Tetradecimal")  { ternary_to_tetradecimal();   }
		
		if(comboBox1.getValue() == "Ternary"  && comboBox2.getValue() == "Pentadecimal")  { ternary_to_pentadecimal();   }
		
		if(comboBox1.getValue() == "Ternary"  && comboBox2.getValue() == "Hexadecimal")   { ternary_to_hexadecimal();    }
		
		
		
        if(comboBox1.getValue() == "Quaternary"  && comboBox2.getValue() == "Binary")        { quaternary_to_binary();         }        
		
		if(comboBox1.getValue() == "Quaternary"  && comboBox2.getValue() == "Ternary")       { quaternary_to_ternary();        }
		
		if(comboBox1.getValue() == "Quaternary"  && comboBox2.getValue() == "Quinary")       { quaternary_to_quinary();        }
		
		if(comboBox1.getValue() == "Quaternary"  && comboBox2.getValue() == "Senary")        { quaternary_to_senary();         }
		
		if(comboBox1.getValue() == "Quaternary"  && comboBox2.getValue() == "Septenary")     { quaternary_to_septenary();      }
		
		if(comboBox1.getValue() == "Quaternary"  && comboBox2.getValue() == "Octal")         { quaternary_to_octal();          }
		
		if(comboBox1.getValue() == "Quaternary"  && comboBox2.getValue() == "Nonary")        { quaternary_to_nonary();         }
		
		if(comboBox1.getValue() == "Quaternary"  && comboBox2.getValue() == "Undecimal")     { quaternary_to_undecimal();      }
		
		if(comboBox1.getValue() == "Quaternary"  && comboBox2.getValue() == "Duodecimal")    { quaternary_to_duodecimal();     }
		
		if(comboBox1.getValue() == "Quaternary"  && comboBox2.getValue() == "Tridecimal")    { quaternary_to_tridecimal();     }
	
		if(comboBox1.getValue() == "Quaternary"  && comboBox2.getValue() == "Tetradecimal")  { quaternary_to_tetradecimal();   }
		
		if(comboBox1.getValue() == "Quaternary"  && comboBox2.getValue() == "Pentadecimal")  { quaternary_to_pentadecimal();   }
		
		if(comboBox1.getValue() == "Quaternary"  && comboBox2.getValue() == "Hexadecimal")   { quaternary_to_hexadecimal();    }
		
		
		
		if(comboBox1.getValue() == "Quinary"  && comboBox2.getValue() == "Binary")        { quinary_to_binary();         }        
		
		if(comboBox1.getValue() == "Quinary"  && comboBox2.getValue() == "Ternary")       { quinary_to_ternary();        }
		
		if(comboBox1.getValue() == "Quinary"  && comboBox2.getValue() == "Quaternary")    { quinary_to_quaternary();     }
		
		if(comboBox1.getValue() == "Quinary"  && comboBox2.getValue() == "Senary")        { quinary_to_senary();         }
		
		if(comboBox1.getValue() == "Quinary"  && comboBox2.getValue() == "Septenary")     { quinary_to_septenary();      }
		
		if(comboBox1.getValue() == "Quinary"  && comboBox2.getValue() == "Octal")         { quinary_to_octal();          }
		
		if(comboBox1.getValue() == "Quinary"  && comboBox2.getValue() == "Nonary")        { quinary_to_nonary();         }
		
		if(comboBox1.getValue() == "Quinary"  && comboBox2.getValue() == "Undecimal")     { quinary_to_undecimal();      }
		
		if(comboBox1.getValue() == "Quinary"  && comboBox2.getValue() == "Duodecimal")    { quinary_to_duodecimal();     }
		
		if(comboBox1.getValue() == "Quinary"  && comboBox2.getValue() == "Tridecimal")    { quinary_to_tridecimal();     }
	
		if(comboBox1.getValue() == "Quinary"  && comboBox2.getValue() == "Tetradecimal")  { quinary_to_tetradecimal();   }
		
		if(comboBox1.getValue() == "Quinary"  && comboBox2.getValue() == "Pentadecimal")  { quinary_to_pentadecimal();   }
		
		if(comboBox1.getValue() == "Quinary"  && comboBox2.getValue() == "Hexadecimal")   { quinary_to_hexadecimal();    }
		
		
		
		if(comboBox1.getValue() == "Senary"  && comboBox2.getValue() == "Binary")        { senary_to_binary();         }        
		
		if(comboBox1.getValue() == "Senary"  && comboBox2.getValue() == "Ternary")       { senary_to_ternary();        }
		
		if(comboBox1.getValue() == "Senary"  && comboBox2.getValue() == "Quaternary")    { senary_to_quaternary();     }
		
		if(comboBox1.getValue() == "Senary"  && comboBox2.getValue() == "Quinary")       { senary_to_quinary();         }
		
		if(comboBox1.getValue() == "Senary"  && comboBox2.getValue() == "Septenary")     { senary_to_septenary();      }
		
		if(comboBox1.getValue() == "Senary"  && comboBox2.getValue() == "Octal")         { senary_to_octal();          }
		
		if(comboBox1.getValue() == "Senary"  && comboBox2.getValue() == "Nonary")        { senary_to_nonary();         }
		
		if(comboBox1.getValue() == "Senary"  && comboBox2.getValue() == "Undecimal")     { senary_to_undecimal();      }
		
		if(comboBox1.getValue() == "Senary"  && comboBox2.getValue() == "Duodecimal")    { senary_to_duodecimal();     }
		
		if(comboBox1.getValue() == "Senary"  && comboBox2.getValue() == "Tridecimal")    { senary_to_tridecimal();     }
	
		if(comboBox1.getValue() == "Senary"  && comboBox2.getValue() == "Tetradecimal")  { senary_to_tetradecimal();   }
		
		if(comboBox1.getValue() == "Senary"  && comboBox2.getValue() == "Pentadecimal")  { senary_to_pentadecimal();   }
		
		if(comboBox1.getValue() == "Senary"  && comboBox2.getValue() == "Hexadecimal")   { senary_to_hexadecimal();    }
		
		
        if(comboBox1.getValue() == "Septenary"  && comboBox2.getValue() == "Binary")        { septenary_to_binary();         }        
		
		if(comboBox1.getValue() == "Septenary"  && comboBox2.getValue() == "Ternary")       { septenary_to_ternary();        }
		
		if(comboBox1.getValue() == "Septenary"  && comboBox2.getValue() == "Quaternary")    { septenary_to_quaternary();     }
		
		if(comboBox1.getValue() == "Septenary"  && comboBox2.getValue() == "Quinary")       { septenary_to_quinary();        }
		
		if(comboBox1.getValue() == "Septenary"  && comboBox2.getValue() == "Senary")       { septenary_to_senary();        }
		
		if(comboBox1.getValue() == "Septenary"  && comboBox2.getValue() == "Octal")         { septenary_to_octal();          }
		
		if(comboBox1.getValue() == "Septenary"  && comboBox2.getValue() == "Nonary")        { septenary_to_nonary();         }
		
		if(comboBox1.getValue() == "Septenary"  && comboBox2.getValue() == "Undecimal")     { septenary_to_undecimal();      }
		
		if(comboBox1.getValue() == "Septenary"  && comboBox2.getValue() == "Duodecimal")    { septenary_to_duodecimal();     }
		
		if(comboBox1.getValue() == "Septenary"  && comboBox2.getValue() == "Tridecimal")    { septenary_to_tridecimal();     }
	
		if(comboBox1.getValue() == "Septenary"  && comboBox2.getValue() == "Tetradecimal")  { septenary_to_tetradecimal();   }
		
		if(comboBox1.getValue() == "Septenary"  && comboBox2.getValue() == "Pentadecimal")  { septenary_to_pentadecimal();   }
		
		if(comboBox1.getValue() == "Septenary"  && comboBox2.getValue() == "Hexadecimal")   { septenary_to_hexadecimal();    }
		
		
        if(comboBox1.getValue() == "Octal"  && comboBox2.getValue() == "Binary")        { octal_to_binary();         }        
		
		if(comboBox1.getValue() == "Octal"  && comboBox2.getValue() == "Ternary")       { octal_to_ternary();        }
		
		if(comboBox1.getValue() == "Octal"  && comboBox2.getValue() == "Quaternary")    { octal_to_quaternary();     }
		
		if(comboBox1.getValue() == "Octal"  && comboBox2.getValue() == "Quinary")       { octal_to_quinary();        }
		
		if(comboBox1.getValue() == "Octal"  && comboBox2.getValue() == "Senary")        { octal_to_senary();         }
		
		if(comboBox1.getValue() == "Octal"  && comboBox2.getValue() == "Septenary")     { octal_to_septenary();      }
		
		if(comboBox1.getValue() == "Octal"  && comboBox2.getValue() == "Nonary")        { octal_to_nonary();         }
		
		if(comboBox1.getValue() == "Octal"  && comboBox2.getValue() == "Undecimal")     { octal_to_undecimal();      }
		
		if(comboBox1.getValue() == "Octal"  && comboBox2.getValue() == "Duodecimal")    { octal_to_duodecimal();     }
		
		if(comboBox1.getValue() == "Octal"  && comboBox2.getValue() == "Tridecimal")    { octal_to_tridecimal();     }
	
		if(comboBox1.getValue() == "Octal"  && comboBox2.getValue() == "Tetradecimal")  { octal_to_tetradecimal();   }
		
		if(comboBox1.getValue() == "Octal"  && comboBox2.getValue() == "Pentadecimal")  { octal_to_pentadecimal();   }
		
		if(comboBox1.getValue() == "Octal"  && comboBox2.getValue() == "Hexadecimal")   { octal_to_hexadecimal();    }
		
		
		
		if(comboBox1.getValue() == "Nonary"  && comboBox2.getValue() == "Binary")        { nonary_to_binary();         }        
		
		if(comboBox1.getValue() == "Nonary"  && comboBox2.getValue() == "Ternary")       { nonary_to_ternary();        }
		
		if(comboBox1.getValue() == "Nonary"  && comboBox2.getValue() == "Quaternary")    { nonary_to_quaternary();     }
		
		if(comboBox1.getValue() == "Nonary"  && comboBox2.getValue() == "Quinary")       { nonary_to_quinary();        }
		
		if(comboBox1.getValue() == "Nonary"  && comboBox2.getValue() == "Senary")        { nonary_to_senary();        }
		
		if(comboBox1.getValue() == "Nonary"  && comboBox2.getValue() == "Septenary")     { nonary_to_septenary();          }
		
		if(comboBox1.getValue() == "Nonary"  && comboBox2.getValue() == "Octal")         { nonary_to_octal();         }
		
		if(comboBox1.getValue() == "Nonary"  && comboBox2.getValue() == "Undecimal")     { nonary_to_undecimal();      }
		
		if(comboBox1.getValue() == "Nonary"  && comboBox2.getValue() == "Duodecimal")    { nonary_to_duodecimal();     }
		
		if(comboBox1.getValue() == "Nonary"  && comboBox2.getValue() == "Tridecimal")    { nonary_to_tridecimal();     }
	
		if(comboBox1.getValue() == "Nonary"  && comboBox2.getValue() == "Tetradecimal")  { nonary_to_tetradecimal();   }
		
		if(comboBox1.getValue() == "Nonary"  && comboBox2.getValue() == "Pentadecimal")  { nonary_to_pentadecimal();   }
		
		if(comboBox1.getValue() == "Nonary"  && comboBox2.getValue() == "Hexadecimal")   { nonary_to_hexadecimal();    }
		
		
		if(comboBox1.getValue() == "Undecimal"  && comboBox2.getValue() == "Binary")        { undecimal_to_binary();         }        
		
		if(comboBox1.getValue() == "Undecimal"  && comboBox2.getValue() == "Ternary")       { undecimal_to_ternary();        }
		
		if(comboBox1.getValue() == "Undecimal"  && comboBox2.getValue() == "Quaternary")    { undecimal_to_quaternary();     }
		
		if(comboBox1.getValue() == "Undecimal"  && comboBox2.getValue() == "Quinary")       { undecimal_to_quinary();        }
		
		if(comboBox1.getValue() == "Undecimal"  && comboBox2.getValue() == "Senary")        { undecimal_to_senary();        }
		
		if(comboBox1.getValue() == "Undecimal"  && comboBox2.getValue() == "Septenary")     { undecimal_to_septenary();          }
		
		if(comboBox1.getValue() == "Undecimal"  && comboBox2.getValue() == "Octal")         { undecimal_to_octal();         }
		
		if(comboBox1.getValue() == "Undecimal"  && comboBox2.getValue() == "Nonary")        { undecimal_to_nonary();      }
		
		if(comboBox1.getValue() == "Undecimal"  && comboBox2.getValue() == "Duodecimal")    { undecimal_to_duodecimal();     }
		
		if(comboBox1.getValue() == "Undecimal"  && comboBox2.getValue() == "Tridecimal")    { undecimal_to_tridecimal();     }
	
		if(comboBox1.getValue() == "Undecimal"  && comboBox2.getValue() == "Tetradecimal")  { undecimal_to_tetradecimal();   }
		
		if(comboBox1.getValue() == "Undecimal"  && comboBox2.getValue() == "Pentadecimal")  { undecimal_to_pentadecimal();   }
		
		if(comboBox1.getValue() == "Undecimal"  && comboBox2.getValue() == "Hexadecimal")   { undecimal_to_hexadecimal();    }
		
		
		if(comboBox1.getValue() == "Duodecimal"  && comboBox2.getValue() == "Binary")        { duodecimal_to_binary();         }        
		
		if(comboBox1.getValue() == "Duodecimal"  && comboBox2.getValue() == "Ternary")       { duodecimal_to_ternary();        }
		
		if(comboBox1.getValue() == "Duodecimal"  && comboBox2.getValue() == "Quaternary")    { duodecimal_to_quaternary();     }
		
		if(comboBox1.getValue() == "Duodecimal"  && comboBox2.getValue() == "Quinary")       { duodecimal_to_quinary();        }
		
		if(comboBox1.getValue() == "Duodecimal"  && comboBox2.getValue() == "Senary")        { duodecimal_to_senary();         }
		
		if(comboBox1.getValue() == "Duodecimal"  && comboBox2.getValue() == "Septenary")     { duodecimal_to_septenary();      }
		
		if(comboBox1.getValue() == "Duodecimal"  && comboBox2.getValue() == "Octal")         { duodecimal_to_octal();          }
		
		if(comboBox1.getValue() == "Duodecimal"  && comboBox2.getValue() == "Nonary")        { duodecimal_to_nonary();         }
		
		if(comboBox1.getValue() == "Duodecimal"  && comboBox2.getValue() == "Undecimal")     { duodecimal_to_undecimal();     }
		
		if(comboBox1.getValue() == "Duodecimal"  && comboBox2.getValue() == "Tridecimal")    { duodecimal_to_tridecimal();     }
	
		if(comboBox1.getValue() == "Duodecimal"  && comboBox2.getValue() == "Tetradecimal")  { duodecimal_to_tetradecimal();   }
		
		if(comboBox1.getValue() == "Duodecimal"  && comboBox2.getValue() == "Pentadecimal")  { duodecimal_to_pentadecimal();   }
		
		if(comboBox1.getValue() == "Duodecimal"  && comboBox2.getValue() == "Hexadecimal")   { duodecimal_to_hexadecimal();    }
		
		
		
		if(comboBox1.getValue() == "Tridecimal"  && comboBox2.getValue() == "Binary")        { tridecimal_to_binary();         }        
		
		if(comboBox1.getValue() == "Tridecimal"  && comboBox2.getValue() == "Ternary")       { tridecimal_to_ternary();        }
		
		if(comboBox1.getValue() == "Tridecimal"  && comboBox2.getValue() == "Quaternary")    { tridecimal_to_quaternary();     }
		
		if(comboBox1.getValue() == "Tridecimal"  && comboBox2.getValue() == "Quinary")       { tridecimal_to_quinary();        }
		
		if(comboBox1.getValue() == "Tridecimal"  && comboBox2.getValue() == "Senary")        { tridecimal_to_senary();         }
		
		if(comboBox1.getValue() == "Tridecimal"  && comboBox2.getValue() == "Septenary")     { tridecimal_to_septenary();      }
		
		if(comboBox1.getValue() == "Tridecimal"  && comboBox2.getValue() == "Octal")         { tridecimal_to_octal();          }
		
		if(comboBox1.getValue() == "Tridecimal"  && comboBox2.getValue() == "Nonary")        { tridecimal_to_nonary();         }
		
		if(comboBox1.getValue() == "Tridecimal"  && comboBox2.getValue() == "Undecimal")     { tridecimal_to_undecimal();      }
		
		if(comboBox1.getValue() == "Tridecimal"  && comboBox2.getValue() == "Duodecimal")    { tridecimal_to_duodecimal();     }
	
		if(comboBox1.getValue() == "Tridecimal"  && comboBox2.getValue() == "Tetradecimal")  { tridecimal_to_tetradecimal();   }
		
		if(comboBox1.getValue() == "Tridecimal"  && comboBox2.getValue() == "Pentadecimal")  { tridecimal_to_pentadecimal();   }
		
		if(comboBox1.getValue() == "Tridecimal"  && comboBox2.getValue() == "Hexadecimal")   { tridecimal_to_hexadecimal();    }
		
		
		if(comboBox1.getValue() == "Tetradecimal"  && comboBox2.getValue() == "Binary")        { tetradecimal_to_binary();         }        
		
		if(comboBox1.getValue() == "Tetradecimal"  && comboBox2.getValue() == "Ternary")       { tetradecimal_to_ternary();        }
		
		if(comboBox1.getValue() == "Tetradecimal"  && comboBox2.getValue() == "Quaternary")    { tetradecimal_to_quaternary();     }
		
		if(comboBox1.getValue() == "Tetradecimal"  && comboBox2.getValue() == "Quinary")       { tetradecimal_to_quinary();        }
		
		if(comboBox1.getValue() == "Tetradecimal"  && comboBox2.getValue() == "Senary")        { tetradecimal_to_senary();         }
		
		if(comboBox1.getValue() == "Tetradecimal"  && comboBox2.getValue() == "Septenary")     { tetradecimal_to_septenary();      }
		
		if(comboBox1.getValue() == "Tetradecimal"  && comboBox2.getValue() == "Octal")         { tetradecimal_to_octal();          }
		
		if(comboBox1.getValue() == "Tetradecimal"  && comboBox2.getValue() == "Nonary")        { tetradecimal_to_nonary();         }
		
		if(comboBox1.getValue() == "Tetradecimal"  && comboBox2.getValue() == "Undecimal")     { tetradecimal_to_undecimal();      }
		
		if(comboBox1.getValue() == "Tetradecimal"  && comboBox2.getValue() == "Duodecimal")    { tetradecimal_to_duodecimal();     }
	
		if(comboBox1.getValue() == "Tetradecimal"  && comboBox2.getValue() == "Tridecimal")    { tetradecimal_to_tridecimal();   }
		
		if(comboBox1.getValue() == "Tetradecimal"  && comboBox2.getValue() == "Pentadecimal")  { tetradecimal_to_pentadecimal();   }
		
		if(comboBox1.getValue() == "Tetradecimal"  && comboBox2.getValue() == "Hexadecimal")   { tetradecimal_to_hexadecimal();    }
		
		
		if(comboBox1.getValue() == "Pentadecimal"  && comboBox2.getValue() == "Binary")        { pentadecimal_to_binary();         }        
		
		if(comboBox1.getValue() == "Pentadecimal"  && comboBox2.getValue() == "Ternary")       { pentadecimal_to_ternary();        }
		
		if(comboBox1.getValue() == "Pentadecimal"  && comboBox2.getValue() == "Quaternary")    { pentadecimal_to_quaternary();     }
		
		if(comboBox1.getValue() == "Pentadecimal"  && comboBox2.getValue() == "Quinary")       { pentadecimal_to_quinary();        }
		
		if(comboBox1.getValue() == "Pentadecimal"  && comboBox2.getValue() == "Senary")        { pentadecimal_to_senary();         }
		
		if(comboBox1.getValue() == "Pentadecimal"  && comboBox2.getValue() == "Septenary")     { pentadecimal_to_septenary();      }
		
		if(comboBox1.getValue() == "Pentadecimal"  && comboBox2.getValue() == "Octal")         { pentadecimal_to_octal();          }
		
		if(comboBox1.getValue() == "Pentadecimal"  && comboBox2.getValue() == "Nonary")        { pentadecimal_to_nonary();         }
		
		if(comboBox1.getValue() == "Pentadecimal"  && comboBox2.getValue() == "Undecimal")     { pentadecimal_to_undecimal();      }
		
		if(comboBox1.getValue() == "Pentadecimal"  && comboBox2.getValue() == "Duodecimal")    { pentadecimal_to_duodecimal();     }
	
		if(comboBox1.getValue() == "Pentadecimal"  && comboBox2.getValue() == "Tridecimal")    { pentadecimal_to_tridecimal();   }
		
		if(comboBox1.getValue() == "Pentadecimal"  && comboBox2.getValue() == "Tetradecimal")  { pentadecimal_to_tetradecimal();   }
		
		if(comboBox1.getValue() == "Pentadecimal"  && comboBox2.getValue() == "Hexadecimal")   { pentadecimal_to_hexadecimal();    }
		
		
		if(comboBox1.getValue() == "Hexadecimal"  && comboBox2.getValue() == "Binary")        { hexadecimal_to_binary();         }        
		
		if(comboBox1.getValue() == "Hexadecimal"  && comboBox2.getValue() == "Ternary")       { hexadecimal_to_ternary();        }
		
		if(comboBox1.getValue() == "Hexadecimal"  && comboBox2.getValue() == "Quaternary")    { hexadecimal_to_quaternary();     }
		
		if(comboBox1.getValue() == "Hexadecimal"  && comboBox2.getValue() == "Quinary")       { hexadecimal_to_quinary();        }
		
		if(comboBox1.getValue() == "Hexadecimal"  && comboBox2.getValue() == "Senary")        { hexadecimal_to_senary();         }
		
		if(comboBox1.getValue() == "Hexadecimal"  && comboBox2.getValue() == "Septenary")     { hexadecimal_to_septenary();      }
		
		if(comboBox1.getValue() == "Hexadecimal"  && comboBox2.getValue() == "Octal")         { hexadecimal_to_octal();          }
		
		if(comboBox1.getValue() == "Hexadecimal"  && comboBox2.getValue() == "Nonary")        { hexadecimal_to_nonary();         }
		
		if(comboBox1.getValue() == "Hexadecimal"  && comboBox2.getValue() == "Undecimal")     { hexadecimal_to_undecimal();      }
		
		if(comboBox1.getValue() == "Hexadecimal"  && comboBox2.getValue() == "Duodecimal")    { hexadecimal_to_duodecimal();     }
	
		if(comboBox1.getValue() == "Hexadecimal"  && comboBox2.getValue() == "Tridecimal")    { hexadecimal_to_tridecimal();     }
		
		if(comboBox1.getValue() == "Hexadecimal"  && comboBox2.getValue() == "Tetradecimal")  { hexadecimal_to_tetradecimal();   }
		
		if(comboBox1.getValue() == "Hexadecimal"  && comboBox2.getValue() == "Pentadecimal")   { hexadecimal_to_pentadecimal();    }
		
		
	    }
	
		
	    //Convert actions start
	
	
	//Random example starts
	
	public void BtnRandomExampleNS(ActionEvent event){	
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Binary")       { calc_binary_random();       }
		
        if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Ternary")      { calc_ternary_random();      }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Quaternary")   { calc_quaternary_random();   }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Quinary")      { calc_quinary_random();      }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Senary")       { calc_senary_random();       }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Septenary")    { calc_septenary_random();    }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Octal")        { calc_octal_random();        }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Nonary")       { calc_nonary_random();       }		
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Undecimal")    { calc_undecimal_random();    }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Duodecimal")   { calc_duodecimal_random();   }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Tridecimal")   { calc_tridecimal_random();   }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Tetradecimal") { calc_tetradecimal_random(); }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Pentadecimal") { calc_pentadecimal_random(); }
		
		if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Hexadecimal")  { calc_hexadecimal_random();  }
		
		
        if(comboBox1.getValue() == "Binary"       && comboBox2.getValue() == "Decimal") { bin_to_dec_random();          }
		
		if(comboBox1.getValue() == "Ternary"      && comboBox2.getValue() == "Decimal") { ternary_to_dec_random();      }
		
		if(comboBox1.getValue() == "Quaternary"   && comboBox2.getValue() == "Decimal") { quaternary_to_dec_random();   }
		
		if(comboBox1.getValue() == "Quinary"      && comboBox2.getValue() == "Decimal") { quinary_to_dec_random();      }
		
		if(comboBox1.getValue() == "Senary"       && comboBox2.getValue() == "Decimal") { senary_to_dec_random();       }
		
		if(comboBox1.getValue() == "Septenary"    && comboBox2.getValue() == "Decimal") { septenary_to_dec_random();    }
		
		if(comboBox1.getValue() == "Octal"        && comboBox2.getValue() == "Decimal") { octal_to_dec_random();        }
		
		if(comboBox1.getValue() == "Nonary"       && comboBox2.getValue() == "Decimal") { nonary_to_dec_random();       }	
		
		if(comboBox1.getValue() == "Undecimal"    && comboBox2.getValue() == "Decimal") { undecimal_to_dec_random();    }
		
		if(comboBox1.getValue() == "Duodecimal"   && comboBox2.getValue() == "Decimal") { duodecimal_to_dec_random();   }
		
		if(comboBox1.getValue() == "Tridecimal"   && comboBox2.getValue() == "Decimal") { tridecimal_to_dec_random();   }
		
		if(comboBox1.getValue() == "Tetradecimal" && comboBox2.getValue() == "Decimal") { tetradecimal_to_dec_random(); }
		
		if(comboBox1.getValue() == "Pentadecimal" && comboBox2.getValue() == "Decimal") { pentadecimal_to_dec_random(); }
		
		if(comboBox1.getValue() == "Hexadecimal"  && comboBox2.getValue() == "Decimal") { hexadecimal_to_dec_random();  }
		
		
		
	}
	
	
	//Random example starts
		
	
	//Number systems to decimal start
	
		public void binary_to_decimal_calc(){
			
			NumberSystems ns = new NumberSystems();
			
			DecimalFormat f = new DecimalFormat(",###"); 
				
			long sn = NumberSystems.bin_to_dec(TFInputNS.getText());
			
			TFOutputNS.setText(String.valueOf( (f.format(sn)).replaceAll(",", ".")) );
			
			
			Long   length = sn;
			
			String length2 = length.toString(); 
			
			TFNSCount.setText(String.valueOf(length2.length()));
			
			TAOutputSPNU.setText(String.valueOf(ns.HDW2_NS_to_dec(TFInputNS.getText())));
			
		}
		
		public void ternary_to_decimal_calc(){
			
			NumberSystems ns = new NumberSystems();
			
			DecimalFormat f = new DecimalFormat(",###"); 
			
			long sn  = NumberSystems.ternary_to_dec(TFInputNS.getText());
			
			TFOutputNS.setText(String.valueOf( (f.format(sn)).replaceAll(",", ".")) );
			
			
			Long   length = sn;
			
			String length2 = length.toString();
			
			TFNSCount.setText(String.valueOf(length2.length()));
			
			TAOutputSPNU.setText(String.valueOf(ns.HDW3_NS_to_dec(TFInputNS.getText())));
			
		}
	
		public void quaternary_to_decimal_calc(){
			
			NumberSystems ns = new NumberSystems();
			
			DecimalFormat f = new DecimalFormat(",###"); 
			
			long sn = NumberSystems.quaternary_to_dec(TFInputNS.getText());
			
			TFOutputNS.setText(String.valueOf( (f.format(sn)).replaceAll(",", ".") ));
			
			
			Long length = sn;
			
			String length2 = length.toString();
			
			TFNSCount.setText(String.valueOf(length2.length()));
			
			TAOutputSPNU.setText(String.valueOf(ns.HDW4_NS_to_dec(TFInputNS.getText())));
			
		}
		
		public void quinary_to_decimal_calc(){
			
			NumberSystems ns = new NumberSystems();
			
			DecimalFormat f = new DecimalFormat(",###"); 
			
			long sn = NumberSystems.quinary_to_dec(TFInputNS.getText());
			
			TFOutputNS.setText(String.valueOf( (f.format(sn)).replaceAll(",", ".") ));
			
			
			Long length = sn;
			
			String length2 = length.toString();
			
			TFNSCount.setText(String.valueOf(length2.length()));
			
			TAOutputSPNU.setText(String.valueOf(ns.HDW5_NS_to_dec(TFInputNS.getText())));
			
		}
		
		public void senary_to_decimal_calc(){
			
			NumberSystems ns = new NumberSystems();
			
			DecimalFormat f = new DecimalFormat(",###"); 
			
			long sn = NumberSystems.senary_to_dec(TFInputNS.getText());
			
			TFOutputNS.setText(String.valueOf( (f.format(sn)).replaceAll(",", ".") ));
			
			
			Long length = sn;
			
			String length2 = length.toString();
			
			TFNSCount.setText(String.valueOf(length2.length()));
			
			TAOutputSPNU.setText(String.valueOf(ns.HDW6_NS_to_dec(TFInputNS.getText())));
			
		}
		
		public void septenary_to_decimal_calc(){
			
			NumberSystems ns = new NumberSystems();
			
			DecimalFormat f = new DecimalFormat(",###"); 
			
			long sn = NumberSystems.septenary_to_dec(TFInputNS.getText());
			
			TFOutputNS.setText(String.valueOf( (f.format(sn)).replaceAll(",", ".") ));
			
			
			Long length = sn;
			
			String length2 = length.toString();
			
			TFNSCount.setText(String.valueOf(length2.length()));
			
			TAOutputSPNU.setText(String.valueOf(ns.HDW7_NS_to_dec(TFInputNS.getText())));
			
		}
		
		public void octal_to_decimal_calc(){
			
			NumberSystems ns = new NumberSystems();
			
			DecimalFormat f = new DecimalFormat(",###"); 
			
			long sn = NumberSystems.octal_to_dec(TFInputNS.getText());
			
			TFOutputNS.setText(String.valueOf( (f.format(sn)).replaceAll(",", ".") ));
			
			
			Long length = sn;
			
			String length2 = length.toString();
			
			TFNSCount.setText(String.valueOf(length2.length()));
			
			TAOutputSPNU.setText(String.valueOf(ns.HDW8_NS_to_dec(TFInputNS.getText())));
			
		}
		
		public void nonary_to_decimal_calc(){
			
			NumberSystems ns = new NumberSystems();
			
			DecimalFormat f = new DecimalFormat(",###"); 
			
			long sn = NumberSystems.nonary_to_dec(TFInputNS.getText());
			
			TFOutputNS.setText(String.valueOf( (f.format(sn)).replaceAll(",", ".") ));
			
			
			Long length = sn;
			
			String length2 = length.toString();
			
			TFNSCount.setText(String.valueOf(length2.length()));
			
			TAOutputSPNU.setText(String.valueOf(ns.HDW9_NS_to_dec(TFInputNS.getText())));
		}
		
		public void decimal_to_decimal_calc(){
			
			DecimalFormat f = new DecimalFormat(",###"); 
			
			long sn;
			
			sn = Long.parseLong(TFInputNS.getText());
			
			TFOutputNS.setText(String.valueOf( (f.format(sn)).replaceAll(",", ".") ));
			
			
			Long length = sn;
			
			String length2 = length.toString();
			
			TFNSCount.setText(String.valueOf(length2.length()));
		}
		
		public void undecimal_to_decimal_calc(){
			
			NumberSystems ns = new NumberSystems();
			
			DecimalFormat f = new DecimalFormat(",###"); 
			
			long sn = NumberSystems.undecimal_to_dec(TFInputNS.getText());
			
			TFOutputNS.setText(String.valueOf( (f.format(sn)).replaceAll(",", ".") ));
			
			
			Long length = sn;
			
			String length2 = length.toString();
			
			TFNSCount.setText(String.valueOf(length2.length()));
			
			TAOutputSPNU.setText(String.valueOf(ns.HDW11_NS_to_dec(TFInputNS.getText())));
			
		}
		
		public void duodecimal_to_decimal_calc(){
			
			NumberSystems ns = new NumberSystems();
			
			DecimalFormat f = new DecimalFormat(",###"); 
			
			long sn = NumberSystems.duodecimal_to_dec(TFInputNS.getText());
			
			TFOutputNS.setText(String.valueOf( (f.format(sn)).replaceAll(",", ".") ));
			
			
			Long length = sn;
			
			String length2 = length.toString();
			
			TFNSCount.setText(String.valueOf(length2.length()));
			
			TAOutputSPNU.setText(String.valueOf(ns.HDW12_NS_to_dec(TFInputNS.getText())));
			
		} 
		
		public void tridecimal_to_decimal_calc(){
			
			NumberSystems ns = new NumberSystems();
			
			DecimalFormat f = new DecimalFormat(",###"); 
			
			long sn = NumberSystems.tridecimal_to_dec(TFInputNS.getText());
			
			TFOutputNS.setText(String.valueOf( (f.format(sn)).replaceAll(",", ".") ));
			
			
			Long length = sn;
			
			String length2 = length.toString();
			
			TFNSCount.setText(String.valueOf(length2.length()));
			
			TAOutputSPNU.setText(String.valueOf(ns.HDW13_NS_to_dec(TFInputNS.getText())));
			
		}
		
		public void tetradecimal_to_decimal_calc(){
			
			NumberSystems ns = new NumberSystems();
			
			DecimalFormat f = new DecimalFormat(",###"); 
			
			long sn = NumberSystems.tetradecimal_to_dec(TFInputNS.getText());
			
			TFOutputNS.setText(String.valueOf( (f.format(sn)).replaceAll(",", ".") ));
			
			
			Long length = sn;
			
			String length2 = length.toString();
			
			TFNSCount.setText(String.valueOf(length2.length()));
			
			TAOutputSPNU.setText(String.valueOf(ns.HDW14_NS_to_dec(TFInputNS.getText())));
			
		} 
		
		public void pentadecimal_to_decimal_calc(){
			
			NumberSystems ns = new NumberSystems();
			
			DecimalFormat f = new DecimalFormat(",###"); 
			
			long sn = NumberSystems.pentadecimal_to_dec(TFInputNS.getText());
			
			TFOutputNS.setText(String.valueOf( (f.format(sn)).replaceAll(",", ".") ));
			
			
			Long length = sn;
			
			String length2 = length.toString();
			
			TFNSCount.setText(String.valueOf(length2.length()));
			
			TAOutputSPNU.setText(String.valueOf(ns.HDW15_NS_to_dec(TFInputNS.getText())));
			
		} 
		
		public void hexadecimal_to_decimal_calc(){
			
			NumberSystems ns = new NumberSystems();
			
			DecimalFormat f = new DecimalFormat(",###"); 
			
			long sn = NumberSystems.hexadecimal_to_dec(TFInputNS.getText());
			
			TFOutputNS.setText(String.valueOf( (f.format(sn)).replaceAll(",", ".") ));
			
			
			Long length = sn;
			
			String length2 = length.toString();
			
			TFNSCount.setText(String.valueOf(length2.length()));
			
			TAOutputSPNU.setText(String.valueOf(ns.HDW16_NS_to_dec(TFInputNS.getText())));
		} 
		
		//Number systems to decimal start
	
	
	
	//Decimal to numbersystem start
	
	private void decimal_to_binary_calc(){
		 
        long n;
        
             n = Long.parseLong(TFInputNS.getText());
       
        NumberSystems ns2 = new NumberSystems();
        
        TFOutputNS.  setText(String.valueOf(ns2.binary_to_decimal(n)));
        
        TFNSCount.   setText(String.valueOf(ns2.count_Numbers(ns2.binary_to_decimal(n))));
        
        TAOutputSPNU.setText(String.valueOf(ns2.HDW2(n)));  
       
       
    }
	
	private void binary_to_ternary(){

		NumberSystems ns = new NumberSystems(); 
        
		          long n = NumberSystems.bin_to_dec(TFInputNS.getText());
		          
            
        between.     setText(String.valueOf(n));
        
        TFOutputNS.  setText(String.valueOf(ns.ternary_to_decimal(n)));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW2_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW3(n)));
		
	}
	
	private void binary_to_quaternary(){

		NumberSystems ns = new NumberSystems(); 
        
		         long n  = NumberSystems.bin_to_dec(TFInputNS.getText());
		          
            
        between.     setText(String.valueOf(n));
        
        TFOutputNS.  setText(String.valueOf(ns.quaternary_to_decimal(n)));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW2_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW4(n)));
		
	}
	
	private void binary_to_quinary(){

		NumberSystems ns = new NumberSystems(); 
        
		         long n  = NumberSystems.bin_to_dec(TFInputNS.getText());
		          
            
        between.     setText(String.valueOf(n));
        
        TFOutputNS.  setText(String.valueOf(ns.quinary_to_decimal(n)));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW2_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW5(n)));
		
	}
	
	private void binary_to_senary(){

		NumberSystems ns = new NumberSystems(); 
        
		         long n  = NumberSystems.bin_to_dec(TFInputNS.getText());
		          
            
        between.     setText(String.valueOf(n));
        
        TFOutputNS.  setText(String.valueOf(ns.senary_to_decimal(n)));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW2_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW6(n)));
		
	}
	
	private void binary_to_septenary(){

		NumberSystems ns = new NumberSystems(); 
        
		         long n  = NumberSystems.bin_to_dec(TFInputNS.getText());
		          
            
        between.     setText(String.valueOf(n));
        
        TFOutputNS.  setText(String.valueOf(ns.septenary_to_decimal(n)));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW2_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW7(n)));
		
	}
	
	private void binary_to_octal(){

		NumberSystems ns = new NumberSystems(); 
        
		         long n  = NumberSystems.bin_to_dec(TFInputNS.getText());
		          
            
        between.     setText(String.valueOf(n));
        
        TFOutputNS.  setText(String.valueOf(ns.octal_to_decimal(n)));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW2_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW8(n)));
		
	}
	
	private void binary_to_nonary(){

		NumberSystems ns = new NumberSystems(); 
        
		         long n  = NumberSystems.bin_to_dec(TFInputNS.getText());
		          
            
        between.     setText(String.valueOf(n));
        
        TFOutputNS.  setText(String.valueOf(ns.nonary_to_decimal(n)));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW2_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW9(n)));
		
	}
	
	private void binary_to_undecimal(){

		NumberSystems ns = new NumberSystems(); 
        
		         long n  = NumberSystems.bin_to_dec(TFInputNS.getText());
		          
            
        between.     setText(String.valueOf(n));
        
        TFOutputNS.  setText(String.valueOf(ns.undecimal_to_decimal(n)));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW2_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW11(n)));
		
	}
	
	private void binary_to_duodecimal(){

		NumberSystems ns = new NumberSystems(); 
        
		         long n  = NumberSystems.bin_to_dec(TFInputNS.getText());
		          
            
        between.     setText(String.valueOf(n));
        
        TFOutputNS.  setText(String.valueOf(ns.duodecimal_to_decimal(n)));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW2_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW12(n)));
		
	}
	
	private void binary_to_tridecimal(){

		NumberSystems ns = new NumberSystems(); 
        
		         long n  = NumberSystems.bin_to_dec(TFInputNS.getText());
		          
            
        between.     setText(String.valueOf(n));
        
        TFOutputNS.  setText(String.valueOf(ns.tridecimal_to_decimal(n)));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW2_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW13(n)));
		
	}
	
	private void binary_to_tetradecimal(){

		NumberSystems ns = new NumberSystems(); 
        
		         long n  = NumberSystems.bin_to_dec(TFInputNS.getText());
		          
            
        between.     setText(String.valueOf(n));
        
        TFOutputNS.  setText(String.valueOf(ns.tetradecimal_to_decimal(n)));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW2_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW14(n)));
		
	}
	
	private void binary_to_pentadecimal(){

		NumberSystems ns = new NumberSystems(); 
        
		         long n  = NumberSystems.bin_to_dec(TFInputNS.getText());
		          
            
        between.     setText(String.valueOf(n));
        
        TFOutputNS.  setText(String.valueOf(ns.pentadecimal_to_decimal(n)));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW2_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW15(n)));
		
	}
	
	private void binary_to_hexadecimal(){

		NumberSystems ns = new NumberSystems(); 
        
		         long n  = NumberSystems.bin_to_dec(TFInputNS.getText());
		          
            
        between.     setText(String.valueOf(n));
        
        TFOutputNS.  setText(String.valueOf(ns.hexadecimal_to_decimal(n)));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW2_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW16(n)));
		
	}
	
	private void ternary_to_binary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.ternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.binary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW3_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW2(n)));

	}
	
	private void ternary_to_quaternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.ternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quaternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW3_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW4(n)));

	}
	
	private void ternary_to_quinary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.ternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quinary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW3_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW5(n)));

	}
	
	private void ternary_to_senary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.ternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.senary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW3_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW6(n)));

	}
	
	private void ternary_to_septenary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.ternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.septenary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW3_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW7(n)));

	}
	
	private void ternary_to_octal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.ternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.octal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW3_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW8(n)));

	}
	
	private void ternary_to_nonary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.ternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.nonary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW3_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW9(n)));

	}
	
	private void ternary_to_undecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.ternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.undecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW3_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW11(n)));

	}
	
	private void ternary_to_duodecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.ternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.duodecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW3_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW12(n)));

	}
	
	private void ternary_to_tridecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.ternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tridecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW3_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW13(n)));

	}
	
	private void ternary_to_tetradecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.ternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tetradecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW3_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW14(n)));

	}
	
	private void ternary_to_pentadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.ternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.pentadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW3_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW15(n)));

	}
	
	private void ternary_to_hexadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.ternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.hexadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW3_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW16(n)));

	}
	
	private void quaternary_to_binary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quaternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.binary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW4_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW2(n)));

	}
	
	private void quaternary_to_ternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quaternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.ternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW4_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW3(n)));

	}
	
	private void quaternary_to_quinary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quaternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quinary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW4_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW5(n)));

	}
	
	private void quaternary_to_senary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quaternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.senary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW4_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW6(n)));

	}
	
	private void quaternary_to_septenary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quaternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.septenary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW4_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW7(n)));

	}
	
	private void quaternary_to_octal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quaternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.octal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW4_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW8(n)));

	}
	
	private void quaternary_to_nonary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quaternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.nonary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW4_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW9(n)));

	}
	
	private void quaternary_to_undecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quaternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.undecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW4_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW11(n)));

	}
	
	private void quaternary_to_duodecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quaternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.duodecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW4_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW12(n)));

	}
	
	private void quaternary_to_tridecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quaternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tridecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW4_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW13(n)));

	}
	
	private void quaternary_to_tetradecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quaternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tetradecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW4_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW14(n)));

	}
	
	private void quaternary_to_pentadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quaternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.pentadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW4_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW15(n)));

	}
	
	private void quaternary_to_hexadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quaternary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.hexadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW4_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW16(n)));

	}
	
	private void quinary_to_binary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quinary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.binary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW5_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW2(n)));

	}
	
	private void quinary_to_ternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quinary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.ternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW5_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW3(n)));

	}
	
	private void quinary_to_quaternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quinary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quaternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW5_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW4(n)));

	}
	
	private void quinary_to_senary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quinary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.senary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW5_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW6(n)));

	}
	
	private void quinary_to_septenary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quinary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.septenary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW5_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW7(n)));

	}
	
	private void quinary_to_octal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quinary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.octal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW5_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW8(n)));

	}
	
	private void quinary_to_nonary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quinary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.nonary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW5_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW9(n)));

	}
	
	private void quinary_to_undecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quinary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.undecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW5_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW11(n)));

	}
	
	private void quinary_to_duodecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quinary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.duodecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW5_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW12(n)));

	}
	
	private void quinary_to_tridecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quinary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tridecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW5_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW13(n)));

	}
	
	private void quinary_to_tetradecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quinary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tetradecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW5_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW14(n)));

	}
	
	private void quinary_to_pentadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quinary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.pentadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW5_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW15(n)));

	}
	
	private void quinary_to_hexadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.quinary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.hexadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW5_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW16(n)));

	}
	
	private void senary_to_binary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.senary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.binary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW6_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW2(n)));

	}
	
	private void senary_to_ternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.senary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.ternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW6_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW3(n)));

	}
	
	private void senary_to_quaternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.senary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quaternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW6_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW4(n)));

	}
	
	private void senary_to_quinary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.senary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quinary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW6_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW5(n)));

	}
	
	private void senary_to_septenary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.senary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.septenary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW6_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW7(n)));

	}
	
	private void senary_to_octal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.senary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.octal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW6_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW8(n)));

	}
	
	private void senary_to_nonary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.senary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.nonary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW6_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW9(n)));

	}
	
	private void senary_to_undecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.senary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.undecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW6_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW11(n)));

	}
	
	private void senary_to_duodecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.senary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.duodecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW6_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW12(n)));

	}
	
	private void senary_to_tridecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.senary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tridecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW6_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW13(n)));

	}
	
	private void senary_to_tetradecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.senary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tetradecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW6_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW14(n)));

	}
	
	private void senary_to_pentadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.senary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.pentadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW6_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW15(n)));

	}
	
	private void senary_to_hexadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.senary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.hexadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW6_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW16(n)));

	}
	
	
	
	private void septenary_to_binary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.septenary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.binary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW7_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW2(n)));

	}
	
	private void septenary_to_ternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.septenary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.ternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW7_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW3(n)));

	}
	
	private void septenary_to_quaternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.septenary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quaternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW7_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW4(n)));

	}
	
	private void septenary_to_quinary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.septenary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quinary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW7_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW5(n)));

	}
	
	private void septenary_to_senary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.septenary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.senary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW7_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW6(n)));

	}
	
	private void septenary_to_octal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.septenary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.octal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW7_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW8(n)));

	}
	
	private void septenary_to_nonary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.septenary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.nonary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW7_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW9(n)));

	}
	
	private void septenary_to_undecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.septenary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.undecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW7_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW11(n)));

	}
	
	private void septenary_to_duodecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.septenary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.duodecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW7_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW12(n)));

	}
	
	private void septenary_to_tridecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.septenary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tridecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW7_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW13(n)));

	}
	
	private void septenary_to_tetradecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.septenary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tetradecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW7_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW14(n)));

	}
	
	private void septenary_to_pentadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.septenary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.pentadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW7_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW15(n)));

	}
	
	private void septenary_to_hexadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.septenary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.hexadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW6_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW16(n)));

	}

	
	private void octal_to_binary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.octal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.binary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW8_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW2(n)));

	}
	
	private void octal_to_ternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.octal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.ternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW8_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW3(n)));

	}
	
	private void octal_to_quaternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.octal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quaternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW8_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW4(n)));

	}
	
	private void octal_to_quinary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.octal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quinary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW8_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW5(n)));

	}
	
	private void octal_to_senary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.octal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.senary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW8_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW6(n)));

	}
	
	private void octal_to_septenary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.octal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.septenary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW8_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW7(n)));

	}
	
	private void octal_to_nonary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.octal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.nonary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW8_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW9(n)));

	}
	
	private void octal_to_undecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.octal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.undecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW8_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW11(n)));

	}
	
	private void octal_to_duodecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.octal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.duodecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW8_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW12(n)));

	}
	
	private void octal_to_tridecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.octal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tridecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW8_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW13(n)));

	}
	
	private void octal_to_tetradecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.octal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tetradecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW8_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW14(n)));

	}
	
	private void octal_to_pentadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.octal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.pentadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW8_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW15(n)));

	}
	
	private void octal_to_hexadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.octal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.hexadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW8_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW16(n)));

	}
	
private void nonary_to_binary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.nonary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.binary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW9_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW2(n)));

	}
	
	private void nonary_to_ternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.nonary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.ternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW9_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW3(n)));

	}
	
	private void nonary_to_quaternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.nonary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quaternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW9_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW4(n)));

	}
	
	private void nonary_to_quinary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.nonary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quinary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW9_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW5(n)));

	}
	
	private void nonary_to_senary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.nonary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.senary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW9_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW6(n)));

	}
	
	private void nonary_to_septenary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.nonary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.septenary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW9_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW7(n)));

	}
	
	private void nonary_to_octal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.nonary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.octal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW9_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW8(n)));

	}
	
	private void nonary_to_undecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.nonary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.undecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW9_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW11(n)));

	}
	
	private void nonary_to_duodecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.nonary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.duodecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW9_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW12(n)));

	}
	
	private void nonary_to_tridecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.nonary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tridecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW9_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW13(n)));

	}
	
	private void nonary_to_tetradecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.nonary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tetradecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW9_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW14(n)));

	}
	
	private void nonary_to_pentadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.nonary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.pentadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW9_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW15(n)));

	}
	
	private void nonary_to_hexadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.nonary_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.hexadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW9_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW16(n)));

	}
	
	
	
	
	
	private void undecimal_to_binary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.undecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.binary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW11_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW2(n)));

	}
	
	private void undecimal_to_ternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.undecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.ternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW11_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW3(n)));

	}
	
	private void undecimal_to_quaternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.undecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quaternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW11_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW4(n)));

	}
	
	private void undecimal_to_quinary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.undecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quinary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW11_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW5(n)));

	}
	
	private void undecimal_to_senary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.undecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.senary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW11_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW6(n)));

	}
	
	private void undecimal_to_septenary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.undecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.septenary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW11_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW7(n)));

	}
	
	private void undecimal_to_octal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.undecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.octal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW11_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW8(n)));

	}
	
	private void undecimal_to_nonary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.undecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.nonary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW11_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW9(n)));

	}
	
	private void undecimal_to_duodecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.undecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.duodecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW11_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW12(n)));

	}
	
	private void undecimal_to_tridecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.undecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tridecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW11_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW13(n)));

	}
	
	private void undecimal_to_tetradecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.undecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tetradecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW11_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW14(n)));

	}
	
	private void undecimal_to_pentadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.undecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.pentadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW11_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW15(n)));

	}
	
	private void undecimal_to_hexadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.undecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.hexadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW11_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW16(n)));

	}
	
	
	
	private void duodecimal_to_binary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.duodecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.binary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW12_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW2(n)));

	}
	
	private void duodecimal_to_ternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.duodecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.ternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW12_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW3(n)));

	}
	
	private void duodecimal_to_quaternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.duodecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quaternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW12_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW4(n)));

	}
	
	private void duodecimal_to_quinary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.duodecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quinary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW12_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW5(n)));

	}
	
	private void duodecimal_to_senary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.duodecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.senary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW12_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW6(n)));

	}
	
	private void duodecimal_to_septenary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.duodecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.septenary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW12_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW7(n)));

	}
	
	private void duodecimal_to_octal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.duodecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.octal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW12_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW8(n)));

	}
	
	private void duodecimal_to_nonary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.duodecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.nonary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW12_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW9(n)));

	}
	
	private void duodecimal_to_undecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.duodecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.undecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW12_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW11(n)));

	}
	
	private void duodecimal_to_tridecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.duodecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tridecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW12_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW13(n)));

	}
	
	private void duodecimal_to_tetradecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.duodecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tetradecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW12_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW14(n)));

	}
	
	private void duodecimal_to_pentadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.duodecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.pentadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW12_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW15(n)));

	}
	
	private void duodecimal_to_hexadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.duodecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.hexadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW12_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW16(n)));

	}
	
	
private void tridecimal_to_binary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tridecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.binary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW13_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW2(n)));

	}
	
	private void tridecimal_to_ternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tridecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.ternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW13_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW3(n)));

	}
	
	private void tridecimal_to_quaternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tridecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quaternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW13_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW4(n)));

	}
	
	private void tridecimal_to_quinary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tridecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quinary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW13_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW5(n)));

	}
	
	private void tridecimal_to_senary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tridecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.senary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW13_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW6(n)));

	}
	
	private void tridecimal_to_septenary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tridecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.septenary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW13_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW7(n)));

	}
	
	private void tridecimal_to_octal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tridecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.octal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW13_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW8(n)));

	}
	
	private void tridecimal_to_nonary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tridecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.nonary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW13_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW9(n)));

	}
	
	private void tridecimal_to_undecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tridecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.undecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW13_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW11(n)));

	}
	
	private void tridecimal_to_duodecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tridecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.duodecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW13_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW12(n)));

	}
	
	private void tridecimal_to_tetradecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tridecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tetradecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW13_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW14(n)));

	}
	
	private void tridecimal_to_pentadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tridecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.pentadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW13_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW15(n)));

	}
	
	private void tridecimal_to_hexadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tridecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.hexadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW13_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW16(n)));

	}
	
	
	
private void tetradecimal_to_binary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tetradecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.binary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW14_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW2(n)));

	}
	
	private void tetradecimal_to_ternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tetradecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.ternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW14_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW3(n)));

	}
	
	private void tetradecimal_to_quaternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tetradecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quaternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW14_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW4(n)));

	}
	
	private void tetradecimal_to_quinary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tetradecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quinary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW14_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW5(n)));

	}
	
	private void tetradecimal_to_senary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tetradecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.senary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW14_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW6(n)));

	}
	
	private void tetradecimal_to_septenary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tetradecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.septenary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW14_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW7(n)));

	}
	
	private void tetradecimal_to_octal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tetradecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.octal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW14_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW8(n)));

	}
	
	private void tetradecimal_to_nonary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tetradecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.nonary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW14_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW9(n)));

	}
	
	private void tetradecimal_to_undecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tetradecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.undecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW14_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW11(n)));

	}
	
	private void tetradecimal_to_duodecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tetradecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.duodecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW14_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW12(n)));

	}
	
	private void tetradecimal_to_tridecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tetradecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tridecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW14_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW13(n)));

	}
	
	private void tetradecimal_to_pentadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tetradecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.pentadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW14_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW15(n)));

	}
	
	private void tetradecimal_to_hexadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.tetradecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.hexadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW14_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW16(n)));

	}
	
	
	private void hexadecimal_to_binary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.pentadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.binary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW16_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW2(n)));

	}
	
	private void hexadecimal_to_ternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.hexadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.ternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW16_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW3(n)));

	}
	
	private void hexadecimal_to_quaternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.hexadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quaternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW16_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW4(n)));

	}
	
	private void hexadecimal_to_quinary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.hexadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quinary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW16_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW5(n)));

	}
	
	private void hexadecimal_to_senary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.hexadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.senary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW16_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW6(n)));

	}
	
	private void hexadecimal_to_septenary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.hexadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.septenary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW16_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW7(n)));

	}
	
	private void hexadecimal_to_octal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.hexadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.octal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW16_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW8(n)));

	}
	
	private void hexadecimal_to_nonary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.hexadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.nonary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW16_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW9(n)));

	}
	
	private void hexadecimal_to_undecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.hexadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.undecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW16_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW11(n)));

	}
	
	private void hexadecimal_to_duodecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.hexadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.duodecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW16_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW12(n)));

	}
	
	private void hexadecimal_to_tridecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.hexadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tridecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW16_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW13(n)));

	}
	
	private void hexadecimal_to_tetradecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.hexadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tetradecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW16_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW14(n)));

	}
	
	private void hexadecimal_to_pentadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.hexadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.pentadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW16_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW15(n)));

	}
	
	
private void pentadecimal_to_binary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.pentadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.binary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW15_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW2(n)));

	}
	
	private void pentadecimal_to_ternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.pentadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.ternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW15_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW3(n)));

	}
	
	private void pentadecimal_to_quaternary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.pentadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quaternary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW15_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW4(n)));

	}
	
	private void pentadecimal_to_quinary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.pentadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.quinary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW15_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW5(n)));

	}
	
	private void pentadecimal_to_senary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.pentadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.senary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW15_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW6(n)));

	}
	
	private void pentadecimal_to_septenary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.pentadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.septenary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW15_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW7(n)));

	}
	
	private void pentadecimal_to_octal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.pentadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.octal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW15_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW8(n)));

	}
	
	private void pentadecimal_to_nonary(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.pentadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.nonary_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW15_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW9(n)));

	}
	
	private void pentadecimal_to_undecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.pentadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.undecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW15_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW11(n)));

	}
	
	private void pentadecimal_to_duodecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.pentadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.duodecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW15_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW12(n)));

	}
	
	private void pentadecimal_to_tridecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.pentadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tridecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW15_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW13(n)));

	}
	
	private void pentadecimal_to_tetradecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.pentadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.tetradecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW15_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW14(n)));

	}
	
	private void pentadecimal_to_hexadecimal(){
		
		NumberSystems ns = new NumberSystems(); 
        
        		 long n  = NumberSystems.pentadecimal_to_dec(TFInputNS.getText());
         
   
        between.     setText(String.valueOf(n));

        TFOutputNS.  setText(String.valueOf(ns.hexadecimal_to_decimal(n)));

        TAOutputSPNU.setText(String.valueOf(ns.HDW15_NS_to_dec(TFInputNS.getText()) + "\n"  + " \n " + "interim result = " + n + "\n" + ns.HDW16(n)));

	}
	
	
	private void decimal_to_ternary_calc(){
		
		long n;
		
		     n = Long.parseLong(TFInputNS.getText());
		
		NumberSystems ns3 = new NumberSystems(); 
		
		TFOutputNS.  setText(String.valueOf(ns3.ternary_to_decimal(n)));
		
		TFNSCount.   setText(String.valueOf(ns3.count_Numbers(ns3.ternary_to_decimal(n))));
		
		TAOutputSPNU.setText(String.valueOf(ns3.HDW3(n))); 
	}
	
	private void decimal_to_quaterrnary_calc(){
		
		long n;
		
		     n = Long.parseLong(TFInputNS.getText());
		
		NumberSystems ns4 = new NumberSystems();
		
		TFOutputNS.  setText(String.valueOf(ns4.quaternary_to_decimal(n)));
		
		TFNSCount.   setText(String.valueOf(ns4.count_Numbers(ns4.quaternary_to_decimal(n))));
		
		TAOutputSPNU.setText(String.valueOf(ns4.HDW4(n)));
	}
	
	private void decimal_to_quinary_calc(){
		
		long n;
		
		     n = Long.parseLong(TFInputNS.getText());
		
		NumberSystems ns5 = new NumberSystems();
		
		TFOutputNS.  setText(String.valueOf(ns5.quinary_to_decimal(n)));
		
		TFNSCount.   setText(String.valueOf(ns5.count_Numbers(ns5.quinary_to_decimal(n))));
		
		TAOutputSPNU.setText(String.valueOf(ns5.HDW5(n)));
		
	}
	
	private void decimal_to_senary_calc(){
		
		long n;
		
		     n = Long.parseLong(TFInputNS.getText());
		
		NumberSystems ns6 = new NumberSystems();
		
		TFOutputNS.  setText(String.valueOf(ns6.senary_to_decimal(n)));
		
		TFNSCount.   setText(String.valueOf(ns6.count_Numbers(ns6.senary_to_decimal(n))));
		
		TAOutputSPNU.setText(String.valueOf(ns6.HDW6(n)));
		
	}
	
	private void decimal_to_septenary_calc(){
		
		long n;
		
		n = Long.parseLong(TFInputNS.getText());
		
		NumberSystems ns7 = new NumberSystems();
		
		TFOutputNS.  setText(String.valueOf(ns7.septenary_to_decimal(n)));
		
		TFNSCount.   setText(String.valueOf(ns7.count_Numbers(ns7.septenary_to_decimal(n))));
		
		TAOutputSPNU.setText(String.valueOf(ns7.HDW7(n)));
		
	}
	
	private void decimal_to_octal_calc(){
		
		long n;
		
		n = Long.parseLong(TFInputNS.getText());
		
		NumberSystems ns8 = new NumberSystems();
		
		TFOutputNS.  setText(String.valueOf(ns8.octal_to_decimal(n)));
		
		TFNSCount.   setText(String.valueOf(ns8.count_Numbers(ns8.octal_to_decimal(n))));
		
		TAOutputSPNU.setText(String.valueOf(ns8.HDW8(n)));
	}
	
	private void decimal_to_nonary_calc(){
		
		long n;
		
		     n = Long.parseLong(TFInputNS.getText());
		
		NumberSystems ns9 = new NumberSystems();
		
		TFOutputNS.  setText(String.valueOf(ns9.nonary_to_decimal(n)));
		
		TFNSCount.   setText(String.valueOf(ns9.count_Numbers(ns9.nonary_to_decimal(n))));
		
		TAOutputSPNU.setText(String.valueOf(ns9.HDW9(n)));
		
	}
	
	
	private void decimal_to_undecimal_calc(){
		
		long n;
		
		     n = Long.parseLong(TFInputNS.getText());
		
		NumberSystems ns11 = new NumberSystems();
		
		TFOutputNS.  setText(String.valueOf(ns11.undecimal_to_decimal(n)));
		
		TFNSCount.   setText(String.valueOf(ns11.count_Numbers(ns11.undecimal_to_decimal(n))));
		
		TAOutputSPNU.setText(String.valueOf(ns11.HDW11(n)));
		
	}
	
	private void decimal_to_duodecimal_calc(){
		
		long n;
		
		     n = Long.parseLong(TFInputNS.getText());
		
		NumberSystems ns12 = new NumberSystems();
		
		TFOutputNS.  setText(String.valueOf(ns12.duodecimal_to_decimal(n)));
		
		TFNSCount.   setText(String.valueOf(ns12.count_Numbers(ns12.duodecimal_to_decimal(n))));
		
		TAOutputSPNU.setText(String.valueOf(ns12.HDW12(n)));
		
	}
	
	private void decimal_to_tridecimal_calc(){
		
		long n;
		
		     n = Long.parseLong(TFInputNS.getText());
		
		NumberSystems ns13 = new NumberSystems();
		
		TFOutputNS.  setText(String.valueOf(ns13.tridecimal_to_decimal(n)));
		
		TFNSCount.   setText(String.valueOf(ns13.count_Numbers(ns13.tridecimal_to_decimal(n))));
		
		TAOutputSPNU.setText(String.valueOf(ns13.HDW13(n)));
		
	}
	
	private void decimal_to_tetradecimal_calc(){
		
		long n;
		
		     n = Long.parseLong(TFInputNS.getText());
		
		NumberSystems ns14 = new NumberSystems();
		
		TFOutputNS.  setText(String.valueOf(ns14.tetradecimal_to_decimal(n)));
		
		TFNSCount.   setText(String.valueOf(ns14.count_Numbers(ns14.tetradecimal_to_decimal(n))));
		
		TAOutputSPNU.setText(String.valueOf(ns14.HDW14(n)));
		
	}
	
	private void decimal_to_pentadecimal_calc(){
		
		long n;
		
		     n = Long.parseLong(TFInputNS.getText());
		
		NumberSystems ns15 = new NumberSystems();
		
		TFOutputNS.  setText(String.valueOf(ns15.pentadecimal_to_decimal(n)));
		
		TFNSCount.   setText(String.valueOf(ns15.count_Numbers(ns15.pentadecimal_to_decimal(n))));
		
		TAOutputSPNU.setText(String.valueOf(ns15.HDW15(n)));
	}
	
	private void decimal_to_hexadecimal_calc(){
		
		long n;
		
		     n = Long.parseLong(TFInputNS.getText());
		
		NumberSystems ns16 = new NumberSystems();
		
		TFOutputNS  .setText(String.valueOf(ns16.hexadecimal_to_decimal(n)));
		
		TFNSCount   .setText(String.valueOf(ns16.count_Numbers(ns16.hexadecimal_to_decimal(n))));
		
		TAOutputSPNU.setText(String.valueOf(ns16.HDW16(n)));
	}
	
	//Decimal to numbersystem ends
	
	

	private void bin_to_dec_random(){
     
		NumberSystems ns = new NumberSystems();
		
		DecimalFormat f = new DecimalFormat(",###"); 
		
		Random number_generater = new Random();
		
		int b = number_generater.nextInt(20-1)+1;
		
        char [] container_set = "10".toCharArray();
        
        String a = RandomString.randomString(container_set, b);
        
        TFInputNS.setText(a);
        
        long n = NumberSystems.bin_to_dec(a);
        
        TFOutputNS.setText(String.valueOf(f.format(n).replaceAll(",", ".")));
        
        TFNSCount.setText(String.valueOf(a.length()));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW2_NS_to_dec(a)));
        
    }
	
	
	private void ternary_to_dec_random(){
	    
		NumberSystems ns = new NumberSystems();
		
		DecimalFormat f = new DecimalFormat(",###"); 
		
		Random number_generater = new Random();
		
		int b = number_generater.nextInt(20-1)+1;
		
        char [] container_set = "012".toCharArray();
        
        String a = RandomString.randomString(container_set, b);
        
        TFInputNS.setText(a);
        
        long n = NumberSystems.ternary_to_dec(a);
        
        TFOutputNS.setText(String.valueOf(f.format(n).replaceAll(",", ".")));
        
        TFNSCount.setText(String.valueOf(a.length()));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW3_NS_to_dec(a)));
        
    }
	
	private void quaternary_to_dec_random(){
	    
		NumberSystems ns = new NumberSystems();
		
		DecimalFormat f = new DecimalFormat(",###"); 
		
		Random number_generater = new Random();
		
		int b = number_generater.nextInt(20-1)+1;
		
        char [] container_set = "0123".toCharArray();
        
        String a = RandomString.randomString(container_set, b);
        
        TFInputNS.setText(a);
        
        long n = NumberSystems.quaternary_to_dec(a);
        
        TFOutputNS.setText(String.valueOf(f.format(n).replaceAll(",", ".")));
        
        TFNSCount.setText(String.valueOf(a.length()));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW4_NS_to_dec(a)));
        
    }
	
	
	private void quinary_to_dec_random(){
	    
		NumberSystems ns = new NumberSystems();
		
		DecimalFormat f = new DecimalFormat(",###"); 
		
		Random number_generater = new Random();
		
		int b = number_generater.nextInt(20-1)+1;
		
        char [] container_set = "01234".toCharArray();
        
        String a = RandomString.randomString(container_set, b);
        
        TFInputNS.setText(a);
        
        long n = NumberSystems.quinary_to_dec(a);
        
        TFOutputNS.setText(String.valueOf(f.format(n).replaceAll(",", ".")));
        
        TFNSCount.setText(String.valueOf(a.length()));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW5_NS_to_dec(a)));
        
    }
	
	private void senary_to_dec_random(){
	    
		NumberSystems ns = new NumberSystems();
		
		DecimalFormat f = new DecimalFormat(",###"); 
		
		Random number_generater = new Random();
		
		int b = number_generater.nextInt(20-1)+1;
		
        char [] container_set = "012345".toCharArray();
        
        String a = RandomString.randomString(container_set, b);
        
        TFInputNS.setText(a);
        
        long n = NumberSystems.senary_to_dec(a);
        
        TFOutputNS.setText(String.valueOf(f.format(n).replaceAll(",", ".")));
        
        TFNSCount.setText(String.valueOf(a.length()));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW6_NS_to_dec(a)));
        
    }
	
	
	private void septenary_to_dec_random(){
	    
		NumberSystems ns = new NumberSystems();
		
		DecimalFormat f = new DecimalFormat(",###"); 
		
		Random number_generater = new Random();
		
		int b = number_generater.nextInt(20-1)+1;
		
        char [] container_set = "0123456".toCharArray();
        
        String a = RandomString.randomString(container_set, b);
        
        TFInputNS.setText(a);
        
        long n = NumberSystems.septenary_to_dec(a);
        
        TFOutputNS.setText(String.valueOf(f.format(n).replaceAll(",", ".")));
        
        TFNSCount.setText(String.valueOf(a.length()));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW7_NS_to_dec(a)));
        
    }
	
	
	private void octal_to_dec_random(){
	    
		NumberSystems ns = new NumberSystems();
		
		DecimalFormat f = new DecimalFormat(",###"); 
		
		Random number_generater = new Random();
		
		int b = number_generater.nextInt(20-1)+1;
		
        char [] container_set = "01234567".toCharArray();
        
        String a = RandomString.randomString(container_set, b);
        
        TFInputNS.setText(a);
        
        long n = NumberSystems.octal_to_dec(a);
        
        TFOutputNS.setText(String.valueOf(f.format(n).replaceAll(",", ".")));
        
        TFNSCount.setText(String.valueOf(a.length()));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW8_NS_to_dec(a)));
        
    }
	
	private void nonary_to_dec_random(){
	    
		NumberSystems ns = new NumberSystems();
		
		DecimalFormat f = new DecimalFormat(",###"); 
		
		Random number_generater = new Random();
		
		int b = number_generater.nextInt(20-1)+1;
		
        char [] container_set = "012345678".toCharArray();
        
        String a = RandomString.randomString(container_set, b);
        
        TFInputNS.setText(a);
        
        long n = NumberSystems.nonary_to_dec(a);
        
        TFOutputNS.setText(String.valueOf(f.format(n).replaceAll(",", ".")));
        
        TFNSCount.setText(String.valueOf(a.length()));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW9_NS_to_dec(a)));
        
    }
	
	
	private void undecimal_to_dec_random(){
	    
		NumberSystems ns = new NumberSystems();
		
		DecimalFormat f = new DecimalFormat(",###"); 
		
		Random number_generater = new Random();
		
		int b = number_generater.nextInt(12-1)+1;
		
        char [] container_set = "0123456789A".toCharArray();
        
        String a = RandomString.randomString(container_set, b);
        
        TFInputNS.setText(a);
        
        long n = NumberSystems.undecimal_to_dec(a);
        
        TFOutputNS.setText(String.valueOf(f.format(n).replaceAll(",", ".")));
        
        TFNSCount.setText(String.valueOf(a.length()));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW11_NS_to_dec(a)));
        
    }
	
	private void duodecimal_to_dec_random(){
	    
		NumberSystems ns = new NumberSystems();
		
		DecimalFormat f = new DecimalFormat(",###"); 
		
		Random number_generater = new Random();
		
		int b = number_generater.nextInt(12-1)+1;
		
        char [] container_set = "0123456789AB".toCharArray();
        
        String a = RandomString.randomString(container_set, b);
        
        TFInputNS.setText(a);
        
        long n = NumberSystems.duodecimal_to_dec(a);
        
        TFOutputNS.setText(String.valueOf(f.format(n).replaceAll(",", ".")));
        
        TFNSCount.setText(String.valueOf(a.length()));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW12_NS_to_dec(a)));
        
    }
	
	private void tridecimal_to_dec_random(){
	    
		NumberSystems ns = new NumberSystems();
		
		DecimalFormat f = new DecimalFormat(",###"); 
		
		Random number_generater = new Random();
		
		int b = number_generater.nextInt(12-1)+1;
		
        char [] container_set = "0123456789ABC".toCharArray();
        
        String a = RandomString.randomString(container_set, b);
        
        TFInputNS.setText(a);
        
        long n = NumberSystems.tridecimal_to_dec(a);
        
        TFOutputNS.setText(String.valueOf(f.format(n).replaceAll(",", ".")));
        
        TFNSCount.setText(String.valueOf(a.length()));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW13_NS_to_dec(a)));
        
    }
	
	private void tetradecimal_to_dec_random(){
	    
		NumberSystems ns = new NumberSystems();
		
		DecimalFormat f = new DecimalFormat(",###"); 
		
		Random number_generater = new Random();
		
		int b = number_generater.nextInt(12-1)+1;
		
        char [] container_set = "0123456789ABCD".toCharArray();
        
        String a = RandomString.randomString(container_set, b);
        
        TFInputNS.setText(a);
        
        long n = NumberSystems.tetradecimal_to_dec(a);
        
        TFOutputNS.setText(String.valueOf(f.format(n).replaceAll(",", ".")));
        
        TFNSCount.setText(String.valueOf(a.length()));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW14_NS_to_dec(a)));
        
    }
	
	private void pentadecimal_to_dec_random(){
	    
		NumberSystems ns = new NumberSystems();
		
		DecimalFormat f = new DecimalFormat(",###"); 
		
		Random number_generater = new Random();
		
		int b = number_generater.nextInt(12-1)+1;
		
        char [] container_set = "0123456789ABCDE".toCharArray();
        
        String a = RandomString.randomString(container_set, b);
        
        TFInputNS.setText(a);
        
        long n = NumberSystems.pentadecimal_to_dec(a);
        
        TFOutputNS.setText(String.valueOf(f.format(n).replaceAll(",", ".")));
        
        TFNSCount.setText(String.valueOf(a.length()));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW15_NS_to_dec(a)));
        
    }
	
	private void hexadecimal_to_dec_random(){
		
		NumberSystems ns = new NumberSystems();
	     
		DecimalFormat f = new DecimalFormat(",###"); 
		
		Random number_generater = new Random();
		
		int b = number_generater.nextInt(12-1)+1;
		
        char [] container_set = "0123456789ABCDEF".toCharArray();
        
        String a = RandomString.randomString(container_set, b);
        
        TFInputNS.setText(a);
        
        long n = NumberSystems.hexadecimal_to_dec(a);
        
        TFOutputNS.setText(String.valueOf(f.format(n).replaceAll(",", ".")));
        
        TFNSCount.  setText(String.valueOf(a.length()));
        
        TAOutputSPNU.setText(String.valueOf(ns.HDW16_NS_to_dec(a)));
        
    }
	
	//Random example start (decimal to numbersystems)
	
	 private void calc_binary_random(){
	        
	        Random generator = new Random();
	        
	        int start = 1 ;
	        int end   = 8192;
	        
	             
	        int randomNumber = generator.nextInt(end-start)+start;
	        
	        Integer rN = randomNumber;   
	        
	        String c = rN.toString(); 
	     
	        
	        TFInputNS.setText(c);
	        
	        NumberSystems ns2 = new NumberSystems();
	        
	        TFOutputNS.  setText(String.valueOf(ns2.binary_to_decimal(randomNumber)));
	        
	        TFNSCount.   setText(String.valueOf(ns2.count_Numbers(ns2.binary_to_decimal(randomNumber))));
	        
	        TAOutputSPNU.setText(String.valueOf(ns2.HDW2(randomNumber)));
	        
	    }
	 

	 private void calc_ternary_random(){
		 
		 Random generator = new Random();
		 
		 int start = 1;
		 int end   = 8192;
		 
		 int randomNumber = generator.nextInt(end-start)+start;
		 
		 Integer rN = randomNumber;
		 
		 String  c  = rN.toString();
		 
		 TFInputNS.setText(c);
		 
		 NumberSystems ns3 = new NumberSystems();
		 
		 TFOutputNS.  setText(String.valueOf(ns3.ternary_to_decimal(randomNumber)));
		 
		 TFNSCount.   setText(String.valueOf(ns3.count_Numbers(ns3.ternary_to_decimal(randomNumber))));
		 
		 TAOutputSPNU.setText(String.valueOf(ns3.HDW3(randomNumber)));
		 
		 
	 }
	 
	 private void calc_quaternary_random(){
		 
		 Random generator = new Random();
		 
		 int start = 1;
		 int end   = 8192;
		 
		 int randomNumber = generator.nextInt(end-start)+start;
		 
		 Integer rN = randomNumber;
		 
		 String   c = rN.toString();
		 
		 TFInputNS.setText(c);
		 
		 NumberSystems ns4 = new NumberSystems();
		 
		 TFOutputNS.  setText(String.valueOf(ns4.quaternary_to_decimal(randomNumber)));
		 
		 TFNSCount.   setText(String.valueOf(ns4.count_Numbers(ns4.quaternary_to_decimal(randomNumber))));
		 
		 TAOutputSPNU.setText(String.valueOf(ns4.HDW4(randomNumber)));
	 }
	 
	 private void calc_quinary_random(){
		 
		 Random generator = new Random();
		 
		 int start = 1;
		 int end   = 8192;
		 
		 int randomNumber = generator.nextInt(end-start)+start;
		 
		 Integer rN = randomNumber;
		 
		 String  c  = rN.toString();
		 
		 TFInputNS.setText(c);
		 
		 NumberSystems ns5 = new NumberSystems();
		 
		 TFOutputNS.  setText(String.valueOf(ns5.quinary_to_decimal(randomNumber)));
		 
		 TFNSCount.   setText(String.valueOf(ns5.count_Numbers(ns5.quinary_to_decimal(randomNumber))));
		 
		 TAOutputSPNU.setText(String.valueOf(ns5.HDW5(randomNumber)));
		 
	 }
	 
	
		
	 private void calc_senary_random(){
		 
		 Random generator = new Random();
		 
		 int start = 1;
		 int end   = 268435456;
		 
		 int randomNumber = generator.nextInt(end-start)+start;
		 
		 Integer rN = randomNumber;
		 
		 String c = rN.toString();
		 
		 TFInputNS.setText(c);
		 
		 NumberSystems ns6 = new NumberSystems();
		 
		 TFOutputNS.  setText(String.valueOf(ns6.senary_to_decimal(randomNumber)));
		 
		 TFNSCount.   setText(String.valueOf(ns6.count_Numbers(ns6.senary_to_decimal(randomNumber))));
		 
		 TAOutputSPNU.setText(String.valueOf(ns6.HDW6(randomNumber)));
		 
	 }
	
	 
	 private void calc_septenary_random(){
		 
		 Random generator = new Random();
		 
		 int start = 1;
		 int end   = 268435456;
		 
		 int randomNumber = generator.nextInt(end-start)+start;
		 
		 Integer rN = randomNumber;
		 
		 String   c = rN.toString();
		 
		 TFInputNS.setText(c);
		 
		 NumberSystems ns7 = new NumberSystems();
		 
		 TFOutputNS.  setText(String.valueOf(ns7.septenary_to_decimal(randomNumber)));
		 
		 TFNSCount.   setText(String.valueOf(ns7.count_Numbers(ns7.septenary_to_decimal(randomNumber))));
		 
		 TAOutputSPNU.setText(String.valueOf(ns7.HDW7(randomNumber)));
		 
	 }
	 
	 
	 private void calc_octal_random(){
		 
		 Random generator = new Random();
		 
		 int start = 1;
		 int end   = 268435456;
		 
		 int randomNumber = generator.nextInt(end-start)+start;
		 
		 Integer rN = randomNumber;
		 
		 String   c = rN.toString();
		 
		 TFInputNS.setText(c);
		 
		 NumberSystems ns8 = new NumberSystems();
		 
		 TFOutputNS.  setText(String.valueOf(ns8.octal_to_decimal(randomNumber)));
		 
		 TFNSCount.   setText(String.valueOf(ns8.count_Numbers(ns8.octal_to_decimal(randomNumber))));
		 
		 TAOutputSPNU.setText(String.valueOf(ns8.HDW8(randomNumber)));
		 
	 }
	 
	 
	 private void calc_nonary_random(){
		 
		 Random generator = new Random();
		 
		 int start = 1;
		 int end   = 268435456;
		 
		 int randomNumber = generator.nextInt(end-start)+start;
		 
		 Integer rN = randomNumber;
		 
		 String   c = rN.toString();
		 
		 TFInputNS.setText(c);
		 
		 NumberSystems ns9 = new NumberSystems();
		 
		 TFOutputNS.  setText(String.valueOf(ns9.nonary_to_decimal(randomNumber)));
		 
		 TFNSCount.   setText(String.valueOf(ns9.count_Numbers(ns9.nonary_to_decimal(randomNumber))));
		 
		 TAOutputSPNU.setText(String.valueOf(ns9.HDW9(randomNumber)));
		 
	 }
	 
	 
	 private void calc_undecimal_random(){
		 
		 Random generator = new Random();
		 
		 int start = 1;
		 int end   = 268435456;
		 
		 int randomNumber = generator.nextInt(end-start)+start;
		 
		 Integer rN = randomNumber;
		 
		 String   c = rN.toString();
		 
		 TFInputNS.setText(c);
		 
		 NumberSystems ns11 = new NumberSystems();
		 
		 TFOutputNS.  setText(String.valueOf(ns11.undecimal_to_decimal(randomNumber)));
		 
		 TFNSCount.   setText(String.valueOf(ns11.count_Numbers(ns11.undecimal_to_decimal(randomNumber))));
		 
		 TAOutputSPNU.setText(String.valueOf(ns11.HDW11(randomNumber)));
	 }
	 
	 private void calc_duodecimal_random(){
		 
		 Random generator = new Random();
		 
		 int start = 1;
		 int end   = 268435456;
		 
		 int randomNumber = generator.nextInt(end-start)+start;
		 
		 Integer rN = randomNumber;
		 
		 String c = rN.toString();
		 
		 TFInputNS.setText(c);
		 
		 NumberSystems ns12 = new NumberSystems();
		 
		 TFOutputNS.  setText(String.valueOf(ns12.duodecimal_to_decimal(randomNumber)));
		 
		 TFNSCount.   setText(String.valueOf(ns12.count_Numbers(ns12.duodecimal_to_decimal(randomNumber))));
		 
		 TAOutputSPNU.setText(String.valueOf(ns12.HDW12(randomNumber)));
	 }
	 
	 private void calc_tridecimal_random(){
		 
		 Random generator = new Random();
		 
		 int start = 1;
		 int end   = 268435456;
		 
		 int randomNumber = generator.nextInt(end-start)+start;
		 
		 Integer rN = randomNumber;
		 
		 String   c = rN.toString();
		 
		 TFInputNS.setText(c);
		 
		 NumberSystems ns13 = new NumberSystems();
		 
		 TFOutputNS.  setText(String.valueOf(ns13.tridecimal_to_decimal(randomNumber)));
		 
		 TFNSCount.   setText(String.valueOf(ns13.count_Numbers(ns13.tridecimal_to_decimal(randomNumber))));
		 
		 TAOutputSPNU.setText(String.valueOf(ns13.HDW13(randomNumber)));
		 
	 }
	 
	 private void calc_tetradecimal_random(){
		 
		 Random generator = new Random();
		 
		 int start = 1;
		 int end   = 268435456;
		 
		 int randomNumber = generator.nextInt(end-start)+start;
		 
		 Integer rN = randomNumber;
		 
		 String c = rN.toString();
		 
		 TFInputNS.setText(c);
		 
		 NumberSystems ns14 = new NumberSystems();
		 
		 TFOutputNS.  setText(String.valueOf(ns14.ternary_to_decimal(randomNumber)));
		 
		 TFNSCount.   setText(String.valueOf(ns14.count_Numbers(ns14.ternary_to_decimal(randomNumber))));
		 
		 TAOutputSPNU.setText(String.valueOf(ns14.HDW14(randomNumber)));
	 }
	 
	 
	 private void calc_pentadecimal_random(){
		 
		 Random generator = new Random();
		 
		 int start = 1;
		 int end   = 268435456;
		 
		 int randomNumber = generator.nextInt(end-start)+start;
		 
		 Integer rN = randomNumber;
		 
		 String   c = rN.toString();
		 
		 TFInputNS.setText(c);
		 
		 NumberSystems ns15 = new NumberSystems();
		 
		 TFOutputNS.  setText(String.valueOf(ns15.pentadecimal_to_decimal(randomNumber)));
		 
		 TFNSCount.   setText(String.valueOf(ns15.count_Numbers(ns15.pentadecimal_to_decimal(randomNumber))));
		 
		 TAOutputSPNU.setText(String.valueOf(ns15.HDW15(randomNumber)));
	 }

	 private void calc_hexadecimal_random(){
		 
		 Random generator = new Random();
		 
		 int start = 1;
		 int end   = 268435456;
		 
		 int randomNumber = generator.nextInt(end-start)+start;
		 
		 Integer rN = randomNumber;
		 
		 String   c = rN.toString();
		 
		 TFInputNS.setText(c);
		 
		 NumberSystems ns16 = new NumberSystems();
		 
		 TFOutputNS.  setText(String.valueOf(ns16.hexadecimal_to_decimal(randomNumber)));
		 
		 TFNSCount.   setText(String.valueOf(ns16.count_Numbers(ns16.hexadecimal_to_decimal(randomNumber))));
		 
		 TAOutputSPNU.setText(String.valueOf(ns16.HDW16(randomNumber)));
	 }
	 
	
	 
	}
	
	


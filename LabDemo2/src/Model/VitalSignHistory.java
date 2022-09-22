/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ZeyuLiao
 */
public class VitalSignHistory {
    private ArrayList<VitalSigns> history;
    
    public void VistalSignalHistory(){
        this.history = new ArrayList<VitalSigns>();        
        
        
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    
    public VistalSignals addNewvitals(){
    
        VitalSigns newVitals = new VitalSign();
        history.addNewVitals();
    
    }
    
  
}

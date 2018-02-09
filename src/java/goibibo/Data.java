/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goibibo;

import java.util.ArrayList;

/**
 *
 * @author rahul
 */
public class Data {
    private ArrayList<Returnflight> returnflights;

  public ArrayList<Returnflight> getReturnflights() { return this.returnflights; }

  public void setReturnflights(ArrayList<Returnflight> returnflights) { this.returnflights = returnflights; }

  private ArrayList<Onwardflight> onwardflights;

  public ArrayList<Onwardflight> getOnwardflights() { return this.onwardflights; }

  public void setOnwardflights(ArrayList<Onwardflight> onwardflights) { this.onwardflights = onwardflights; }
}

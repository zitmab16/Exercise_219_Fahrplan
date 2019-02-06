/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.time.LocalTime;

/**
 *
 * @author vizug
 */
public class Zug {
    private String ziel;
    private LocalTime time;
    private String liniennummer;
    private int bahnsteig;
    private LocalTime delay;

    public Zug(String ziel, LocalTime time, LocalTime delay, String liniennummer, int bahnsteig) {
        this.ziel = ziel;
        this.time = time;
        this.delay=delay;
        this.liniennummer = liniennummer;
        this.bahnsteig = bahnsteig;
    }

    public String getZiel() {
        return ziel;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getLiniennummer() {
        return liniennummer;
    }

    public int getBahnsteig() {
        return bahnsteig;
    }

    public LocalTime getDelay() {
        return delay;
    }
    
    
    
}

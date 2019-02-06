/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author vizug
 */
public interface Subject {
    public void register(Observer observer);

    public void deregister(Observer observer);

    public void inform(bl.Zug z);
}

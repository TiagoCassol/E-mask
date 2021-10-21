/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EMask.Controler;

import java.util.ArrayList;

/**
 *
 * @author casso
 */
public interface InterfaceMask<I> {
    public int gerarId();
    
    public void add(I o);
    
    public ArrayList<I> getAll();
   
    public boolean deletar(I o);

}

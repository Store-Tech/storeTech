/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Matheus
 */
public enum TipoProduto {
    
    PERIFERICOS, HARDWARE, FERRAMENTAS, GAMES;
    
    public static TipoProduto getTipoProd(String tipoProd){
        for(TipoProduto tp:TipoProduto.values()){
            if(tp.toString().equals(tipoProd.toUpperCase())){
                return tp;
            }
        }
        return null;
    }
}

package Model;

import java.util.ArrayList;

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
    
    public static ArrayList<String> stringTipoProd() {
        ArrayList<String>tipos = new ArrayList<String>();
        for (TipoProduto tp : TipoProduto.values()) {
            tipos.add(tp.toString());
        }
        return tipos;
    }

   
}

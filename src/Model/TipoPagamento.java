package Model;

import java.util.ArrayList;

public enum TipoPagamento {

    PIX, CARTAO, DINHEIRO;

    public static TipoPagamento getTipoPag(String tipoPag){
        for(TipoPagamento tp:TipoPagamento.values()){
            if(tp.toString().equals(tipoPag.toUpperCase())){
                return tp;
            }
        }
        return null;
    }
    
    public static ArrayList<String> stringTipoPag() {
        ArrayList<String>tipos = new ArrayList<String>();
        for (TipoPagamento tp : TipoPagamento.values()) {
            tipos.add(tp.toString());
        }
        return tipos;
    }

   
}

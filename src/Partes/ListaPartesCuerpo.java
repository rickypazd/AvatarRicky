package Partes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListaPartesCuerpo {

    private static HashMap<String, ParteCuerpo> DATA;

    public static HashMap<String, ParteCuerpo> getDATA() {
        if (DATA == null) {
            DATA = new HashMap();
        }
        return DATA;
    }

    public static void setDATA(ParteCuerpo parteCuerpo) {
        if (DATA == null) {
            DATA = new HashMap();
        }
        parteCuerpo.setIndex(DATA.size());
        DATA.put(parteCuerpo.getNombre(), parteCuerpo);
    }

    public static int size(){
        return DATA.size();
    }
    public static ParteCuerpo get(int i){
        List<String> indexes = new ArrayList<>(DATA.keySet());
        return DATA.get(indexes.get(i));
    }
}

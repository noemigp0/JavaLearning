package leetCode;

public class HashTable {
    private final Integer  size = 13 ;
    //primo no necesariamente cercano a una potencia de dos
    public HashTable(){

    }

    private Integer hash(Integer k){

        Integer key = 0;
        key = (k & 0x7fffffff) % size;
        return key;
    }


    public void insertar(Integer k){
        System.out.println(k + "tiene el hash ->" + hash(k) );

    }
}

public class Generiks{
    public static void main(String args[]){
        String str = "What the fudge you son of buiscuit";
        Integer integer = 10;
        
        AdiList adiList = new AdiList<>();
        adiList.add(str);
        System.out.println(adiList.get());
        adiList.add(integer);
        System.out.println(adiList.get());
    }
}

class AdiList<T>{

    T data;
    void add(T data){
        this.data = data;
    }

    T get(){
        return this.data;
    }
}

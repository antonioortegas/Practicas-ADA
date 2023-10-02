
public class Bicicleta {
    int frenos;
    int velocidad;

    public Bicicleta(int frenos){
        this.frenos = frenos;
        this.velocidad = 0;
    }

    public void frenar(){
        velocidad = velocidad - frenos;
    }

    public void acelerar(int v){
        velocidad = velocidad + v;
    }

    public String toString(){
        return "Frenada : " + frenos + ", Velocidad : " + velocidad;
    }
}

 
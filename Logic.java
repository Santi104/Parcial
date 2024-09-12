
public class Logic {
    double numero1; 
    double numero2;
    public Logic(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public int calcularMultiplo() {
        int resultado = 0;
        if (numero1== 0 || numero2 == 0 ) {
            resultado=0;
        }else if (numero2 % numero1 == 0) {
            resultado=1;
        }else if (numero1 % numero2 == 0) {
            resultado=2;
        }else {
            resultado=3;
        }

        return resultado;
    }
    /*aqui no use switch, porque no supe como implementarlo (me dio miedo que se me rompiera la logica) 
     * aunque esta forma usando el % no queria usarla, implemente multiplicando pero no cumplia las fases que 
     * estipulaba el problema
    */

}
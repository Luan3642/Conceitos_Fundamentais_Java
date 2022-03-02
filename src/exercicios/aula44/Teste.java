
package exercicios.aula44;

/**
 *
 * @author Luan
 */
public class Teste {
    public static void main(String[] args) {
        
       Quadrado f1 = new Quadrado();
       f1.setLado(2);
       
       Circulo f2 = new Circulo();
       f2.setRaio(2);
       
       Triangulo f3 = new Triangulo();
       f3.setAltura(2);
       f3.setBase(3);
       
       Cubo f4 = new Cubo();
       f4.setLado(3);
       
       Cilindro f5 = new Cilindro();
       f5.setAltura(3);
       f5.setRaio(2);
       
       Piramide f6 = new Piramide();
       f6.setAltura(3);
       f6.setApotema(4);
       f6.setArestaBase(2);
       f6.setNumPoliBase(4);
       f6.setBase(2);
       
       
       FiguraGeometria[] figuraGeometrias = new FiguraGeometria[6];
       figuraGeometrias[0] = f1;
       figuraGeometrias[1] = f2;
       figuraGeometrias[2] = f3;
       figuraGeometrias[3] = f4;
       figuraGeometrias[4] = f5;
       figuraGeometrias[5] = f6;
       
        for (FiguraGeometria figuraGeometria : figuraGeometrias) {
            System.out.println("-----------------------");
            
            if(figuraGeometria instanceof Figura2D){
                Figura2D f2d = (Figura2D) figuraGeometria;
                f2d.calcularArea();
                
            }
        }
        
        
        
        
        
            
    }
}

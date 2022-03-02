/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula44;

/**
 *
 * @author Luan
 */
public class Piramide extends Figura3D implements DimensaoVolumetrica {

    private int altura;
    private int apotema;
    private int arestaBase;
    private int numPoliBase;
    private int base;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getApotema() {
        return apotema;
    }

    public void setApotema(int apotema) {
        this.apotema = apotema;
    }

    public int getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(int arestaBase) {
        this.arestaBase = arestaBase;
    }

    public int getNumPoliBase() {
        return numPoliBase;
    }

    public void setNumPoliBase(int numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public int calcularVolume(int areaBase, int altura) {
        return (areaBase * altura) / 3;
    }

}

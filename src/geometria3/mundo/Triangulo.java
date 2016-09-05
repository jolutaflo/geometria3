
package geometria3.mundo;

public class Triangulo {

    float l1,l2,l3;
    public Triangulo(){
        this.l1=0;
        this.l2=0;
        this.l3=0;
        
    }
    public String getTipo() {
            if(l1==l2&&l2==l3){
                return "Equilatero";
        }
        
        
        else if(l1==l2 || l1==l3 || l2==l3){
            if((Math.pow(l1, 2)+Math.pow(l2, 2))==Math.round(Math.pow(l3, 2))){
            return "Isosceles Rectangulo";
            }
            else{
                return "Isosceles";
                    }
            
        }
        else{
           
            if((Math.pow(l1, 2)+Math.pow(l2, 2))==Math.round(Math.pow(l3, 2))){
                return "Escaleno Rectangulo";
            }
            else{
                 return "Escaleno";   
                    }
            
        }
    }
    public void setLado1(float lado1){
        l1=lado1;
    }
    public void setLado2(float lado2){
        l2=lado2;
    }
    public void setLado3(float lado3){
        l3=lado3;
    }
//fin método getTipo
        
}//fin clase Triangulo


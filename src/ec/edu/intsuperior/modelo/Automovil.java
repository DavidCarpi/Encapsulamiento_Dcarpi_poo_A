package ec.edu.intsuperior.modelo;

public class Automovil {
   public String marca;
   public int modelo;
   public int motor;
   
   public enum TipoCombustible{
       GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL 
   }
   TipoCombustible combustible;
   
   public enum TipoAutomovil{
       CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
   }
   TipoAutomovil automovil;
   
   int puertas;
   int asientos;
   int velocidad;
   public enum TipoColor{
       BLANCO, NEGRO, ROJO, NARANJA, AMARRILLO, VERDE, AZUL, VIOLETA
   }
   TipoColor color;
   int velocidadInicio = 0;
   
   public Automovil (){
   }
   
   Automovil(String marca, int modelo, int motor, TipoCombustible combustible,
           TipoAutomovil automovil, int puertas, int asientos, 
           int velocidad, TipoColor color, int velocidadInicio){
       
   }
           
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public void setCombustible(TipoCombustible combustible) {
        this.combustible = combustible;
    }

    public void setAutomovil(TipoAutomovil automovil) {
        this.automovil = automovil;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setAsientos(int acientos) {
        this.asientos = acientos;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setColor(TipoColor color) {
        this.color = color;
    }

    public void setVelocidadInicio(int velocidadInicio) {
        this.velocidadInicio = velocidadInicio;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public int getMotor() {
        return motor;
    }

    public TipoCombustible getCombustible() {
        return combustible;
    }

    public TipoAutomovil getAutomovil() {
        return automovil;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getAsientos() {
        return asientos;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public TipoColor getColor() {
        return color;
    }

    public int getVelocidadInicio() {
        return velocidadInicio;
    }    
    
}


class Polideportivo extends Edificio {
    private String tipoInstalacion; // Puede ser "Techado" o "Abierto"

    public Polideportivo(double ancho, double alto, double largo, String nombre, String tipoInstalacion) {
        super(ancho, alto, largo);
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public double calcularSuperficie() {
        return ancho * largo;
    }

    @Override
    public double calcularVolumen() {
        return ancho * largo * alto;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }
}

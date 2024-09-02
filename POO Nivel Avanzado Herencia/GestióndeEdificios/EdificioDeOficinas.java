class EdificioDeOficinas extends Edificio {
    private int numOficinas;
    private int personasPorOficina;
    private int numPisos;

    public EdificioDeOficinas(double ancho, double alto, double largo, int numOficinas, int personasPorOficina, int numPisos) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numPisos = numPisos;
    }

    @Override
    public double calcularSuperficie() {
        return ancho * largo;
    }

    @Override
    public double calcularVolumen() {
        return ancho * largo * alto;
    }

    public int cantPersonas() {
        return numOficinas * personasPorOficina * numPisos;
    }
}

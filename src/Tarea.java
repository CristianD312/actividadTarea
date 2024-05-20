public class Tarea {
    String descripcion;
    int tiempo;
    boolean estado;

    public Tarea() {
    }

    public Tarea(String descripcion, int tiempo, boolean estado) {
        this.descripcion = descripcion;
        this.tiempo = tiempo;
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", tiempo=" + tiempo +
                ", estado=" + estado +
                '}';
    }
}

public class MembresiaBasica extends Membresia {

    private int visitasRestantes;

    public MembresiaBasica (String idMiembro, String nombreUsuario, int visitasRestantes){
        super(idMiembro, nombreUsuario);
        this.visitasRestantes = visitasRestantes;
    }

    @Override
    public boolean verificarAcceso() {
        if (visitasRestantes > 0) {
            visitasRestantes--;
            System.out.println("Bienvenido " + nombreUsuario + ", te quedan " + visitasRestantes + " visitas disponibles.");
            return true;
        } else {
            System.out.println("Lo sentimos " + nombreUsuario + ", no tienes visitas disponibles.");
            return false;
        }
    }
}

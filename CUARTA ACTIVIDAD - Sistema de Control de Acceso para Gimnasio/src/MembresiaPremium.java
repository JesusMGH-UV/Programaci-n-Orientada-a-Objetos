public class MembresiaPremium extends Membresia {

    private int pasesInvitado;

    public MembresiaPremium(String idMiembro, String nombreUsuario, int pasesInvitado){
        super(idMiembro, nombreUsuario);
        this.pasesInvitado = pasesInvitado;
    }

    @Override
    public boolean verificarAcceso() {
        System.out.println("Bienvenido " + nombreUsuario);
        return true;
    }

    public boolean ingresarConInvitado() {
        if (pasesInvitado > 0){
            pasesInvitado--;
            System.out.println("Bienvenido invitado, puede pasar");
            return true;
        } else {
            System.out.println("Lo sentimos, no tiene pases de invitado disponibles");
            return false;
        }
    }
}

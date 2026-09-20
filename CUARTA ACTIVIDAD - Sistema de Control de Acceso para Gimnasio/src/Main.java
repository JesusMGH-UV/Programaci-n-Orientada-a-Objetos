import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Membresia> membresias = new ArrayList<>();

        membresias.add(new MembresiaBasica("38142", "UsuarioBasico", 3));
        membresias.add(new MembresiaPremium("49713", "UsuarioPremium", 2));

        membresias.getFirst().mostrarDatos();
        for (int i = 0; i <= 3; i++) {
            membresias.getFirst().verificarAcceso();
        }

        System.out.println("\n");

        if (membresias.getLast() instanceof MembresiaPremium premium) {
            for (int i = 0; i <= 2; i++) {
                premium.verificarAcceso();
                premium.ingresarConInvitado();
            }
        }

    }
}
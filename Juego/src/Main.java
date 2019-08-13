
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fantasma f = new Fantasma();
		Jugador j = new Jugador("Clau");

		j.Disparar(f);
		j.Disparar(f);
		
		j.AdquirirArma(new ArmaProtones());
		j.Disparar(f);
		j.Disparar(f);
		j.Disparar(f);
	}

}

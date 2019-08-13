
public class Enemigo {

	public int puntosdevida = 3;
	public boolean esta_muerto = false;

	void RecibirDanio(int i) {
		if (!esta_muerto) {
			puntosdevida -= i;
			if (puntosdevida <= 0) {
				Morir();
			} else {
				System.out.println("¡Me diste! aun tengo: " + puntosdevida + " puntos de vida");
			}
		} else {
			System.out.println("¡ESTOY MUERTO!");
		}
	}
	
	void RecibirDanio(int i, int tipo_danio) {
		RecibirDanio (i);
	}

	void Morir() {
		puntosdevida = 0;
		System.out.println("GAME OVER -  x_x");
		esta_muerto = true;
	}

}

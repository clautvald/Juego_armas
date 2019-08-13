
public class Fantasma extends Enemigo {


	public Fantasma() {
		puntosdevida = 12;
	}
	void RecibirDanio(int i, int tipo_danio) {

		if (tipo_danio == 0) {
			System.out.println("¡JA! ¡Lo esquive!");
		} else
			super.RecibirDanio(i);
	}
}

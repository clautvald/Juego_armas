
public class Troll extends Enemigo{

	public Troll() {
		puntosdevida = 10;
	}
	
	void RecibirDanio(int i, int tipo_danio) {

		if (tipo_danio == 1) {
			System.out.println("¡Me haces cosquillas!");
		} else
			super.RecibirDanio(i);
	}
}

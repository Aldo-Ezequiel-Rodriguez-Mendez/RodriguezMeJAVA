package hilos.threads;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class ComponentThread extends Thread{
private JProgressBar component;
	
	private Random rand;
	
	private volatile boolean estaCompletado = false;
	
	private Random getRand() {
		return rand;
	}
	
	public ComponentThread(JProgressBar component, String nombre) {
		this.component = component;
		rand = new Random();
		this.component.setName(nombre);
		this.component.setMaximum(100);
	}
	
	public synchronized boolean isCompleted() {
		return estaCompletado;
	}
	
	@Override
	public void run() {
		int intPorciento = 0;
		while(!estaCompletado) {
			if(component.getValue() >= 100) {
				estaCompletado = true;
			}
			component.setValue(intPorciento); 
			intPorciento += getRand().nextInt(3);
			try {
				Thread.sleep(35);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		component.setValue(0);
		JOptionPane.showMessageDialog(component, component.getName() + " ha terminado el progreso");
	}
}

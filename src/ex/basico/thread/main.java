package ex.basico.thread;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) throws InterruptedException {
		
				
		//***********************Thread 1**********************//
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		//***********************Thread 2**********************//
		Thread threadPDF = new Thread(thread2);
		threadPDF.start();
			
		JOptionPane.showMessageDialog(null, "Tarefa ocorrendo em paralelo com a Thread onclu�da com sucesso!" );			
	}
	
	private static Runnable thread1 = new Runnable() {
		public void run() {
			for(int i=0; i <10; i++) {
				System.out.println("Neste momento est� ocorrendo por exemplo um envio de email");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {						
					e.printStackTrace();
				}
			}
		System.out.println("Conclu�do a Thread");
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		public void run() {
			for(int i=0; i <10; i++) {
				System.out.println("Neste momento est� ocorrendo por exemplo a gera��o de um PDF");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {						
					e.printStackTrace();
				}
			}
		System.out.println("Conclu�do a Thread");
		}
	};

}
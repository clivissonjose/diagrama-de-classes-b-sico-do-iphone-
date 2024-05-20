package cell;

public class Iphone implements Musicas, Ligacoes, NavegadorWeb {
	
	    private boolean ligado;
	    private String dono;
	    private String numero;
	    
		
		
		public boolean isLigado() {
			return ligado;
		}

		public void setLigado(boolean ligado) {
			this.ligado = ligado;
		}

		public String getDono() {
			return dono;
		}

		public void setDono(String dono) {
			this.dono = dono;
		}

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}
		
	
		
		@Override
		public void adicionarNovaAba() {
			if(isLigado())
				System.out.println("Adicionando nova aba - iphone");
			else
				System.out.println("Iphone desligado");
			
		}


		@Override
		public void atualizarPagina() {
			System.out.println("Atualizando a página - iphone");
			
		}

		@Override
		public void ligar(String numero) {
			System.out.println("Ligando para o número " + numero);
			
		}

		@Override
		public void atender() {
			System.out.println("Alô");
			
		}

		@Override
		public void iniciarCorreioVoz() {
			System.out.println("Correo de voz...");
		}

		@Override
		public void tocar() {
			System.out.println("tocando...");			
		}

		@Override
		public void pausar() {
			System.out.println("Pausar música");
			
		}

		@Override
		public void selecionarMusica(String musica) {
			System.out.println("Selecionando a míusica " + musica);
			
		}

		@Override
		public void exibirPagina(String url) {
			System.out.println("Página " + url);
		}


	

}

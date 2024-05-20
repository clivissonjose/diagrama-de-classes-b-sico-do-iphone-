# diagrama-de-classes-b-sico-do-iphone-

classDiagram

   class NavegadorWeb{
         +exibirPagina(String url)
         +atualizarPagina()
         +adicionarNovaAba()
    }

    class  Ligacoes{
         +ligar(String numero)
	     +atender()
	     +iniciarCorreioVoz()
   }

   class Musicas{
       +tocar()
	   +pausar()
	   +selecionarMusica(String musica)
   }


    class iPhone {
    }

    iPhone --> Musicas
    iPhone --> Ligacoes
    iPhone --> NavegadorWeb






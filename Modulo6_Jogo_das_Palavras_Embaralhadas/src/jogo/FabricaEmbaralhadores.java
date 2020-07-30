package jogo;


public class FabricaEmbaralhadores {
	
	
	// m�todo que retorna um embaralhador aleat�riamente.
	
	public Embaralhador getEmbaralhadorAleatorio()
	{
		int random = (int) (Math.random()*2);
		if (random ==0)
		{
			return  new EmbaralhadorUm();
		} else
			{
				return new EmbaralhadorDois();
			}
			
	}

}

package qualiti.banco.geral;

/**
 * Exce��o lan�ada quando ocorre um erro de acesso ao mecanismo de armazenamento de
 * dados nas implementa��es dos reposit�rios. 
 *
 * @author Qualiti <a href="mailto:qualiti@qualiti.com.br">qualiti@qualiti.com.br</a>
 *
 * @version 1.0 
 */
@SuppressWarnings("serial")
public class ErroAcessoRepositorioException extends Exception {

	/**
	 * A exce��o interna ocorrida dentro da implementa��o do reposit�rio.
	 */
	private Exception excecaoInterna;

	/**
	 * O c�digo num�rico de erro associado � exce��o ocorrida dentro da implementa��o 
	 * do reposit�rio. 
	 */
	private int codigoErro;

	/**
	 * O construtor da classe. Passa a mensagem de erro � super-classe, inicializa a 
	 * exce��o interna associada e o c�digo interno da exce��o associada. 
	 * 
	 * @param pMensagem a mensagem de erro associada � exce��o.
	 * @param pExcecaoInterna a exce��o interna ocorrida na implementa��o do reposit�rio.
	 * @param pCodigoErro o c�digo de erro da exce��o interna ocorrida na implementa��o 
	 *        do reposit�rio.
	 */
	public ErroAcessoRepositorioException(
		String pMensagem,
		Exception pExcecaoInterna,
		int pCodigoErro) {
		super(pMensagem);
		excecaoInterna = pExcecaoInterna;
		codigoErro = pCodigoErro;
	}
	/**
	 * Retorna o c�digo num�rico de erro associado � exce��o ocorrida dentro da implementa��o 
	 * do reposit�rio.
	 *
	 * @return int o c�digo num�rico de erro associado � exce��o ocorrida dentro da 
	 *         implementa��o do reposit�rio.
	 */
	public int getCodigoErro() {
		return codigoErro;
	}
	/**
	 * Retorna a exce��o interna ocorrida dentro da implementa��o do reposit�rio.
	 *
	 * @return Exception a exce��o interna ocorrida dentro da implementa��o do reposit�rio.
	 */
	public Exception getExcecaoInterna() {
		return excecaoInterna;
	}
}
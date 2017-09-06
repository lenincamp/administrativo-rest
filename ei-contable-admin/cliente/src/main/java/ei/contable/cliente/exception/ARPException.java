/**
 * 
 */
package ei.contable.cliente.exception;

import java.util.Collection;

/**
 * @author crodriguez
 *
 */
@SuppressWarnings("serial")
public class ARPException extends RuntimeException {
	private String codigoError;
	  private String descripcionError;
	  private Boolean showErrorMessage;
	  private Collection<String> descripcionesErrores;
	  private Object entidadError;

	  /**
	   * Constructor
	   */
	  public ARPException()
	  {
	  }

	  /**
	   * Constructor
	   * @param message
	   */
	  public ARPException(String message)
	  {
	    super(message);
	  }

	  /**
	   * Constructor
	   * @param message
	   * @param showErrorMessage
	   */
	  public ARPException(String message, Boolean showErrorMessage)
	  {
	    this(message);
	    this.descripcionError = message;
	    this.showErrorMessage = showErrorMessage;
	  }

	  /**
	   * Constructor
	   * @param descripcionesErrores
	   * @param showErrorMessage
	   */
	  public ARPException(Collection<String> descripcionesErrores, Boolean showErrorMessage)
	  {
	    this.descripcionesErrores = descripcionesErrores;
	    this.showErrorMessage = showErrorMessage;
	  }
	  
	  /**
	   * Constructor
	   * @param message
	   * @param cause
	   */
	  public ARPException(String message, Throwable cause)
	  {
	    super(message, cause);
	  }

	  /**
	   * Constructor
	   * @param cause
	   */
	  public ARPException(Throwable cause)
	  {
	    super(cause);
	  }

	  /**
	   * Constructor
	   * @param codigoError
	   * @param descripcionError
	   */
	  public ARPException(String codigoError, String descripcionError)
	  {
	    super(descripcionError, null);
	    this.codigoError = codigoError;
	    this.descripcionError = descripcionError;
	  }

	  /**
	   * Constructor
	   * @param codigoError
	   * @param message
	   * @param descripcionError
	   */
	  public ARPException(String codigoError, String mensaje, String descripcionError)
	  {
	    super(mensaje);
	    this.codigoError = codigoError;
	    this.descripcionError = descripcionError;
	  }
	  
	  /**
	   * Constructor
	   * @param codigoError
	   * @param message
	   * @param cause
	   */
	  public ARPException(String codigoError, String message, Throwable cause)
	  {
	    super(message, cause);
	    this.codigoError = codigoError;
	  }

	  /**
	   * @return the codigoError
	   */
	  public String getCodigoError()
	  {
	    return this.codigoError;
	  }

	  /**
	   * @param codigoError the codigoError to set
	   */
	  public void setCodigoError(String codigoError)
	  {
	    this.codigoError = codigoError;
	  }

	  /**
	   * @return the descripcionError
	   */
	  public String getDescripcionError()
	  {
	    return this.descripcionError;
	  }
	  
	  /**
	   * @param descripcionError the descripcionError to set
	   */
	  public void setDescripcionError(String descripcionError)
	  {
	    this.descripcionError = descripcionError;
	  }
	  
	  /**
	   * @return the showErrorMessage
	   */
	  public Boolean getShowErrorMessage()
	  {
	    return this.showErrorMessage;
	  }

	  /**
	   * @param showErrorMessage the showErrorMessage to set
	   */
	  public void setShowErrorMessage(Boolean showErrorMessage)
	  {
	    this.showErrorMessage = showErrorMessage;
	  }

	  /**
	   * @return the descripcionesErrores
	   */
	  public Collection<String> getDescripcionesErrores()
	  {
	    return this.descripcionesErrores;
	  }

	  /**
	   * @param descripcionesErrores the descripcionesErrores to set
	   */
	  public void setDescripcionesErrores(Collection<String> descripcionesErrores)
	  {
	    this.descripcionesErrores = descripcionesErrores;
	  }

	  /**
	   * @return the entidadError
	   */
	  public Object getEntidadError() {
	    return this.entidadError;
	  }

	  /**
	   * @param entidadError the entidadError to set
	   */
	  public void setEntidadError(Object entidadError) {
	    this.entidadError = entidadError;
	  }
}

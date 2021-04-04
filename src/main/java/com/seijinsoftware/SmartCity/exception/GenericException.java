package com.seijinsoftware.SmartCity.exception;

public class GenericException extends Exception {

	private static final long serialVersionUID = -3472622545652767465L;

	private final int errorCode;

	public GenericException(){
		super();
		this.errorCode = -1;
	}

	/**
	 * @param messageArguments
	 *        arguments to be replace in message
	 */
	public GenericException(String message){
		super(message);
		this.errorCode = -1;
	}

	/**
	 * @param messageArguments
	 *        arguments to be replace in messageFormat Message with "{}" to replace for message arguments by order
	 * @param messageArguments
	 *        arguments to be replace in messageArguments arguments to be replace in message
	 */
	public GenericException(String messageFormat, Object... messageArguments){
		super(String.format(messageFormat, messageArguments));
		this.errorCode = -1;
	}

	/**
	 * @param errorCode
	 */
	public GenericException(int errorCode){
		super();
		this.errorCode = errorCode;
	}

	/**
	 * @param exception
	 */
	public GenericException(Exception exception){
		super(exception);
		this.errorCode = -1;
	}

	/**
	 * @param messageArguments
	 *        arguments to be replace in message
	 * @param errorCode
	 */
	public GenericException(String message, int errorCode){
		super(message);
		this.errorCode = errorCode;
	}

	/**
	 * @param messageArguments
	 *        arguments to be replace in messageFormat Message with "{}" to replace for message arguments by order
	 * @param errorCode
	 * @param messageArguments
	 *        arguments to be replace in messageArguments
	 */
	public GenericException(String messageFormat, int errorCode, Object... messageArguments){
		super(String.format(messageFormat, messageArguments));
		this.errorCode = errorCode;
	}

	/**
	 * @param messageArguments
	 *        arguments to be replace in message
	 * @param exception
	 */
	public GenericException(String message, Exception exception){
		super(message, exception);
		this.errorCode = -1;
	}

	/**
	 * @param messageArguments
	 *        arguments to be replace in messageFormat Message with "{}" to replace for message arguments by order
	 * @param exception
	 * @param messageArguments
	 *        arguments to be replace in messageArguments
	 */
	public GenericException(String messageFormat, Exception exception, Object... messageArguments){
		super(String.format(messageFormat, messageArguments), exception);
		this.errorCode = -1;
	}

	/**
	 * @param errorCode
	 * @param exception
	 */
	public GenericException(int errorCode, Exception exception){
		super(exception);
		this.errorCode = errorCode;
	}

	/**
	 * @param messageArguments
	 *        arguments to be replace in message
	 * @param errorCode
	 * @param exception
	 */
	public GenericException(String message, int errorCode, Exception exception){
		super(message, exception);
		this.errorCode = errorCode;
	}

	/**
	 * @param messageArguments
	 *        arguments to be replace in messageFormat Message with "{}" to replace for message arguments by order
	 * @param errorCode
	 * @param exception
	 * @param messageArguments
	 *        arguments to be replace in messageArguments
	 */
	public GenericException(String messageFormat, int errorCode, Exception exception, Object... messageArguments){
		super(String.format(messageFormat, messageArguments), exception);
		this.errorCode = errorCode;
	}

	/**
	 * @return error code, default value is "-1"
	 */
	public int getErrorCode(){
		return errorCode;
	}
	
}

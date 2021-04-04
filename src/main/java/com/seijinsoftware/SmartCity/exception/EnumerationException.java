package com.seijinsoftware.SmartCity.exception;

public class EnumerationException extends GenericException {

	private static final long serialVersionUID = -3492786412033565829L;

	public EnumerationException(){
		super();
	}

	/**
	 * @param messageArguments
	 *        arguments to be replace in message
	 */
	public EnumerationException(String message){
		super(message);
	}

	/**
	 * @param messageArguments
	 *        arguments to be replace in messageFormat Message with "{}" to replace for message arguments by order
	 * @param messageArguments
	 *        arguments to be replace in messageArguments arguments to be replace in message
	 */
	public EnumerationException(String messageFormat, Object... messageArguments){
		super(messageFormat, messageArguments);
	}

	/**
	 * @param errorCode
	 */
	public EnumerationException(int errorCode){
		super(errorCode);
	}

	/**
	 * @param exception
	 */
	public EnumerationException(Exception exception){
		super(exception);
	}

	/**
	 * @param messageArguments
	 *        arguments to be replace in message
	 * @param errorCode
	 */
	public EnumerationException(String message, int errorCode){
		super(message, errorCode);
	}

	/**
	 * @param messageArguments
	 *        arguments to be replace in messageFormat Message with "{}" to replace for message arguments by order
	 * @param errorCode
	 * @param messageArguments
	 *        arguments to be replace in messageArguments
	 */
	public EnumerationException(String messageFormat, int errorCode, Object... messageArguments){
		super(messageFormat, errorCode, messageArguments);
	}

	/**
	 * @param messageArguments
	 *        arguments to be replace in message
	 * @param exception
	 */
	public EnumerationException(String message, Exception exception){
		super(message, exception);
	}

	/**
	 * @param messageArguments
	 *        arguments to be replace in messageFormat Message with "{}" to replace for message arguments by order
	 * @param exception
	 * @param messageArguments
	 *        arguments to be replace in messageArguments
	 */
	public EnumerationException(String messageFormat, Exception exception, Object... messageArguments){
		super(messageFormat, exception, messageArguments);
	}

	/**
	 * @param errorCode
	 * @param exception
	 */
	public EnumerationException(int errorCode, Exception exception){
		super(errorCode, exception);
	}

	/**
	 * @param messageArguments
	 *        arguments to be replace in message
	 * @param errorCode
	 * @param exception
	 */
	public EnumerationException(String message, int errorCode, Exception exception){
		super(message, errorCode, exception);
	}

	/**
	 * @param messageArguments
	 *        arguments to be replace in messageFormat Message with "{}" to replace for message arguments by order
	 * @param errorCode
	 * @param exception
	 * @param messageArguments
	 *        arguments to be replace in messageArguments
	 */
	public EnumerationException(String messageFormat, int errorCode, Exception exception, Object... messageArguments){
		super(messageFormat, errorCode, exception, messageArguments);
	}
}

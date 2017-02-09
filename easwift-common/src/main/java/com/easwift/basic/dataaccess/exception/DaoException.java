package com.easwift.basic.dataaccess.exception;

/**
 * 
 * @descrpiton dao层异常类
 * @author [dingwei.tang]
 * @date [2017年2月9日 下午1:23:51]
 */
public class DaoException extends Exception {

	private static final long serialVersionUID = 4640181036015959754L;

	public DaoException() {
		super();
	}

	public DaoException(String message, Throwable cause) {
		super(message, cause);
	}

	public DaoException(String message) {
		super(message);
	}

	public DaoException(Throwable cause) {
		super(cause);
	}

}

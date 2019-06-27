package com.pc.bean;

public class JsonResultVo
{
	private int code;
    private String msg;


    public JsonResultVo(int code, String msg)
	{
		super();
		this.code = code;
		this.msg = msg;
	}

	public JsonResultVo()
	{
		super();
	}

	public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

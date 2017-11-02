package com.internousdev.login3.dto;

public class ItemDTO {
	private String pencil;
	private String ruler;
	private String eraser;
	private String pen;

	//////////////////////以下、カプセル化
	public String getPencil() {
		return pencil;
	}
	public void setPencil(String pencil) {
		this.pencil = pencil;
	}
	public String getRuler(){
		return ruler;
	}
	public void setRuler(String ruler){
		this.ruler= ruler;
	}
	public String getEraser(){
		return eraser;
	}
	public void setEraser(String eraser){
		this.eraser= eraser;
	}
	public String getPen(){
		return pen;
	}
	public void setPen(String pen){
		this.pen= pen;
	}

}

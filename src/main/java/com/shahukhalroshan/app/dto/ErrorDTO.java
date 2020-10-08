package com.shahukhalroshan.app.dto;

public class ErrorDTO {
	
	private Long id;
	private Integer status;
	private Integer code;
	private String title;
	private String detai;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetai() {
		return detai;
	}
	public void setDetai(String detai) {
		this.detai = detai;
	}
}

package edu.moduloalumno.entity;

public class BeneficioReporte {
	
	private Integer total;
	private Integer epg;
	private Integer upg;
	private Float d_total;
	private Integer d_epg;
	private Float d_upg;
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getEpg() {
		return epg;
	}
	public void setEpg(Integer epg) {
		this.epg = epg;
	}
	public Integer getUpg() {
		return upg;
	}
	public void setUpg(Integer upg) {
		this.upg = upg;
	}
	
	public Integer getD_epg() {
		return d_epg;
	}
	public void setD_epg(Integer d_epg) {
		this.d_epg = d_epg;
	}
	
	
	public Float getD_total() {
		return d_total;
	}
	public void setD_total(Float d_total) {
		this.d_total = d_total;
	}
	public Float getD_upg() {
		return d_upg;
	}
	public void setD_upg(Float d_upg) {
		this.d_upg = d_upg;
	}
	
	@Override
	public String toString() {
		return "BeneficioReporte [total=" + total + ", epg=" + epg + ", upg=" + upg + ", d_total=" + d_total
				+ ", d_epg=" + d_epg + ", d_upg=" + d_upg + "]";
	}
	
	

}

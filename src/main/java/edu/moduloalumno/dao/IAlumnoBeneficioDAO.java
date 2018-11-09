package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.AlumnoProgramaBeneficioCon;
import edu.moduloalumno.entity.BeneficioReporte;
import edu.moduloalumno.entity.AlumnoProgramaBeneficio;
import edu.moduloalumno.entity.CondicionBeneficio;
import edu.moduloalumno.entity.TipoAplicaBeneficio;
import edu.moduloalumno.entity.TipoBeneficio;

public interface IAlumnoBeneficioDAO {
	public List<AlumnoProgramaBeneficioCon> getAllAlumnoBeneficio(String codigo);
	
	public boolean insertAlumnoProgramaBeneficio(AlumnoProgramaBeneficio apbeneficio);
	
	public boolean getIdBeneficio(Integer id_abp);

	public List<CondicionBeneficio> getAllCondicionB();
	
	public List<TipoBeneficio> getAllTipo();

	public List<TipoAplicaBeneficio> getTipoAplicaBeneficio();

	public BeneficioReporte funcionDescuento(String codigo, float descuento,Integer id_programa);
}


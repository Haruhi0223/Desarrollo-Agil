package cursoDAgil.managedBean.direccion;

import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import cursoDAgil.bd.domain.Direccion;
import cursoDAgil.service.direccion.DireccionService;


@Named
@ViewScoped
public class DireccionBean {
	
	
	@Inject
	DireccionService direccionService;
	
	private List<Direccion> ListaDireccion;

	public List<Direccion> getListaDireccion() {
		if (ListaDireccion == null)
			setListaDireccion(direccionService.obtenerDirecciones());
		return ListaDireccion;
	}

	public void setListaDireccion(List<Direccion> listaDireccion) {
		ListaDireccion = listaDireccion;
	}
}

package br.com.tads.util;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import br.com.tads.dao.DAO;
import br.com.tads.modelo.Veiculo;

@FacesConverter("converterVeiculo")
public class ConverterVeiculo implements Converter{

	
		@Override
		public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
			if (value != null && value.trim().length() > 0) {
				try {
					DAO dao = new DAO(Veiculo.class);
					Object veiculo = dao.buscaPorId(Long.parseLong(value));
					return veiculo;
				} catch (NumberFormatException e) {
					throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro no converter veiculo",
							"Não é um veiculo válido"));
				}
			} else {
				return null;
			}
		}

		@Override
		public String getAsString(FacesContext fc, UIComponent uic, Object object) {
			if (object != null) {
				return String.valueOf(((Veiculo) object).getId());
			} else {
				return null;
			}
		}

}

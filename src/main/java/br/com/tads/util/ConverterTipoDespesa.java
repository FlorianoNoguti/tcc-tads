package br.com.tads.util;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import br.com.tads.dao.DAO;
import br.com.tads.modelo.TipoDespesa;


@FacesConverter("converterTipoDespesa")
public class ConverterTipoDespesa implements Converter{
		@Override
		public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
			if (value != null && value.trim().length() > 0) {
				try {
					DAO dao = new DAO(TipoDespesa.class);
					Object tipoDespesa = dao.buscaPorId(Long.parseLong(value));
					return tipoDespesa;
				} catch (NumberFormatException e) {
					throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro no converter tipo despesa",
							"Não é um tipo de despesa válido"));
				}
			} else {
				return null;
			}
		}

		@Override
		public String getAsString(FacesContext fc, UIComponent uic, Object object) {
			if (object != null) {
				return String.valueOf(((TipoDespesa) object).getId());
			} else {
				return null;
			}
		}
}
